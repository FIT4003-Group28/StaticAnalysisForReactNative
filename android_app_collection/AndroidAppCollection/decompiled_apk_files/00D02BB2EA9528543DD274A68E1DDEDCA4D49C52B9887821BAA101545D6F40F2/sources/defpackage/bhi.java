package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bhi  reason: default package */
/* loaded from: classes3.dex */
public final class bhi implements Executor {
    public final ArrayDeque<bhh> a = new ArrayDeque<>();
    public final Object b = new Object();
    private final Executor c;
    private volatile Runnable d;

    public bhi(Executor executor) {
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.b) {
            bhh poll = this.a.poll();
            this.d = poll;
            if (poll != null) {
                this.c.execute(this.d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new bhh(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
