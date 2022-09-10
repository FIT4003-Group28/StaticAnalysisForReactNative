package defpackage;
/* compiled from: PG */
/* renamed from: aiev  reason: default package */
/* loaded from: classes2.dex */
public final class aiev implements amrl {
    private final amri c;
    private final amsa b = new amsa();
    @dzsi
    akra a = null;

    public aiev(amri amriVar) {
        this.c = amriVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        akra akraVar = this.a;
        if (akraVar == null) {
            return false;
        }
        return this.b.a(aktcVar, amrkVar, this.c, akraVar, amrjVar);
    }
}
