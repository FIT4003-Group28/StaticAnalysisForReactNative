package org.spongycastle.crypto.prng;
/* loaded from: classes.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
