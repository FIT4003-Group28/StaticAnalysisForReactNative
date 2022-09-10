package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: yyt  reason: default package */
/* loaded from: classes7.dex */
public final class yyt {
    private static final dcqe a = dcqe.c("yyt");

    public static amte a(amte amteVar) {
        boolean z;
        dphr dphrVar;
        dqvj dqvjVar;
        boolean z2;
        int i = 1;
        boolean z3 = false;
        dbsk.a(amteVar.c.length > 2);
        dwaa dwaaVar = amteVar.a.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        int i2 = 5;
        dsqp dsqpVar = (dsqp) dvzuVar.cu(5);
        dsqpVar.bC(dvzuVar);
        dvzo dvzoVar = (dvzo) dsqpVar;
        amsy amsyVar = amteVar.a;
        int size = ((dvzu) dvzoVar.b).c.size();
        if (size != 0) {
            if (size != amsyVar.l()) {
                bvoo.h("Proto and directions parking detail counts are out of sync. Proto: %d, directions object: %d", Integer.valueOf(((dvzu) dvzoVar.b).c.size()), Integer.valueOf(amsyVar.l()));
            }
            if (size <= 0 || size != amsyVar.i()) {
                bvoo.h("Proto parking details and waypoint count are out of sync. parking: %d, waypoints: %d", Integer.valueOf(size), Integer.valueOf(amsyVar.i()));
            } else {
                if (dvzoVar.c) {
                    dvzoVar.bF();
                    dvzoVar.c = false;
                }
                dvzu dvzuVar2 = (dvzu) dvzoVar.b;
                dvzuVar2.e();
                dvzuVar2.c.remove(0);
            }
        }
        if (((dvzu) dvzoVar.b).b.size() == 0) {
            bvoo.h("Directions has no waypoints.", new Object[0]);
        } else {
            dvzoVar.f(0);
        }
        dvzu dvzuVar3 = (dvzu) dvzoVar.b;
        if (dvzuVar3.g < dvzuVar3.e.size()) {
            dpie a2 = dvzoVar.a(((dvzu) dvzoVar.b).g);
            dsqp dsqpVar2 = (dsqp) a2.cu(5);
            dsqpVar2.bC(a2);
            dphrVar = (dphr) dsqpVar2;
            if (((dpie) dphrVar.b).e.size() == 0) {
                bvoo.h("Trip proto has no first path.", new Object[0]);
                z = false;
            } else {
                dpec dpecVar = dphrVar.a(0).b;
                if (dpecVar == null) {
                    dpecVar = dpec.o;
                }
                dpeq dpeqVar = ((dpie) dphrVar.b).f;
                if (dpeqVar == null) {
                    dpeqVar = dpeq.m;
                }
                dowb dowbVar = dpecVar.d;
                if (dowbVar == null) {
                    dowbVar = dowb.d;
                }
                int i3 = dowbVar.b;
                dsqp dsqpVar3 = (dsqp) dpeqVar.cu(5);
                dsqpVar3.bC(dpeqVar);
                dpeh dpehVar = (dpeh) dsqpVar3;
                if (((dpeq) dpehVar.b).b.size() > 0) {
                    while (((dpeq) dpehVar.b).b.size() > 0 && dpehVar.a(0).b < i3) {
                        if (dpehVar.c) {
                            dpehVar.bF();
                            dpehVar.c = false;
                        }
                        dpeq dpeqVar2 = (dpeq) dpehVar.b;
                        dpeqVar2.b();
                        dpeqVar2.b.remove(0);
                    }
                    if (((dpeq) dpehVar.b).b.size() > 0) {
                        long j = dpehVar.a(0).c;
                        int i4 = 0;
                        while (i4 < ((dpeq) dpehVar.b).b.size()) {
                            dpco a3 = dpehVar.a(i4);
                            dsqp dsqpVar4 = (dsqp) a3.cu(i2);
                            dsqpVar4.bC(a3);
                            dpcl dpclVar = (dpcl) dsqpVar4;
                            int i5 = ((dpco) dpclVar.b).b - i3;
                            if (dpclVar.c) {
                                dpclVar.bF();
                                dpclVar.c = z3;
                            }
                            dpco dpcoVar = (dpco) dpclVar.b;
                            int i6 = dpcoVar.a | i;
                            dpcoVar.a = i6;
                            dpcoVar.b = i5;
                            long j2 = dpcoVar.c;
                            dpcoVar.a = i6 | 2;
                            dpcoVar.c = j2 - j;
                            if (dpehVar.c) {
                                dpehVar.bF();
                                dpehVar.c = false;
                            }
                            dpeq dpeqVar3 = (dpeq) dpehVar.b;
                            dpco bK = dpclVar.bK();
                            bK.getClass();
                            dpeqVar3.b();
                            dpeqVar3.b.set(i4, bK);
                            i4++;
                            i = 1;
                            z3 = false;
                            i2 = 5;
                        }
                    }
                }
                if (dpehVar.c) {
                    dpehVar.bF();
                    z2 = false;
                    dpehVar.c = false;
                } else {
                    z2 = false;
                }
                ((dpeq) dpehVar.b).d = dpeq.ck();
                if (dpehVar.c) {
                    dpehVar.bF();
                    dpehVar.c = z2;
                }
                ((dpeq) dpehVar.b).e = dpeq.ck();
                if (dpehVar.c) {
                    dpehVar.bF();
                    dpehVar.c = z2;
                }
                ((dpeq) dpehVar.b).f = dpeq.ck();
                if (dpehVar.c) {
                    dpehVar.bF();
                    dpehVar.c = z2;
                }
                dpeq dpeqVar4 = (dpeq) dpehVar.b;
                dpeqVar4.k = null;
                int i7 = dpeqVar4.a & (-17);
                dpeqVar4.a = i7;
                dpeqVar4.a = i7 & (-33);
                dpeqVar4.l = 0;
                dpeq dpeqVar5 = (dpeq) dpehVar.bK();
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar = (dpie) dphrVar.b;
                dpieVar.f = null;
                int i8 = dpieVar.a & (-17);
                dpieVar.a = i8;
                dpeqVar5.getClass();
                dpieVar.f = dpeqVar5;
                dpieVar.a = i8 | 16;
                dpec dpecVar2 = dpieVar.d;
                if (dpecVar2 == null) {
                    dpecVar2 = dpec.o;
                }
                dowb dowbVar2 = dpecVar2.d;
                if (dowbVar2 == null) {
                    dowbVar2 = dowb.d;
                }
                dgas dgasVar = dpecVar2.e;
                if (dgasVar == null) {
                    dgasVar = dgas.e;
                }
                dsqp dsqpVar5 = (dsqp) dpecVar2.cu(5);
                dsqpVar5.bC(dpecVar2);
                dpeb dpebVar = (dpeb) dsqpVar5;
                dsqp dsqpVar6 = (dsqp) dowbVar2.cu(5);
                dsqpVar6.bC(dowbVar2);
                dovy dovyVar = (dovy) dsqpVar6;
                int i9 = dowbVar2.b;
                dowb dowbVar3 = dpecVar.d;
                if (dowbVar3 == null) {
                    dowbVar3 = dowb.d;
                }
                int i10 = i9 - dowbVar3.b;
                if (dovyVar.c) {
                    dovyVar.bF();
                    dovyVar.c = false;
                }
                dowb dowbVar4 = (dowb) dovyVar.b;
                dowbVar4.a |= 1;
                dowbVar4.b = i10;
                if (dpebVar.c) {
                    dpebVar.bF();
                    dpebVar.c = false;
                }
                dpec dpecVar3 = (dpec) dpebVar.b;
                dowb bK2 = dovyVar.bK();
                bK2.getClass();
                dpecVar3.d = bK2;
                dpecVar3.a |= 4;
                dsqp dsqpVar7 = (dsqp) dgasVar.cu(5);
                dsqpVar7.bC(dgasVar);
                dgar dgarVar = (dgar) dsqpVar7;
                int i11 = dgasVar.b;
                dgas dgasVar2 = dpecVar.e;
                if (dgasVar2 == null) {
                    dgasVar2 = dgas.e;
                }
                int i12 = i11 - dgasVar2.b;
                if (dgarVar.c) {
                    dgarVar.bF();
                    dgarVar.c = false;
                }
                dgas dgasVar3 = (dgas) dgarVar.b;
                dgasVar3.a |= 1;
                dgasVar3.b = i12;
                if (dpebVar.c) {
                    dpebVar.bF();
                    dpebVar.c = false;
                }
                dpec dpecVar4 = (dpec) dpebVar.b;
                dgas bK3 = dgarVar.bK();
                bK3.getClass();
                dpecVar4.e = bK3;
                dpecVar4.a |= 8;
                if ((dpecVar2.a & 256) != 0 && (dpecVar.a & 256) != 0) {
                    doxd doxdVar = dpecVar2.k;
                    if (doxdVar == null) {
                        doxdVar = doxd.l;
                    }
                    doxd doxdVar2 = dpecVar.k;
                    if (doxdVar2 == null) {
                        doxdVar2 = doxd.l;
                    }
                    dsqp dsqpVar8 = (dsqp) doxdVar.cu(5);
                    dsqpVar8.bC(doxdVar);
                    dows dowsVar = (dows) dsqpVar8;
                    if ((doxdVar.a & 1) != 0 && (doxdVar2.a & 1) != 0) {
                        dgas dgasVar4 = doxdVar.b;
                        if (dgasVar4 == null) {
                            dgasVar4 = dgas.e;
                        }
                        int i13 = dgasVar4.b;
                        dgas dgasVar5 = doxdVar2.b;
                        if (dgasVar5 == null) {
                            dgasVar5 = dgas.e;
                        }
                        int i14 = i13 - dgasVar5.b;
                        dgas dgasVar6 = doxdVar.b;
                        if (dgasVar6 == null) {
                            dgasVar6 = dgas.e;
                        }
                        dsqp dsqpVar9 = (dsqp) dgasVar6.cu(5);
                        dsqpVar9.bC(dgasVar6);
                        dgar dgarVar2 = (dgar) dsqpVar9;
                        if (dgarVar2.c) {
                            dgarVar2.bF();
                            dgarVar2.c = false;
                        }
                        dgas dgasVar7 = (dgas) dgarVar2.b;
                        dgasVar7.a |= 1;
                        dgasVar7.b = i14;
                        if (dowsVar.c) {
                            dowsVar.bF();
                            dowsVar.c = false;
                        }
                        doxd doxdVar3 = (doxd) dowsVar.b;
                        dgas bK4 = dgarVar2.bK();
                        bK4.getClass();
                        doxdVar3.b = bK4;
                        doxdVar3.a |= 1;
                    } else {
                        if (dowsVar.c) {
                            dowsVar.bF();
                            dowsVar.c = false;
                        }
                        doxd doxdVar4 = (doxd) dowsVar.b;
                        doxdVar4.b = null;
                        doxdVar4.a &= -2;
                    }
                    if (dowsVar.c) {
                        dowsVar.bF();
                        dowsVar.c = false;
                    }
                    doxd doxdVar5 = (doxd) dowsVar.b;
                    doxdVar5.d = null;
                    int i15 = doxdVar5.a & (-9);
                    doxdVar5.a = i15;
                    doxdVar5.f = null;
                    int i16 = i15 & (-33);
                    doxdVar5.a = i16;
                    doxdVar5.e = null;
                    int i17 = i16 & (-17);
                    doxdVar5.a = i17;
                    doxdVar5.h = null;
                    doxdVar5.a = i17 & (-129);
                    doxd bK5 = dowsVar.bK();
                    if (dpebVar.c) {
                        dpebVar.bF();
                        dpebVar.c = false;
                    }
                    dpec dpecVar5 = (dpec) dpebVar.b;
                    bK5.getClass();
                    dpecVar5.k = bK5;
                    dpecVar5.a |= 256;
                } else {
                    if (dpebVar.c) {
                        dpebVar.bF();
                        dpebVar.c = false;
                    }
                    dpec dpecVar6 = (dpec) dpebVar.b;
                    dpecVar6.k = null;
                    dpecVar6.a &= -257;
                }
                dpec dpecVar7 = (dpec) dpebVar.b;
                dpecVar7.a &= -3;
                dpecVar7.c = dpec.o.c;
                dpec bK6 = dpebVar.bK();
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar2 = (dpie) dphrVar.b;
                bK6.getClass();
                dpieVar2.d = bK6;
                dpieVar2.a |= 8;
                dpie dpieVar3 = (dpie) dphrVar.b;
                dpieVar3.b();
                dpieVar3.e.remove(0);
                int i18 = -1;
                for (int i19 = 0; i19 < ((dpie) dphrVar.b).e.size(); i19++) {
                    dpbp a4 = dphrVar.a(i19);
                    dsqp dsqpVar10 = (dsqp) a4.cu(5);
                    dsqpVar10.bC(a4);
                    dpbm dpbmVar = (dpbm) dsqpVar10;
                    for (int i20 = 0; i20 < ((dpbp) dpbmVar.b).c.size(); i20++) {
                        dpdy a5 = dpbmVar.a(i20);
                        dsqp dsqpVar11 = (dsqp) a5.cu(5);
                        dsqpVar11.bC(a5);
                        dpdr dpdrVar = (dpdr) dsqpVar11;
                        for (int i21 = 0; i21 < ((dpdy) dpdrVar.b).d.size(); i21++) {
                            dpdq a6 = dpdrVar.a(i21);
                            dsqp dsqpVar12 = (dsqp) a6.cu(5);
                            dsqpVar12.bC(a6);
                            dpcp dpcpVar = (dpcp) dsqpVar12;
                            if (i18 < 0) {
                                i18 = ((dpdq) dpcpVar.b).q;
                            }
                            int i22 = ((dpdq) dpcpVar.b).q - i18;
                            if (dpcpVar.c) {
                                dpcpVar.bF();
                                dpcpVar.c = false;
                            }
                            dpdq dpdqVar = (dpdq) dpcpVar.b;
                            dpdqVar.a |= 4096;
                            dpdqVar.q = i22;
                            if (dpdrVar.c) {
                                dpdrVar.bF();
                                dpdrVar.c = false;
                            }
                            dpdy dpdyVar = (dpdy) dpdrVar.b;
                            dpdq bK7 = dpcpVar.bK();
                            bK7.getClass();
                            dpdyVar.b();
                            dpdyVar.d.set(i21, bK7);
                        }
                        dpbmVar.c(i20, dpdrVar);
                    }
                    dphrVar.c(i19, dpbmVar);
                }
                if (((dpie) dphrVar.b).i < ((dvzu) dvzoVar.b).p.size()) {
                    dvzn b = dvzoVar.b(((dpie) dphrVar.b).i);
                    if (dvzoVar.c) {
                        dvzoVar.bF();
                        dvzoVar.c = false;
                    }
                    ((dvzu) dvzoVar.b).p = dvzu.ck();
                    dbsk.y(i18, b.b.size());
                    dvzm bZ = dvzn.e.bZ();
                    int i23 = b.d;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvzn dvznVar = (dvzn) bZ.b;
                    dvznVar.a |= 1;
                    dvznVar.d = i23;
                    int i24 = 0;
                    int i25 = 0;
                    for (int i26 = 0; i26 <= i18; i26++) {
                        i24 += b.b.f(i26);
                        i25 += b.c.f(i26);
                    }
                    bZ.c(i24);
                    bZ.d(i25);
                    for (int i27 = i18 + 1; i27 < b.b.size(); i27++) {
                        bZ.c(b.b.f(i27));
                        bZ.d(b.c.f(i27));
                    }
                    dvzoVar.c(bZ.bK());
                    if (dphrVar.c) {
                        dphrVar.bF();
                        z = false;
                        dphrVar.c = false;
                    } else {
                        z = false;
                    }
                    dpie dpieVar4 = (dpie) dphrVar.b;
                    dpieVar4.a |= 128;
                    int i28 = z ? 1 : 0;
                    int i29 = z ? 1 : 0;
                    int i30 = z ? 1 : 0;
                    dpieVar4.i = i28;
                } else {
                    z = false;
                    bvoo.h("Trip compact polyline index is larger than the number of polylines.", new Object[0]);
                }
            }
            if (dvzoVar.c) {
                dvzoVar.bF();
                dvzoVar.c = z;
            }
            ((dvzu) dvzoVar.b).e = dvzu.ck();
            dvzoVar.d(dphrVar);
            if (dvzoVar.c) {
                dvzoVar.bF();
                dvzoVar.c = z;
            }
            dvzu dvzuVar4 = (dvzu) dvzoVar.b;
            dvzuVar4.a = 2 | dvzuVar4.a;
            int i31 = z ? 1 : 0;
            int i32 = z ? 1 : 0;
            int i33 = z ? 1 : 0;
            int i34 = z ? 1 : 0;
            dvzuVar4.g = i31;
        } else {
            z = false;
            bvoo.h("Selected trip index is larger than the number of directions.", new Object[0]);
            dphrVar = null;
        }
        if (dvzoVar.c) {
            dvzoVar.bF();
            dvzoVar.c = z;
        }
        ((dvzu) dvzoVar.b).w = dvzu.ck();
        if (dphrVar != null) {
            dpec dpecVar8 = ((dpie) dphrVar.b).d;
            if (dpecVar8 == null) {
                dpecVar8 = dpec.o;
            }
            dqvjVar = dqvj.c(dpecVar8.b);
            if (dqvjVar == null) {
                dqvjVar = dqvj.DRIVE;
            }
        } else {
            dqvjVar = null;
        }
        amtd amtdVar = new amtd();
        dwaz dwazVar = (dwaz) dwbc.g.ca(amteVar.a.a);
        dvzz bZ2 = dwaa.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwaa dwaaVar2 = (dwaa) bZ2.b;
        dvzu bK8 = dvzoVar.bK();
        bK8.getClass();
        dwaaVar2.b = bK8;
        dwaaVar2.a |= 1;
        dwaa dwaaVar3 = amteVar.a.a.b;
        if (dwaaVar3 == null) {
            dwaaVar3 = dwaa.g;
        }
        dsrj<dqtx> dsrjVar = dwaaVar3.f;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwaa dwaaVar4 = (dwaa) bZ2.b;
        dsrj<dqtx> dsrjVar2 = dwaaVar4.f;
        if (!dsrjVar2.a()) {
            dwaaVar4.f = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dwaaVar4.f);
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar = (dwbc) dwazVar.b;
        dwaa bK9 = bZ2.bK();
        bK9.getClass();
        dwbcVar.b = bK9;
        dwbcVar.a |= 1;
        amtdVar.a = new amsy((dwbc) dwazVar.bK());
        amvh[] amvhVarArr = amteVar.c;
        amtdVar.e((amvh[]) Arrays.copyOfRange(amvhVarArr, 1, amvhVarArr.length));
        amtdVar.d(amteVar.i());
        amtdVar.g = amteVar.g;
        if (dqvjVar != null) {
            amtdVar.b = dqvjVar;
        }
        return amtdVar.a();
    }
}
