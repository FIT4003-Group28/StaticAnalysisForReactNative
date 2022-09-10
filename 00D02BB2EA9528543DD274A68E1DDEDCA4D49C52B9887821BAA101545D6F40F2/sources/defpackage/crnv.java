package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crnv  reason: default package */
/* loaded from: classes5.dex */
public final class crnv implements degu<Boolean> {
    final /* synthetic */ crny a;
    final /* synthetic */ btlu b;
    final /* synthetic */ crnz c;

    public crnv(crnz crnzVar, crny crnyVar, btlu btluVar) {
        this.c = crnzVar;
        this.a = crnyVar;
        this.b = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcdc<bzqb> dcdcVar = crnz.a;
        this.c.hashCode();
        th.getMessage();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Boolean bool) {
        Boolean bool2 = bool;
        bvrj.NAVIGATION_INTERNAL.c();
        int i = this.a.a;
        crnz crnzVar = this.c;
        if (i != crnzVar.f) {
            crnzVar.hashCode();
        } else if (bool2 == null || !bool2.booleanValue()) {
            crnz crnzVar2 = this.c;
            crnzVar2.e = crnzVar2.j(2, this.a);
            crnz crnzVar3 = this.c;
            crnzVar3.h(2, this.b, this.a, crnzVar3.e);
        } else {
            crnz crnzVar4 = this.c;
            btlu btluVar = this.b;
            crny crnyVar = this.a;
            bvrj.NAVIGATION_INTERNAL.c();
            deha.q(deha.i(crnzVar4.d(crnyVar, crnyVar.i()), crnzVar4.e(btluVar.s(), crnyVar)), new crnw(crnzVar4, crnyVar, btluVar), crnzVar4.c);
        }
    }
}
