package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: crne  reason: default package */
/* loaded from: classes5.dex */
final class crne<T> implements Runnable {
    public final CountDownLatch a;
    private final bvqg<T> c;
    private final dcdc<T> d;
    public final crnd b = new crnd();
    private final AtomicInteger e = new AtomicInteger(0);

    public crne(dcdc<T> dcdcVar, bvqg<T> bvqgVar) {
        this.c = bvqgVar;
        this.d = dcdcVar;
        this.a = new CountDownLatch(dcdcVar.size());
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        int andIncrement = this.e.getAndIncrement();
        while (andIncrement < this.d.size()) {
            try {
                try {
                    this.c.NU(this.d.get(andIncrement));
                    countDownLatch = this.a;
                } catch (Exception e) {
                    this.b.a.compareAndSet(null, e);
                    countDownLatch = this.a;
                }
                countDownLatch.countDown();
                andIncrement = this.e.getAndIncrement();
            } catch (Throwable th) {
                this.a.countDown();
                throw th;
            }
        }
    }
}
