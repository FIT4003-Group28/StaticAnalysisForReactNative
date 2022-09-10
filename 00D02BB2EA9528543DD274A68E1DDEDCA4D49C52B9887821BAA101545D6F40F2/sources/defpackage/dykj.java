package defpackage;
/* compiled from: PG */
/* renamed from: dykj  reason: default package */
/* loaded from: classes6.dex */
public abstract class dykj extends dyko {
    private boolean a;
    private boolean b;
    private Runnable c;
    private boolean d;
    public final dyvi j;
    public dylu k;
    public dyfu l;
    public volatile boolean m;
    public boolean n;

    /* JADX INFO: Access modifiers changed from: protected */
    public dykj(int i, dyvi dyviVar, dyvr dyvrVar) {
        super(i, dyviVar, dyvrVar);
        this.l = dyfu.b;
        this.b = false;
        dbsk.t(dyviVar, "statsTraceCtx");
        this.j = dyviVar;
    }

    @Override // defpackage.dysn
    public void g(boolean z) {
        dbsk.m(this.n, "status should have been reported on deframer closed");
        this.b = true;
        if (this.d && z) {
            h(dyjb.l.g("Encountered end-of-stream mid-frame"), true, new dyhw());
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
    }

    public final void h(dyjb dyjbVar, boolean z, dyhw dyhwVar) {
        i(dyjbVar, dylt.PROCESSED, z, dyhwVar);
    }

    public final void i(dyjb dyjbVar, dylt dyltVar, boolean z, dyhw dyhwVar) {
        dbsk.t(dyjbVar, "status");
        dbsk.t(dyhwVar, "trailers");
        if (!this.n || z) {
            this.n = true;
            this.d = dyjbVar.i();
            synchronized (this.p) {
                this.t = true;
            }
            if (this.b) {
                this.c = null;
                j(dyjbVar, dyltVar, dyhwVar);
                return;
            }
            this.c = new dyki(this, dyjbVar, dyltVar, dyhwVar);
            if (z) {
                this.o.close();
            } else {
                this.o.e();
            }
        }
    }

    public final void j(dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        if (!this.a) {
            this.a = true;
            this.j.m();
            this.k.e(dyjbVar, dyltVar, dyhwVar);
            dyvr dyvrVar = this.q;
            if (dyjbVar.i()) {
                dyvrVar.d++;
            } else {
                dyvrVar.e++;
            }
        }
    }

    @Override // defpackage.dyko
    protected final /* bridge */ /* synthetic */ dyvl k() {
        return this.k;
    }
}
