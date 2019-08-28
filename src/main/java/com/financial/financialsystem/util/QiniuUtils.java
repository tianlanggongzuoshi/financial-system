package com.financial.financialsystem.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QiniuUtils {

    @Value("${qiniu.accessKey}")
    private String accessKey;
    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    public String getPath() {
        return path;
    }

    public String getBucket() {
        return bucket;
    }


    public String getAccessKey() {
        return accessKey;
    }


    public String getSecretKey() {
        return secretKey;
    }
}