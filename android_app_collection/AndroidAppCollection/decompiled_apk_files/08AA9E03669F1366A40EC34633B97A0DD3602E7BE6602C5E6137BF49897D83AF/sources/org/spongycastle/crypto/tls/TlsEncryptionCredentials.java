package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public interface TlsEncryptionCredentials extends TlsCredentials {
    byte[] decryptPreMasterSecret(byte[] bArr);
}
