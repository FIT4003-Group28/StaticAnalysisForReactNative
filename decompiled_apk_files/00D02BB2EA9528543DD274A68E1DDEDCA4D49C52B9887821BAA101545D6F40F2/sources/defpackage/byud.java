package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: byud  reason: default package */
/* loaded from: classes4.dex */
public final class byud {
    private final bytc a;

    public byud(bytc bytcVar) {
        this.a = bytcVar;
    }

    public static ddzg f(bzil bzilVar, boolean z, boolean z2, int i) {
        ddzf bZ = ddzg.t.bZ();
        boolean z3 = true;
        int i2 = 2;
        if (z) {
            deaq bZ2 = dear.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dear dearVar = (dear) bZ2.b;
            dearVar.b = 2;
            dearVar.a |= 1;
            dear bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ.b;
            bK.getClass();
            dsrj<dear> dsrjVar = ddzgVar.d;
            if (!dsrjVar.a()) {
                ddzgVar.d = dsqw.cl(dsrjVar);
            }
            ddzgVar.d.add(bK);
        }
        bzig bzigVar = bzilVar.c;
        if (bzigVar == null) {
            bzigVar = bzig.i;
        }
        bzhr bzhrVar = bzilVar.b;
        if (bzhrVar == null) {
            bzhrVar = bzhr.e;
        }
        bzjj bzjjVar = bzhrVar.b;
        if (bzjjVar == null) {
            bzjjVar = bzjj.i;
        }
        int i3 = bzjjVar.f;
        ddzv bZ3 = ddzx.i.bZ();
        float f = bzigVar.d;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ddzx ddzxVar = (ddzx) bZ3.b;
        int i4 = ddzxVar.a | 4;
        ddzxVar.a = i4;
        ddzxVar.b = f;
        int i5 = i4 | 64;
        ddzxVar.a = i5;
        ddzxVar.c = i3;
        int i6 = i5 | 512;
        ddzxVar.a = i6;
        ddzxVar.f = z2;
        if (i != 2) {
            z3 = false;
        }
        ddzxVar.a = i6 | 1024;
        ddzxVar.g = z3;
        if ((bzigVar.a & 16) == 0) {
            ddzx ddzxVar2 = (ddzx) bZ3.b;
            ddzxVar2.d = 0;
            ddzxVar2.a |= 128;
        } else {
            bzii bziiVar = bzigVar.e;
            if (bziiVar == null) {
                bziiVar = bzii.d;
            }
            if (!bziiVar.b) {
                i2 = 3;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddzx ddzxVar3 = (ddzx) bZ3.b;
            ddzxVar3.d = i2 - 1;
            int i7 = ddzxVar3.a | 128;
            ddzxVar3.a = i7;
            int i8 = bziiVar.c;
            ddzxVar3.a = i7 | 256;
            ddzxVar3.e = i8;
        }
        if ((bzjjVar.a & 8) != 0) {
            String str = bzjjVar.h;
            ddzx ddzxVar4 = (ddzx) bZ3.b;
            str.getClass();
            ddzxVar4.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            ddzxVar4.h = str;
        }
        ddzx bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar2 = (ddzg) bZ.b;
        bK2.getClass();
        ddzgVar2.e = bK2;
        ddzgVar2.a |= 8388608;
        return bZ.bK();
    }

    public final void a(boolean z, boolean z2) {
        this.a.a(67);
        if (z && !z2) {
            this.a.a(143);
        }
        if (!z && z2) {
            this.a.a(144);
        }
        if (z && z2) {
            this.a.a(142);
        }
        if (z || z2) {
            return;
        }
        this.a.a(145);
    }

    public final void b(boolean z, boolean z2) {
        this.a.a(66);
        if (z && !z2) {
            this.a.a(147);
        }
        if (!z && z2) {
            this.a.a(148);
        }
        if (z && z2) {
            this.a.a(146);
        }
        if (z || z2) {
            return;
        }
        this.a.a(149);
    }

    public final void c(boolean z, boolean z2) {
        this.a.a(95);
        if (z && !z2) {
            this.a.a(135);
        }
        if (!z && z2) {
            this.a.a(136);
        }
        if (z && z2) {
            this.a.a(134);
        }
        if (z || z2) {
            return;
        }
        this.a.a(137);
    }

    public final void d(boolean z, boolean z2) {
        this.a.a(96);
        if (z && !z2) {
            this.a.a(139);
        }
        if (!z && z2) {
            this.a.a(140);
        }
        if (z && z2) {
            this.a.a(138);
        }
        if (z || z2) {
            return;
        }
        this.a.a(141);
    }

    public final void e(boolean z, boolean z2, boolean z3, int i) {
        this.a.a(68);
        if (z) {
            this.a.a(80);
        }
        if (z2 && !z3) {
            this.a.a(131);
        }
        if (!z2 && z3) {
            this.a.a(132);
        }
        if (z2 && z3) {
            this.a.a(130);
        }
        if (!z2 && !z3) {
            this.a.a(133);
        }
        if (i == 1) {
            this.a.a(206);
        } else if (i == 2) {
            this.a.a(207);
        } else if (i == 3) {
            this.a.a(208);
        } else if (i != 4) {
        } else {
            this.a.a(210);
        }
    }
}
