package defpackage;

import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: aaqz  reason: default package */
/* loaded from: classes.dex */
public final class aaqz {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public aaqz(DisplayMetrics displayMetrics, boolean z) {
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int n = zew.n(displayMetrics, i);
        int n2 = zew.n(displayMetrics, i2);
        float f = i / displayMetrics.xdpi;
        float f2 = i2 / displayMetrics.ydpi;
        if (!z || i <= i2) {
            this.a = n;
            this.b = n2;
            this.c = f;
            this.d = f2;
        } else {
            this.a = n2;
            this.b = n;
            this.c = f2;
            this.d = f;
        }
        this.e = displayMetrics.density;
    }
}
