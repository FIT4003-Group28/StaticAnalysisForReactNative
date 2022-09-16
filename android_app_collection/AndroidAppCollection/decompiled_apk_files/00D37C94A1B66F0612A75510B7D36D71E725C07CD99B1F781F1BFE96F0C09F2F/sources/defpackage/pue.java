package defpackage;

import android.text.Layout;
/* compiled from: PG */
/* renamed from: pue  reason: default package */
/* loaded from: classes4.dex */
public final class pue {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public pty r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public final void b(int i) {
        this.d = i;
        this.e = true;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(pue pueVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (pueVar != null) {
            if (!this.c && pueVar.c) {
                c(pueVar.b);
            }
            if (this.h == -1) {
                this.h = pueVar.h;
            }
            if (this.i == -1) {
                this.i = pueVar.i;
            }
            if (this.a == null && (str = pueVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = pueVar.f;
            }
            if (this.g == -1) {
                this.g = pueVar.g;
            }
            if (this.n == -1) {
                this.n = pueVar.n;
            }
            if (this.o == null && (alignment2 = pueVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = pueVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = pueVar.q;
            }
            if (this.j == -1) {
                this.j = pueVar.j;
                this.k = pueVar.k;
            }
            if (this.r == null) {
                this.r = pueVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = pueVar.s;
            }
            if (!this.e && pueVar.e) {
                b(pueVar.d);
            }
            if (this.m != -1 || (i = pueVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
