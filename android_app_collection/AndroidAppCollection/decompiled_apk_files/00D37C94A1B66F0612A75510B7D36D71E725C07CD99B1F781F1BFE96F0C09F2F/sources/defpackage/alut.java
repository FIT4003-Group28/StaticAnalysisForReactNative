package defpackage;
/* compiled from: PG */
/* renamed from: alut  reason: default package */
/* loaded from: classes.dex */
final class alut implements Runnable {
    final /* synthetic */ aluu a;

    public alut(aluu aluuVar) {
        this.a = aluuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            aluv aluvVar = this.a.b;
            alsy alsyVar = ((alsq) aluvVar).a;
            alvg alvgVar = ((alsq) aluvVar).b;
            synchronized (alsyVar.e) {
                alsyVar.d.remove(alvgVar);
            }
        }
    }
}
