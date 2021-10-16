package com.aws.example.awsdemo.controller;

import com.aws.example.awsdemo.domain.Object;
import com.aws.example.awsdemo.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/s3")
public class AwsController {

    private AwsService awsService;

    @Autowired
    public AwsController(AwsService awsService) {
        this.awsService = awsService;
    }

    @GetMapping("/getS3FileContent")
    public ResponseEntity<String> getS3FileContent(@RequestParam(value = "bucketName") String bucketName, @RequestParam(value = "fileName") String fileName) throws IOException {
        return new ResponseEntity<>(awsService.getS3FileContent(bucketName, fileName), HttpStatus.OK);
    }

    @GetMapping("/listS3Files")
    public ResponseEntity<List<Object>> getS3Files(@RequestParam(value = "bucketName") String bucketName) throws IOException {
        List<Object> list= new ArrayList<>();
        HttpStatus status=  HttpStatus.OK;
        try {
            list =  awsService.getS3Files(bucketName);
        } catch (Exception e) {
            status =  HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(list, status);
    }

    @GetMapping("/downloadS3File")
    public ResponseEntity<ByteArrayResource> downloadS3File(@RequestParam(value = "bucketName") String bucketName, @RequestParam(value = "fileName") String fileName)
            throws IOException {
        byte[] data = awsService.downloadFile(bucketName, fileName);
        ByteArrayResource resource = new ByteArrayResource(data);
        return ResponseEntity
                .ok()
                .contentLength(data.length)
                .header("Content-type", "application/octet-stream")
                .header("Content-disposition", "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

    @DeleteMapping("/deleteObject")
    public ResponseEntity<String> deleteFile(@RequestParam(value = "bucketName") String bucketName, @RequestParam(value = "fileName") String fileName) {
        awsService.deleteObject(bucketName, fileName);
        return new ResponseEntity<>("File deleted", HttpStatus.OK);
    }

    @GetMapping("/moveFile")
    public ResponseEntity<String> moveFile(@RequestParam(value = "bucketName") String bucketName,
                                           @RequestParam(value = "fileName") String fileKey,
                                                   @RequestParam(value = "fileNameDest") String fileKeyDest) {
        awsService.moveObject(bucketName, fileKey, fileKeyDest);
        return new ResponseEntity<>("File moved", HttpStatus.OK);
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam(value = "bucketName") String bucketName, @RequestParam(value = "filePath") String filePath, @RequestParam(value = "file") MultipartFile file) {
        return new ResponseEntity<>(awsService.uploadFile(bucketName, filePath, file), HttpStatus.OK);
    }


}
