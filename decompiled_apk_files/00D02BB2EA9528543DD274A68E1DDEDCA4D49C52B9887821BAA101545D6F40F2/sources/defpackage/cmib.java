package defpackage;

import android.text.Layout;
/* compiled from: PG */
/* renamed from: cmib  reason: default package */
/* loaded from: classes5.dex */
final class cmib {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;

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

    public final void d(cmib cmibVar) {
        int i;
        Layout.Alignment alignment;
        String str;
        if (cmibVar != null) {
            if (!this.c && cmibVar.c) {
                c(cmibVar.b);
            }
            if (this.h == -1) {
                this.h = cmibVar.h;
            }
            if (this.i == -1) {
                this.i = cmibVar.i;
            }
            if (this.a == null && (str = cmibVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = cmibVar.f;
            }
            if (this.g == -1) {
                this.g = cmibVar.g;
            }
            if (this.n == -1) {
                this.n = cmibVar.n;
            }
            if (this.o == null && (alignment = cmibVar.o) != null) {
                this.o = alignment;
            }
            if (this.p == -1) {
                this.p = cmibVar.p;
            }
            if (this.j == -1) {
                this.j = cmibVar.j;
                this.k = cmibVar.k;
            }
            if (!this.e && cmibVar.e) {
                b(cmibVar.d);
            }
            if (this.m != -1 || (i = cmibVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
