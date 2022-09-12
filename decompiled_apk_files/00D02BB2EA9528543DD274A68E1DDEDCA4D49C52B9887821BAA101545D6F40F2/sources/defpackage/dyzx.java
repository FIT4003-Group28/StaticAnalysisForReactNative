package defpackage;
/* compiled from: PG */
/* renamed from: dyzx  reason: default package */
/* loaded from: classes6.dex */
final class dyzx implements Runnable, dzak {
    final Runnable a;
    final dyzy b;
    Thread c;

    public dyzx(Runnable runnable, dyzy dyzyVar) {
        this.a = runnable;
        this.b = dyzyVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (this.c == Thread.currentThread()) {
            dyzy dyzyVar = this.b;
            if (dyzyVar instanceof dzes) {
                dzes dzesVar = (dzes) dyzyVar;
                if (dzesVar.c) {
                    return;
                }
                dzesVar.c = true;
                dzesVar.b.shutdown();
                return;
            }
        }
        this.b.SQ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            SQ();
            this.c = null;
        }
    }
}
