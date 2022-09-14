package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjrf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjrf implements dbrn<dnpo, dean> {
    public abstract void b(dnpo dnpoVar, deam deamVar);

    public void c(dnpo dnpoVar, deam deamVar) {
        throw null;
    }

    @Override // defpackage.dbrn
    /* renamed from: d */
    public final dean a(dnpo dnpoVar) {
        deam bZ = dean.p.bZ();
        for (dnow dnowVar : new dsrh(dnpoVar.d, dnpo.e)) {
            dpkj a = cjso.a.a(dnowVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar = (dean) bZ.b;
            a.getClass();
            dsrf dsrfVar = deanVar.b;
            if (!dsrfVar.a()) {
                deanVar.b = dsqw.cg(dsrfVar);
            }
            deanVar.b.h(a.O);
        }
        for (dnph dnphVar : new dsrh(dnpoVar.f, dnpo.g)) {
            dpkr a2 = cjso.b.a(dnphVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar2 = (dean) bZ.b;
            a2.getClass();
            dsrf dsrfVar2 = deanVar2.d;
            if (!dsrfVar2.a()) {
                deanVar2.d = dsqw.cg(dsrfVar2);
            }
            deanVar2.d.h(a2.s);
        }
        if ((dnpoVar.a & 2) != 0) {
            dbrn<dndc, deai> dbrnVar = cjso.c;
            dndc dndcVar = dnpoVar.c;
            if (dndcVar == null) {
                dndcVar = dndc.f;
            }
            deai a3 = dbrnVar.a(dndcVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar3 = (dean) bZ.b;
            a3.getClass();
            deanVar3.e = a3;
            deanVar3.a |= 1;
        }
        if ((dnpoVar.a & 4) != 0) {
            b(dnpoVar, bZ);
        }
        if ((dnpoVar.a & 8) != 0) {
            dbrn<dnpn, dpkw> dbrnVar2 = cjso.d;
            dnpn b = dnpn.b(dnpoVar.i);
            if (b == null) {
                b = dnpn.UNKNOWN_REASON;
            }
            dpkw a4 = dbrnVar2.a(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar4 = (dean) bZ.b;
            deanVar4.g = a4.c;
            deanVar4.a |= 4;
        }
        if ((dnpoVar.a & 32) != 0) {
            dbrn<dnoz, dpkl> dbrnVar3 = cjso.e;
            dnoz b2 = dnoz.b(dnpoVar.k);
            if (b2 == null) {
                b2 = dnoz.UNKNOWN_PROVIDER;
            }
            dpkl a5 = dbrnVar3.a(b2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar5 = (dean) bZ.b;
            deanVar5.h = a5.g;
            deanVar5.a |= 8;
        }
        for (dnpj dnpjVar : new dsrh(dnpoVar.l, dnpo.m)) {
            dpkt a6 = cjso.f.a(dnpjVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar6 = (dean) bZ.b;
            a6.getClass();
            dsrf dsrfVar3 = deanVar6.i;
            if (!dsrfVar3.a()) {
                deanVar6.i = dsqw.cg(dsrfVar3);
            }
            deanVar6.i.h(a6.d);
        }
        if ((dnpoVar.a & 128) != 0) {
            int i = dnpoVar.n;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar7 = (dean) bZ.b;
            deanVar7.a |= 32;
            deanVar7.j = i;
        }
        if ((dnpoVar.a & 256) != 0) {
            int i2 = dnpoVar.p;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar8 = (dean) bZ.b;
            deanVar8.a |= 128;
            deanVar8.l = i2;
        }
        if ((dnpoVar.a & 512) != 0) {
            c(dnpoVar, bZ);
        }
        if ((dnpoVar.a & 1024) != 0) {
            int i3 = dnpoVar.r;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dean deanVar9 = (dean) bZ.b;
            deanVar9.a |= 512;
            deanVar9.n = i3;
        }
        return bZ.bK();
    }
}
