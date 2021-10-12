package com.aws.example.awsdemo.repository;

import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.aws.example.awsdemo.domain.Object;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface S3Repository {

    List<Object> listObjectsInBucket(String bucket);

    S3ObjectInputStream getObject(String bucketName, String fileName) throws IOException;

    byte[] downloadFile(String bucketName, String fileName) throws IOException;

    void moveObject(String bucketName, String fileKey, String destinationFileKey);

    void deleteObject (String bucketName, String fileKey);

    String uploadFile(String bucketName, String fileName, File fileObj);
}
