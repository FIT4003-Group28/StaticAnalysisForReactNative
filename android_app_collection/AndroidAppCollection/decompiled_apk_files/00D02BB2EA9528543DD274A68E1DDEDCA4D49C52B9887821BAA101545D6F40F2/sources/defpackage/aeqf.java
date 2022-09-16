package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aeqf  reason: default package */
/* loaded from: classes2.dex */
public class aeqf implements aeqd {
    private final Activity a;
    @dzsi
    private final aeqe b;
    @dzsi
    private final ddho c;
    private final aeqq d;
    private ilo e;
    @dzsi
    private aeqp f;
    private dbsg<dnnn> g;

    public aeqf(Activity activity, aeqq aeqqVar, ilo iloVar, @dzsi aeqe aeqeVar, @dzsi ddho ddhoVar) {
        dbsg<dnnn> dbsgVar;
        this.a = activity;
        this.e = iloVar;
        this.b = aeqeVar;
        this.c = ddhoVar;
        this.d = aeqqVar;
        this.f = j(aeqqVar, iloVar);
        if (k(iloVar)) {
            dnnn dnnnVar = iloVar.bS().b().b;
            dbsgVar = dbsg.i(dnnnVar == null ? dnnn.l : dnnnVar);
        } else {
            dbsgVar = dbpy.a;
        }
        this.g = dbsgVar;
    }

    @dzsi
    private static aeqp j(aeqq aeqqVar, ilo iloVar) {
        if (!iloVar.bS().a() || iloVar.aa() == null) {
            return null;
        }
        return aeqqVar.a(iloVar.bS().b(), iloVar.bZ(), iloVar.n());
    }

    private static boolean k(ilo iloVar) {
        return iloVar.bS().a() && aehr.b(iloVar.bS().b());
    }

    @dzsi
    private final aeqj l() {
        aeqp aeqpVar = this.f;
        if (aeqpVar != null) {
            return aeqpVar.d();
        }
        return null;
    }

    @Override // defpackage.aeqd
    @dzsi
    public String a() {
        if (!this.g.a() || l() != null) {
            return null;
        }
        return aehr.e(this.a, this.g.b());
    }

    @Override // defpackage.aeqd
    @dzsi
    public aeqk b() {
        return this.f;
    }

    @Override // defpackage.aeqd
    @dzsi
    public aeqj c() {
        aeqj l = l();
        if (l == null || !l.a().equals(0)) {
            return null;
        }
        return l;
    }

    @Override // defpackage.aeqd
    @dzsi
    public aeqj d() {
        aeqj l = l();
        if (l == null || !l.a().equals(2)) {
            return null;
        }
        return l;
    }

    @Override // defpackage.aeqd
    public Boolean e() {
        aeqj l = l();
        boolean z = true;
        if (l == null || !l.a().equals(1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeqd
    public cqkl f() {
        aeqe aeqeVar = this.b;
        if (aeqeVar != null) {
            aeqeVar.a(this.e);
        }
        return cqkl.a;
    }

    @Override // defpackage.aeqd
    @dzsi
    public cjtd g() {
        if (this.c == null) {
            return null;
        }
        cjta c = cjtd.c(this.e.bZ());
        c.d = this.c;
        return c.a();
    }

    public void h(ilo iloVar) {
        dbsg<dnnn> dbsgVar;
        this.e = iloVar;
        this.f = j(this.d, iloVar);
        if (k(iloVar)) {
            dnnn dnnnVar = iloVar.bS().b().b;
            if (dnnnVar == null) {
                dnnnVar = dnnn.l;
            }
            dbsgVar = dbsg.i(dnnnVar);
        } else {
            dbsgVar = dbpy.a;
        }
        this.g = dbsgVar;
    }

    public boolean i() {
        return this.e.aa() != null;
    }
}
