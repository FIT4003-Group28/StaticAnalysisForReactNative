package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypx  reason: default package */
/* loaded from: classes6.dex */
public final class dypx implements dysl {
    final dymc a;
    boolean b = false;
    final /* synthetic */ dypz c;

    public dypx(dypz dypzVar, dymc dymcVar) {
        this.c = dypzVar;
        this.a = dymcVar;
    }

    @Override // defpackage.dysl
    public final void a() {
        this.c.d.a(2, "READY");
        this.c.e.execute(new dypu(this));
    }

    @Override // defpackage.dysl
    public final void b(boolean z) {
        this.c.g(this.a, z);
    }

    @Override // defpackage.dysl
    public final void c(dyjb dyjbVar) {
        this.c.d.b(2, "{0} SHUTDOWN with {1}", this.a.k(), dypz.j(dyjbVar));
        this.b = true;
        this.c.e.execute(new dypv(this, dyjbVar));
    }

    @Override // defpackage.dysl
    public final void d() {
        dbsk.m(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.d.b(2, "{0} Terminated", this.a.k());
        dygj.b(this.c.c.e, this.a);
        this.c.g(this.a, false);
        this.c.e.execute(new dypw(this));
    }
}
