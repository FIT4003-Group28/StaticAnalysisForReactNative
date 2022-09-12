package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eamb  reason: default package */
/* loaded from: classes6.dex */
public final class eamb implements Executor {
    public final Executor a;
    public final Runnable b = new eama(this);
    public final ArrayDeque<Runnable> c = new ArrayDeque<>();
    public boolean d;

    public eamb(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
