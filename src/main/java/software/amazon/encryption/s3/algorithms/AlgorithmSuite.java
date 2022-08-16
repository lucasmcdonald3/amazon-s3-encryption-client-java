package software.amazon.encryption.s3.algorithms;


public enum AlgorithmSuite {
    ALG_AES_256_GCM_IV12_TAG16_NO_KDF(0x0078,
            false,
            "AES",
            256,
            "AES/GCM/NoPadding",
            128,
            96,
            128,
            AlgorithmConstants.GCM_MAX_CONTENT_LENGTH_BITS),
    ALG_AES_256_CBC_IV16_NO_KDF(0x0070,
            true,
            "AES",
            256,
            "AES/CBC/PKCS5Padding",
            128,
            128,
            0,
            AlgorithmConstants.CBC_MAX_CONTENT_LENGTH_BYTES);

    private int _id;
    private boolean _isLegacy;
    private String _dataKeyAlgorithm;
    private int _dataKeyLengthBits;
    private String _cipherName;
    private int _cipherBlockSizeBits;
    private int _cipherNonceLengthBits;
    private int _cipherTagLengthBits;
    private long _cipherMaxContentLengthBits;

    AlgorithmSuite(int id,
            boolean isLegacy,
            String dataKeyAlgorithm,
            int dataKeyLengthBits,
            String cipherName,
            int cipherBlockSizeBits,
            int cipherNonceLengthBits,
            int cipherTagLengthBits,
            long cipherMaxContentLengthBits
    ) {
        this._id = id;
        this._isLegacy = isLegacy;
        this._dataKeyAlgorithm = dataKeyAlgorithm;
        this._dataKeyLengthBits = dataKeyLengthBits;
        this._cipherName = cipherName;
        this._cipherBlockSizeBits = cipherBlockSizeBits;
        this._cipherNonceLengthBits = cipherNonceLengthBits;
        this._cipherTagLengthBits = cipherTagLengthBits;
        this._cipherMaxContentLengthBits = cipherMaxContentLengthBits;
    }

    public int id() {
        return _id;
    }

    public boolean isLegacy() {
        return _isLegacy;
    }

    public String dataKeyAlgorithm() {
        return _dataKeyAlgorithm;
    }

    public int dataKeyLengthBits() {
        return _dataKeyLengthBits;
    }

    public String cipherName() {
        return _cipherName;
    }

    public int cipherTagLengthBits() {
        return _cipherTagLengthBits;
    }

    public int nonceLengthBytes() {
        return _cipherNonceLengthBits / 8;
    }
}
