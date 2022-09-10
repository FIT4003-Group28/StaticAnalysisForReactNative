package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ee  reason: default package */
/* loaded from: classes6.dex */
public final class ee extends ei {
    int ag;
    int ah;
    private eh am;
    protected final dy af = new dy();
    private int an = 0;
    private int ao = 0;
    private ed[] ap = new ed[4];
    private ed[] aq = new ed[4];
    private ed[] ar = new ed[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final ed[] at = new ed[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Removed duplicated region for block: B:259:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(defpackage.dy r31) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.G(dy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x052e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.dy r31) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.H(dy):void");
    }

    private final int I(dy dyVar, ed[] edVarArr, ed edVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        ed edVar2 = null;
        edVarArr[0] = null;
        edVarArr[2] = null;
        edVarArr[1] = null;
        edVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            ec ecVar = edVar.i.b;
            boolean z = ecVar == null || ecVar.a == this;
            edVar.ab = null;
            ed edVar3 = edVar.K != 8 ? edVar : null;
            ed edVar4 = edVar;
            ed edVar5 = null;
            ed edVar6 = edVar3;
            i2 = 0;
            while (edVar4.k.b != null) {
                edVar4.ab = edVar2;
                if (edVar4.K != 8) {
                    if (edVar3 == null) {
                        edVar3 = edVar4;
                    }
                    if (edVar6 != null && edVar6 != edVar4) {
                        edVar6.ab = edVar4;
                    }
                    edVar6 = edVar4;
                } else {
                    ec ecVar2 = edVar4.i;
                    dyVar.n(ecVar2.f, ecVar2.b.f, 0, 5);
                    dyVar.n(edVar4.k.f, edVar4.i.f, 0, 5);
                }
                if (edVar4.K != 8 && edVar4.ad == 3) {
                    if (edVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (edVar4.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        ed[] edVarArr2 = this.ap;
                        int length = edVarArr2.length;
                        if (i4 >= length) {
                            this.ap = (ed[]) Arrays.copyOf(edVarArr2, length + length);
                        }
                        this.ap[i2] = edVar4;
                        i2 = i4;
                    }
                }
                ed edVar7 = edVar4.k.b.a;
                ec ecVar3 = edVar7.i.b;
                if (ecVar3 == null || ecVar3.a != edVar4 || edVar7 == edVar4) {
                    break;
                }
                edVar5 = edVar7;
                edVar4 = edVar5;
                edVar2 = null;
                f = 0.0f;
            }
            ec ecVar4 = edVar4.k.b;
            if (ecVar4 != null && ecVar4.a != this) {
                z = false;
            }
            if (edVar.i.b == null || edVar5.k.b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            edVar.X = z;
            edVar5.ab = null;
            edVarArr[0] = edVar;
            edVarArr[2] = edVar3;
            edVarArr[c2] = edVar5;
            edVarArr[3] = edVar6;
        } else {
            ec ecVar5 = edVar.j.b;
            boolean z2 = ecVar5 == null || ecVar5.a == this;
            ed edVar8 = null;
            edVar.ac = null;
            ed edVar9 = edVar;
            ed edVar10 = null;
            ed edVar11 = edVar.K != 8 ? edVar : null;
            ed edVar12 = edVar11;
            int i5 = 0;
            while (edVar9.l.b != null) {
                edVar9.ac = edVar8;
                if (edVar9.K != 8) {
                    if (edVar11 == null) {
                        edVar11 = edVar9;
                    }
                    if (edVar12 != null && edVar12 != edVar9) {
                        edVar12.ac = edVar9;
                    }
                    edVar12 = edVar9;
                } else {
                    ec ecVar6 = edVar9.j;
                    dyVar.n(ecVar6.f, ecVar6.b.f, 0, i3);
                    dyVar.n(edVar9.l.f, edVar9.j.f, 0, i3);
                }
                if (edVar9.K != 8 && edVar9.ae == 3) {
                    if (edVar9.ad == 3) {
                        zArr[0] = false;
                    }
                    if (edVar9.u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        ed[] edVarArr3 = this.ap;
                        int length2 = edVarArr3.length;
                        if (i6 >= length2) {
                            this.ap = (ed[]) Arrays.copyOf(edVarArr3, length2 + length2);
                        }
                        this.ap[i5] = edVar9;
                        i5 = i6;
                    }
                }
                ed edVar13 = edVar9.l.b.a;
                ec ecVar7 = edVar13.j.b;
                if (ecVar7 == null || ecVar7.a != edVar9 || edVar13 == edVar9) {
                    break;
                }
                edVar10 = edVar13;
                edVar9 = edVar10;
                edVar8 = null;
                i3 = 5;
            }
            i2 = i5;
            ec ecVar8 = edVar9.l.b;
            if (ecVar8 != null && ecVar8.a != this) {
                z2 = false;
            }
            if (edVar.j.b == null || edVar10.l.b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            edVar.Y = z2;
            edVar10.ac = null;
            edVarArr[0] = edVar;
            edVarArr[2] = edVar11;
            edVarArr[c] = edVar10;
            edVarArr[3] = edVar12;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05e2 A[LOOP:16: B:284:0x05e0->B:285:0x05e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024f  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // defpackage.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.A():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r12 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.ed r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.B(ed, boolean[]):void");
    }

    public final void C(ed edVar, boolean[] zArr) {
        int i;
        ed edVar2;
        int i2;
        ec ecVar;
        ec ecVar2;
        ec ecVar3;
        int i3;
        boolean z;
        ec ecVar4;
        ec ecVar5;
        ec ecVar6;
        ec ecVar7;
        ed edVar3;
        boolean z2 = false;
        r2 = 0;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (edVar.ae != 3 || edVar.ad == 3 || edVar.u <= 0.0f) {
            int f = edVar.f();
            edVar.U = true;
            if (edVar instanceof ef) {
                ef efVar = (ef) edVar;
                if (efVar.ai == 0) {
                    f = efVar.ag;
                    if (f == -1) {
                        int i5 = efVar.ah;
                        if (i5 != -1) {
                            i4 = i5;
                        }
                        f = 0;
                    }
                } else {
                    i4 = f;
                }
                i = f;
                f = i4;
            } else {
                ec ecVar8 = edVar.m;
                if (ecVar8.b == null && edVar.j.b == null && edVar.l.b == null) {
                    i = edVar.x + f;
                } else {
                    ec ecVar9 = edVar.l.b;
                    if (ecVar9 == null || (ecVar7 = edVar.j.b) == null || (ecVar9 != ecVar7 && ((edVar3 = ecVar9.a) != ecVar7.a || edVar3 == edVar.r))) {
                        if (ecVar8.c()) {
                            ed edVar4 = edVar.m.b.a;
                            if (!edVar4.U) {
                                C(edVar4, zArr);
                            }
                            int max = Math.max((edVar4.L - edVar4.t) + f, f);
                            int max2 = Math.max((edVar4.O - edVar4.t) + f, f);
                            if (edVar.K == 8) {
                                int i6 = edVar.t;
                                max -= i6;
                                max2 -= i6;
                            }
                            edVar.L = max;
                            edVar.O = max2;
                            return;
                        }
                        ed edVar5 = null;
                        if (edVar.j.c()) {
                            ec ecVar10 = edVar.j;
                            edVar2 = ecVar10.b.a;
                            i = ecVar10.a() + f;
                            if (!edVar2.c() && !edVar2.U) {
                                C(edVar2, zArr);
                            }
                        } else {
                            i = f;
                            edVar2 = null;
                        }
                        if (edVar.l.c()) {
                            ec ecVar11 = edVar.l;
                            ed edVar6 = ecVar11.b.a;
                            f += ecVar11.a();
                            if (!edVar6.c() && !edVar6.U) {
                                C(edVar6, zArr);
                            }
                            edVar5 = edVar6;
                        }
                        if (edVar.j.b != null && !edVar2.c()) {
                            int i7 = edVar.j.b.g;
                            if (i7 == 3) {
                                i3 = edVar2.L - edVar2.f();
                            } else {
                                if (i7 == 5) {
                                    i3 = edVar2.L;
                                }
                                z = !edVar2.R || !((ecVar5 = edVar2.j.b) == null || ecVar5.a == edVar || (ecVar6 = edVar2.l.b) == null || ecVar6.a == edVar || edVar2.ae == 3);
                                edVar.R = z;
                                if (z && ((ecVar4 = edVar2.l.b) == null || ecVar4.a != edVar)) {
                                    i += i - edVar2.L;
                                }
                            }
                            i += i3;
                            if (!edVar2.R) {
                            }
                            edVar.R = z;
                            if (z) {
                                i += i - edVar2.L;
                            }
                        }
                        if (edVar.l.b != null && !edVar5.c()) {
                            int i8 = edVar.l.b.g;
                            if (i8 == 5) {
                                i2 = edVar5.O - edVar5.f();
                            } else {
                                if (i8 == 3) {
                                    i2 = edVar5.O;
                                }
                                if (!edVar5.S || ((ecVar2 = edVar5.j.b) != null && ecVar2.a != edVar && (ecVar3 = edVar5.l.b) != null && ecVar3.a != edVar && edVar5.ae != 3)) {
                                    z2 = true;
                                }
                                edVar.S = z2;
                                if (z2 && ((ecVar = edVar5.j.b) == null || ecVar.a != edVar)) {
                                    f += f - edVar5.O;
                                }
                            }
                            f += i2;
                            if (!edVar5.S) {
                            }
                            z2 = true;
                            edVar.S = z2;
                            if (z2) {
                                f += f - edVar5.O;
                            }
                        }
                    } else {
                        zArr[0] = false;
                        return;
                    }
                }
            }
            if (edVar.K == 8) {
                int i9 = edVar.t;
                i -= i9;
                f -= i9;
            }
            edVar.L = i;
            edVar.O = f;
            return;
        }
        zArr[0] = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x06c0, code lost:
        if (r3.K != 8) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.dy r21) {
        /*
            Method dump skipped, instructions count: 1783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.E(dy):boolean");
    }

    @Override // defpackage.ei, defpackage.ed
    public final void a() {
        this.af.a();
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(ed edVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                ec ecVar = edVar.i;
                ec ecVar2 = ecVar.b;
                if (ecVar2 == null) {
                    break;
                }
                ed edVar2 = ecVar2.a;
                ec ecVar3 = edVar2.k.b;
                if (ecVar3 == null || ecVar3 != ecVar || edVar2 == edVar) {
                    break;
                }
                edVar = edVar2;
            }
            while (true) {
                int i3 = this.an;
                if (i2 < i3) {
                    if (this.ar[i2] == edVar) {
                        return;
                    }
                    i2++;
                } else {
                    ed[] edVarArr = this.ar;
                    int length = edVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (ed[]) Arrays.copyOf(edVarArr, length + length);
                    }
                    ed[] edVarArr2 = this.ar;
                    int i4 = this.an;
                    edVarArr2[i4] = edVar;
                    this.an = i4 + 1;
                    return;
                }
            }
        } else {
            while (true) {
                ec ecVar4 = edVar.j;
                ec ecVar5 = ecVar4.b;
                if (ecVar5 == null) {
                    break;
                }
                ed edVar3 = ecVar5.a;
                ec ecVar6 = edVar3.l.b;
                if (ecVar6 == null || ecVar6 != ecVar4 || edVar3 == edVar) {
                    break;
                }
                edVar = edVar3;
            }
            while (true) {
                int i5 = this.ao;
                if (i2 < i5) {
                    if (this.aq[i2] == edVar) {
                        return;
                    }
                    i2++;
                } else {
                    ed[] edVarArr3 = this.aq;
                    int length2 = edVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (ed[]) Arrays.copyOf(edVarArr3, length2 + length2);
                    }
                    ed[] edVarArr4 = this.aq;
                    int i6 = this.ao;
                    edVarArr4[i6] = edVar;
                    this.ao = i6 + 1;
                    return;
                }
            }
        }
    }
}
