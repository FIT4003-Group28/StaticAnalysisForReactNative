package defpackage;
/* compiled from: PG */
/* renamed from: ino  reason: default package */
/* loaded from: classes6.dex */
final class ino implements amrl {
    private final amsa a = new amsa();
    private final amri b;

    public ino(amri amriVar) {
        this.b = amriVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra a = amrkVar.a();
        dbsk.s(a);
        return this.a.a(aktcVar, amrkVar, this.b, a, amrjVar);
    }
}
