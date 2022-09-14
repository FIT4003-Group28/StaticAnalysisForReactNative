package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public class AbstractTlsCipherFactory implements TlsCipherFactory {
    @Override // org.spongycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i, int i2) {
        throw new TlsFatalAlert((short) 80);
    }
}
