package uk.hmrc.com.intrasoft.mock.amazons3mock;

import com.adobe.testing.s3mock.S3MockApplication;
import com.adobe.testing.s3mock.S3MockConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AmazonS3MockApplication {

    public static void main(String[] args) {
        S3MockApplication.start(args);
    }

}
