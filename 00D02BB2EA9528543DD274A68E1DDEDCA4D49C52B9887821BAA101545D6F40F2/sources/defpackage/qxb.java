package defpackage;
/* compiled from: PG */
/* renamed from: qxb  reason: default package */
/* loaded from: classes7.dex */
final class qxb implements amrl {
    private final amsa a = new amsa();
    private final amri b;

    public qxb(amri amriVar) {
        this.b = amriVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra a = amrkVar.a();
        dbsk.s(a);
        return this.a.a(aktcVar, amrkVar, this.b, a, amrjVar);
    }
}
