package defpackage;
/* compiled from: PG */
/* renamed from: dysv  reason: default package */
/* loaded from: classes6.dex */
public final class dysv extends dyem {
    public final dylv a;
    public final dyib<?, ?> b;
    public final dyhw c;
    public final dyet d;
    @dzsi
    public dyls g;
    public boolean h;
    dynv i;
    public final Object f = new Object();
    public final dyfo e = dyfo.a();

    public dysv(dylv dylvVar, dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        this.a = dylvVar;
        this.b = dyibVar;
        this.c = dyhwVar;
        this.d = dyetVar;
    }

    @Override // defpackage.dyem
    public final void a(dyhw dyhwVar) {
        throw null;
    }

    @Override // defpackage.dyem
    public final void b(dyjb dyjbVar) {
        dbsk.b(!dyjbVar.i(), "Cannot fail with OK status");
        dbsk.m(!this.h, "apply() or fail() already called");
        c(new dyoh(dyjbVar));
    }

    public final void c(dyls dylsVar) {
        boolean z = true;
        dbsk.m(!this.h, "already finalized");
        this.h = true;
        synchronized (this.f) {
            if (this.g == null) {
                this.g = dylsVar;
                return;
            }
            if (this.i == null) {
                z = false;
            }
            dbsk.m(z, "delayedStream is null");
            this.i.o(dylsVar);
        }
    }
}
