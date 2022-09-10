package defpackage;
/* compiled from: PG */
/* renamed from: avtq  reason: default package */
/* loaded from: classes3.dex */
public final class avtq extends cjtt {
    private final dwaw a;
    private final dwbc b;

    public avtq(cqat cqatVar, dwaw dwawVar, dwbc dwbcVar) {
        super(cqatVar);
        boolean z;
        boolean z2;
        this.a = dwawVar;
        int i = 5;
        dsqp dsqpVar = (dsqp) dwbcVar.cu(5);
        dsqpVar.bC(dwbcVar);
        dwaz dwazVar = (dwaz) dsqpVar;
        dwaa dwaaVar = dwbcVar.b;
        dvzu dvzuVar = (dwaaVar == null ? dwaa.g : dwaaVar).b;
        dvzuVar = dvzuVar == null ? dvzu.F : dvzuVar;
        dsqp dsqpVar2 = (dsqp) dvzuVar.cu(5);
        dsqpVar2.bC(dvzuVar);
        dvzo dvzoVar = (dvzo) dsqpVar2;
        boolean z3 = false;
        int i2 = 0;
        while (i2 < ((dvzu) dvzoVar.b).e.size()) {
            dpie a = dvzoVar.a(i2);
            dsqp dsqpVar3 = (dsqp) a.cu(i);
            dsqpVar3.bC(a);
            dphr dphrVar = (dphr) dsqpVar3;
            int i3 = 0;
            while (i3 < ((dpie) dphrVar.b).e.size()) {
                dpbp a2 = dphrVar.a(i3);
                dsqp dsqpVar4 = (dsqp) a2.cu(i);
                dsqpVar4.bC(a2);
                dpbm dpbmVar = (dpbm) dsqpVar4;
                int i4 = 0;
                while (i4 < ((dpbp) dpbmVar.b).c.size()) {
                    dpdy a3 = dpbmVar.a(i4);
                    dsqp dsqpVar5 = (dsqp) a3.cu(i);
                    dsqpVar5.bC(a3);
                    dpdr dpdrVar = (dpdr) dsqpVar5;
                    int i5 = 0;
                    while (i5 < ((dpdy) dpdrVar.b).d.size()) {
                        dpdq a4 = dpdrVar.a(i5);
                        dsqp dsqpVar6 = (dsqp) a4.cu(i);
                        dsqpVar6.bC(a4);
                        dpcp dpcpVar = (dpcp) dsqpVar6;
                        dpec dpecVar = ((dpdq) dpcpVar.b).c;
                        dpec b = b(dpecVar == null ? dpec.o : dpecVar);
                        if (dpcpVar.c) {
                            dpcpVar.bF();
                            dpcpVar.c = z3;
                        }
                        dpdq dpdqVar = (dpdq) dpcpVar.b;
                        b.getClass();
                        dpdqVar.c = b;
                        int i6 = dpdqVar.a | 2;
                        dpdqVar.a = i6;
                        dpdqVar.d = null;
                        int i7 = i6 & (-5);
                        dpdqVar.a = i7;
                        dpdqVar.e = null;
                        int i8 = i7 & (-9);
                        dpdqVar.a = i8;
                        dpdqVar.f = null;
                        dpdqVar.a = i8 & (-17);
                        dpdqVar.m = dpdq.ck();
                        if (dpcpVar.c) {
                            dpcpVar.bF();
                            z2 = false;
                            dpcpVar.c = false;
                        } else {
                            z2 = false;
                        }
                        ((dpdq) dpcpVar.b).n = dpdq.ck();
                        if (dpcpVar.c) {
                            dpcpVar.bF();
                            dpcpVar.c = z2;
                        }
                        dpdq dpdqVar2 = (dpdq) dpcpVar.b;
                        dpdqVar2.o = null;
                        dpdqVar2.a &= -2049;
                        dpdqVar2.p = dpdq.ck();
                        if (dpcpVar.c) {
                            dpcpVar.bF();
                            dpcpVar.c = false;
                        }
                        ((dpdq) dpcpVar.b).t = dpdq.ck();
                        dpdq bK = dpcpVar.bK();
                        if (dpdrVar.c) {
                            dpdrVar.bF();
                            dpdrVar.c = false;
                        }
                        dpdy dpdyVar = (dpdy) dpdrVar.b;
                        bK.getClass();
                        dpdyVar.b();
                        dpdyVar.d.set(i5, bK);
                        i5++;
                        i = 5;
                        z3 = false;
                    }
                    dpec dpecVar2 = ((dpdy) dpdrVar.b).c;
                    dpec b2 = b(dpecVar2 == null ? dpec.o : dpecVar2);
                    if (dpdrVar.c) {
                        dpdrVar.bF();
                        dpdrVar.c = false;
                    }
                    dpdy dpdyVar2 = (dpdy) dpdrVar.b;
                    b2.getClass();
                    dpdyVar2.c = b2;
                    int i9 = dpdyVar2.a | 2;
                    dpdyVar2.a = i9;
                    dpdyVar2.e = null;
                    int i10 = i9 & (-9);
                    dpdyVar2.a = i10;
                    dpdyVar2.g = null;
                    dpdyVar2.a = i10 & (-33);
                    dpbmVar.d(i4, dpdrVar.bK());
                    i4++;
                    i = 5;
                    z3 = false;
                }
                dpec dpecVar3 = ((dpbp) dpbmVar.b).b;
                dpec b3 = b(dpecVar3 == null ? dpec.o : dpecVar3);
                if (dpbmVar.c) {
                    dpbmVar.bF();
                    dpbmVar.c = false;
                }
                dpbp dpbpVar = (dpbp) dpbmVar.b;
                b3.getClass();
                dpbpVar.b = b3;
                dpbpVar.a |= 1;
                dpbp bK2 = dpbmVar.bK();
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar = (dpie) dphrVar.b;
                bK2.getClass();
                dpieVar.b();
                dpieVar.e.set(i3, bK2);
                i3++;
                i = 5;
                z3 = false;
            }
            dpec dpecVar4 = ((dpie) dphrVar.b).d;
            dpec b4 = b(dpecVar4 == null ? dpec.o : dpecVar4);
            if (dphrVar.c) {
                dphrVar.bF();
                dphrVar.c = false;
            }
            dpie dpieVar2 = (dpie) dphrVar.b;
            b4.getClass();
            dpieVar2.d = b4;
            int i11 = dpieVar2.a | 8;
            dpieVar2.a = i11;
            dpieVar2.f = null;
            dpieVar2.a = i11 & (-17);
            int size = dvzoVar.b(a.i).b.size();
            if (dphrVar.c) {
                dphrVar.bF();
                dphrVar.c = false;
            }
            dpie dpieVar3 = (dpie) dphrVar.b;
            int i12 = dpieVar3.a | 128;
            dpieVar3.a = i12;
            dpieVar3.i = size;
            dpieVar3.p = null;
            int i13 = i12 & (-16385);
            dpieVar3.a = i13;
            dpieVar3.a = i13 & (-1048577);
            dpieVar3.t = dpie.C.t;
            if (dphrVar.c) {
                dphrVar.bF();
                dphrVar.c = false;
            }
            dpie dpieVar4 = (dpie) dphrVar.b;
            dpieVar4.a &= -2097153;
            dpieVar4.u = dpie.C.u;
            dvzoVar.h(i2, (dpie) dphrVar.bK());
            i2++;
            i = 5;
            z3 = false;
        }
        if (dvzoVar.c) {
            dvzoVar.bF();
            z = false;
            dvzoVar.c = false;
        } else {
            z = false;
        }
        ((dvzu) dvzoVar.b).p = dvzu.ck();
        if (dvzoVar.c) {
            dvzoVar.bF();
            dvzoVar.c = z;
        }
        dvzu dvzuVar2 = (dvzu) dvzoVar.b;
        dvzuVar2.a &= -513;
        dvzuVar2.r = dvzu.F.r;
        if (dvzoVar.c) {
            dvzoVar.bF();
            dvzoVar.c = false;
        }
        ((dvzu) dvzoVar.b).s = dvzu.ck();
        dwaa dwaaVar2 = dwbcVar.b;
        dwaaVar2 = dwaaVar2 == null ? dwaa.g : dwaaVar2;
        dsqp dsqpVar7 = (dsqp) dwaaVar2.cu(5);
        dsqpVar7.bC(dwaaVar2);
        dvzz dvzzVar = (dvzz) dsqpVar7;
        if (dvzzVar.c) {
            dvzzVar.bF();
            dvzzVar.c = false;
        }
        dwaa dwaaVar3 = (dwaa) dvzzVar.b;
        dvzu bK3 = dvzoVar.bK();
        bK3.getClass();
        dwaaVar3.b = bK3;
        dwaaVar3.a |= 1;
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dwaa bK4 = dvzzVar.bK();
        bK4.getClass();
        dwbcVar2.b = bK4;
        dwbcVar2.a |= 1;
        this.b = (dwbc) dwazVar.bK();
    }

