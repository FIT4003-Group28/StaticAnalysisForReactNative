package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pzz  reason: default package */
/* loaded from: classes4.dex */
public final class pzz extends Thread {
    final CountDownLatch a = new CountDownLatch(1);
    boolean b = false;
    private final WeakReference c;
    private final long d;

    public pzz(qab qabVar, long j) {
        this.c = new WeakReference(qabVar);
        this.d = j;
        start();
    }

    private final void a() {
        qab qabVar = (qab) this.c.get();
        if (qabVar != null) {
            qabVar.b();
            this.b = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
