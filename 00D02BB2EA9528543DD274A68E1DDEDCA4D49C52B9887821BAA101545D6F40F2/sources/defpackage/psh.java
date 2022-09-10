package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: psh  reason: default package */
/* loaded from: classes7.dex */
public final class psh implements Runnable {
    final /* synthetic */ vvy a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ psi c;

    public psh(psi psiVar, vvy vvyVar, Runnable runnable) {
        this.c = psiVar;
        this.a = vvyVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            if (dbsd.a(this.c.c, this.a)) {
                psi psiVar = this.c;
                psiVar.b.b(psiVar.a, this.a);
                this.c.c = null;
            }
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
