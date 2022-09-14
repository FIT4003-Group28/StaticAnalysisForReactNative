package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvpt  reason: default package */
/* loaded from: classes.dex */
final class bvpt implements Runnable {
    final /* synthetic */ bvqr a;
    final /* synthetic */ bvqx b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;
    final /* synthetic */ Runnable e;
    final /* synthetic */ bvpv f;

    public bvpt(bvpv bvpvVar, bvqr bvqrVar, bvqx bvqxVar, long j, TimeUnit timeUnit, Runnable runnable) {
        this.f = bvpvVar;
        this.a = bvqrVar;
        this.b = bvqxVar;
        this.c = j;
        this.d = timeUnit;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final bvqr bvqrVar = this.a;
        final bvqx bvqxVar = this.b;
        final long j = this.c;
        final TimeUnit timeUnit = this.d;
        final Runnable runnable = this.e;
        bvqrVar.execute(new Runnable(this, bvqxVar, j, timeUnit, runnable, bvqrVar) { // from class: bvpr
            private final bvpt a;
            private final bvqx b;
            private final long c;
            private final TimeUnit d;
            private final Runnable e;
            private final bvqr f;

            {
                this.a = this;
                this.b = bvqxVar;
                this.c = j;
                this.d = timeUnit;
                this.e = runnable;
                this.f = bvqrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvpt bvptVar = this.a;
                bvqx bvqxVar2 = this.b;
                long j2 = this.c;
                TimeUnit timeUnit2 = this.d;
                Runnable runnable2 = this.e;
                bvqr bvqrVar2 = this.f;
                if (bvqxVar2.isDone()) {
                    return;
                }
                bvqxVar2.a(bvptVar.f.schedule(bvptVar, j2, timeUnit2).a);
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    bvptVar.f.execute(new Runnable(th) { // from class: bvps
                        private final Throwable a;

                        {
                            this.a = th;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            throw this.a;
                        }
                    });
                    bvqrVar2.b();
                }
            }
        });
    }
}
