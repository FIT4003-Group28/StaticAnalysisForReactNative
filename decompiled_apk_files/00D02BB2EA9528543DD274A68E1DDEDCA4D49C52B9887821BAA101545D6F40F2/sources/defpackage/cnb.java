package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cnb  reason: default package */
/* loaded from: classes.dex */
final class cnb {
    public final Queue<Runnable> a = new ArrayDeque();
    private final Handler b;

    public cnb(Handler handler) {
        this.b = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Runnable runnable) {
        this.a.add(runnable);
        this.b.post(new Runnable(this) { // from class: cna
            private final cnb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnb cnbVar = this.a;
                synchronized (cnbVar) {
                    Runnable poll = cnbVar.a.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        while (this.a.size() > 0) {
            Runnable remove = this.a.remove();
            remove.run();
            this.b.removeCallbacks(remove);
        }
    }
}
