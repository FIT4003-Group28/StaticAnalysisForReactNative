package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qw  reason: default package */
/* loaded from: classes4.dex */
public final class qw implements qz {
    final /* synthetic */ qz c;
    final qx a = new qx();
    private final Executor d = AsyncTask.THREAD_POOL_EXECUTOR;
    final AtomicBoolean b = new AtomicBoolean(false);
    private final Runnable e = new qv(this);

    public qw(qz qzVar) {
        this.c = qzVar;
    }

    private final void d() {
        if (this.b.compareAndSet(false, true)) {
            this.d.execute(this.e);
        }
    }

    public final void a(qy qyVar) {
        this.a.c(qyVar);
        d();
    }

    @Override // defpackage.qz
    public final void b(rb rbVar) {
        a(qy.b(4, 0, rbVar));
    }

    public final void c(qy qyVar) {
        this.a.d(qyVar);
        d();
    }
}
