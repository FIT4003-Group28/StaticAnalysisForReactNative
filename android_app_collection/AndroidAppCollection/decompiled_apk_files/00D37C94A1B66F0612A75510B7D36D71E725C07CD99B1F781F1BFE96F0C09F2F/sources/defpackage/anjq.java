package defpackage;

import com.google.common.util.concurrent.SettableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjq  reason: default package */
/* loaded from: classes.dex */
public final class anjq implements Runnable {
    final /* synthetic */ anlq a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ ankt c;
    final /* synthetic */ ankt d;
    final /* synthetic */ anjs e;

    public anjq(anlq anlqVar, SettableFuture settableFuture, ankt anktVar, ankt anktVar2, anjs anjsVar) {
        this.a = anlqVar;
        this.b = settableFuture;
        this.c = anktVar;
        this.d = anktVar2;
        this.e = anjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isDone()) {
            this.b.lV(this.c);
        } else if (!this.d.isCancelled() || !this.e.compareAndSet(anjr.NOT_RUN, anjr.CANCELLED)) {
        } else {
            this.a.cancel(false);
        }
    }
}
