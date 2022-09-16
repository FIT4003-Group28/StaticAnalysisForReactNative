package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzgd  reason: default package */
/* loaded from: classes4.dex */
public final class bzgd implements Runnable, bzgi {
    @dzsi
    public bzgf a;
    @dzsi
    public final Executor b;
    final /* synthetic */ bzge c;

    public bzgd(bzge bzgeVar, @dzsi bzgf bzgfVar, Executor executor) {
        this.c = bzgeVar;
        dbsk.s(bzgfVar);
        this.a = bzgfVar;
        this.b = executor;
    }

    @Override // defpackage.bzgi
    public final void Rr() {
        synchronized (this) {
            if (this.a != null) {
                this.a = null;
                this.c.a.remove(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        bzgf bzgfVar;
        synchronized (this) {
            bzgfVar = this.a;
        }
        if (bzgfVar != null) {
            bzgfVar.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b();
    }
}
