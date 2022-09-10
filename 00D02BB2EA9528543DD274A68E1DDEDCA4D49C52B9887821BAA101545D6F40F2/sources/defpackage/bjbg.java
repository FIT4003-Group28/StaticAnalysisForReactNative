package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bjbg  reason: default package */
/* loaded from: classes3.dex */
public class bjbg implements bjbd {
    public final gga a;
    public final cjtd b;
    private final bjbe c;
    private final List<bkam> d;

    public bjbg(cqhn cqhnVar, gga ggaVar, bkan bkanVar, List<dqcq> list, cjtd cjtdVar, bjbe bjbeVar) {
        this.a = ggaVar;
        this.b = cjtdVar;
        this.c = bjbeVar;
        bjbf bjbfVar = new bjbf(this);
        dccx dccxVar = new dccx();
        for (dqcq dqcqVar : list) {
            dccxVar.g(bkanVar.a(dqcqVar, bjbfVar));
        }
        this.d = dccxVar.f();
    }

    @Override // defpackage.bjbd
    public List<? extends bjxa> a() {
        return this.d;
    }

    @Override // defpackage.bjbd
    public cjtd b() {
        cjta c = cjtd.c(this.b);
        c.d = dtxl.J;
        return c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(@dzsi dqcq dqcqVar) {
        bizu bizuVar = ((bizp) this.c).a;
        bizuVar.e = dqcqVar;
        cqkx.p(bizuVar);
        for (bkam bkamVar : this.d) {
            bkamVar.g(bkamVar.f().equals(dqcqVar) ? 1 : 0);
        }
        cqkx.p(this);
    }
}
