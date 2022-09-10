package defpackage;
/* compiled from: PG */
/* renamed from: dypu  reason: default package */
/* loaded from: classes6.dex */
final class dypu implements Runnable {
    final /* synthetic */ dypx a;

    public dypu(dypx dypxVar) {
        this.a = dypxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dypx dypxVar = this.a;
        dypz dypzVar = dypxVar.c;
        dypzVar.r = null;
        if (dypzVar.q != null) {
            dbsk.m(dypzVar.o == null, "Unexpected non-null activeTransport");
            dypx dypxVar2 = this.a;
            dypxVar2.a.e(dypxVar2.c.q);
            return;
        }
        dymc dymcVar = dypzVar.n;
        dymc dymcVar2 = dypxVar.a;
        if (dymcVar != dymcVar2) {
            return;
        }
        dypzVar.o = dymcVar2;
        this.a.c.n = null;
        this.a.c.c(dyfk.READY);
    }
}
