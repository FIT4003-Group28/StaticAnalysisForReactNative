package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: bvrd  reason: default package */
/* loaded from: classes.dex */
final class bvrd implements Runnable {
    final Runnable a;
    final Semaphore b;

    public bvrd(Runnable runnable, @dzsi Semaphore semaphore) {
        this.a = runnable;
        this.b = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.release();
        }
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
