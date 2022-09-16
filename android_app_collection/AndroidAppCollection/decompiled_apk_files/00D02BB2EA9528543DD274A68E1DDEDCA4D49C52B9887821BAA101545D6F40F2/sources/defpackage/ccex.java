package defpackage;
/* compiled from: PG */
/* renamed from: ccex  reason: default package */
/* loaded from: classes4.dex */
final class ccex implements Runnable {
    final /* synthetic */ ilo a;
    final /* synthetic */ dlfh b;
    final /* synthetic */ ccey c;

    public ccex(ccey cceyVar, ilo iloVar, dlfh dlfhVar) {
        this.c = cceyVar;
        this.a = iloVar;
        this.b = dlfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        begj begjVar = new begj();
        begjVar.b(this.a);
        begjVar.c = jjn.EXPANDED;
        begjVar.F = false;
        begjVar.b = this.b;
        this.c.c.o(begjVar, false, null);
    }
}
