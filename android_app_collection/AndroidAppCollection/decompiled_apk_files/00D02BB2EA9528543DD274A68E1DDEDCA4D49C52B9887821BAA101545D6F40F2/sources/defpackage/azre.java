package defpackage;
/* compiled from: PG */
@btsb
/* renamed from: azre  reason: default package */
/* loaded from: classes3.dex */
public final class azre {
    @dzsi
    public final btlu a;
    private final dcdc<azwv> b;
    @dzsi
    private final axwp c;
    private final dehn<Boolean> d;

    private azre(@dzsi btlu btluVar, dcdc<azwv> dcdcVar, @dzsi axwp axwpVar, dehn<Boolean> dehnVar) {
        this.a = btluVar;
        this.b = dcdcVar;
        this.c = axwpVar;
        this.d = dehnVar;
    }

    public static azre a(@dzsi btlu btluVar, axwp axwpVar) {
        return new azre(btluVar, dcdc.e(), axwpVar, axwpVar.i());
    }

    public final dcdc<azwv> b() {
        axwp axwpVar = this.c;
        return axwpVar != null ? axwpVar.e() : this.b;
    }

    public final boolean c() {
        return this.d.isDone() && ((Boolean) deha.s(this.d)).booleanValue();
    }
}
