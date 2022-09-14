package defpackage;
/* compiled from: PG */
/* renamed from: dywp  reason: default package */
/* loaded from: classes6.dex */
final class dywp implements Runnable {
    final /* synthetic */ dywr a;

    public dywp(dywr dywrVar) {
        this.a = dywrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dywr dywrVar = this.a;
        dywrVar.l.execute(dywrVar.n);
        synchronized (this.a.j) {
            dywr dywrVar2 = this.a;
            dywrVar2.u = Integer.MAX_VALUE;
            dywrVar2.g();
        }
    }
}
