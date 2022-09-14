package org.spongycastle.crypto.ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.math.ec.ECPoint;
/* loaded from: classes.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}
