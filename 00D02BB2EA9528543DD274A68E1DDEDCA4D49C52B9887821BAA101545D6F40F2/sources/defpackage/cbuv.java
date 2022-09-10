package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbuv  reason: default package */
/* loaded from: classes4.dex */
public class cbuv implements cbuu, crzp {
    private final cbrx a;
    private dcdc<cbvb> b = dcdc.e();
    @dzsi
    private cbto c = null;

    public cbuv(cbrx cbrxVar, cbss cbssVar, Executor executor, cbvd cbvdVar, cqhn cqhnVar) {
        this.a = cbrxVar;
        ((cbsb) cbssVar).b.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<cbto> crzmVar) {
        cbto l = crzmVar.l();
        cbto cbtoVar = this.c;
        this.c = l;
        if (l != null && !l.equals(cbtoVar)) {
            dccx dccxVar = new dccx();
            for (cbtn cbtnVar : l.a) {
                cbrx cbrxVar = this.a;
                cbvd.a(cbrxVar, 1);
                cbvd.a(cbtnVar, 2);
                dccxVar.g(new cbvc(cbrxVar, cbtnVar));
            }
            this.b = dccxVar.f();
            cqkx.p(this);
        }
    }

    @Override // defpackage.cbuu
    public List<cbvb> b() {
        return this.b;
    }
}
