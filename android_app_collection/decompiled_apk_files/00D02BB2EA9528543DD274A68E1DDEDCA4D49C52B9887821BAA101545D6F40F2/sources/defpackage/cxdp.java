package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cxdp  reason: default package */
/* loaded from: classes5.dex */
final class cxdp extends cxdi implements cwwr, cxdn {
    private static final Callable<Void> a = cxdo.a;
    private final cxdl b;
    private final cxed c;

    public cxdp(cxdl cxdlVar, cxed cxedVar) {
        this.b = cxdlVar;
        this.c = cxedVar;
    }

    private final void h(cxdh cxdhVar, String str) {
        if (!cxdh.b(cxdhVar) && this.c.a(str)) {
            cxdhVar.c = true;
        }
    }

    private final dehn<Void> i(@dzsi cxdh cxdhVar, String str, @dzsi String str2) {
        if (cxdhVar == null || cxdh.b(cxdhVar)) {
            return dehk.a;
        }
        if (cxdhVar.c) {
            return this.c.d(str, str2);
        }
        this.c.c(str, cxdhVar.a, cxdhVar.d());
        return dehk.a;
    }

    private static dehn<Void> j(dehn<Void>... dehnVarArr) {
        return deha.m(dehnVarArr).b(a, dege.a);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.c.e();
    }

    @Override // defpackage.cxdi
    public final synchronized cxdh a() {
        cxdh a2;
        a2 = this.b.a();
        h(a2, "");
        return a2;
    }

    @Override // defpackage.cxdi
    public final synchronized cxdh c(String str) {
        cxdh c;
        c = this.b.c(str);
        h(c, str);
        return c;
    }

    @Override // defpackage.cxdi
    public final synchronized cxdh d(String str) {
        cxdh d;
        d = this.b.d(str);
        if (!cxdh.b(d) && d.c) {
            this.c.e();
        }
        return d;
    }

    @Override // defpackage.cxdi
    public final dehn<Void> e(@dzsi cxdh cxdhVar, String str, int i) {
        return j(this.b.e(cxdhVar, str, i), i(cxdhVar, str, null));
    }

    @Override // defpackage.cxdi
    public final synchronized dehn<Void> f(String str, @dzsi String str2, @dzsi dzze dzzeVar, int i) {
        return j(this.b.f(str, str2, dzzeVar, i), i(this.b.c.get(str), str, str2));
    }

    @Override // defpackage.cwwr
    public final void g() {
    }
}
