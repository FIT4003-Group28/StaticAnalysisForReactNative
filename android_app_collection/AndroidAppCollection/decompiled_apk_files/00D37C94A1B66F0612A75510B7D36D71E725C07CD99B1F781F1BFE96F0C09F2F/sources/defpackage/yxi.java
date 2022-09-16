package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: yxi  reason: default package */
/* loaded from: classes4.dex */
public final class yxi implements ylo {
    @Override // defpackage.ylo
    public final Runnable a(Runnable runnable) {
        yxb a = yxd.a();
        return a != null ? new yxh(a, runnable) : runnable;
    }

    @Override // defpackage.ylo
    public final Callable b(Callable callable) {
        yxb a = yxd.a();
        return a != null ? new yxg(a, callable) : callable;
    }

    @Override // defpackage.ylo
    public final void c(Throwable th) {
    }

    @Override // defpackage.ylo
    public final void d() {
    }

    @Override // defpackage.ylo
    public final void e(Throwable th) {
    }
}
