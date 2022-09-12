package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bdrs  reason: default package */
/* loaded from: classes3.dex */
public final class bdrs {
    public final Runnable a;
    public final AtomicInteger b;
    private final bvrb c;

    public bdrs(int i, Runnable runnable, bvrb bvrbVar) {
        this.c = bvrbVar;
        this.a = runnable;
        AtomicInteger atomicInteger = new AtomicInteger(i);
        this.b = atomicInteger;
        if (atomicInteger.get() == 0) {
            runnable.run();
        }
    }

    public final void a(final Runnable runnable, bvrj bvrjVar) {
        this.c.b(new Runnable(this, runnable) { // from class: bdrr
            private final bdrs a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdrs bdrsVar = this.a;
                try {
                    this.b.run();
                    if (bdrsVar.b.decrementAndGet() != 0) {
                        return;
                    }
                } catch (Throwable unused) {
                    if (bdrsVar.b.decrementAndGet() != 0) {
                        return;
                    }
                }
                bdrsVar.a.run();
            }
        }, bvrjVar);
    }
}
