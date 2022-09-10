package defpackage;
/* compiled from: PG */
/* renamed from: bhlm  reason: default package */
/* loaded from: classes3.dex */
public final class bhlm extends befr<bhmz> {
    public bhlm(bhmz bhmzVar) {
        super(bhmzVar, 2, 2);
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        cqivVar.a(new bhmh(), (bhmj) this.a);
    }

    @Override // defpackage.befr, defpackage.befz
    public final void b(cqiv cqivVar) {
        cjtd h = ((bhmz) this.a).a().h();
        if (h == null || h.f() != ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL) {
            return;
        }
        cqivVar.a(new grf(dtxy.kk), (bhmz) this.a);
    }
}
