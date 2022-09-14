package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public abstract class DefaultTlsClient extends AbstractTlsClient {
    public DefaultTlsClient() {
    }

    public DefaultTlsClient(TlsCipherFactory tlsCipherFactory) {
        super(tlsCipherFactory);
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 64, 50, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 103, 51, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 60, 47};
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public TlsKeyExchange getKeyExchange() {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm != 1) {
            if (keyExchangeAlgorithm == 3 || keyExchangeAlgorithm == 5) {
                return createDHEKeyExchange(keyExchangeAlgorithm);
            }
            if (keyExchangeAlgorithm == 7 || keyExchangeAlgorithm == 9) {
                return createDHKeyExchange(keyExchangeAlgorithm);
            }
            switch (keyExchangeAlgorithm) {
                case 16:
                case 18:
                case 20:
                    return createECDHKeyExchange(keyExchangeAlgorithm);
                case 17:
                case 19:
                    return createECDHEKeyExchange(keyExchangeAlgorithm);
                default:
                    throw new TlsFatalAlert((short) 80);
            }
        }
        return createRSAKeyExchange();
    }

    protected TlsKeyExchange createDHKeyExchange(int i) {
        return new TlsDHKeyExchange(i, this.supportedSignatureAlgorithms, null);
    }

    protected TlsKeyExchange createDHEKeyExchange(int i) {
        return new TlsDHEKeyExchange(i, this.supportedSignatureAlgorithms, null);
    }

    protected TlsKeyExchange createECDHKeyExchange(int i) {
        return new TlsECDHKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createECDHEKeyExchange(int i) {
        return new TlsECDHEKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createRSAKeyExchange() {
        return new TlsRSAKeyExchange(this.supportedSignatureAlgorithms);
    }
}
