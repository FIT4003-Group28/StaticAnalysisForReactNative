package defpackage;
/* compiled from: PG */
/* renamed from: byox  reason: default package */
/* loaded from: classes4.dex */
final class byox implements Runnable {
    final /* synthetic */ byqe a;
    final /* synthetic */ btlu b;
    final /* synthetic */ byoz c;

    public byox(byoz byozVar, byqe byqeVar, btlu btluVar) {
        this.c = byozVar;
        this.a = byqeVar;
        this.b = btluVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            byoz byozVar = this.c;
            byoy byoyVar = byozVar.g;
            if (byoyVar != null) {
                byozVar.f(this.a.g(), byqb.TIMEOUT, false);
                byoyVar.c();
                byoz byozVar2 = this.c;
                byozVar2.c(byozVar2.a.b(), this.b);
            }
        }
    }
}
