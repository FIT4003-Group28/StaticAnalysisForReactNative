package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rvb  reason: default package */
/* loaded from: classes4.dex */
final class rvb implements rvf, ruz, ruw, ruq {
    public final rvd a;
    private final Executor b;
    private final rvj c;

    public rvb(Executor executor, rvd rvdVar, rvj rvjVar) {
        this.b = executor;
        this.a = rvdVar;
        this.c = rvjVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        this.b.execute(new rva(this, rveVar));
    }

    @Override // defpackage.ruq
    public final void b() {
        this.c.u();
    }

    @Override // defpackage.ruw
    public final void c(Exception exc) {
        this.c.s(exc);
    }

    @Override // defpackage.ruz
    public final void d(Object obj) {
        this.c.t(obj);
    }
}
