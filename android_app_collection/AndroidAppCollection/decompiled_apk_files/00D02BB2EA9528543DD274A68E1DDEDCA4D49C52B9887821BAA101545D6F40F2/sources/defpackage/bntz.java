package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bntz  reason: default package */
/* loaded from: classes.dex */
public final class bntz {
    private static final dcqe p = dcqe.c("bntz");
    private static final int q = bntn.values().length;
    public final bnsn a;
    public final bntb b;
    public final bnty c;
    public int d;
    public int e;
    public int f = 4096;
    public float[] g = new float[20480];
    public int h = 0;
    public int i = 0;
    public bntc j = bntc.a;
    public bntc k = bntc.a;
    public final bntx[] l = new bntx[q];
    public final ArrayDeque<bntw> m = new ArrayDeque<>();
    @dzsi
    public bnvb n = null;
    @dzsi
    public bnrz o = null;

    public bntz(bnsn bnsnVar, bntb bntbVar) {
        this.a = bnsnVar;
        this.b = bntbVar;
        bnty bntyVar = new bnty();
        this.c = bntyVar;
        int k = bntbVar.k(bntyVar.c(), bntyVar.d(), bntyVar.a);
        bntyVar.w = k;
        bntyVar.a(bntbVar, k);
    }

    public final boolean a(@dzsi bnvb bnvbVar, bnrz bnrzVar) {
        int i = this.f;
        if ((i * 5) - this.i <= 2000) {
            if (i == 65536) {
                bvoo.h("Too many labels, can't make label buffer any larger!", new Object[0]);
                return false;
            }
            int i2 = i + i;
            float[] copyOf = Arrays.copyOf(this.g, i2 * 5);
            this.f = i2;
            this.g = copyOf;
            if (this.j.a()) {
                this.b.u(this.j);
                this.j = bntc.a;
            }
            if (this.k.a()) {
                this.b.u(this.k);
                this.k = bntc.a;
            }
        }
        if (this.n != bnvbVar || this.o != bnrzVar) {
            b();
        }
        this.n = bnvbVar;
        this.o = bnrzVar;
        return true;
    }

    public final void b() {
        if (this.h == this.i) {
            return;
        }
        bnrz bnrzVar = this.o;
        dbsk.s(bnrzVar);
        int b = bnrzVar.b();
        bntx bntxVar = this.l[b];
        if (bntxVar == null) {
            bntxVar = new bntx(bnrzVar);
            bntxVar.n(true);
            this.a.h(bntxVar);
            this.l[b] = bntxVar;
        }
        int i = this.h;
        int i2 = (((this.i - i) / 5) / 4) * 6;
        int i3 = ((i / 5) / 4) * 12;
        bntw bntwVar = this.m.isEmpty() ? new bntw() : this.m.pop();
        bntwVar.a = this.n;
        bntwVar.b = i2;
        bntwVar.c = i3;
        bntxVar.a.add(bntwVar);
        this.h = this.i;
    }

    public final void c(bnve bnveVar, bnrz bnrzVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (a(bnveVar.g, bnrzVar)) {
            float f10 = f3 * 0.5f;
            float f11 = 0.5f * f4;
            float f12 = f - f10;
            float f13 = f2 + f11;
            float f14 = f2 - f11;
            float f15 = f + f10;
            g(f12, f13, f12, f14, f15, f14, f15, f13, f5, f6, f7, f8, f9);
        }
    }

    public final void d(bnve bnveVar, bnrz bnrzVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        if (a(bnveVar.g, bnrzVar)) {
            g(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13);
        }
    }

    public final void e(bnve bnveVar, bnrz bnrzVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        if (a(bnveVar.g, bnrzVar)) {
            f(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
        }
    }

    public final void f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12 = f5 * 0.5f;
        float f13 = 0.5f * f6;
        float f14 = f12 * f3;
        float f15 = f12 * f4;
        float f16 = (-f4) * f13;
        float f17 = f13 * f3;
        float f18 = f - f14;
        float f19 = f2 - f15;
        float f20 = f + f14;
        float f21 = f2 + f15;
        g(f18 + f16, f19 + f17, f18 - f16, f19 - f17, f20 - f16, f21 - f17, f20 + f16, f21 + f17, f7, f8, f9, f10, f11);
    }

    public final void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        if (f >= 0.0f || f3 >= 0.0f || f5 >= 0.0f || f7 >= 0.0f) {
            if (f2 < 0.0f && f4 < 0.0f && f6 < 0.0f && f8 < 0.0f) {
                return;
            }
            float f14 = this.d;
            if (f > f14 && f3 > f14 && f5 > f14 && f7 > f14) {
                return;
            }
            float f15 = this.e;
            if (f2 > f15 && f4 > f15 && f6 > f15 && f8 > f15) {
                return;
            }
            float[] fArr = (float[]) dbsk.s(this.g);
            int i = this.i;
            int i2 = i + 1;
            this.i = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.i = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.i = i4;
            fArr[i3] = f13;
            int i5 = i4 + 1;
            this.i = i5;
            fArr[i4] = f9;
            int i6 = i5 + 1;
            this.i = i6;
            float f16 = f10 + f12;
            fArr[i5] = f16;
            int i7 = i6 + 1;
            this.i = i7;
            fArr[i6] = f3;
            int i8 = i7 + 1;
            this.i = i8;
            fArr[i7] = f4;
            int i9 = i8 + 1;
            this.i = i9;
            fArr[i8] = f13;
            int i10 = i9 + 1;
            this.i = i10;
            fArr[i9] = f9;
            int i11 = i10 + 1;
            this.i = i11;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            this.i = i12;
            fArr[i11] = f5;
            int i13 = i12 + 1;
            this.i = i13;
            fArr[i12] = f6;
            int i14 = i13 + 1;
            this.i = i14;
            fArr[i13] = f13;
            int i15 = i14 + 1;
            this.i = i15;
            float f17 = f9 + f11;
            fArr[i14] = f17;
            int i16 = i15 + 1;
            this.i = i16;
            fArr[i15] = f10;
            int i17 = i16 + 1;
            this.i = i17;
            fArr[i16] = f7;
            int i18 = i17 + 1;
            this.i = i18;
            fArr[i17] = f8;
            int i19 = i18 + 1;
            this.i = i19;
            fArr[i18] = f13;
            int i20 = i19 + 1;
            this.i = i20;
            fArr[i19] = f17;
            this.i = i20 + 1;
            fArr[i20] = f16;
        }
    }
}
