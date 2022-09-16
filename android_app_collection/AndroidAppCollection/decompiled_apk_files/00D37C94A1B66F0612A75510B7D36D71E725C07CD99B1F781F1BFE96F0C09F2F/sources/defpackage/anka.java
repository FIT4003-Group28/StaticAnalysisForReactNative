package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: anka  reason: default package */
/* loaded from: classes.dex */
public abstract class anka extends anjw implements ankw {
    protected abstract ankw f();

    @Override // defpackage.anjw
    protected /* bridge */ /* synthetic */ ExecutorService h() {
        throw null;
    }

    @Override // defpackage.anjw, java.util.concurrent.ExecutorService
    /* renamed from: qo */
    public final ankt submit(Runnable runnable) {
        return f().qo(runnable);
    }

    @Override // defpackage.anjw, java.util.concurrent.ExecutorService
    /* renamed from: qp */
    public final ankt submit(Callable callable) {
        return f().qp(callable);
    }

    @Override // defpackage.anjw, java.util.concurrent.ExecutorService
    /* renamed from: qq */
    public final ankt submit(Runnable runnable, Object obj) {
        return f().qq(runnable, obj);
    }
}
