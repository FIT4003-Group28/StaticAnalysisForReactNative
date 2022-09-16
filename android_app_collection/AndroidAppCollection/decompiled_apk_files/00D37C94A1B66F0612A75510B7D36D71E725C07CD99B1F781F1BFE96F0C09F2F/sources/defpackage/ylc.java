package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ylc  reason: default package */
/* loaded from: classes4.dex */
public final class ylc implements ylo {
    @Override // defpackage.ylo
    public final /* synthetic */ Runnable a(Runnable runnable) {
        return runnable;
    }

    @Override // defpackage.ylo
    public final /* synthetic */ Callable b(Callable callable) {
        return callable;
    }

    @Override // defpackage.ylo
    public final void c(Throwable th) {
        zep.d("Uncaught exception", th);
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void e(Throwable th) {
        yln.a(this, th);
    }
}
