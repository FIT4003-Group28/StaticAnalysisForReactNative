package defpackage;

import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnqo  reason: default package */
/* loaded from: classes.dex */
public abstract class cnqo implements Runnable {
    final /* synthetic */ cnqp b;

    public cnqo(cnqp cnqpVar) {
        this.b = cnqpVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        this.b.b.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock = this.b.b;
                } else {
                    a();
                    lock = this.b.b;
                }
            } catch (RuntimeException e) {
                cnrb cnrbVar = this.b.a;
                cnrbVar.e.sendMessage(cnrbVar.e.obtainMessage(2, e));
                lock = this.b.b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.b.b.unlock();
            throw th;
        }
    }
}
