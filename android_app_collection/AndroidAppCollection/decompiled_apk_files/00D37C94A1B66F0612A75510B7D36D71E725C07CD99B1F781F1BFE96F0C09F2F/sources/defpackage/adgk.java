package defpackage;

import java.util.List;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: adgk  reason: default package */
/* loaded from: classes.dex */
final class adgk implements Runnable {
    final List a;
    final CountDownLatch b;
    final adeo c;

    public adgk(List list, CountDownLatch countDownLatch, adeo adeoVar) {
        this.a = list;
        this.b = countDownLatch;
        this.c = adeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.addAll(this.c.a());
        this.b.countDown();
    }
}
