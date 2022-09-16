package defpackage;
/* compiled from: PG */
/* renamed from: rux  reason: default package */
/* loaded from: classes4.dex */
final class rux implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ ruy b;

    public rux(ruy ruyVar, rve rveVar) {
        this.b = ruyVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            ruz ruzVar = this.b.b;
            if (ruzVar != null) {
                ruzVar.d(this.a.g());
            }
        }
    }
}
