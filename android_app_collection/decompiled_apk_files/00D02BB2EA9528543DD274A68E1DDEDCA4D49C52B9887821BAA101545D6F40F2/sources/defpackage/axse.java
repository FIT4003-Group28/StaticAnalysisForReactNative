package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axse  reason: default package */
/* loaded from: classes3.dex */
public final class axse implements axws {
    private final axwy b;
    private final Executor d;
    private final bzge a = new bzge();
    private axwt c = axwt.a;
    private dehn<String> e = null;

    public axse(axwy axwyVar, Executor executor) {
        this.b = axwyVar;
        this.d = executor;
    }

    private final synchronized void e(boolean z) {
        final dehn<String> C = this.b.C(z);
        if (C == this.e) {
            return;
        }
        this.e = C;
        C.Pk(new Runnable(this, C) { // from class: axsd
            private final axse a;
            private final dehn b;

            {
                this.a = this;
                this.b = C;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        }, this.d);
    }

    public final synchronized void a(dehn<String> dehnVar) {
        if (dehnVar != this.e) {
            return;
        }
        try {
            this.c = axwt.c(dehnVar.get(), true);
        } catch (InterruptedException | ExecutionException unused) {
        }
        this.a.a();
    }

    @Override // defpackage.axws
    public final synchronized axwt b() {
        return this.c;
    }

    @Override // defpackage.axws
    public final void c(boolean z) {
        e(z);
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.a.b(bzgfVar, bzgjVar, executor);
        e(false);
    }
}
