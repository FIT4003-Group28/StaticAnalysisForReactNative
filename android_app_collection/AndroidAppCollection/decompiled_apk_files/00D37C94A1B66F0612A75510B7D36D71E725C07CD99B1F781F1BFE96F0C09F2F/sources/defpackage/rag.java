package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: rag  reason: default package */
/* loaded from: classes4.dex */
final class rag extends Thread {
    public rag(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
