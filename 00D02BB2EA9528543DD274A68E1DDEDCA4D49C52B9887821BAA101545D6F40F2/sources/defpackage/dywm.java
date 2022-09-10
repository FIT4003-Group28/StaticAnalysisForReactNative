package defpackage;
/* compiled from: PG */
/* renamed from: dywm  reason: default package */
/* loaded from: classes6.dex */
final class dywm implements Runnable {
    final /* synthetic */ dywr a;

    public dywm(dywr dywrVar) {
        this.a = dywrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dywr dywrVar = this.a;
        dywrVar.n = new dywq(dywrVar, null, null);
        dywr dywrVar2 = this.a;
        dywrVar2.l.execute(dywrVar2.n);
        synchronized (this.a.j) {
            dywr dywrVar3 = this.a;
            dywrVar3.u = Integer.MAX_VALUE;
            dywrVar3.g();
        }
        throw null;
    }
}
