package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: alup  reason: default package */
/* loaded from: classes2.dex */
final class alup extends Thread {
    private Choreographer a;

    public alup() {
        super("ChoreographerThread");
        this.a = null;
    }

    public final synchronized Choreographer a() {
        Choreographer choreographer;
        if (getState() == Thread.State.NEW) {
            start();
        }
        while (true) {
            choreographer = this.a;
            if (choreographer == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return choreographer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this) {
            this.a = Choreographer.getInstance();
            notifyAll();
        }
        Looper.loop();
    }
}
