package defpackage;
/* compiled from: PG */
/* renamed from: vtd  reason: default package */
/* loaded from: classes7.dex */
final class vtd implements amrl {
    private final amsa a = new amsa();
    private final amri b;

    public vtd() {
        amsd amsdVar = new amsd();
        amsdVar.c(new amrz());
        amsdVar.c(new amrq());
        amsdVar.c(new amrm());
        this.b = amsdVar.a();
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra a = amrkVar.a();
        dbsk.s(a);
        return this.a.a(aktcVar, amrkVar, this.b, a, amrjVar);
    }
}
