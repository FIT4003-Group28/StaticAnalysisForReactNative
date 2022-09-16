package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes.dex */
public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        return localEngineGetParameterSpec(cls);
    }
}
