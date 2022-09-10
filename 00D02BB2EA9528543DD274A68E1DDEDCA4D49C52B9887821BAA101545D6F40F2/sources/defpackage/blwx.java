package defpackage;
/* compiled from: PG */
/* renamed from: blwx  reason: default package */
/* loaded from: classes3.dex */
final class blwx implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ blwy b;

    public blwx(blwy blwyVar, Runnable runnable) {
        this.b = blwyVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            blwy blwyVar = this.b;
            blwyVar.d(blwl.a(blwyVar.c, blwyVar.d, dbsj.e(blwyVar.a.a().o())));
        }
        this.a.run();
    }
}
