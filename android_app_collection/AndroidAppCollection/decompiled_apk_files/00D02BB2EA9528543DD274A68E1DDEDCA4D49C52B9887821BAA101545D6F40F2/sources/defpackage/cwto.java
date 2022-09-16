package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cwto  reason: default package */
/* loaded from: classes5.dex */
final class cwto implements ThreadFactory {
    public final int a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c = "Primes";

    public cwto(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Runnable runnable2 = new Runnable(this, runnable) { // from class: cwtn
            private final cwto a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwto cwtoVar = this.a;
                Runnable runnable3 = this.b;
                int i = cwtoVar.a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                runnable3.run();
            }
        };
        String str = this.c;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable2, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
