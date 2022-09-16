package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ylb  reason: default package */
/* loaded from: classes4.dex */
public final class ylb implements ylo {
    private final Executor a;

    public ylb(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.ylo
    public final /* synthetic */ Runnable a(Runnable runnable) {
        return runnable;
    }

    @Override // defpackage.ylo
    public final /* synthetic */ Callable b(Callable callable) {
        return callable;
    }

    @Override // defpackage.ylo
    public final void c(final Throwable th) {
        zep.d("Crashing on uncaught exception", th);
        this.a.execute(new Runnable() { // from class: yla
            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException("Crashing on uncaught exception", th);
            }
        });
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void e(Throwable th) {
        yln.a(this, th);
    }
}
