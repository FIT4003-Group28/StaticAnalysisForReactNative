package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ahw  reason: default package */
/* loaded from: classes.dex */
public final class ahw {
    public static final ahp a = new ahp();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, ahh ahhVar, aij aijVar, boolean z) {
        ahg ahgVar;
        ahg ahgVar2;
        ahg ahgVar3;
        ahg ahgVar4;
        ahg ahgVar5;
        ahg ahgVar6;
        if (ahhVar.n) {
            return;
        }
        b++;
        if (!(ahhVar instanceof ahi) && ahhVar.K() && c(ahhVar)) {
            ahi.X(ahhVar, aijVar, new ahp());
        }
        ahg L = ahhVar.L(2);
        ahg L2 = ahhVar.L(4);
        int a2 = L.a();
        int a3 = L2.a();
        HashSet hashSet = L.a;
        float f = 0.0f;
        if (hashSet != null && L.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ahg ahgVar7 = (ahg) it.next();
                ahh ahhVar2 = ahgVar7.d;
                int i2 = i + 1;
                boolean c2 = c(ahhVar2);
                if (ahhVar2.K() && c2) {
                    ahi.X(ahhVar2, aijVar, new ahp());
                }
                if (ahhVar2.N() != 3 || c2) {
                    if (!ahhVar2.K()) {
                        ahg ahgVar8 = ahhVar2.f46J;
                        if (ahgVar7 != ahgVar8 || ahhVar2.L.e != null) {
                            ahg ahgVar9 = ahhVar2.L;
                            if (ahgVar7 != ahgVar9 || ahgVar8.e != null) {
                                if (ahgVar7 == ahgVar8 && (ahgVar3 = ahgVar9.e) != null && ahgVar3.c && !ahhVar2.I()) {
                                    e(i2, aijVar, ahhVar2, z);
                                }
                            } else {
                                int b2 = a2 - ahgVar9.b();
                                ahhVar2.w(b2 - ahhVar2.j(), b2);
                                a(i2, ahhVar2, aijVar, z);
                            }
                            f = 0.0f;
                        } else {
                            int b3 = ahgVar8.b() + a2;
                            ahhVar2.w(b3, ahhVar2.j() + b3);
                            a(i2, ahhVar2, aijVar, z);
                        }
                    }
                } else if (ahhVar2.N() == 3 && ahhVar2.w >= 0 && ahhVar2.v >= 0 && (ahhVar2.ag == 8 || (ahhVar2.s == 0 && ahhVar2.W == f))) {
                    if (!ahhVar2.I() && ((ahgVar7 == (ahgVar4 = ahhVar2.f46J) && (ahgVar6 = ahhVar2.L.e) != null && ahgVar6.c) || (ahgVar7 == ahhVar2.L && (ahgVar5 = ahgVar4.e) != null && ahgVar5.c))) {
                        if (!ahhVar2.I()) {
                            f(i2, ahhVar, aijVar, ahhVar2, z);
                        }
                    }
                }
            }
        }
        if (ahhVar instanceof ahk) {
            return;
        }
        HashSet hashSet2 = L2.a;
        if (hashSet2 != null && L2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ahg ahgVar10 = (ahg) it2.next();
                ahh ahhVar3 = ahgVar10.d;
                int i3 = i + 1;
                boolean c3 = c(ahhVar3);
                if (ahhVar3.K() && c3) {
                    ahi.X(ahhVar3, aijVar, new ahp());
                }
                ahg ahgVar11 = ahhVar3.f46J;
                boolean z2 = false;
                if ((ahgVar10 == ahgVar11 && (ahgVar2 = ahhVar3.L.e) != null && ahgVar2.c) || (ahgVar10 == ahhVar3.L && (ahgVar = ahgVar11.e) != null && ahgVar.c)) {
                    z2 = true;
                }
                if (ahhVar3.N() != 3 || c3) {
                    if (!ahhVar3.K()) {
                        ahg ahgVar12 = ahhVar3.f46J;
                        if (ahgVar10 != ahgVar12 || ahhVar3.L.e != null) {
                            ahg ahgVar13 = ahhVar3.L;
                            if (ahgVar10 != ahgVar13 || ahgVar12.e != null) {
                                if (z2 && !ahhVar3.I()) {
                                    e(i3, aijVar, ahhVar3, z);
                                }
                            } else {
                                int b4 = a3 - ahgVar13.b();
                                ahhVar3.w(b4 - ahhVar3.j(), b4);
                                a(i3, ahhVar3, aijVar, z);
                            }
                        } else {
                            int b5 = ahgVar12.b() + a3;
                            ahhVar3.w(b5, ahhVar3.j() + b5);
                            a(i3, ahhVar3, aijVar, z);
                        }
                    }
                } else if (ahhVar3.N() == 3) {
                    if (ahhVar3.w >= 0) {
                        if (ahhVar3.v >= 0) {
                            if (ahhVar3.ag != 8) {
                                if (ahhVar3.s == 0 && ahhVar3.W == 0.0f) {
                                }
                            }
                            if (!ahhVar3.I() && z2 && !ahhVar3.I()) {
                                f(i3, ahhVar, aijVar, ahhVar3, z);
                            }
                        }
                    }
                }
            }
        }
        ahhVar.n = true;
    }

    public static void b(int i, ahh ahhVar, aij aijVar) {
        ahg ahgVar;
        ahg ahgVar2;
        ahg ahgVar3;
        ahg ahgVar4;
        ahg ahgVar5;
        ahg ahgVar6;
        if (ahhVar.o) {
            return;
        }
        c++;
        if (!(ahhVar instanceof ahi) && ahhVar.K() && c(ahhVar)) {
            ahi.X(ahhVar, aijVar, new ahp());
        }
        ahg L = ahhVar.L(3);
        ahg L2 = ahhVar.L(5);
        int a2 = L.a();
        int a3 = L2.a();
        HashSet hashSet = L.a;
        if (hashSet != null && L.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ahg ahgVar7 = (ahg) it.next();
                ahh ahhVar2 = ahgVar7.d;
                int i2 = i + 1;
                boolean c2 = c(ahhVar2);
                if (ahhVar2.K() && c2) {
                    ahi.X(ahhVar2, aijVar, new ahp());
                }
                if (ahhVar2.O() != 3 || c2) {
                    if (!ahhVar2.K()) {
                        ahg ahgVar8 = ahhVar2.K;
                        if (ahgVar7 != ahgVar8 || ahhVar2.M.e != null) {
                            ahg ahgVar9 = ahhVar2.M;
                            if (ahgVar7 == ahgVar9 && ahgVar9.e == null) {
                                int b2 = a2 - ahgVar9.b();
                                ahhVar2.x(b2 - ahhVar2.h(), b2);
                                b(i2, ahhVar2, aijVar);
                            } else if (ahgVar7 == ahgVar8 && (ahgVar3 = ahgVar9.e) != null && ahgVar3.c) {
                                g(i2, aijVar, ahhVar2);
                            }
                        } else {
                            int b3 = ahgVar8.b() + a2;
                            ahhVar2.x(b3, ahhVar2.h() + b3);
                            b(i2, ahhVar2, aijVar);
                        }
                    }
                } else if (ahhVar2.O() == 3 && ahhVar2.z >= 0 && ahhVar2.y >= 0 && (ahhVar2.ag == 8 || (ahhVar2.t == 0 && ahhVar2.W == 0.0f))) {
                    if (!ahhVar2.J() && ((ahgVar7 == (ahgVar4 = ahhVar2.K) && (ahgVar6 = ahhVar2.M.e) != null && ahgVar6.c) || (ahgVar7 == ahhVar2.M && (ahgVar5 = ahgVar4.e) != null && ahgVar5.c))) {
                        if (!ahhVar2.J()) {
                            h(i2, ahhVar, aijVar, ahhVar2);
                        }
                    }
                }
            }
        }
        if (ahhVar instanceof ahk) {
            return;
        }
        HashSet hashSet2 = L2.a;
        if (hashSet2 != null && L2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ahg ahgVar10 = (ahg) it2.next();
                ahh ahhVar3 = ahgVar10.d;
                int i3 = i + 1;
                boolean c3 = c(ahhVar3);
                if (ahhVar3.K() && c3) {
                    ahi.X(ahhVar3, aijVar, new ahp());
                }
                ahg ahgVar11 = ahhVar3.K;
                boolean z = false;
                if ((ahgVar10 == ahgVar11 && (ahgVar2 = ahhVar3.M.e) != null && ahgVar2.c) || (ahgVar10 == ahhVar3.M && (ahgVar = ahgVar11.e) != null && ahgVar.c)) {
                    z = true;
                }
                if (ahhVar3.O() != 3 || c3) {
                    if (!ahhVar3.K()) {
                        ahg ahgVar12 = ahhVar3.K;
                        if (ahgVar10 != ahgVar12 || ahhVar3.M.e != null) {
                            ahg ahgVar13 = ahhVar3.M;
                            if (ahgVar10 != ahgVar13 || ahgVar12.e != null) {
                                if (z && !ahhVar3.J()) {
                                    g(i3, aijVar, ahhVar3);
                                }
                            } else {
                                int b4 = a3 - ahgVar13.b();
                                ahhVar3.x(b4 - ahhVar3.h(), b4);
                                b(i3, ahhVar3, aijVar);
                            }
                        } else {
                            int b5 = ahgVar12.b() + a3;
                            ahhVar3.x(b5, ahhVar3.h() + b5);
                            b(i3, ahhVar3, aijVar);
                        }
                    }
                } else if (ahhVar3.O() == 3 && ahhVar3.z >= 0 && ahhVar3.y >= 0 && (ahhVar3.ag == 8 || (ahhVar3.t == 0 && ahhVar3.W == 0.0f))) {
                    if (!ahhVar3.J() && z && !ahhVar3.J()) {
                        h(i3, ahhVar, aijVar, ahhVar3);
                    }
                }
            }
        }
        ahg L3 = ahhVar.L(6);
        if (L3.a != null && L3.c) {
            int a4 = L3.a();
            Iterator it3 = L3.a.iterator();
            while (it3.hasNext()) {
                ahg ahgVar14 = (ahg) it3.next();
                ahh ahhVar4 = ahgVar14.d;
                int i4 = i + 1;
                boolean c4 = c(ahhVar4);
                if (ahhVar4.K() && c4) {
                    ahi.X(ahhVar4, aijVar, new ahp());
                }
                if (ahhVar4.O() != 3 || c4) {
                    if (!ahhVar4.K() && ahgVar14 == ahhVar4.N) {
                        int b6 = ahgVar14.b() + a4;
                        if (ahhVar4.F) {
                            int i5 = b6 - ahhVar4.aa;
                            int i6 = ahhVar4.V;
                            ahhVar4.Z = i5;
                            ahhVar4.K.e(i5);
                            ahhVar4.M.e(i5 + i6);
                            ahhVar4.N.e(b6);
                            ahhVar4.m = true;
                        }
                        b(i4, ahhVar4, aijVar);
                    }
                }
            }
        }
        ahhVar.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.ahh r9) {
        /*
            int r0 = r9.N()
            int r1 = r9.O()
            ahh r2 = r9.T
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.N()
        L12:
            if (r2 == 0) goto L17
            r2.O()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4f
            boolean r7 = r9.e()
            if (r7 != 0) goto L4f
            if (r0 == r2) goto L4f
            if (r0 != r4) goto L3c
            int r0 = r9.s
            if (r0 != 0) goto L3b
            float r0 = r9.W
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
            boolean r0 = r9.G(r5)
            if (r0 != 0) goto L39
            goto L3b
        L39:
            r0 = 3
            goto L4f
        L3b:
            r0 = 3
        L3c:
            if (r0 != r4) goto L4d
            int r7 = r9.s
            if (r7 != r6) goto L4d
            int r7 = r9.j()
            boolean r7 = r9.H(r5, r7)
            if (r7 == 0) goto L4d
            goto L4f
        L4d:
            r7 = 0
            goto L50
        L4f:
            r7 = 1
        L50:
            if (r1 == r6) goto L7f
            boolean r8 = r9.f()
            if (r8 != 0) goto L7f
            if (r1 == r2) goto L7f
            if (r1 != r4) goto L6c
            int r1 = r9.t
            if (r1 != 0) goto L6c
            float r1 = r9.W
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6c
            boolean r1 = r9.G(r6)
            if (r1 != 0) goto L7f
        L6c:
            if (r0 != r4) goto L7d
            int r0 = r9.t
            if (r0 != r6) goto L7d
            int r0 = r9.h()
            boolean r0 = r9.H(r6, r0)
            if (r0 == 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            float r9 = r9.W
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L8e
            if (r7 != 0) goto L8d
            if (r0 != 0) goto L8d
            r0 = 0
            r7 = 0
            goto L8e
        L8d:
            return r6
        L8e:
            if (r7 == 0) goto L93
            if (r0 == 0) goto L93
            return r6
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahw.c(ahh):boolean");
    }

    public static void d(ahe aheVar, aij aijVar, int i, boolean z) {
        if (aheVar.c()) {
            if (i == 0) {
                a(1, aheVar, aijVar, z);
            } else {
                b(1, aheVar, aijVar);
            }
        }
    }

    private static void e(int i, aij aijVar, ahh ahhVar, boolean z) {
        float f = ahhVar.ad;
        int a2 = ahhVar.f46J.e.a();
        int a3 = ahhVar.L.e.a();
        int b2 = ahhVar.f46J.b() + a2;
        int b3 = a3 - ahhVar.L.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int j = ahhVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        ahhVar.w(i3, i4);
        a(i + 1, ahhVar, aijVar, z);
    }

    private static void f(int i, ahh ahhVar, aij aijVar, ahh ahhVar2, boolean z) {
        int j;
        float f = ahhVar2.ad;
        int a2 = ahhVar2.f46J.e.a() + ahhVar2.f46J.b();
        int a3 = ahhVar2.L.e.a() - ahhVar2.L.b();
        if (a3 >= a2) {
            int j2 = ahhVar2.j();
            if (ahhVar2.ag != 8) {
                int i2 = ahhVar2.s;
                if (i2 == 2) {
                    if (!(ahhVar instanceof ahi)) {
                        j = ahhVar.T.j();
                    } else {
                        j = ahhVar.j();
                    }
                    j2 = (int) (ahhVar2.ad * 0.5f * j);
                } else if (i2 == 0) {
                    j2 = a3 - a2;
                }
                j2 = Math.max(ahhVar2.v, j2);
                int i3 = ahhVar2.w;
                if (i3 > 0) {
                    j2 = Math.min(i3, j2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - j2)) + 0.5f));
            ahhVar2.w(i4, j2 + i4);
            a(i + 1, ahhVar2, aijVar, z);
        }
    }

    private static void g(int i, aij aijVar, ahh ahhVar) {
        float f = ahhVar.ae;
        int a2 = ahhVar.K.e.a();
        int a3 = ahhVar.M.e.a();
        int b2 = ahhVar.K.b() + a2;
        int b3 = a3 - ahhVar.M.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int h = ahhVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        ahhVar.x(i4, i5);
        b(i + 1, ahhVar, aijVar);
    }

    private static void h(int i, ahh ahhVar, aij aijVar, ahh ahhVar2) {
        int h;
        float f = ahhVar2.ae;
        int a2 = ahhVar2.K.e.a() + ahhVar2.K.b();
        int a3 = ahhVar2.M.e.a() - ahhVar2.M.b();
        if (a3 >= a2) {
            int h2 = ahhVar2.h();
            if (ahhVar2.ag != 8) {
                int i2 = ahhVar2.t;
                if (i2 == 2) {
                    if (!(ahhVar instanceof ahi)) {
                        h = ahhVar.T.h();
                    } else {
                        h = ahhVar.h();
                    }
                    h2 = (int) (f * 0.5f * h);
                } else if (i2 == 0) {
                    h2 = a3 - a2;
                }
                h2 = Math.max(ahhVar2.y, h2);
                int i3 = ahhVar2.z;
                if (i3 > 0) {
                    h2 = Math.min(i3, h2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - h2)) + 0.5f));
            ahhVar2.x(i4, h2 + i4);
            b(i + 1, ahhVar2, aijVar);
        }
    }
}