    private static dpec b(dpec dpecVar) {
        dsqp dsqpVar = (dsqp) dpecVar.cu(5);
        dsqpVar.bC(dpecVar);
        dpeb dpebVar = (dpeb) dsqpVar;
        if (dpebVar.c) {
            dpebVar.bF();
            dpebVar.c = false;
        }
        dpec dpecVar2 = (dpec) dpebVar.b;
        dpec dpecVar3 = dpec.o;
        dpecVar2.a &= -3;
        dpecVar2.c = dpec.o.c;
        if (dpebVar.c) {
            dpebVar.bF();
            dpebVar.c = false;
        }
        dpec dpecVar4 = (dpec) dpebVar.b;
        dpecVar4.m = null;
        dpecVar4.a &= -1025;
        dpecVar4.n = dpec.ck();
        return dpebVar.bK();
    }

    @Override // defpackage.cjtt
    protected final dvfy a() {
        dvfx bZ = dvfy.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfy dvfyVar = (dvfy) bZ.b;
        dvfyVar.a |= 1;
        dvfyVar.d = 142;
        dvfv bZ2 = dvfw.d.bZ();
        dwaw dwawVar = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvfw dvfwVar = (dvfw) bZ2.b;
        dwawVar.getClass();
        dvfwVar.b = dwawVar;
        int i = dvfwVar.a | 1;
        dvfwVar.a = i;
        dwbc dwbcVar = this.b;
        dwbcVar.getClass();
        dvfwVar.c = dwbcVar;
        dvfwVar.a = i | 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfy dvfyVar2 = (dvfy) bZ.b;
        dvfw bK = bZ2.bK();
        bK.getClass();
        dvfyVar2.c = bK;
        dvfyVar2.b = 3;
        return bZ.bK();
    }
}
