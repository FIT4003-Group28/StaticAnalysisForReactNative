package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyzd  reason: default package */
/* loaded from: classes6.dex */
final class dyzd extends ConcurrentLinkedQueue<Runnable> implements Executor {
    public static final Logger a = Logger.getLogger(dyzd.class.getName());
    public volatile Thread b;

    public static void a() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        LockSupport.unpark(this.b);
    }
}
