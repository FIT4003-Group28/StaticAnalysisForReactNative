package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;
/* loaded from: classes.dex */
public interface ElGamalPrivateKey extends DHPrivateKey, ElGamalKey {
    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey
    BigInteger getX();
}
