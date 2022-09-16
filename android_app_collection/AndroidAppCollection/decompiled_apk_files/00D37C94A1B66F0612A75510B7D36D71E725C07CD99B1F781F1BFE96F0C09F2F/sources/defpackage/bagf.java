package defpackage;

import org.chromium.net.InlineExecutionProhibitedException;
/* compiled from: PG */
/* renamed from: bagf  reason: default package */
/* loaded from: classes2.dex */
final class bagf implements Runnable {
    public Thread a;
    public InlineExecutionProhibitedException b;
    private final Runnable c;

    public bagf(Runnable runnable, Thread thread) {
        this.c = runnable;
        this.a = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() == this.a) {
            this.b = new InlineExecutionProhibitedException();
        } else {
            this.c.run();
        }
    }
}
