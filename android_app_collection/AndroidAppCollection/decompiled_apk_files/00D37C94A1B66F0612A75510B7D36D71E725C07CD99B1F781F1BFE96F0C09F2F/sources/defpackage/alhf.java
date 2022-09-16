package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alhf  reason: default package */
/* loaded from: classes.dex */
public final class alhf implements ankt {
    public final String a;
    public final ankt b;
    public final algr c;
    private final alhc d;

    public alhf(String str, alhc alhcVar, algr algrVar, ankt anktVar) {
        this.a = str;
        this.d = alhcVar;
        this.c = algrVar;
        this.b = anktVar;
    }

    public final alhf b(algt algtVar) {
        alhc alhcVar = this.d;
        String str = this.a;
        algr algrVar = this.c;
        return new alhf(str, alhcVar, algrVar, anii.i(this, new algv(alhcVar, str, algtVar, algrVar, 1), anjk.a));
    }

    public final void c(Runnable runnable) {
        qY(runnable, this.d.c);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() {
        return (alhe) this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        this.b.qY(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (alhe) this.b.get(j, timeUnit);
    }
}
