package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayoo  reason: default package */
/* loaded from: classes2.dex */
public final class ayoo implements Runnable, aypg {
    final Runnable a;
    final ayoq b;
    volatile boolean c;

    public ayoo(Runnable runnable, ayoq ayoqVar) {
        this.a = runnable;
        this.b = ayoqVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c = true;
        this.b.qr();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            try {
                this.a.run();
            } catch (Throwable th) {
                bapv.j(th);
                this.b.qr();
                throw azom.b(th);
            }
        }
    }
}
