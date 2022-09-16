package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ce  reason: default package */
/* loaded from: classes2.dex */
public final class ce extends ci {
    int ag;
    int ah;
    private ch am;
    protected final bz af = new bz();
    private int an = 0;
    private int ao = 0;
    private cd[] ap = new cd[4];
    private cd[] aq = new cd[4];
    private cd[] ar = new cd[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final cd[] at = new cd[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(bz bzVar, cd[] cdVarArr, cd cdVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        cd cdVar2 = null;
        cdVarArr[0] = null;
        cdVarArr[2] = null;
        cdVarArr[1] = null;
        cdVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            cc ccVar = cdVar.i.b;
            boolean z = ccVar == null || ccVar.a == this;
            cdVar.ab = null;
            cd cdVar3 = cdVar.K != 8 ? cdVar : null;
            cd cdVar4 = cdVar;
            cd cdVar5 = null;
            cd cdVar6 = cdVar3;
            i2 = 0;
            while (cdVar4.k.b != null) {
                cdVar4.ab = cdVar2;
                if (cdVar4.K != 8) {
                    if (cdVar3 == null) {
                        cdVar3 = cdVar4;
                    }
                    if (cdVar6 != null && cdVar6 != cdVar4) {
                        cdVar6.ab = cdVar4;
                    }
                    cdVar6 = cdVar4;
                } else {
                    cc ccVar2 = cdVar4.i;
                    bzVar.n(ccVar2.f, ccVar2.b.f, 0, 5);
                    bzVar.n(cdVar4.k.f, cdVar4.i.f, 0, 5);
                }
                if (cdVar4.K != 8 && cdVar4.ad == 3) {
                    if (cdVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (cdVar4.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        cd[] cdVarArr2 = this.ap;
                        int length = cdVarArr2.length;
                        if (i4 >= length) {
                            this.ap = (cd[]) Arrays.copyOf(cdVarArr2, length + length);
                        }
                        this.ap[i2] = cdVar4;
                        i2 = i4;
                    }
                }
                cd cdVar7 = cdVar4.k.b.a;
                cc ccVar3 = cdVar7.i.b;
                if (ccVar3 == null || ccVar3.a != cdVar4 || cdVar7 == cdVar4) {
                    break;
                }
                cdVar5 = cdVar7;
                cdVar4 = cdVar5;
                cdVar2 = null;
                f = 0.0f;
            }
            cc ccVar4 = cdVar4.k.b;
            if (ccVar4 != null && ccVar4.a != this) {
                z = false;
            }
            if (cdVar.i.b == null || cdVar5.k.b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            cdVar.X = z;
            cdVar5.ab = null;
            cdVarArr[0] = cdVar;
            cdVarArr[2] = cdVar3;
            cdVarArr[c2] = cdVar5;
            cdVarArr[3] = cdVar6;
        } else {
            cc ccVar5 = cdVar.j.b;
            boolean z2 = ccVar5 == null || ccVar5.a == this;
            cd cdVar8 = null;
            cdVar.ac = null;
            cd cdVar9 = cdVar;
            cd cdVar10 = null;
            cd cdVar11 = cdVar.K != 8 ? cdVar : null;
            cd cdVar12 = cdVar11;
            int i5 = 0;
            while (cdVar9.l.b != null) {
                cdVar9.ac = cdVar8;
                if (cdVar9.K != 8) {
                    if (cdVar11 == null) {
                        cdVar11 = cdVar9;
                    }
                    if (cdVar12 != null && cdVar12 != cdVar9) {
                        cdVar12.ac = cdVar9;
                    }
                    cdVar12 = cdVar9;
                } else {
                    cc ccVar6 = cdVar9.j;
                    bzVar.n(ccVar6.f, ccVar6.b.f, 0, i3);
                    bzVar.n(cdVar9.l.f, cdVar9.j.f, 0, i3);
                }
                if (cdVar9.K != 8 && cdVar9.ae == 3) {
                    if (cdVar9.ad == 3) {
                        zArr[0] = false;
                    }
                    if (cdVar9.u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        cd[] cdVarArr3 = this.ap;
                        int length2 = cdVarArr3.length;
                        if (i6 >= length2) {
                            this.ap = (cd[]) Arrays.copyOf(cdVarArr3, length2 + length2);
                        }
                        this.ap[i5] = cdVar9;
                        i5 = i6;
                    }
                }
                cd cdVar13 = cdVar9.l.b.a;
                cc ccVar7 = cdVar13.j.b;
                if (ccVar7 == null || ccVar7.a != cdVar9 || cdVar13 == cdVar9) {
                    break;
                }
                cdVar10 = cdVar13;
                cdVar9 = cdVar10;
                cdVar8 = null;
                i3 = 5;
            }
            i2 = i5;
            cc ccVar8 = cdVar9.l.b;
            if (ccVar8 != null && ccVar8.a != this) {
                z2 = false;
            }
            if (cdVar.j.b == null || cdVar10.l.b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            cdVar.Y = z2;
            cdVar10.ac = null;
            cdVarArr[0] = cdVar;
            cdVarArr[2] = cdVar11;
            cdVarArr[c] = cdVar10;
            cdVarArr[3] = cdVar12;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.bz r31) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.H(bz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x052e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.bz r31) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.I(bz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r12 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.cd r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.B(cd, boolean[]):void");
    }

    public final void C(cd cdVar, boolean[] zArr) {
        int i;
        cd cdVar2;
        int i2;
        cc ccVar;
        cc ccVar2;
        cc ccVar3;
        int i3;
        boolean z;
        cc ccVar4;
        cc ccVar5;
        cc ccVar6;
        cc ccVar7;
        cd cdVar3;
        boolean z2 = false;
        r2 = 0;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (cdVar.ae != 3 || cdVar.ad == 3 || cdVar.u <= 0.0f) {
            int e = cdVar.e();
            cdVar.U = true;
            if (cdVar instanceof cf) {
                cf cfVar = (cf) cdVar;
                if (cfVar.ai == 0) {
                    e = cfVar.ag;
                    if (e == -1) {
                        int i5 = cfVar.ah;
                        if (i5 != -1) {
                            i4 = i5;
                        }
                        e = 0;
                    }
                } else {
                    i4 = e;
                }
                i = e;
                e = i4;
            } else {
                cc ccVar8 = cdVar.m;
                if (ccVar8.b == null && cdVar.j.b == null && cdVar.l.b == null) {
                    i = cdVar.x + e;
                } else {
                    cc ccVar9 = cdVar.l.b;
                    if (ccVar9 == null || (ccVar7 = cdVar.j.b) == null || (ccVar9 != ccVar7 && ((cdVar3 = ccVar9.a) != ccVar7.a || cdVar3 == cdVar.r))) {
                        if (ccVar8.c()) {
                            cd cdVar4 = cdVar.m.b.a;
                            if (!cdVar4.U) {
                                C(cdVar4, zArr);
                            }
                            int max = Math.max((cdVar4.L - cdVar4.t) + e, e);
                            int max2 = Math.max((cdVar4.O - cdVar4.t) + e, e);
                            if (cdVar.K == 8) {
                                int i6 = cdVar.t;
                                max -= i6;
                                max2 -= i6;
                            }
                            cdVar.L = max;
                            cdVar.O = max2;
                            return;
                        }
                        cd cdVar5 = null;
                        if (cdVar.j.c()) {
                            cc ccVar10 = cdVar.j;
                            cdVar2 = ccVar10.b.a;
                            i = ccVar10.a() + e;
                            if (!cdVar2.t() && !cdVar2.U) {
                                C(cdVar2, zArr);
                            }
                        } else {
                            i = e;
                            cdVar2 = null;
                        }
                        if (cdVar.l.c()) {
                            cc ccVar11 = cdVar.l;
                            cd cdVar6 = ccVar11.b.a;
                            e += ccVar11.a();
                            if (!cdVar6.t() && !cdVar6.U) {
                                C(cdVar6, zArr);
                            }
                            cdVar5 = cdVar6;
                        }
                        if (cdVar.j.b != null && !cdVar2.t()) {
                            int i7 = cdVar.j.b.g;
                            if (i7 == 3) {
                                i3 = cdVar2.L - cdVar2.e();
                            } else {
                                if (i7 == 5) {
                                    i3 = cdVar2.L;
                                }
                                z = !cdVar2.R || !((ccVar5 = cdVar2.j.b) == null || ccVar5.a == cdVar || (ccVar6 = cdVar2.l.b) == null || ccVar6.a == cdVar || cdVar2.ae == 3);
                                cdVar.R = z;
                                if (z && ((ccVar4 = cdVar2.l.b) == null || ccVar4.a != cdVar)) {
                                    i += i - cdVar2.L;
                                }
                            }
                            i += i3;
                            if (!cdVar2.R) {
                            }
                            cdVar.R = z;
                            if (z) {
                                i += i - cdVar2.L;
                            }
                        }
                        if (cdVar.l.b != null && !cdVar5.t()) {
                            int i8 = cdVar.l.b.g;
                            if (i8 == 5) {
                                i2 = cdVar5.O - cdVar5.e();
                            } else {
                                if (i8 == 3) {
                                    i2 = cdVar5.O;
                                }
                                if (!cdVar5.S || ((ccVar2 = cdVar5.j.b) != null && ccVar2.a != cdVar && (ccVar3 = cdVar5.l.b) != null && ccVar3.a != cdVar && cdVar5.ae != 3)) {
                                    z2 = true;
                                }
                                cdVar.S = z2;
                                if (z2 && ((ccVar = cdVar5.j.b) == null || ccVar.a != cdVar)) {
                                    e += e - cdVar5.O;
                                }
                            }
                            e += i2;
                            if (!cdVar5.S) {
                            }
                            z2 = true;
                            cdVar.S = z2;
                            if (z2) {
                                e += e - cdVar5.O;
                            }
                        }
                    } else {
                        zArr[0] = false;
                        return;
                    }
                }
            }
            if (cdVar.K == 8) {
                int i9 = cdVar.t;
                i -= i9;
                e -= i9;
            }
            cdVar.L = i;
            cdVar.O = e;
            return;
        }
        zArr[0] = false;
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
    @Override // defpackage.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x06c0, code lost:
        if (r3.K != 8) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.bz r21) {
        /*
            Method dump skipped, instructions count: 1783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.E(bz):boolean");
    }

    @Override // defpackage.ci, defpackage.cd
    public final void i() {
        this.af.l();
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(cd cdVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                cc ccVar = cdVar.i;
                cc ccVar2 = ccVar.b;
                if (ccVar2 == null) {
                    break;
                }
                cd cdVar2 = ccVar2.a;
                cc ccVar3 = cdVar2.k.b;
                if (ccVar3 == null || ccVar3 != ccVar || cdVar2 == cdVar) {
                    break;
                }
                cdVar = cdVar2;
            }
            while (true) {
                int i3 = this.an;
                if (i2 < i3) {
                    if (this.ar[i2] == cdVar) {
                        return;
                    }
                    i2++;
                } else {
                    cd[] cdVarArr = this.ar;
                    int length = cdVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (cd[]) Arrays.copyOf(cdVarArr, length + length);
                    }
                    cd[] cdVarArr2 = this.ar;
                    int i4 = this.an;
                    cdVarArr2[i4] = cdVar;
                    this.an = i4 + 1;
                    return;
                }
            }
        } else {
            while (true) {
                cc ccVar4 = cdVar.j;
                cc ccVar5 = ccVar4.b;
                if (ccVar5 == null) {
                    break;
                }
                cd cdVar3 = ccVar5.a;
                cc ccVar6 = cdVar3.l.b;
                if (ccVar6 == null || ccVar6 != ccVar4 || cdVar3 == cdVar) {
                    break;
                }
                cdVar = cdVar3;
            }
            while (true) {
                int i5 = this.ao;
                if (i2 < i5) {
                    if (this.aq[i2] == cdVar) {
                        return;
                    }
                    i2++;
                } else {
                    cd[] cdVarArr3 = this.aq;
                    int length2 = cdVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (cd[]) Arrays.copyOf(cdVarArr3, length2 + length2);
                    }
                    cd[] cdVarArr4 = this.aq;
                    int i6 = this.ao;
                    cdVarArr4[i6] = cdVar;
                    this.ao = i6 + 1;
                    return;
                }
            }
        }
    }
}
