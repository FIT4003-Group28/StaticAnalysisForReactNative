package defpackage;
/* compiled from: PG */
/* renamed from: bkoj  reason: default package */
/* loaded from: classes3.dex */
public final class bkoj {
    public final bhru a;
    public bwrs<ilo> b;
    private final btvo c;

    public bkoj(btvo btvoVar, bhru bhruVar) {
        this.c = btvoVar;
        this.a = bhruVar;
    }

    private final boolean f() {
        return this.c.getPlaceMenuParameters().a();
    }

    private final boolean g() {
        return this.c.getPlaceMenuParameters().b();
    }

    public final boolean a() {
        return b() == ddhj.VISIBILITY_VISIBLE || c() == ddhj.VISIBILITY_VISIBLE;
    }

    public final ddhj b() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        if (iloVar == null) {
            return ddhj.VISIBILITY_HIDDEN;
        }
        if (e(iloVar)) {
            if (g()) {
                return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
            }
            return ddhj.VISIBILITY_VISIBLE;
        }
        return ddhj.VISIBILITY_HIDDEN;
    }

    public final ddhj c() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        if (iloVar == null) {
            return ddhj.VISIBILITY_HIDDEN;
        }
        if (d(iloVar)) {
            if (g()) {
                return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
            }
            return ddhj.VISIBILITY_VISIBLE;
        }
        return ddhj.VISIBILITY_HIDDEN;
    }

    public final boolean d(ilo iloVar) {
        return !iloVar.aF(dweb.MENU).isEmpty() && f();
    }

    public final boolean e(ilo iloVar) {
        return iloVar.az() != null && !iloVar.az().d.isEmpty() && f();
    }
}
