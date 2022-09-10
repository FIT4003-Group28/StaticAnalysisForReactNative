package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dqb  reason: default package */
/* loaded from: classes6.dex */
public final class dqb {
    public final befw a;
    public final Executor e;
    private final dqa f;
    public boolean d = false;
    @dzsi
    public dehn<ilo> b = null;
    @dzsi
    public ilo c = null;

    public dqb(Executor executor, befw befwVar, dqa dqaVar) {
        this.e = executor;
        this.a = befwVar;
        this.f = dqaVar;
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        dehn<ilo> dehnVar = this.b;
        if (dehnVar != null) {
            dehnVar.cancel(false);
            this.b = null;
        }
        this.c = null;
    }

    public final void b(ilo iloVar) {
        if (this.d) {
            this.f.a(iloVar);
            this.c = null;
        }
        this.b = null;
    }
}
