package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: agy  reason: default package */
/* loaded from: classes.dex */
public final class agy {
    public static boolean a = false;
    public static long b = 0;
    private static int k = 1000;
    agw[] e;
    public final agx j;
    private final agw r;
    private agw s;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private ahc[] p = new ahc[k];
    private int q = 0;

    public agy() {
        this.e = null;
        this.e = new agw[32];
        t();
        agx agxVar = new agx();
        this.j = agxVar;
        this.r = new ahb(agxVar);
        this.s = new agw(agxVar);
    }

    public static final int o(Object obj) {
        ahc ahcVar = ((ahg) obj).h;
        if (ahcVar != null) {
            return (int) (ahcVar.f + 0.5f);
        }
        return 0;
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            agw agwVar = this.e[i];
            agwVar.a.f = agwVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (agw[]) Arrays.copyOf(this.e, i2);
        agx agxVar = this.j;
        agxVar.a = (ahc[]) Arrays.copyOf(agxVar.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            agw agwVar = this.e[i];
            if (agwVar != null) {
                this.j.b.b(agwVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(agw agwVar) {
        agv agvVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            ahc ahcVar = agwVar.a;
            if (ahcVar != null) {
                this.n[ahcVar.c] = true;
            }
            ahc k2 = agwVar.k(this.n);
            if (k2 != null) {
                boolean[] zArr = this.n;
                int i5 = k2.c;
                if (zArr[i5]) {
                    return;
                }
                zArr[i5] = true;
            }
            if (k2 != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    agw agwVar2 = this.e[i7];
                    if (agwVar2.a.n != 1 && !agwVar2.d && (i = (agvVar = agwVar2.e).f) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i != -1 && i8 < agvVar.a) {
                                if (agvVar.c[i] != k2.c) {
                                    i = agvVar.d[i];
                                    i8++;
                                } else {
                                    float a2 = agwVar2.e.a(k2);
                                    if (a2 < 0.0f) {
                                        float f2 = (-agwVar2.b) / a2;
                                        if (f2 < f) {
                                            i6 = i7;
                                            f = f2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    agw agwVar3 = this.e[i6];
                    agwVar3.a.d = -1;
                    agwVar3.b(k2);
                    ahc ahcVar2 = agwVar3.a;
                    ahcVar2.d = i6;
                    ahcVar2.e(this, agwVar3);
                }
            } else {
                z = true;
            }
        }
    }

    private final ahc v(int i) {
        ahc ahcVar = (ahc) this.j.c.a();
        if (ahcVar == null) {
            ahcVar = new ahc(i);
            ahcVar.n = i;
        } else {
            ahcVar.c();
            ahcVar.n = i;
        }
        int i2 = this.q;
        int i3 = k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            k = i4;
            this.p = (ahc[]) Arrays.copyOf(this.p, i4);
        }
        ahc[] ahcVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        ahcVarArr[i5] = ahcVar;
        return ahcVar;
    }

    public final agw a() {
        agw agwVar = (agw) this.j.b.a();
        if (agwVar == null) {
            agwVar = new agw(this.j);
            b++;
        } else {
            agwVar.a = null;
            agwVar.e.f();
            agwVar.b = 0.0f;
            agwVar.d = false;
        }
        ahc.a++;
        return agwVar;
    }

    public final ahc b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        ahg ahgVar = (ahg) obj;
        ahc ahcVar = ahgVar.h;
        if (ahcVar == null) {
            ahgVar.i();
            ahcVar = ahgVar.h;
        }
        int i = ahcVar.c;
        if (i != -1) {
            if (i > this.d || this.j.a[i] == null) {
                if (i != -1) {
                    ahcVar.c();
                }
            }
            return ahcVar;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        ahcVar.c = i2;
        ahcVar.n = 1;
        this.j.a[i2] = ahcVar;
        return ahcVar;
    }

    public final ahc c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        ahc v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        this.j.a[i] = v;
        return v;
    }

    public final void d(ahc ahcVar, ahc ahcVar2, int i, float f, ahc ahcVar3, ahc ahcVar4, int i2, int i3) {
        agw a2 = a();
        if (ahcVar2 == ahcVar3) {
            a2.e.g(ahcVar, 1.0f);
            a2.e.g(ahcVar4, 1.0f);
            a2.e.g(ahcVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(ahcVar, 1.0f);
            a2.e.g(ahcVar2, -1.0f);
            a2.e.g(ahcVar3, -1.0f);
            a2.e.g(ahcVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(ahcVar, -1.0f);
            a2.e.g(ahcVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(ahcVar4, -1.0f);
            a2.e.g(ahcVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(ahcVar, f2);
            a2.e.g(ahcVar2, -f2);
            a2.e.g(ahcVar3, -f);
            a2.e.g(ahcVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.agw r17) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.e(agw):void");
    }

    public final void f(ahc ahcVar, int i) {
        int i2 = ahcVar.d;
        if (i2 == -1) {
            ahcVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                ahc ahcVar2 = this.j.a[i3];
            }
        } else if (i2 != -1) {
            agw agwVar = this.e[i2];
            if (agwVar.d) {
                agwVar.b = i;
            } else if (agwVar.e.a == 0) {
                agwVar.d = true;
                agwVar.b = i;
            } else {
                agw a2 = a();
                if (i < 0) {
                    a2.b = -i;
                    a2.e.g(ahcVar, 1.0f);
                } else {
                    a2.b = i;
                    a2.e.g(ahcVar, -1.0f);
                }
                e(a2);
            }
        } else {
            agw a3 = a();
            a3.a = ahcVar;
            float f = i;
            ahcVar.f = f;
            a3.b = f;
            a3.d = true;
            e(a3);
        }
    }

    public final void g(ahc ahcVar, ahc ahcVar2, int i, int i2) {
        agw a2 = a();
        ahc c = c();
        c.e = 0;
        a2.h(ahcVar, ahcVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(ahc ahcVar, ahc ahcVar2, int i, int i2) {
        agw a2 = a();
        ahc c = c();
        c.e = 0;
        a2.i(ahcVar, ahcVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(agw agwVar, int i, int i2) {
        agwVar.e.g(p(i2), i);
    }

    public final void j() {
        if (this.r.e()) {
            r();
        } else if (this.g) {
            for (int i = 0; i < this.i; i++) {
                if (!this.e[i].d) {
                    l(this.r);
                    return;
                }
            }
            r();
        } else {
            l(this.r);
        }
    }

    public final void k() {
        agx agxVar;
        int i = 0;
        while (true) {
            agxVar = this.j;
            ahc[] ahcVarArr = agxVar.a;
            if (i >= ahcVarArr.length) {
                break;
            }
            ahc ahcVar = ahcVarArr[i];
            if (ahcVar != null) {
                ahcVar.c();
            }
            i++;
        }
        agz agzVar = agxVar.c;
        ahc[] ahcVarArr2 = this.p;
        int i2 = this.q;
        int length = ahcVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ahc ahcVar2 = ahcVarArr2[i3];
            int i4 = agzVar.b;
            Object[] objArr = agzVar.a;
            if (i4 < 256) {
                objArr[i4] = ahcVar2;
                agzVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.j.a, (Object) null);
        this.d = 0;
        ahb ahbVar = (ahb) this.r;
        ahbVar.f = 0;
        ahbVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            agw agwVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new agw(this.j);
    }

    final void l(agw agwVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            agw agwVar2 = this.e[i];
            if (agwVar2.a.n != 1) {
                float f = 0.0f;
                if (agwVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.i) {
                            agw agwVar3 = this.e[i3];
                            if (agwVar3.a.n != 1 && !agwVar3.d && agwVar3.b < f) {
                                int i7 = agwVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    ahc d = agwVar3.e.d(i8);
                                    float a2 = agwVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            agw agwVar4 = this.e[i4];
                            agwVar4.a.d = -1;
                            agwVar4.b(this.j.a[i5]);
                            ahc ahcVar = agwVar4.a;
                            ahcVar.d = i4;
                            ahcVar.e(this, agwVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(agwVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.ahc r6, defpackage.ahc r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L18
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = 8
        L18:
            agw r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L39
            if (r8 >= 0) goto L27
            int r8 = -r8
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2e
            goto L39
        L2e:
            agv r8 = r1.e
            r8.g(r6, r2)
            agv r6 = r1.e
            r6.g(r7, r3)
            goto L43
        L39:
            agv r8 = r1.e
            r8.g(r6, r3)
            agv r6 = r1.e
            r6.g(r7, r2)
        L43:
            if (r9 == r0) goto L48
            r1.f(r5, r9)
        L48:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.m(ahc, ahc, int, int):void");
    }

    public final void n(ahc ahcVar, ahc ahcVar2, ahc ahcVar3, ahc ahcVar4, float f) {
        agw a2 = a();
        a2.g(ahcVar, ahcVar2, ahcVar3, ahcVar4, f);
        e(a2);
    }

    public final ahc p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        ahc v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        this.j.a[i2] = v;
        ahb ahbVar = (ahb) this.r;
        aha ahaVar = ahbVar.g;
        ahaVar.a = v;
        Arrays.fill(ahaVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        ahbVar.m(v);
        return v;
    }

    private final void q(agw agwVar) {
        int i;
        if (agwVar.d) {
            agwVar.a.d(this, agwVar.b);
        } else {
            agw[] agwVarArr = this.e;
            int i2 = this.i;
            agwVarArr[i2] = agwVar;
            ahc ahcVar = agwVar.a;
            ahcVar.d = i2;
            this.i = i2 + 1;
            ahcVar.e(this, agwVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                agw agwVar2 = this.e[i3];
                if (agwVar2 != null && agwVar2.d) {
                    agwVar2.a.d(this, agwVar2.b);
                    this.j.b.b(agwVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        agw[] agwVarArr2 = this.e;
                        int i6 = i4 - 1;
                        agw agwVar3 = agwVarArr2[i4];
                        agwVarArr2[i6] = agwVar3;
                        ahc ahcVar2 = agwVar3.a;
                        if (ahcVar2.d == i4) {
                            ahcVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }
}
