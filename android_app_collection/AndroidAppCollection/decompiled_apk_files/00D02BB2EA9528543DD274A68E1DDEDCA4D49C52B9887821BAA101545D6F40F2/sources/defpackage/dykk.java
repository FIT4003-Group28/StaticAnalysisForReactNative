package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dykk  reason: default package */
/* loaded from: classes6.dex */
public abstract class dykk extends dykp implements dyls, dyst {
    public static final Logger r = Logger.getLogger(dykk.class.getName());
    private final dyoo a;
    private dyhw b;
    private volatile boolean c;
    public final dyvr s;
    public final boolean t;

    /* JADX INFO: Access modifiers changed from: protected */
    public dykk(dyvt dyvtVar, dyvi dyviVar, dyvr dyvrVar, dyhw dyhwVar, dyet dyetVar) {
        dbsk.t(dyhwVar, "headers");
        dbsk.t(dyvrVar, "transportTracer");
        this.s = dyvrVar;
        this.t = dyow.a(dyetVar);
        this.a = new dysu(this, dyvtVar, dyviVar);
        this.b = dyhwVar;
    }

    @Override // defpackage.dyls
    public final void a(dylu dyluVar) {
        dykj t = t();
        dbsk.m(t.k == null, "Already called setListener");
        t.k = dyluVar;
        s().a(this.b, null);
        this.b = null;
    }

    @Override // defpackage.dyls
    public final void d() {
        if (!t().m) {
            t().m = true;
            v().d();
        }
    }

    @Override // defpackage.dyls
    public final void e(dyjb dyjbVar) {
        dbsk.b(!dyjbVar.i(), "Should not cancel with OK status");
        this.c = true;
        s().c(dyjbVar);
    }

    @Override // defpackage.dyls
    public final void i(dyfr dyfrVar) {
        this.b.j(dyow.a);
        this.b.i(dyow.a, Long.valueOf(Math.max(0L, dyfrVar.c(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.dyls
    public final void j(int i) {
        t().o.a(i);
    }

    @Override // defpackage.dyls
    public final void k(int i) {
        this.a.e(i);
    }

    @Override // defpackage.dyls
    public final void l(dypf dypfVar) {
        dypfVar.b("remote_addr", f().a(dygc.a));
    }

    @Override // defpackage.dyls
    public final void m(dyfu dyfuVar) {
        dykj t = t();
        dbsk.m(t.k == null, "Already called start");
        dbsk.t(dyfuVar, "decompressorRegistry");
        t.l = dyfuVar;
    }

    protected abstract dykh s();

    protected abstract dykj t();

    @Override // defpackage.dykp
    protected /* bridge */ /* synthetic */ dyko u() {
        throw null;
    }

    @Override // defpackage.dykp
    protected final dyoo v() {
        return this.a;
    }

    @Override // defpackage.dyst
    public final void w(dyvs dyvsVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (dyvsVar == null && !z) {
            z3 = false;
        }
        dbsk.b(z3, "null frame before EOS");
        s().b(dyvsVar, z, z2, i);
    }
}
