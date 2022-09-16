package defpackage;
/* compiled from: PG */
/* renamed from: tlf  reason: default package */
/* loaded from: classes7.dex */
public final class tlf {
    public static dbsg<amsy> a(amsy amsyVar, int i, amve amveVar) {
        if (!amveVar.v()) {
            return dbpy.a;
        }
        dpie dpieVar = amsyVar.m(i).a;
        dsqp dsqpVar = (dsqp) dpieVar.cu(5);
        dsqpVar.bC(dpieVar);
        dphr dphrVar = (dphr) dsqpVar;
        dpid w = amveVar.w();
        dpid dpidVar = ((dpie) dphrVar.b).w;
        if (dpidVar == null) {
            dpidVar = dpid.h;
        }
        dsqp dsqpVar2 = (dsqp) dpidVar.cu(5);
        dsqpVar2.bC(dpidVar);
        dphy dphyVar = (dphy) dsqpVar2;
        if (dphyVar.c) {
            dphyVar.bF();
            dphyVar.c = false;
        }
        ((dpid) dphyVar.b).e = dpid.ck();
        dphyVar.a(w.e);
        if (dphyVar.c) {
            dphyVar.bF();
            dphyVar.c = false;
        }
        ((dpid) dphyVar.b).f = dpid.ck();
        dphyVar.b(w.f);
        if (dphyVar.c) {
            dphyVar.bF();
            dphyVar.c = false;
        }
        ((dpid) dphyVar.b).g = dpid.ck();
        dsrj<dpia> dsrjVar = w.g;
        if (dphyVar.c) {
            dphyVar.bF();
            dphyVar.c = false;
        }
        dpid dpidVar2 = (dpid) dphyVar.b;
        dsrj<dpia> dsrjVar2 = dpidVar2.g;
        if (!dsrjVar2.a()) {
            dpidVar2.g = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dpidVar2.g);
        dwbc dwbcVar = amsyVar.a;
        dsqp dsqpVar3 = (dsqp) dwbcVar.cu(5);
        dsqpVar3.bC(dwbcVar);
        dwaz dwazVar = (dwaz) dsqpVar3;
        dwaa dwaaVar = ((dwbc) dwazVar.b).b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dsqp dsqpVar4 = (dsqp) dvzuVar.cu(5);
        dsqpVar4.bC(dvzuVar);
        dvzo dvzoVar = (dvzo) dsqpVar4;
        if (dphrVar.c) {
            dphrVar.bF();
            dphrVar.c = false;
        }
        dpie dpieVar2 = (dpie) dphrVar.b;
        dpid bK = dphyVar.bK();
        bK.getClass();
        dpieVar2.w = bK;
        dpieVar2.a |= 8388608;
        dvzoVar.g(i, dphrVar);
        dvzu bK2 = dvzoVar.bK();
        dwaa dwaaVar2 = ((dwbc) dwazVar.b).b;
        if (dwaaVar2 == null) {
            dwaaVar2 = dwaa.g;
        }
        dsqp dsqpVar5 = (dsqp) dwaaVar2.cu(5);
        dsqpVar5.bC(dwaaVar2);
        dvzz dvzzVar = (dvzz) dsqpVar5;
        if (dvzzVar.c) {
            dvzzVar.bF();
            dvzzVar.c = false;
        }
        dwaa dwaaVar3 = (dwaa) dvzzVar.b;
        bK2.getClass();
        dwaaVar3.b = bK2;
        dwaaVar3.a |= 1;
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dwaa bK3 = dvzzVar.bK();
        bK3.getClass();
        dwbcVar2.b = bK3;
        dwbcVar2.a |= 1;
        return dbsg.i(new amsy((dwbc) dwazVar.bK()));
    }

    public static dbsg<amsy> b(amsy amsyVar, amsy amsyVar2, int i) {
        int size;
        if (amsyVar2.s() == dovb.NO_ROUTES_FOUND) {
            return dbpy.a;
        }
        dvzu dvzuVar = amsyVar.a().b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dsqp dsqpVar = (dsqp) dvzuVar.cu(5);
        dsqpVar.bC(dvzuVar);
        dvzo dvzoVar = (dvzo) dsqpVar;
        dvzu dvzuVar2 = amsyVar2.a().b;
        if (dvzuVar2 == null) {
            dvzuVar2 = dvzu.F;
        }
        int size2 = dvzuVar2.p.size();
        if (size2 == 1 || size2 != 0) {
            dvzoVar.c(dvzuVar2.p.get(0));
            size = ((dvzu) dvzoVar.b).p.size() - 1;
        } else {
            size = ((dvzu) dvzoVar.b).p.size();
        }
        dpie dpieVar = amsyVar2.m(0).a;
        dsqp dsqpVar2 = (dsqp) dpieVar.cu(5);
        dsqpVar2.bC(dpieVar);
        dphr dphrVar = (dphr) dsqpVar2;
        if (dphrVar.c) {
            dphrVar.bF();
            dphrVar.c = false;
        }
        dpie dpieVar2 = (dpie) dphrVar.b;
        dpie dpieVar3 = dpie.C;
        dpieVar2.a |= 128;
        dpieVar2.i = size;
        dvzoVar.h(i, (dpie) dphrVar.bK());
        dwbc dwbcVar = amsyVar.a;
        dsqp dsqpVar3 = (dsqp) dwbcVar.cu(5);
        dsqpVar3.bC(dwbcVar);
        dwaz dwazVar = (dwaz) dsqpVar3;
        dwaa dwaaVar = ((dwbc) dwazVar.b).b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dsqp dsqpVar4 = (dsqp) dwaaVar.cu(5);
        dsqpVar4.bC(dwaaVar);
        dvzz dvzzVar = (dvzz) dsqpVar4;
        if (dvzzVar.c) {
            dvzzVar.bF();
            dvzzVar.c = false;
        }
        dwaa dwaaVar2 = (dwaa) dvzzVar.b;
        dvzu bK = dvzoVar.bK();
        bK.getClass();
        dwaaVar2.b = bK;
        dwaaVar2.a |= 1;
        dwaa bK2 = dvzzVar.bK();
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        bK2.getClass();
        dwbcVar2.b = bK2;
        dwbcVar2.a |= 1;
        return dbsg.i(new amsy((dwbc) dwazVar.bK()));
    }
}
