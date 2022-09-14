package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alna  reason: default package */
/* loaded from: classes2.dex */
final class alna implements Runnable, amfq {
    private final Executor a;
    private final deig<Void> b;
    private int c;

    public alna(Executor executor, deig<Void> deigVar, int i) {
        dbsk.e(i > 0, "BackgroundBarrier given a count <= 0: %s", i);
        this.a = executor;
        this.b = deigVar;
        this.c = i;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        int i;
        synchronized (this) {
            i = this.c - 1;
            this.c = i;
        }
        if (i == 0) {
            this.a.execute(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j(null);
    }
}
