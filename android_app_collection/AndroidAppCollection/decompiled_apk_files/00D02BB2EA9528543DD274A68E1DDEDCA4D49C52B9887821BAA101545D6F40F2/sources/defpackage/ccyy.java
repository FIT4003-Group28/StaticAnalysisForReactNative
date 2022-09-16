package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ccyy  reason: default package */
/* loaded from: classes4.dex */
public class ccyy implements ccxe {
    public final ccyx a;
    private ccwk c = ccwk.m;
    private boolean d = false;
    public final ccva b = new ccva();

    public ccyy(cqhn cqhnVar, ccyx ccyxVar) {
        this.a = ccyxVar;
    }

    @Override // defpackage.ccxe
    public cqkl a() {
        this.a.g();
        return cqkl.a;
    }

    @Override // defpackage.ccxe
    public cqkl b() {
        if (g().booleanValue()) {
            ccyx ccyxVar = this.a;
            ccwk ccwkVar = this.c;
            List<bbtm> f = this.b.f();
            dbsk.l(!ccwkVar.f.isEmpty());
            ccsj ccsjVar = ((cclf) ccyxVar).ae;
            ccsh g = ccsi.g();
            g.e(ccwkVar);
            g.d(f);
            g.i(3);
            ccsjVar.b(g.j());
            this.d = true;
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxe
    public Boolean c() {
        return Boolean.valueOf(!this.b.a().isEmpty());
    }

    @Override // defpackage.ccxe
    public ccup<?> d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ccyx, gfw] */
    @Override // defpackage.ccxe
    public cqkl e() {
        String str = this.c.d.isEmpty() ? null : this.c.d.get(0);
        ?? r7 = this.a;
        String str2 = this.c.f;
        cclf cclfVar = (cclf) r7;
        cclq a = cclfVar.e.a();
        dgfb b = dgfb.b(cclfVar.af.i().b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        ccxa ccxaVar = cclfVar.af.i().c;
        if (ccxaVar == null) {
            ccxaVar = ccxa.f;
        }
        a.i(b, str2, str, ccxaVar, ccme.f, r7);
        return cqkl.a;
    }

    @Override // defpackage.ccxe
    public String f() {
        return this.c.f;
    }

    @Override // defpackage.ccxe
    public Boolean g() {
        boolean z = false;
        if (!this.d && !this.c.f.isEmpty() && c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void h(ccwk ccwkVar) {
        this.c = ccwkVar;
        this.b.e(new ccyw(this));
        if (this.c.d.size() > 0) {
            this.b.g(dcbg.b(this.c.d).s(ccyt.a).z());
        }
    }

    public ccwk i() {
        return this.c;
    }

    public Boolean j() {
        int a = draz.a(this.c.h);
        return Boolean.valueOf(a != 0 && a == 2);
    }

    public Boolean k() {
        int a = draz.a(this.c.h);
        return Boolean.valueOf(a != 0 && a == 3);
    }

    public void l(List<bbtm> list) {
        this.b.g(list);
        n(dcbg.b(this.b.f()).s(ccyu.a).z());
    }

    public void m(String str, dgfg dgfgVar) {
        ccwk ccwkVar = this.c;
        dsqp dsqpVar = (dsqp) ccwkVar.cu(5);
        dsqpVar.bC(ccwkVar);
        ccwj ccwjVar = (ccwj) dsqpVar;
        if (ccwjVar.c) {
            ccwjVar.bF();
            ccwjVar.c = false;
        }
        ccwk ccwkVar2 = (ccwk) ccwjVar.b;
        ccwk ccwkVar3 = ccwk.m;
        str.getClass();
        int i = ccwkVar2.a | 4;
        ccwkVar2.a = i;
        ccwkVar2.f = str;
        dgfgVar.getClass();
        ccwkVar2.l = dgfgVar;
        ccwkVar2.a = i | 256;
        this.c = ccwjVar.bK();
        cqkx.p(this);
    }

    public final void n(List<String> list) {
        ccwk ccwkVar = this.c;
        dsqp dsqpVar = (dsqp) ccwkVar.cu(5);
        dsqpVar.bC(ccwkVar);
        ccwj ccwjVar = (ccwj) dsqpVar;
        if (ccwjVar.c) {
            ccwjVar.bF();
            ccwjVar.c = false;
        }
        ccwk ccwkVar2 = ccwk.m;
        ((ccwk) ccwjVar.b).d = dsqw.ck();
        ccwjVar.a(list);
        this.c = ccwjVar.bK();
        cqkx.p(this);
    }
}
