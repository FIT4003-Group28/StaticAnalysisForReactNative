package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}
