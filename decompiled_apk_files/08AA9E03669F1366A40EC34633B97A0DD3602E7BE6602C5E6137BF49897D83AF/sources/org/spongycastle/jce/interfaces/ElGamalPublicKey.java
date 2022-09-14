package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
/* loaded from: classes.dex */
public interface ElGamalPublicKey extends DHPublicKey, ElGamalKey {
    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey
    BigInteger getY();
}
