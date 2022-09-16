package defpackage;
/* compiled from: PG */
/* renamed from: rur  reason: default package */
/* loaded from: classes4.dex */
final class rur implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ rus b;

    public rur(rus rusVar, rve rveVar) {
        this.b = rusVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            rut rutVar = this.b.b;
            if (rutVar != null) {
                rutVar.a(this.a);
            }
        }
    }
}
