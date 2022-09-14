package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public interface TlsSignerCredentials extends TlsCredentials {
    byte[] generateCertificateSignature(byte[] bArr);

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
}
