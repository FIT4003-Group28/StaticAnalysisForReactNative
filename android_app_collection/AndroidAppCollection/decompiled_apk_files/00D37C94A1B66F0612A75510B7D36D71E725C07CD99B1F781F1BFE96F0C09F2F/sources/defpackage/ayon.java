package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayon  reason: default package */
/* loaded from: classes2.dex */
public final class ayon implements Runnable, aypg {
    final Runnable a;
    final ayoq b;
    Thread c;

    public ayon(Runnable runnable, ayoq ayoqVar) {
        this.a = runnable;
        this.b = ayoqVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.c == Thread.currentThread()) {
            ayoq ayoqVar = this.b;
            if (ayoqVar instanceof aznd) {
                aznd azndVar = (aznd) ayoqVar;
                if (azndVar.c) {
                    return;
                }
                azndVar.c = true;
                azndVar.b.shutdown();
                return;
            }
        }
        this.b.qr();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            qr();
            this.c = null;
        }
    }
}
