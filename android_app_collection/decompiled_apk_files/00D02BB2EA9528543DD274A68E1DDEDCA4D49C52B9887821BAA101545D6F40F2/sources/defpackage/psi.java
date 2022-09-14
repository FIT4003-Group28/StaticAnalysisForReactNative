package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: psi  reason: default package */
/* loaded from: classes7.dex */
final class psi {
    public final vzd a;
    public final vzc b;
    @dzsi
    public vvy c;
    private final Executor d;

    public psi(Application application, Executor executor, Executor executor2, vzd vzdVar) {
        this.a = vzdVar;
        this.d = executor2;
        this.b = new vzc(application, executor, executor2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dbsz<vvy> dbszVar) {
        vvy vvyVar;
        synchronized (this) {
            vvyVar = this.c;
        }
        if (vvyVar != null) {
            dbszVar.NU(vvyVar);
        } else {
            this.b.c(this.a, dbszVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(vvy vvyVar, @dzsi Runnable runnable) {
        synchronized (this) {
            this.c = vvyVar;
        }
        this.d.execute(new psh(this, vvyVar, runnable));
    }
}
