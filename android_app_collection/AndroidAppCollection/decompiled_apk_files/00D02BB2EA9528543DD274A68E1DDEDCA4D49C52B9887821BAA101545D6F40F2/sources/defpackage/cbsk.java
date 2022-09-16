package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cbsk  reason: default package */
/* loaded from: classes4.dex */
public final class cbsk implements cbsj {
    public final crzo<cbtv> a = new crzo<>();
    private final ges b;
    private final cbsq c;
    private final cbtc d;

    public cbsk(cbsq cbsqVar, cbtc cbtcVar, ges gesVar) {
        this.b = gesVar;
        this.c = cbsqVar;
        this.d = cbtcVar;
    }

    private final cbsj h(cbtv cbtvVar) {
        cbsj cbtbVar;
        int a = cbtu.a(cbtvVar.a);
        int i = a - 1;
        cbsj cbsjVar = null;
        if (a == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                cbsq cbsqVar = this.c;
                ges gesVar = this.b;
                gga a2 = cbsqVar.a.a();
                cbsq.a(a2, 1);
                cbsg a3 = cbsqVar.b.a();
                cbsq.a(a3, 2);
                cbsq.a(cbsqVar.c.a(), 3);
                cbsq.a(cbtvVar, 4);
                cbsq.a(gesVar, 5);
                cbtbVar = new cbsp(a2, a3, cbtvVar, gesVar);
            }
            dbsk.t(cbsjVar, "Could not fetch correct ReviewFeedbackPageAction.");
            return cbsjVar;
        }
        cbtc cbtcVar = this.d;
        ges gesVar2 = this.b;
        gga a4 = cbtcVar.a.a();
        cbtc.a(a4, 1);
        cbsg a5 = cbtcVar.b.a();
        cbtc.a(a5, 2);
        cbtc.a(cbtcVar.c.a(), 3);
        cbtc.a(cbtvVar, 4);
        cbtc.a(gesVar2, 5);
        cbtbVar = new cbtb(a4, a5, cbtvVar, gesVar2);
        cbsjVar = cbtbVar;
        dbsk.t(cbsjVar, "Could not fetch correct ReviewFeedbackPageAction.");
        return cbsjVar;
    }

    @Override // defpackage.cbsj
    public final void a(List<cbts> list) {
        cbsj h = h(f());
        h.a(list);
        this.a.a(h.f());
    }

    @Override // defpackage.cbsj
    public final void b() {
        cbsj h = h(f());
        h.b();
        this.a.a(h.f());
    }

    @Override // defpackage.cbsj
    public final void c() {
        h(f()).c();
    }

    @Override // defpackage.cbsj
    public final void d(int i) {
        h(f()).d(i);
    }

    @Override // defpackage.cbsj
    public final void e() {
        h(f()).e();
    }

    @Override // defpackage.cbsj
    public final cbtv f() {
        cbtv l = g().l();
        dbsk.s(l);
        dbsk.l(true);
        return l;
    }

    public final crzm<cbtv> g() {
        return this.a.a;
    }
}
