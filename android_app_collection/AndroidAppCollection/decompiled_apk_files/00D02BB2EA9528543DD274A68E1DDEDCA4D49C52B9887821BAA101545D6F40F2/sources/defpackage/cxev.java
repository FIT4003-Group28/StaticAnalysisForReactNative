package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: cxev  reason: default package */
/* loaded from: classes.dex */
public final class cxev {
    private final float a;
    private final Random b;

    public cxev(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        dbsk.b(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
