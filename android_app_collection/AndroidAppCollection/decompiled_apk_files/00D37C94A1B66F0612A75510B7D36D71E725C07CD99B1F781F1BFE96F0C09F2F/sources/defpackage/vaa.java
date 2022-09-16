package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: vaa  reason: default package */
/* loaded from: classes4.dex */
public final class vaa {
    public final float a;
    public final Random b;

    public vaa(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        aqxo.q(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
