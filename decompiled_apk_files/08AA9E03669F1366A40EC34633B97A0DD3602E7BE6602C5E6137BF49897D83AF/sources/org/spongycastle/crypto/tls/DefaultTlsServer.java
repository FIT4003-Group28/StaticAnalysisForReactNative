package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.agreement.DHStandardGroups;
import org.spongycastle.crypto.params.DHParameters;
/* loaded from: classes.dex */
public abstract class DefaultTlsServer extends AbstractTlsServer {
    public DefaultTlsServer() {
    }

    public DefaultTlsServer(TlsCipherFactory tlsCipherFactory) {
        super(tlsCipherFactory);
    }

    protected TlsSignerCredentials getDSASignerCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    protected TlsSignerCredentials getECDSASignerCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    protected TlsEncryptionCredentials getRSAEncryptionCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    protected TlsSignerCredentials getRSASignerCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    protected DHParameters getDHParameters() {
        return DHStandardGroups.rfc3526_2048;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer
    protected int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 107, 103, 57, 51, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 61, 60, 53, 47};
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsCredentials getCredentials() {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm != 1) {
            if (keyExchangeAlgorithm == 3) {
                return getDSASignerCredentials();
            }
            if (keyExchangeAlgorithm != 5) {
                if (keyExchangeAlgorithm == 17) {
                    return getECDSASignerCredentials();
                }
                switch (keyExchangeAlgorithm) {
                    case 19:
                        break;
                    case 20:
                        return null;
                    default:
                        throw new TlsFatalAlert((short) 80);
                }
            }
            return getRSASignerCredentials();
        }
        return getRSAEncryptionCredentials();
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
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
        return new TlsDHKeyExchange(i, this.supportedSignatureAlgorithms, getDHParameters());
    }

    protected TlsKeyExchange createDHEKeyExchange(int i) {
        return new TlsDHEKeyExchange(i, this.supportedSignatureAlgorithms, getDHParameters());
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
