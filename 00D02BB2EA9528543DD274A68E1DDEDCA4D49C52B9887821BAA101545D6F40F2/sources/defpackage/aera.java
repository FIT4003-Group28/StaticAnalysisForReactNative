package defpackage;
/* compiled from: PG */
/* renamed from: aera  reason: default package */
/* loaded from: classes2.dex */
final class aera implements Runnable {
    final /* synthetic */ ilo a;
    final /* synthetic */ ddho b;
    final /* synthetic */ aerb c;
    final /* synthetic */ int d;

    public aera(aerb aerbVar, ilo iloVar, int i, ddho ddhoVar) {
        this.c = aerbVar;
        this.a = iloVar;
        this.d = i;
        this.b = ddhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aerb aerbVar = this.c;
        ilo iloVar = this.a;
        dhiz dhizVar = aerbVar.g;
        int i = this.d;
        ddho ddhoVar = this.b;
        aeui aeuiVar = aerbVar.f;
        cjnx a = aerbVar.c.a();
        bvrj.BACKGROUND_THREADPOOL.c();
        btvo btvoVar = aerbVar.b;
        if (btvoVar == null || !btvoVar.getEnableFeatureParameters().u || iloVar == null || dbsd.a(iloVar.ai(), akqi.a)) {
            return;
        }
        akqi ai = iloVar.ai();
        aeue i2 = aeuiVar.i();
        if (i2 == null || !dbsd.a(i2.c(), ai)) {
            return;
        }
        dhix u = a.u(dhizVar, i, ddhoVar);
        if (aeuiVar != null) {
            dtaq d = aeuiVar.d();
            if (d != null) {
                dhja bZ = dhjb.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjb dhjbVar = (dhjb) bZ.b;
                d.getClass();
                dhjbVar.b = d;
                dhjbVar.a |= 1;
                dhjb bK = bZ.bK();
                if (u.c) {
                    u.bF();
                    u.c = false;
                }
                dhjf dhjfVar = (dhjf) u.b;
                dhjf dhjfVar2 = dhjf.i;
                bK.getClass();
                dhjfVar.e = bK;
                dhjfVar.a |= 8;
            }
            if (!aeuiVar.j.u()) {
                dspd dspdVar = aeuiVar.j;
                if (u.c) {
                    u.bF();
                    u.c = false;
                }
                dhjf dhjfVar3 = (dhjf) u.b;
                dhjf dhjfVar4 = dhjf.i;
                dspdVar.getClass();
                dhjfVar3.a |= 64;
                dhjfVar3.h = dspdVar;
            }
            dwjf e = aeuiVar.e();
            if (e != null) {
                String str = e.c;
                if (u.c) {
                    u.bF();
                    u.c = false;
                }
                dhjf dhjfVar5 = (dhjf) u.b;
                dhjf dhjfVar6 = dhjf.i;
                str.getClass();
                dhjfVar5.a |= 16;
                dhjfVar5.f = str;
                for (dwjb dwjbVar : e.b) {
                    dhjc bZ2 = dhjd.d.bZ();
                    dvyw dvywVar = dwjbVar.b;
                    if (dvywVar == null) {
                        dvywVar = dvyw.bv;
                    }
                    akqi f = akqi.f(dvywVar.g);
                    if (f != null) {
                        dtai m = f.m();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhjd dhjdVar = (dhjd) bZ2.b;
                        m.getClass();
                        dhjdVar.b = m;
                        dhjdVar.a |= 1;
                    }
                    dtaq dtaqVar = dwjbVar.d;
                    if (dtaqVar == null) {
                        dtaqVar = dtaq.m;
                    }
                    if ((dtaqVar.a & 256) != 0) {
                        dtaq dtaqVar2 = dwjbVar.d;
                        if (dtaqVar2 == null) {
                            dtaqVar2 = dtaq.m;
                        }
                        int i3 = dtaqVar2.h;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhjd dhjdVar2 = (dhjd) bZ2.b;
                        dhjdVar2.a |= 2;
                        dhjdVar2.c = i3;
                    }
                    dhjd bK2 = bZ2.bK();
                    if (u.c) {
                        u.bF();
                        u.c = false;
                    }
                    dhjf dhjfVar7 = (dhjf) u.b;
                    bK2.getClass();
                    dsrj<dhjd> dsrjVar = dhjfVar7.g;
                    if (!dsrjVar.a()) {
                        dhjfVar7.g = dsqw.cl(dsrjVar);
                    }
                    dhjfVar7.g.add(bK2);
                }
            }
        }
        a.t(u.bK(), ai);
    }
}
