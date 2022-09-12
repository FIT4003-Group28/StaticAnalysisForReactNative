package defpackage;
/* compiled from: PG */
/* renamed from: sgb  reason: default package */
/* loaded from: classes7.dex */
final class sgb implements amrl {
    private final amsa a = new amsa();
    private final amri b;

    public sgb(amri amriVar) {
        this.b = amriVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra a = amrkVar.a();
        dbsk.s(a);
        return this.a.a(aktcVar, amrkVar, this.b, a, amrjVar);
    }
}
