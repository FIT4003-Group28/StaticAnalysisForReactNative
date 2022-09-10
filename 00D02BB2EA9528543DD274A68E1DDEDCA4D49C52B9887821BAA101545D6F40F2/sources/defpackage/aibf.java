package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aibf  reason: default package */
/* loaded from: classes2.dex */
public final class aibf implements ahvi {
    public final Context a;
    public final vxa b;
    private final btvo c;

    public aibf(Application application, vxa vxaVar, btvo btvoVar) {
        this.a = application;
        this.b = vxaVar;
        this.c = btvoVar;
    }

    public static dowb c(long j) {
        dovy bZ = dowb.d.bZ();
        dowa dowaVar = dowa.KILOMETERS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowb dowbVar = (dowb) bZ.b;
        dowbVar.c = dowaVar.e;
        dowbVar.a |= 4;
        int a = decl.a(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowb dowbVar2 = (dowb) bZ.b;
        dowbVar2.a |= 1;
        dowbVar2.b = a;
        return bZ.bK();
    }

    public static dgas d(long j) {
        dgar bZ = dgas.e.bZ();
        int a = decl.a(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgas dgasVar = (dgas) bZ.b;
        dgasVar.a |= 1;
        dgasVar.b = a;
        return bZ.bK();
    }

    public static dpeb e(dqvj dqvjVar, dowb dowbVar, dgas dgasVar) {
        dpeb bZ = dpec.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpec dpecVar = (dpec) bZ.b;
        dpecVar.b = dqvjVar.k;
        int i = dpecVar.a | 1;
        dpecVar.a = i;
        dowbVar.getClass();
        dpecVar.d = dowbVar;
        int i2 = i | 4;
        dpecVar.a = i2;
        dgasVar.getClass();
        dpecVar.e = dgasVar;
        dpecVar.a = i2 | 8;
        return bZ;
    }

    public static final doqt f(amub amubVar, dqvj dqvjVar, @dzsi Integer num, @dzsi Integer num2, long j, boolean z, dpej dpejVar) {
        amvh[] amvhVarArr;
        doqq bZ = doqt.k.bZ();
        for (amvh amvhVar : amubVar.o) {
            dpjq ca = dpjx.n.ca(amvhVar.I());
            String p = amvhVar.p();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dpjx dpjxVar = (dpjx) ca.b;
            p.getClass();
            dpjxVar.a |= 128;
            dpjxVar.e = p;
            dpjx bK = ca.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doqt doqtVar = (doqt) bZ.b;
            bK.getClass();
            dsrj<dpjx> dsrjVar = doqtVar.b;
            if (!dsrjVar.a()) {
                doqtVar.b = dsqw.cl(dsrjVar);
            }
            doqtVar.b.add(bK);
        }
        dwaa dwaaVar = amubVar.b.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dpie dpieVar = dvzuVar.e.get(amubVar.c);
        if ((dpieVar.a & 128) != 0) {
            dvzn dvznVar = dvzuVar.p.get(dpieVar.i);
            douc bZ2 = doud.c.bZ();
            dsrf dsrfVar = dvznVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doud doudVar = (doud) bZ2.b;
            doudVar.b();
            dsod.bv(dsrfVar, doudVar.a);
            dsrf dsrfVar2 = dvznVar.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doud doudVar2 = (doud) bZ2.b;
            doudVar2.c();
            dsod.bv(dsrfVar2, doudVar2.b);
            doud bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doqt doqtVar2 = (doqt) bZ.b;
            bK2.getClass();
            doqtVar2.e = bK2;
            doqtVar2.a |= 4;
        }
        amtm au = amubVar.au();
        if (au != null) {
            for (amti amtiVar : au.f()) {
                doqr bZ3 = doqs.d.bZ();
                dowb c = c(amtiVar.a);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                doqs doqsVar = (doqs) bZ3.b;
                c.getClass();
                doqsVar.b = c;
                doqsVar.a |= 1;
                dgas d = d(amtiVar.b);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                doqs doqsVar2 = (doqs) bZ3.b;
                d.getClass();
                doqsVar2.c = d;
                doqsVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                doqt doqtVar3 = (doqt) bZ.b;
                doqs bK3 = bZ3.bK();
                bK3.getClass();
                dsrj<doqs> dsrjVar2 = doqtVar3.f;
                if (!dsrjVar2.a()) {
                    doqtVar3.f = dsqw.cl(dsrjVar2);
                }
                doqtVar3.f.add(bK3);
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doqt doqtVar4 = (doqt) bZ.b;
            doqtVar4.a |= 64;
            doqtVar4.j = intValue;
        }
        if (num2 != null) {
            dgas d2 = d(num2.intValue());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doqt doqtVar5 = (doqt) bZ.b;
            d2.getClass();
            doqtVar5.h = d2;
            doqtVar5.a |= 16;
        }
        dowb c2 = c(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doqt doqtVar6 = (doqt) bZ.b;
        c2.getClass();
        doqtVar6.g = c2;
        int i = doqtVar6.a | 8;
        doqtVar6.a = i;
        int i2 = i | 32;
        doqtVar6.a = i2;
        doqtVar6.i = !z;
        doqtVar6.c = dqvjVar.k;
        int i3 = i2 | 1;
        doqtVar6.a = i3;
        doqtVar6.d = dpejVar.e;
        doqtVar6.a = i3 | 2;
        return bZ.bK();
    }

    @Override // defpackage.ahvi
    public final dbsg<ahvj> a(doek doekVar) {
        return b(doekVar);
    }

    public final dbsg<ahvj> b(final doek doekVar) {
        if ((doekVar.a & 2) != 0) {
            dkof dkofVar = this.c.getLocationSharingParameters().q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            return dkofVar.e ? dbpy.a : dbsg.i(new ahvj(doekVar, new dbty(this, doekVar) { // from class: aibc
                private final aibf a;
                private final doek b;

                {
                    this.a = this;
                    this.b = doekVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    dowb dowbVar;
                    Iterator<E> it;
                    boolean z;
                    aibf aibfVar = this.a;
                    doek doekVar2 = this.b;
                    amub amubVar = null;
                    doqs doqsVar = null;
                    if ((doekVar2.a & 2) != 0) {
                        doqt doqtVar = doekVar2.c;
                        if (doqtVar == null) {
                            doqtVar = doqt.k;
                        }
                        dsqp dsqpVar = (dsqp) doqtVar.cu(5);
                        dsqpVar.bC(doqtVar);
                        doqq doqqVar = (doqq) dsqpVar;
                        dqvj dqvjVar = dqvj.DRIVE;
                        if (doqqVar.c) {
                            doqqVar.bF();
                            doqqVar.c = false;
                        }
                        doqt doqtVar2 = (doqt) doqqVar.b;
                        doqtVar2.c = dqvjVar.k;
                        doqtVar2.a |= 1;
                        doqt bK = doqqVar.bK();
                        dqvj c = dqvj.c(bK.c);
                        if (c == null) {
                            c = dqvj.DRIVE;
                        }
                        if (bK.f.size() > 0) {
                            dowb dowbVar2 = bK.f.get(bK.f.size() - 1).b;
                            if (dowbVar2 == null) {
                                dowbVar2 = dowb.d;
                            }
                            dowbVar = aibf.c(dowbVar2.b);
                        } else {
                            dowbVar = dowb.d;
                        }
                        dgas dgasVar = bK.h;
                        if (dgasVar == null) {
                            dgasVar = dgas.e;
                        }
                        dpeb e = aibf.e(c, dowbVar, dgasVar);
                        dsrj<doqs> dsrjVar = bK.f;
                        ArrayList<amun> arrayList = new ArrayList();
                        int i = 0;
                        for (doqs doqsVar2 : dsrjVar) {
                            int i2 = i + 1;
                            amun i3 = amuo.i();
                            i3.g = i;
                            if (doqsVar != null) {
                                dowb dowbVar3 = doqsVar2.b;
                                if (dowbVar3 == null) {
                                    dowbVar3 = dowb.d;
                                }
                                int i4 = dowbVar3.b;
                                dowb dowbVar4 = doqsVar.b;
                                if (dowbVar4 == null) {
                                    dowbVar4 = dowb.d;
                                }
                                i3.l = i4 - dowbVar4.b;
                                dgas dgasVar2 = doqsVar.c;
                                if (dgasVar2 == null) {
                                    dgasVar2 = dgas.e;
                                }
                                int i5 = dgasVar2.b;
                                dgas dgasVar3 = doqsVar2.c;
                                if (dgasVar3 == null) {
                                    dgasVar3 = dgas.e;
                                }
                                i3.n = i5 - dgasVar3.b;
                            }
                            arrayList.add(i3);
                            doqsVar = doqsVar2;
                            i = i2;
                        }
                        int size = bK.b.size() - 1;
                        for (int i6 = 0; i6 < size; i6++) {
                            ((amun) arrayList.get((arrayList.size() - i6) - 1)).a = dgau.DESTINATION;
                            amun amunVar = (amun) arrayList.get((arrayList.size() - i6) - 1);
                            doud doudVar = bK.e;
                            if (doudVar == null) {
                                doudVar = doud.c;
                            }
                            amunVar.h = doudVar.a.size() - 1;
                        }
                        dcdc z2 = dcbg.b(arrayList).s(aibe.a).z();
                        dphr dphrVar = (dphr) dpie.C.bZ();
                        if (dphrVar.c) {
                            dphrVar.bF();
                            dphrVar.c = false;
                        }
                        dpie dpieVar = (dpie) dphrVar.b;
                        dpec bK2 = e.bK();
                        bK2.getClass();
                        dpieVar.d = bK2;
                        dpieVar.a |= 8;
                        if (dphrVar.c) {
                            dphrVar.bF();
                            dphrVar.c = false;
                        }
                        dpie dpieVar2 = (dpie) dphrVar.b;
                        dpieVar2.a |= 128;
                        dpieVar2.i = 0;
                        int i7 = 0;
                        while (i7 < size) {
                            dqvj c2 = dqvj.c(bK.c);
                            if (c2 == null) {
                                c2 = dqvj.DRIVE;
                            }
                            dcdc f = dcdc.f((dpdq) z2.get(i7));
                            dcdc<amun> f2 = dcdc.f((amun) arrayList.get(i7));
                            dpbm bZ = dpbp.i.bZ();
                            int i8 = 0;
                            for (amun amunVar2 : f2) {
                                i8 += amunVar2.l;
                            }
                            dowb c3 = aibf.c(i8);
                            long j = 0;
                            while (f2.iterator().hasNext()) {
                                j += ((amun) it.next()).n;
                                size = size;
                                z2 = z2;
                            }
                            int i9 = size;
                            dcdc dcdcVar = z2;
                            dpeb e2 = aibf.e(c2, c3, aibf.d(j));
                            dpdr bZ2 = dpdy.n.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                z = false;
                                bZ2.c = false;
                            } else {
                                z = false;
                            }
                            dpdy dpdyVar = (dpdy) bZ2.b;
                            dpdyVar.b();
                            dsod.bv(f, dpdyVar.d);
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = z;
                            }
                            dpdy dpdyVar2 = (dpdy) bZ2.b;
                            dpec bK3 = e2.bK();
                            bK3.getClass();
                            dpdyVar2.c = bK3;
                            dpdyVar2.a |= 2;
                            bZ.b(bZ2);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dpbp dpbpVar = (dpbp) bZ.b;
                            dpec bK4 = e2.bK();
                            bK4.getClass();
                            dpbpVar.b = bK4;
                            dpbpVar.a |= 1;
                            dphrVar.b(bZ);
                            i7++;
                            size = i9;
                            z2 = dcdcVar;
                        }
                        dvzo bZ3 = dvzu.F.bZ();
                        dsrj<dpjx> dsrjVar2 = bK.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (dpjx dpjxVar : dsrjVar2) {
                            dpjy bZ4 = dpkf.g.bZ();
                            dpjm bZ5 = dpjn.m.bZ();
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dpjn dpjnVar = (dpjn) bZ5.b;
                            dpjxVar.getClass();
                            dpjnVar.b = dpjxVar;
                            dpjnVar.a |= 1;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dpkf dpkfVar = (dpkf) bZ4.b;
                            dpjn bK5 = bZ5.bK();
                            bK5.getClass();
                            dpkfVar.b = bK5;
                            dpkfVar.a |= 1;
                            arrayList2.add(bZ4.bK());
                        }
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dvzu dvzuVar = (dvzu) bZ3.b;
                        dvzuVar.c();
                        dsod.bv(arrayList2, dvzuVar.b);
                        bZ3.d(dphrVar);
                        doud doudVar2 = bK.e;
                        if (doudVar2 == null) {
                            doudVar2 = doud.c;
                        }
                        dvzm bZ6 = dvzn.e.bZ();
                        bZ6.a(doudVar2.a);
                        bZ6.b(doudVar2.b);
                        bZ3.c(bZ6.bK());
                        dqvj c4 = dqvj.c(bK.c);
                        if (c4 == null) {
                            c4 = dqvj.DRIVE;
                        }
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dvzu dvzuVar2 = (dvzu) bZ3.b;
                        dvzuVar2.d = c4.k;
                        int i10 = dvzuVar2.a | 1;
                        dvzuVar2.a = i10;
                        dvzuVar2.a = i10 | 2;
                        dvzuVar2.g = 0;
                        dvzu bK6 = bZ3.bK();
                        dqvj c5 = dqvj.c(bK.c);
                        if (c5 == null) {
                            c5 = dqvj.DRIVE;
                        }
                        dwaz dwazVar = (dwaz) dwbc.g.bZ();
                        dvzz bZ7 = dwaa.g.bZ();
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dwaa dwaaVar = (dwaa) bZ7.b;
                        bK6.getClass();
                        dwaaVar.b = bK6;
                        dwaaVar.a |= 1;
                        if (dwazVar.c) {
                            dwazVar.bF();
                            dwazVar.c = false;
                        }
                        dwbc dwbcVar = (dwbc) dwazVar.b;
                        dwaa bK7 = bZ7.bK();
                        bK7.getClass();
                        dwbcVar.b = bK7;
                        dwbcVar.a |= 1;
                        amsy amsyVar = new amsy((dwbc) dwazVar.bK());
                        Context context = aibfVar.a;
                        amtx aD = amub.aD(amsyVar, 0L, 0, context, null, amvj.e(amsyVar, context), false, aibfVar.b.b(c5, 3, vul.JOURNEY_SHARING));
                        dbsk.s(aD);
                        ArrayList arrayList3 = new ArrayList();
                        for (amun amunVar3 : arrayList) {
                            arrayList3.add(amunVar3.a());
                        }
                        aD.j = (amuo[]) arrayList3.toArray(new amuo[0]);
                        amubVar = aD.a();
                    }
                    dbsk.s(amubVar);
                    return amubVar;
                }
            }, new dbty(doekVar) { // from class: aibd
                private final doek a;

                {
                    this.a = doekVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    amtm amtmVar;
                    doek doekVar2 = this.a;
                    if ((doekVar2.a & 2) != 0) {
                        doqt doqtVar = doekVar2.c;
                        if (doqtVar == null) {
                            doqtVar = doqt.k;
                        }
                        int size = doqtVar.f.size();
                        amti[] amtiVarArr = new amti[size];
                        for (int i = 0; i < size; i++) {
                            dowb dowbVar = doqtVar.f.get(i).b;
                            if (dowbVar == null) {
                                dowbVar = dowb.d;
                            }
                            int i2 = dowbVar.b;
                            dgas dgasVar = doqtVar.f.get(i).c;
                            if (dgasVar == null) {
                                dgasVar = dgas.e;
                            }
                            amtiVarArr[i] = new amti(i2, dgasVar.b, false);
                        }
                        amtmVar = new amtm(amtiVarArr);
                    } else {
                        amtmVar = null;
                    }
                    dbsk.s(amtmVar);
                    return amtmVar;
                }
            }));
        }
        return dbpy.a;
    }
}
