package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czet  reason: default package */
/* loaded from: classes5.dex */
public final class czet implements degu<cylc> {
    final /* synthetic */ czdx a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dbtp c;
    final /* synthetic */ czev d;

    public czet(czev czevVar, czdx czdxVar, boolean z, dbtp dbtpVar) {
        this.d = czevVar;
        this.a = czdxVar;
        this.b = z;
        this.c = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        czev czevVar = this.d;
        cypg.d(czevVar.d.i, czevVar.f, 0L, cyor.a);
        czev czevVar2 = this.d;
        cypg.e(czevVar2.d.i, czevVar2.f, cypj.a(th), 0L, null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cylc cylcVar) {
        cylc cylcVar2 = cylcVar;
        cyes c = this.d.c(this.a, cylcVar2, this.b);
        cyui.b(c);
        czev czevVar = this.d;
        cypg.d(czevVar.d.i, czevVar.f, czex.n(cylcVar2), cyor.a);
        czev czevVar2 = this.d;
        cypg.e(czevVar2.d.i, czevVar2.f, cyfa.b(c), czex.o(cylcVar2), this.c, cyor.a);
    }
}
