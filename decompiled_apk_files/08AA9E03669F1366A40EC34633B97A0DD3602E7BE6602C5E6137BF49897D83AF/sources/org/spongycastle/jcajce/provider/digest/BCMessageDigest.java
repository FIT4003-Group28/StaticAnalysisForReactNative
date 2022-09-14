package org.spongycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.spongycastle.crypto.Digest;
/* loaded from: classes.dex */
public class BCMessageDigest extends MessageDigest {
    protected Digest digest;

    /* JADX INFO: Access modifiers changed from: protected */
    public BCMessageDigest(Digest digest) {
        super(digest.getAlgorithmName());
        this.digest = digest;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b2) {
        this.digest.update(b2);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }
}
