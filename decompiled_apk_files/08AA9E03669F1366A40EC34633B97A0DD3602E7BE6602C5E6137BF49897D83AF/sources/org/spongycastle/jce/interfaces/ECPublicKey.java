package org.spongycastle.jce.interfaces;

import java.security.PublicKey;
import org.spongycastle.math.ec.ECPoint;
/* loaded from: classes.dex */
public interface ECPublicKey extends PublicKey, ECKey {
    ECPoint getQ();
}
