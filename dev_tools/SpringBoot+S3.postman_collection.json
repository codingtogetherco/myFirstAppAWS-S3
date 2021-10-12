{
	"info": {
		"_postman_id": "cb485fa9-1e8c-45cc-90b1-96359a085d0a",
		"name": "SpringBoot+S3",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "listS3Files",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/s3/listS3Files?bucketName=myawsbucket21458",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"listS3Files"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "getS3FileContent",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/s3/getS3FileContent?bucketName=myawsbucket21458&fileName=VASC2322H.xml",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"getS3FileContent"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "fileName",
							"value": "VASC2322H.xml"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "downloadS3File",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/s3/downloadS3File?bucketName=myawsbucket21458&fileName=VASC2322H.xml",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"downloadS3File"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "fileName",
							"value": "VASC2322H.xml"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "uploadFile",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "formdata",
					"formdata": [
						{
							"key": "file",
							"type": "file",
							"src": "/C:/Users/paola.vargas/Downloads/VASC2322H (7).xml"
						}
					]
				},
				"url": {
					"raw": "http://localhost:8080/s3/uploadFile?bucketName=myawsbucket21458&filePath=folder1/",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"uploadFile"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "filePath",
							"value": "folder1/"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "uploadFile Copy",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "formdata",
					"formdata": [
						{
							"key": "file",
							"type": "file",
							"src": "/C:/Users/paola.vargas/Downloads/VASC2322H (7).xml"
						}
					]
				},
				"url": {
					"raw": "http://localhost:8080/s3/uploadFile?bucketName=myawsbucket21458&filePath=folder1/",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"uploadFile"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "filePath",
							"value": "folder1/"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "moveFile",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/s3/moveFile?bucketName=myawsbucket21458&fileName=VASC2322H.xml&fileNameDest=folder/VASC2322H.xml",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"moveFile"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "fileName",
							"value": "VASC2322H.xml"
						},
						{
							"key": "fileNameDest",
							"value": "folder/VASC2322H.xml"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "deleteObject",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/s3/deleteObject?bucketName=myawsbucket21458&fileName=folder/VASC2322H.xml&=",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"s3",
						"deleteObject"
					],
					"query": [
						{
							"key": "bucketName",
							"value": "myawsbucket21458"
						},
						{
							"key": "fileName",
							"value": "folder/VASC2322H.xml"
						},
						{
							"key": "",
							"value": ""
						}
					]
				}
			},
			"response": []
		}
	]
}