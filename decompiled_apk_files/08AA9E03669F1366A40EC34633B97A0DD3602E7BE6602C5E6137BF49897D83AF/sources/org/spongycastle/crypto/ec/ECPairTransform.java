package org.spongycastle.crypto.ec;

import org.spongycastle.crypto.CipherParameters;
/* loaded from: classes.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
