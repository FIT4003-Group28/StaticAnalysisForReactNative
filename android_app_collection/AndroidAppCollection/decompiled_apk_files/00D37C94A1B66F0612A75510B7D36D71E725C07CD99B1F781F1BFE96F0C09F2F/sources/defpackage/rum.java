package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rum  reason: default package */
/* loaded from: classes4.dex */
final class rum implements rvf, ruz, ruw, ruq {
    public final rui a;
    public final rvj b;
    private final Executor c;

    public rum(Executor executor, rui ruiVar, rvj rvjVar) {
        this.c = executor;
        this.a = ruiVar;
        this.b = rvjVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        this.c.execute(new rul(this, rveVar));
    }

    @Override // defpackage.ruq
    public final void b() {
        this.b.u();
    }

    @Override // defpackage.ruw
    public final void c(Exception exc) {
        this.b.s(exc);
    }

    @Override // defpackage.ruz
    public final void d(Object obj) {
        this.b.t(obj);
    }
}
