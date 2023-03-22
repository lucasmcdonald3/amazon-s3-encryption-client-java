package software.amazon.encryption.s3.examples;

import org.junit.jupiter.api.RepeatedTest;
import software.amazon.encryption.s3.utils.S3EncryptionClientTestResources;

public class PartialKeyPairExampleTest {

    @RepeatedTest(10)
    public void testPartialKeyPairExamples() {
        final String bucket = S3EncryptionClientTestResources.BUCKET;

        PartialKeyPairExample.main(new String[]{bucket});
    }
}
