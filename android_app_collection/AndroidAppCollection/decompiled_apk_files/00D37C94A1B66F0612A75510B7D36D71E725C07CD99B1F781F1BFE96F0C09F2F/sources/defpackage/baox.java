package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: baox  reason: default package */
/* loaded from: classes2.dex */
final class baox implements Runnable {
    final /* synthetic */ baow a;
    final /* synthetic */ Callable b;
    final /* synthetic */ baov c;
    final /* synthetic */ CountDownLatch d;

    public baox(baow baowVar, Callable callable, baov baovVar, CountDownLatch countDownLatch) {
        this.a = baowVar;
        this.b = callable;
        this.c = baovVar;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a = this.b.call();
        } catch (Exception e) {
            this.c.a = e;
        }
        this.d.countDown();
    }
}
