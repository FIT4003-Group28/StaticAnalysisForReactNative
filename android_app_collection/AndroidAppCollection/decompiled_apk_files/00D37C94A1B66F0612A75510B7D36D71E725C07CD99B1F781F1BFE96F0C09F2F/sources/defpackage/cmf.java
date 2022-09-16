package defpackage;

import android.app.ActivityManager;
/* compiled from: PG */
/* renamed from: cmf  reason: default package */
/* loaded from: classes2.dex */
public final class cmf {
    public final int a;
    public final int b;
    public final int c;

    public cmf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public cmf(cmd cmdVar) {
        ActivityManager activityManager;
        int i = cmdVar.b.isLowRamDevice() ? cmdVar.g >> 1 : cmdVar.g;
        this.c = i;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (true == cmdVar.b.isLowRamDevice() ? cmdVar.f : cmdVar.e));
        float f = cmdVar.h.a.widthPixels * cmdVar.h.a.heightPixels * 4;
        int round2 = Math.round(cmdVar.d * f);
        int round3 = Math.round(f * cmdVar.c);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
            return;
        }
        float f2 = cmdVar.d;
        float f3 = cmdVar.c;
        float f4 = i2 / (f2 + f3);
        this.b = Math.round(f3 * f4);
        this.a = Math.round(f4 * cmdVar.d);
    }

    public final int a() {
        return this.a + this.c;
    }

    public final int b() {
        return this.b + this.c;
    }
}
