package defpackage;
/* compiled from: PG */
/* renamed from: vzk  reason: default package */
/* loaded from: classes7.dex */
final class vzk implements Runnable {
    final /* synthetic */ vzp a;

    public vzk(vzp vzpVar) {
        this.a = vzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vzp vzpVar = this.a;
        if (vzpVar.aD) {
            vzu vzuVar = vzpVar.an;
            dbsk.s(vzuVar);
            vzuVar.b();
            cqkx.p(this.a.aj);
            vzp vzpVar2 = this.a;
            vzpVar2.i(vzpVar2.al.c(), this.a.aj.h().c());
        }
    }
}
