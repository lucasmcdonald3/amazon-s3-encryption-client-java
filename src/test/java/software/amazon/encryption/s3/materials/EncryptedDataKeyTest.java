package software.amazon.encryption.s3.materials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptedDataKeyTest {

    private EncryptedDataKey actualEncryptedDataKey;
    private byte[] encryptedDataKey;
    private String keyProviderId;
    private byte[] keyProviderInfo;
    
    @BeforeEach
    public void setUp() {
        keyProviderId = "testKeyProviderId";
        keyProviderInfo = new byte[]{20, 10, 30, 5};
        encryptedDataKey = new byte[]{20, 10, 30, 5};

        actualEncryptedDataKey = EncryptedDataKey.builder()
                .keyProviderId(keyProviderId)
                .keyProviderInfo(keyProviderInfo)
                .encryptedDataKey(encryptedDataKey)
                .build();
    }

    @RepeatedTest(10)
    public void keyProviderId() {
        assertEquals(keyProviderId, actualEncryptedDataKey.keyProviderId());
    }

    @RepeatedTest(10)
    public void keyProviderInfo() {
        assertEquals(Arrays.toString(keyProviderInfo), Arrays.toString(actualEncryptedDataKey.keyProviderInfo()));
    }

    @RepeatedTest(10)
    public void ciphertext() {
        assertEquals(Arrays.toString(encryptedDataKey), Arrays.toString(actualEncryptedDataKey.encryptedDatakey()));
    }
}