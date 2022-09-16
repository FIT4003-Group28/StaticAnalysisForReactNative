package defpackage;
/* compiled from: PG */
/* renamed from: amvr  reason: default package */
/* loaded from: classes.dex */
public final class amvr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final long m;

    public amvr(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, int i, int i2, int i3, int i4, long j2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = j;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = j2;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.e("offPathProbabilitySum", this.b);
        b.e("modeOffPathSec", this.e);
        b.f("offPathReroutes", this.j);
        return b.toString();
    }
}
