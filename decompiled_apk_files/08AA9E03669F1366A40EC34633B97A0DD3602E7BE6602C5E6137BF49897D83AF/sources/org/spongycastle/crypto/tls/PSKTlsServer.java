package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.agreement.DHStandardGroups;
import org.spongycastle.crypto.params.DHParameters;
/* loaded from: classes.dex */
public class PSKTlsServer extends AbstractTlsServer {
    protected TlsPSKIdentityManager pskIdentityManager;

    public PSKTlsServer(TlsPSKIdentityManager tlsPSKIdentityManager) {
        this(new DefaultTlsCipherFactory(), tlsPSKIdentityManager);
    }

    public PSKTlsServer(TlsCipherFactory tlsCipherFactory, TlsPSKIdentityManager tlsPSKIdentityManager) {
        super(tlsCipherFactory);
        this.pskIdentityManager = tlsPSKIdentityManager;
    }

    protected TlsEncryptionCredentials getRSAEncryptionCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    protected DHParameters getDHParameters() {
        return DHStandardGroups.rfc3526_2048;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer
    protected int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA};
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsCredentials getCredentials() {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm != 24) {
            switch (keyExchangeAlgorithm) {
                case 13:
                case 14:
                    return null;
                case 15:
                    return getRSAEncryptionCredentials();
                default:
                    throw new TlsFatalAlert((short) 80);
            }
        }
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsKeyExchange getKeyExchange() {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm != 24) {
            switch (keyExchangeAlgorithm) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new TlsFatalAlert((short) 80);
            }
        }
        return createPSKKeyExchange(keyExchangeAlgorithm);
    }

    protected TlsKeyExchange createPSKKeyExchange(int i) {
        return new TlsPSKKeyExchange(i, this.supportedSignatureAlgorithms, null, this.pskIdentityManager, getDHParameters(), this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }
}
