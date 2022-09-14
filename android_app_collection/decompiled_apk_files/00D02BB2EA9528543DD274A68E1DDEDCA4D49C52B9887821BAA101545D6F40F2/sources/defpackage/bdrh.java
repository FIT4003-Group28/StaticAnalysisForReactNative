package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdrh  reason: default package */
/* loaded from: classes3.dex */
public final class bdrh implements Executor {
    public boolean a = false;
    public final Queue<Runnable> b = new ArrayDeque();
    private final bvrb c;

    public bdrh(bvrb bvrbVar) {
        this.c = bvrbVar;
    }

    private final synchronized void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.b(new Runnable(this) { // from class: bdrg
            private final bdrh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable poll;
                bdrh bdrhVar = this.a;
                while (true) {
                    synchronized (bdrhVar) {
                        poll = bdrhVar.b.poll();
                        if (poll == null) {
                            bdrhVar.a = false;
                            return;
                        }
                    }
                    poll.run();
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.b.offer(runnable);
        if (this.a) {
            return;
        }
        a();
    }
}
