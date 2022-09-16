package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bz  reason: default package */
/* loaded from: classes2.dex */
public final class bz {
    private static int h = 1000;
    public bw[] c;
    public final bx g;
    int a = 0;
    public final by b = new by();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private cb[] l = new cb[h];
    private int m = 0;
    private bw[] n = new bw[32];

    public bz() {
        this.c = null;
        this.c = new bw[32];
        r();
        this.g = new bx();
    }

    public static bw b(bz bzVar, cb cbVar, cb cbVar2, int i, float f, cb cbVar3, cb cbVar4, int i2, boolean z) {
        bw a = bzVar.a();
        a.d(cbVar, cbVar2, i, f, cbVar3, cbVar4, i2);
        if (z) {
            cb d = bzVar.d();
            cb d2 = bzVar.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }

    public static bw c(bz bzVar, cb cbVar, cb cbVar2, int i, boolean z) {
        bw a = bzVar.a();
        a.h(cbVar, cbVar2, i);
        if (z) {
            bzVar.k(a, 1);
        }
        return a;
    }

    public static final int p(Object obj) {
        cb cbVar = ((cc) obj).f;
        if (cbVar != null) {
            return (int) (cbVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (bw[]) Arrays.copyOf(this.c, i2);
        bx bxVar = this.g;
        bxVar.a = (cb[]) Arrays.copyOf(bxVar.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            bw[] bwVarArr = this.c;
            if (i < bwVarArr.length) {
                bw bwVar = bwVarArr[i];
                if (bwVar != null) {
                    this.g.b.b(bwVar);
                }
                this.c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    private final cb s(int i) {
        cb cbVar = (cb) this.g.c.a();
        if (cbVar == null) {
            cbVar = new cb(i);
        } else {
            cbVar.b();
            cbVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (cb[]) Arrays.copyOf(this.l, i4);
        }
        cb[] cbVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        cbVarArr[i5] = cbVar;
        return cbVar;
    }

    public final bw a() {
        bw bwVar = (bw) this.g.b.a();
        if (bwVar == null) {
            return new bw(this.g);
        }
        bwVar.a = null;
        bv bvVar = bwVar.d;
        bvVar.f = -1;
        bvVar.g = -1;
        bvVar.h = false;
        bvVar.a = 0;
        bwVar.b = 0.0f;
        bwVar.e = false;
        return bwVar;
    }

    public final cb d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        cb s = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    public final cb e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        cc ccVar = (cc) obj;
        cb cbVar = ccVar.f;
        if (cbVar == null) {
            ccVar.e();
            cbVar = ccVar.f;
        }
        int i = cbVar.a;
        if (i != -1) {
            if (i > this.a || this.g.a[i] == null) {
                if (i != -1) {
                    cbVar.b();
                }
            }
            return cbVar;
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        cbVar.a = i2;
        cbVar.h = 1;
        this.g.a[i2] = cbVar;
        return cbVar;
    }

    public final cb f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        cb s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.bw r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.g(bw):void");
    }

    public final void h(cb cbVar, int i) {
        int i2 = cbVar.b;
        if (i2 != -1) {
            bw bwVar = this.c[i2];
            if (bwVar.e) {
                bwVar.b = i;
                return;
            }
            bw a = a();
            a.g(cbVar, i);
            g(a);
            return;
        }
        bw a2 = a();
        a2.a = cbVar;
        float f = i;
        cbVar.d = f;
        a2.b = f;
        a2.e = true;
        g(a2);
    }

    public final void i(cb cbVar, cb cbVar2, int i, int i2) {
        bw a = a();
        cb f = f();
        f.c = i2;
        a.i(cbVar, cbVar2, f, i);
        g(a);
    }

    public final void j(cb cbVar, cb cbVar2, int i, int i2) {
        bw a = a();
        cb f = f();
        f.c = i2;
        a.j(cbVar, cbVar2, f, i);
        g(a);
    }

    public final void k(bw bwVar, int i) {
        bwVar.d.f(d(), i);
    }

    public final void l() {
        bx bxVar;
        int i = 0;
        while (true) {
            bxVar = this.g;
            cb[] cbVarArr = bxVar.a;
            if (i >= cbVarArr.length) {
                break;
            }
            cb cbVar = cbVarArr[i];
            if (cbVar != null) {
                cbVar.b();
            }
            i++;
        }
        ca caVar = bxVar.c;
        cb[] cbVarArr2 = this.l;
        int i2 = this.m;
        int length = cbVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cb cbVar2 = cbVarArr2[i3];
            int i4 = caVar.b;
            Object[] objArr = caVar.a;
            if (i4 < 256) {
                objArr[i4] = cbVar2;
                caVar.b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(cb cbVar, cb cbVar2, int i, float f, cb cbVar3, cb cbVar4, int i2) {
        bw a = a();
        a.d(cbVar, cbVar2, i, f, cbVar3, cbVar4, i2);
        cb d = d();
        cb d2 = d();
        d.c = 4;
        d2.c = 4;
        a.c(d, d2);
        g(a);
    }

    public final void n(cb cbVar, cb cbVar2, int i, int i2) {
        bw a = a();
        a.h(cbVar, cbVar2, i);
        cb d = d();
        cb d2 = d();
        d.c = i2;
        d2.c = i2;
        a.c(d, d2);
        g(a);
    }

    public final void o(by byVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            bw bwVar = this.c[i];
            if (bwVar.a.h != 1 && bwVar.b < 0.0f) {
                while (true) {
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    float f = Float.MAX_VALUE;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        bw bwVar2 = this.c[i5];
                        if (bwVar2.a.h != 1 && bwVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                cb cbVar = this.g.a[i6];
                                float a = bwVar2.d.a(cbVar);
                                if (a > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = cbVar.e[i7] / a;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    bw bwVar3 = this.c[i2];
                    bwVar3.a.b = -1;
                    bwVar3.a(this.g.a[i3]);
                    bwVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(bwVar3);
                    }
                    byVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            bw bwVar4 = this.c[i9];
            if (bwVar4.a.h != 1 && bwVar4.b < 0.0f) {
                return;
            }
        }
    }
}
