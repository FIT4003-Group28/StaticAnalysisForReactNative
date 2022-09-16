package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aikk  reason: default package */
/* loaded from: classes.dex */
public final class aikk extends afze {
    public boolean a;
    private boolean b = true;
    private final ankt c;

    private aikk(ankt anktVar) {
        this.c = anktVar;
    }

    public static aikk f(ankt anktVar) {
        return new aikk(anktVar);
    }

    public final boolean g(boolean z) {
        if (this.b || z) {
            this.a = true;
            return true;
        }
        this.a = false;
        return false;
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get() {
        Object obj = this.c.get();
        this.b = false;
        return obj;
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // defpackage.anie, defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        if (this.a) {
            return;
        }
        this.c.qY(runnable, executor);
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.c.get(j, timeUnit);
        this.b = false;
        return obj;
    }
}
