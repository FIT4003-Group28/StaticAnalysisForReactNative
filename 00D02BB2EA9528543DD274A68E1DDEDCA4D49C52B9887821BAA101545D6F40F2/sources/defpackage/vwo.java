package defpackage;
/* compiled from: PG */
/* renamed from: vwo  reason: default package */
/* loaded from: classes7.dex */
public final class vwo {
    private final dzsj<String> a;

    public vwo(dzsj<String> dzsjVar) {
        this.a = dzsjVar;
    }

    public final vwn a(vwn vwnVar, mw<vwl> mwVar) {
        return b(vwnVar.n(), mwVar);
    }

    public final vwn b(vwl vwlVar, mw<vwl> mwVar) {
        amte a;
        dcdn<Integer, String> dcdnVar;
        mwVar.a(vwlVar);
        vwn a2 = vwlVar.a();
        amte p = a2.p();
        if (p == null) {
            a = null;
        } else {
            dwbc dwbcVar = p.a.a;
            amtd amtdVar = new amtd(p);
            dsqp dsqpVar = (dsqp) dwbcVar.cu(5);
            dsqpVar.bC(dwbcVar);
            dwaz dwazVar = (dwaz) dsqpVar;
            dwaa dwaaVar = dwbcVar.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            dsqp dsqpVar2 = (dsqp) dwaaVar.cu(5);
            dsqpVar2.bC(dwaaVar);
            dvzz dvzzVar = (dvzz) dsqpVar2;
            dvzu dvzuVar = dwaaVar.b;
            if (dvzuVar == null) {
                dvzuVar = dvzu.F;
            }
            dsqp dsqpVar3 = (dsqp) dvzuVar.cu(5);
            dsqpVar3.bC(dvzuVar);
            dvzo dvzoVar = (dvzo) dsqpVar3;
            for (int i = 0; i < dvzuVar.e.size(); i++) {
                dpie dpieVar = dvzuVar.e.get(i);
                dsqp dsqpVar4 = (dsqp) dpieVar.cu(5);
                dsqpVar4.bC(dpieVar);
                dphr dphrVar = (dphr) dsqpVar4;
                if ((dpieVar.a & 134217728) == 0) {
                    String a3 = this.a.a();
                    if (dphrVar.c) {
                        dphrVar.bF();
                        dphrVar.c = false;
                    }
                    dpie dpieVar2 = (dpie) dphrVar.b;
                    a3.getClass();
                    dpieVar2.a |= 134217728;
                    dpieVar2.A = a3;
                }
                dvzoVar.h(i, (dpie) dphrVar.bK());
            }
            dvzu bK = dvzoVar.bK();
            if (dvzzVar.c) {
                dvzzVar.bF();
                dvzzVar.c = false;
            }
            dwaa dwaaVar2 = (dwaa) dvzzVar.b;
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
            amtdVar.a = new amsy((dwbc) dwazVar.bK());
            a = amtdVar.a();
        }
        amve[] amveVarArr = a != null ? a.a.d : null;
        if (amveVarArr != null) {
            dcdg q = dcdn.q(amveVarArr.length);
            for (int i2 = 0; i2 < amveVarArr.length; i2++) {
                Integer valueOf = Integer.valueOf(i2);
                String z = amveVarArr[i2].z();
                dbsk.s(z);
                q.f(valueOf, z);
            }
            dcdnVar = q.b();
        } else {
            dcdnVar = null;
        }
        vwl n = a2.n();
        n.q(a);
        n.i(dcdnVar);
        return n.a();
    }
}
