package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TlsSessionImpl implements TlsSession {
    final byte[] sessionID;
    SessionParameters sessionParameters;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsSessionImpl(byte[] bArr, SessionParameters sessionParameters) {
        if (bArr == null) {
            throw new IllegalArgumentException("'sessionID' cannot be null");
        }
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("'sessionID' must have length between 1 and 32 bytes, inclusive");
        }
        this.sessionID = Arrays.clone(bArr);
        this.sessionParameters = sessionParameters;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized SessionParameters exportSessionParameters() {
        return this.sessionParameters == null ? null : this.sessionParameters.copy();
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized byte[] getSessionID() {
        return this.sessionID;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized void invalidate() {
        if (this.sessionParameters != null) {
            this.sessionParameters.clear();
            this.sessionParameters = null;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized boolean isResumable() {
        return this.sessionParameters != null;
    }
}
