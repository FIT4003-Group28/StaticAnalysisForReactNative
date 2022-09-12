package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnrs  reason: default package */
/* loaded from: classes.dex */
public final class bnrs {
    public final alad a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final double n;
    public final double o;
    public final double p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final aksi u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;

    public bnrs() {
        alad aladVar = alad.a;
        throw null;
    }

    public bnrs(alad aladVar, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, int i7, int i8, double d, double d2, double d3, float f5, float f6, float f7, float f8, aksi aksiVar, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.a = aladVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = d;
        this.o = d2;
        this.p = d3;
        this.q = f5;
        this.r = f6;
        this.s = f7;
        this.t = f8;
        this.u = aksiVar;
        this.w = fArr2;
        this.v = fArr;
        this.x = fArr3;
        this.y = fArr4;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof bnrs) {
            bnrs bnrsVar = (bnrs) obj;
            if (this.a.equals(bnrsVar.a) && this.b == bnrsVar.b && this.c == bnrsVar.c && this.d == bnrsVar.d && this.e == bnrsVar.e && this.f == bnrsVar.f && this.g == bnrsVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g)});
    }
}
