package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
/* loaded from: classes.dex */
public interface ECPrivateKey extends PrivateKey, ECKey {
    BigInteger getD();
}
