package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dy  reason: default package */
/* loaded from: classes6.dex */
public final class dy {
    private static int h = 1000;
    public dv[] c;
    public final dw g;
    int a = 0;
    public final dx b = new dx();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private ea[] l = new ea[h];
    private int m = 0;
    private dv[] n = new dv[32];

    public dy() {
        this.c = null;
        this.c = new dv[32];
        r();
        this.g = new dw();
    }

    public static dv k(dy dyVar, ea eaVar, ea eaVar2, int i, boolean z) {
        dv c = dyVar.c();
        c.h(eaVar, eaVar2, i);
        if (z) {
            dyVar.e(c, 1);
        }
        return c;
    }

    public static dv l(dy dyVar, ea eaVar, ea eaVar2, int i, float f, ea eaVar3, ea eaVar4, int i2, boolean z) {
        dv c = dyVar.c();
        c.d(eaVar, eaVar2, i, f, eaVar3, eaVar4, i2);
        if (z) {
            ea f2 = dyVar.f();
            ea f3 = dyVar.f();
            f2.c = 4;
            f3.c = 4;
            c.c(f2, f3);
        }
        return c;
    }

    public static final int p(Object obj) {
        ea eaVar = ((ec) obj).f;
        if (eaVar != null) {
            return (int) (eaVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (dv[]) Arrays.copyOf(this.c, i2);
        dw dwVar = this.g;
        dwVar.a = (ea[]) Arrays.copyOf(dwVar.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            dv[] dvVarArr = this.c;
            if (i < dvVarArr.length) {
                dv dvVar = dvVarArr[i];
                if (dvVar != null) {
                    this.g.b.b(dvVar);
                }
                this.c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    private final ea s(int i) {
        ea eaVar = (ea) this.g.c.a();
        if (eaVar == null) {
            eaVar = new ea(i);
        } else {
            eaVar.b();
            eaVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (ea[]) Arrays.copyOf(this.l, i4);
        }
        ea[] eaVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        eaVarArr[i5] = eaVar;
        return eaVar;
    }

    public final void a() {
        dw dwVar;
        int i = 0;
        while (true) {
            dwVar = this.g;
            ea[] eaVarArr = dwVar.a;
            if (i >= eaVarArr.length) {
                break;
            }
            ea eaVar = eaVarArr[i];
            if (eaVar != null) {
                eaVar.b();
            }
            i++;
        }
        dz dzVar = dwVar.c;
        ea[] eaVarArr2 = this.l;
        int i2 = this.m;
        int length = eaVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ea eaVar2 = eaVarArr2[i3];
            int i4 = dzVar.b;
            Object[] objArr = dzVar.a;
            if (i4 < 256) {
                objArr[i4] = eaVar2;
                dzVar.b = i4 + 1;
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

    public final ea b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        ec ecVar = (ec) obj;
        ea eaVar = ecVar.f;
        if (eaVar == null) {
            ecVar.e();
            eaVar = ecVar.f;
        }
        int i = eaVar.a;
        if (i != -1) {
            if (i > this.a || this.g.a[i] == null) {
                if (i != -1) {
                    eaVar.b();
                }
            }
            return eaVar;
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        eaVar.a = i2;
        eaVar.h = 1;
        this.g.a[i2] = eaVar;
        return eaVar;
    }

    public final dv c() {
        dv dvVar = (dv) this.g.b.a();
        if (dvVar == null) {
            return new dv(this.g);
        }
        dvVar.a = null;
        du duVar = dvVar.d;
        duVar.f = -1;
        duVar.g = -1;
        duVar.h = false;
        duVar.a = 0;
        dvVar.b = 0.0f;
        dvVar.e = false;
        return dvVar;
    }

    public final ea d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ea s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    public final void e(dv dvVar, int i) {
        dvVar.d.a(f(), i);
    }

    public final ea f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ea s = s(4);
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
    public final void g(defpackage.dv r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy.g(dv):void");
    }

    public final void h(ea eaVar, ea eaVar2, int i, int i2) {
        dv c = c();
        ea d = d();
        d.c = i2;
        c.i(eaVar, eaVar2, d, i);
        g(c);
    }

    public final void i(ea eaVar, ea eaVar2, int i, int i2) {
        dv c = c();
        ea d = d();
        d.c = i2;
        c.j(eaVar, eaVar2, d, i);
        g(c);
    }

    public final void j(ea eaVar, int i) {
        int i2 = eaVar.b;
        if (i2 != -1) {
            dv dvVar = this.c[i2];
            if (dvVar.e) {
                dvVar.b = i;
                return;
            }
            dv c = c();
            c.g(eaVar, i);
            g(c);
            return;
        }
        dv c2 = c();
        c2.a = eaVar;
        float f = i;
        eaVar.d = f;
        c2.b = f;
        c2.e = true;
        g(c2);
    }

    public final void m(ea eaVar, ea eaVar2, int i, float f, ea eaVar3, ea eaVar4, int i2) {
        dv c = c();
        c.d(eaVar, eaVar2, i, f, eaVar3, eaVar4, i2);
        ea f2 = f();
        ea f3 = f();
        f2.c = 4;
        f3.c = 4;
        c.c(f2, f3);
        g(c);
    }

    public final void n(ea eaVar, ea eaVar2, int i, int i2) {
        dv c = c();
        c.h(eaVar, eaVar2, i);
        ea f = f();
        ea f2 = f();
        f.c = i2;
        f2.c = i2;
        c.c(f, f2);
        g(c);
    }

    public final void o(dx dxVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            dv dvVar = this.c[i];
            if (dvVar.a.h != 1 && dvVar.b < 0.0f) {
                while (true) {
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    float f = Float.MAX_VALUE;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        dv dvVar2 = this.c[i5];
                        if (dvVar2.a.h != 1 && dvVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                ea eaVar = this.g.a[i6];
                                float g = dvVar2.d.g(eaVar);
                                if (g > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = eaVar.e[i7] / g;
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
                    dv dvVar3 = this.c[i2];
                    dvVar3.a.b = -1;
                    dvVar3.b(this.g.a[i3]);
                    dvVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(dvVar3);
                    }
                    dxVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            dv dvVar4 = this.c[i9];
            if (dvVar4.a.h != 1 && dvVar4.b < 0.0f) {
                return;
            }
        }
    }
}
