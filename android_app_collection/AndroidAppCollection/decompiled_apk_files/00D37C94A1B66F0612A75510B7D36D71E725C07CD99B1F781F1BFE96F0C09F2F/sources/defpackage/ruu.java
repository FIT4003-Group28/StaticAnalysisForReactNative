package defpackage;
/* compiled from: PG */
/* renamed from: ruu  reason: default package */
/* loaded from: classes4.dex */
final class ruu implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ ruv b;

    public ruu(ruv ruvVar, rve rveVar) {
        this.b = ruvVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            ruw ruwVar = this.b.b;
            if (ruwVar != null) {
                Exception f = this.a.f();
                qnm.b(f);
                ruwVar.c(f);
            }
        }
    }
}
