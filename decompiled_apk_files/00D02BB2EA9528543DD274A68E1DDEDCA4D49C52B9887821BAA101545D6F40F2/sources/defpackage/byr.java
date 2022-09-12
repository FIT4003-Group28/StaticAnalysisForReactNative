package defpackage;

import android.app.ActivityManager;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: byr  reason: default package */
/* loaded from: classes.dex */
public final class byr {
    public final int a;
    public final int b;
    public final int c;

    public byr(byp bypVar) {
        ActivityManager activityManager;
        int i = true != bypVar.c.isLowRamDevice() ? 4194304 : 2097152;
        this.c = i;
        int round = Math.round(activityManager.getMemoryClass() * ImageMetadata.SHADING_MODE * (true != bypVar.c.isLowRamDevice() ? 0.4f : 0.33f));
        float f = bypVar.f.a.widthPixels * bypVar.f.a.heightPixels * 4;
        int round2 = Math.round(bypVar.e * f);
        int round3 = Math.round(f * bypVar.d);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
            return;
        }
        float f2 = bypVar.e;
        float f3 = bypVar.d;
        float f4 = i2 / (f2 + f3);
        this.b = Math.round(f3 * f4);
        this.a = Math.round(f4 * bypVar.e);
    }
}
