package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
/* loaded from: classes.dex */
public interface GOST3410PrivateKey extends PrivateKey, GOST3410Key {
    BigInteger getX();
}
