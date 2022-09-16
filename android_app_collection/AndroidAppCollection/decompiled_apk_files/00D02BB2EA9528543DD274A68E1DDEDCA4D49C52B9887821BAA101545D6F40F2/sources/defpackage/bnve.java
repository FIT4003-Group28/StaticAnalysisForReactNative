package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bnve  reason: default package */
/* loaded from: classes.dex */
public final class bnve {
    final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final bnvb g;
    public final int h;
    @dzsi
    public Bitmap i;

    public bnve(bnvb bnvbVar, int i, int i2, Bitmap bitmap, int i3, int i4, int i5, int i6, float f) {
        this.a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = f;
        this.g = bnvbVar;
        this.i = bitmap;
        this.h = i2;
    }

    public final float a() {
        return this.d * this.f;
    }

    public final float b() {
        return this.e * this.f;
    }

    public final void c() {
        this.g.g(this);
    }
}
