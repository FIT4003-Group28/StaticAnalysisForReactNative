package defpackage;
/* compiled from: PG */
/* renamed from: dypm  reason: default package */
/* loaded from: classes6.dex */
final class dypm implements Runnable {
    final /* synthetic */ dypz a;

    public dypm(dypz dypzVar) {
        this.a = dypzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.a(2, "Terminated");
        dypz dypzVar = this.a;
        dyrt dyrtVar = (dyrt) dypzVar.a;
        dyrtVar.a.i.v.remove(dypzVar);
        dygj.b(dyrtVar.a.i.H.d, dypzVar);
        dyrtVar.a.i.t();
    }
}
