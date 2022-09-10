package defpackage;
/* compiled from: PG */
/* renamed from: rgq  reason: default package */
/* loaded from: classes7.dex */
public final class rgq {
    public final rha a;
    public dbsg<rgp> b;
    public dbsg<rgp> c;
    private final rgx d;
    private final dcdn<dnkh, rhb> e;

    public rgq(dbsg<rhj> dbsgVar, dbsg<rhj> dbsgVar2, dcdn<dnkh, rhb> dcdnVar, rgx rgxVar, rha rhaVar) {
        this.b = dbsgVar.h(rfu.a);
        this.c = dbsgVar2.h(rgf.a);
        this.d = rgxVar;
        this.a = rhaVar;
        this.e = dcdnVar;
    }

    private final boolean f(dbsg<rgp> dbsgVar) {
        if (dbsgVar.a()) {
            rhj rhjVar = dbsgVar.b().a;
            dcdn<dnkh, rhb> dcdnVar = this.e;
            for (rhy rhyVar : rhjVar.c()) {
                rhs rhsVar = rhyVar.c;
                rhb rhbVar = dcdnVar.get(rhsVar.a());
                if (rhbVar == null) {
                    return true;
                }
                if (rhbVar.a().a()) {
                    akqq b = rhbVar.a().b();
                    dnoh dnohVar = rhsVar.a.c;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    if (!akqq.v(b, akqq.e(dnohVar), 1.0d)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    private final void g(rhj rhjVar) {
        for (rhy rhyVar : rhjVar.c()) {
            rhs rhsVar = rhyVar.c;
            rhb rhbVar = this.e.get(rhsVar.a());
            if (rhbVar != null) {
                dbsg<akqq> a = rhbVar.a();
                if (a.a()) {
                    dnkf ca = dnki.f.ca(rhsVar.a);
                    dnoh g = a.b().g();
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dnki dnkiVar = (dnki) ca.b;
                    g.getClass();
                    dnkiVar.c = g;
                    dnkiVar.a |= 2;
                    rhsVar.a = ca.bK();
                } else {
                    dnkf ca2 = dnki.f.ca(rhsVar.a);
                    if (ca2.c) {
                        ca2.bF();
                        ca2.c = false;
                    }
                    dnki dnkiVar2 = (dnki) ca2.b;
                    dnkiVar2.c = null;
                    dnkiVar2.a &= -3;
                    rhsVar.a = ca2.bK();
                }
                dbsg<V> h = rhbVar.b().h(rge.a);
                if (h.a()) {
                    dnkf ca3 = dnki.f.ca(rhsVar.a);
                    String str = (String) h.b();
                    if (ca3.c) {
                        ca3.bF();
                        ca3.c = false;
                    }
                    dnki dnkiVar3 = (dnki) ca3.b;
                    str.getClass();
                    dnkiVar3.a |= 4;
                    dnkiVar3.d = str;
                    rhsVar.a = ca3.bK();
                } else {
                    dnkf ca4 = dnki.f.ca(rhsVar.a);
                    if (ca4.c) {
                        ca4.bF();
                        ca4.c = false;
                    }
                    dnki dnkiVar4 = (dnki) ca4.b;
                    dnkiVar4.a &= -5;
                    dnkiVar4.d = dnki.f.d;
                    rhsVar.a = ca4.bK();
                }
            }
        }
    }

    public final dbsg<dnlg> a() {
        return f(this.b) ? dbpy.a : (dbsg) this.b.h(rfx.a).c(dbpy.a);
    }

    public final dbsg<dnlg> b() {
        return f(this.c) ? dbpy.a : (dbsg) this.c.h(rfy.a).c(dbpy.a);
    }

    public final rhj c() {
        rhj a;
        if (this.b.a()) {
            rgp b = this.b.b();
            b.c();
            a = b.a;
        } else {
            dbsg h = this.c.h(rfz.a).h(rga.a);
            rgx rgxVar = this.d;
            a = rgxVar.a("commute_to_work", dnkh.HOME, dnkh.WORK, (dcep) h.c(rgxVar.a.a()), dbpy.a, dbsg.i(rgxVar.a.b()));
            this.b = dbsg.i(rgp.b(a));
        }
        g(a);
        return a;
    }

    public final rhj d() {
        rhj a;
        if (this.c.a()) {
            rgp b = this.c.b();
            b.c();
            a = b.a;
        } else {
            dbsg h = this.b.h(rgb.a).h(rgc.a);
            rgx rgxVar = this.d;
            a = rgxVar.a("commute_to_home", dnkh.WORK, dnkh.HOME, (dcep) h.c(rgxVar.a.a()), dbsg.i(rgxVar.a.c()), dbpy.a);
            this.c = dbsg.i(rgp.b(a));
        }
        g(a);
        return a;
    }

    public final dcep<rhj> e(dbsl<rgp> dbslVar) {
        return dcbg.b(dbsg.k(dcbg.j(this.b, this.c))).o(dbslVar).s(rgd.a).B();
    }
}
