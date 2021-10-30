package com.example.librarymanagementproject.validator;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PhotoUploadUtil {
    public static void savePhoto(String uploadDir, String fileName, MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);

        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path photoPath = uploadPath.resolve(fileName);
            Files.copy(inputStream, photoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ioe) {
            InputStream input = multipartFile.getInputStream();
            Path path = Paths.get(fileName);//check path
            OutputStream output = Files.newOutputStream(path);
            IOUtils.copy(input, output);
        }
    }
}
