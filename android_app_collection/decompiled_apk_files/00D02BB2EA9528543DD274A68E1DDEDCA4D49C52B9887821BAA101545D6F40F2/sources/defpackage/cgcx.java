package defpackage;
/* compiled from: PG */
/* renamed from: cgcx  reason: default package */
/* loaded from: classes4.dex */
final class cgcx implements amrl {
    private final amsa a;
    private final amri b;

    public cgcx(amsa amsaVar, amrz amrzVar, amrm amrmVar) {
        this.a = amsaVar;
        amsd amsdVar = new amsd();
        amsdVar.d(100, amrzVar);
        amsdVar.d(10, amrmVar);
        this.b = amsdVar.a();
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra a = amrkVar.a();
        dbsk.s(a);
        return this.a.a(aktcVar, amrkVar, this.b, a, amrjVar);
    }
}
