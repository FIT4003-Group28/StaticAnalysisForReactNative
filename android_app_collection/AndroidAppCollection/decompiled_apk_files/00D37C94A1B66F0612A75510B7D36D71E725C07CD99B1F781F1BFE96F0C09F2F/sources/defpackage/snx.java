package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: snx  reason: default package */
/* loaded from: classes4.dex */
public final class snx implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ snz d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ soa g;

    public snx(soa soaVar, Runnable runnable, SettableFuture settableFuture, snz snzVar, long j, TimeUnit timeUnit) {
        this.g = soaVar;
        this.b = runnable;
        this.c = settableFuture;
        this.d = snzVar;
        this.e = j;
        this.f = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        soa soaVar = this.g;
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final snz snzVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        soaVar.execute(new Runnable() { // from class: snw
            @Override // java.lang.Runnable
            public final void run() {
                snx snxVar = snx.this;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                snz snzVar2 = snzVar;
                long j2 = j;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    ankv b = snxVar.g.a.b(snxVar.a, j2, timeUnit2);
                    snzVar2.a = b;
                    if (!snzVar2.isDone()) {
                        return;
                    }
                    b.cancel(false);
                } catch (Throwable th) {
                    settableFuture2.e(th);
                }
            }
        });
    }
}
