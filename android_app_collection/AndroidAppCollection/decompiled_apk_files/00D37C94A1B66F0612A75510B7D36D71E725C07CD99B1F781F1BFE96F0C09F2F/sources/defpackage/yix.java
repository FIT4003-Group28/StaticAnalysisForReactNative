package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yix  reason: default package */
/* loaded from: classes4.dex */
public final class yix extends anjy implements yiw {
    private final SettableFuture a;

    protected yix() {
        this(SettableFuture.f());
    }

    protected yix(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    public static yix c() {
        return new yix(SettableFuture.f());
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        if (exc == null) {
            exc = new ExecutionException("No exception provided to CallbackFuture.onError", null);
        }
        this.a.e(exc);
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        this.a.o(obj2);
    }

    @Override // defpackage.anjy
    protected final ankt d() {
        return this.a;
    }

    @Override // defpackage.anjy
    protected final /* bridge */ /* synthetic */ Future e() {
        return this.a;
    }

    @Override // defpackage.anjy, defpackage.amtj
    protected final /* bridge */ /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.anjy, java.util.concurrent.Future
    public final Object get() {
        return anlz.c(this.a);
    }

    @Override // defpackage.anjy, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return anlz.d(this.a, j, timeUnit);
    }
}
