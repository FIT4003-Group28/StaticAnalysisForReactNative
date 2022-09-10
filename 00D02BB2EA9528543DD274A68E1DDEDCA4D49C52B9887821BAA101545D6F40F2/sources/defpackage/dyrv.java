package defpackage;
/* compiled from: PG */
/* renamed from: dyrv  reason: default package */
/* loaded from: classes6.dex */
final class dyrv implements Runnable {
    final /* synthetic */ dypz a;
    final /* synthetic */ dyrx b;

    public dyrv(dyrx dyrxVar, dypz dypzVar) {
        this.b = dyrxVar;
        this.a = dypzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dygj dygjVar = this.b.i.H;
        dygj.a(dygjVar.d, this.a);
        this.b.i.v.add(this.a);
    }
}
