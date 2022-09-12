package defpackage;
/* compiled from: PG */
/* renamed from: dypj  reason: default package */
/* loaded from: classes6.dex */
final class dypj implements Runnable {
    final /* synthetic */ dypk a;

    public dypj(dypk dypkVar) {
        this.a = dypkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dypz dypzVar = this.a.b;
        dysm dysmVar = dypzVar.k;
        dypzVar.j = null;
        dypzVar.k = null;
        dysmVar.e(dyjb.m.g("InternalSubchannel closed transport due to address change"));
    }
}
