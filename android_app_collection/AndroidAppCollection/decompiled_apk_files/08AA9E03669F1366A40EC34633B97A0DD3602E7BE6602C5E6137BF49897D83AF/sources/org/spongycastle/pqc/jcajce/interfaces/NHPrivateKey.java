package org.spongycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;
/* loaded from: classes2.dex */
public interface NHPrivateKey extends PrivateKey, NHKey {
    short[] getSecretData();
}
