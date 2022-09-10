package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjuy  reason: default package */
/* loaded from: classes.dex */
public final class cjuy {
    private static final dcqe b = dcqe.c("cjuy");
    public final ConcurrentLinkedQueue<WeakReference<cjqp>> a = new ConcurrentLinkedQueue<>();
    private final dzsj<duxm> c;
    private final ScheduledExecutorService d;
    private volatile ScheduledFuture<?> e;

    public cjuy(dehq dehqVar, dzsj<duxm> dzsjVar) {
        this.d = dehqVar;
        this.c = dzsjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cjqp cjqpVar) {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    int i = this.c.a().B;
                    if (i <= 0) {
                        bvoo.h("Flush period is %d, must be > 0. Using 60 instead", Integer.valueOf(i));
                        i = 60;
                    }
                    long j = i;
                    this.e = this.d.scheduleAtFixedRate(new Runnable(this) { // from class: cjux
                        private final cjuy a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<WeakReference<cjqp>> it = this.a.a.iterator();
                            while (it.hasNext()) {
                                cjqp cjqpVar2 = it.next().get();
                                if (cjqpVar2 != null) {
                                    cjqpVar2.f();
                                }
                            }
                        }
                    }, j, j, TimeUnit.SECONDS);
                }
            }
        }
        this.a.add(new WeakReference<>(cjqpVar));
    }
}
