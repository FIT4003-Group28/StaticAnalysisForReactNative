package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvqu  reason: default package */
/* loaded from: classes4.dex */
public final class bvqu implements Executor {
    private final Executor a;
    private final Deque<Runnable> b = new ArrayDeque();
    private boolean c;

    public bvqu(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.b) {
            Runnable poll = this.b.poll();
            if (poll == null) {
                this.c = false;
                return;
            }
            poll.run();
            this.a.execute(new Runnable(this) { // from class: bvqt
                private final bvqu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.execute(new Runnable(this) { // from class: bvqs
                private final bvqu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }
}
