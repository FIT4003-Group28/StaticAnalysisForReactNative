package defpackage;
/* compiled from: PG */
/* renamed from: dyqp  reason: default package */
/* loaded from: classes6.dex */
final class dyqp implements Runnable {
    final /* synthetic */ dyrz a;

    public dyqp(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j();
        if (this.a.t != null) {
            dyhd dyhdVar = this.a.t;
        }
        dyrd dyrdVar = this.a.s;
        if (dyrdVar != null) {
            dyrdVar.a.b.d();
        }
    }
}
