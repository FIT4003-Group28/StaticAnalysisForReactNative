package defpackage;
/* compiled from: PG */
/* renamed from: bhru  reason: default package */
/* loaded from: classes3.dex */
public class bhru {
    private final bhrt a;
    private final bhrt b;

    public bhru(btvo btvoVar) {
        dkvf placeOfferingsParameters = btvoVar.getPlaceOfferingsParameters();
        dwpa ugcOfferingsParameters = btvoVar.getUgcOfferingsParameters();
        bhrs g = bhrt.g();
        g.e(dgfb.DISH);
        g.d(placeOfferingsParameters.a());
        g.c(placeOfferingsParameters.b());
        g.g(placeOfferingsParameters.c());
        g.f(placeOfferingsParameters.e());
        g.b(ugcOfferingsParameters.a());
        this.a = g.a();
        dkvf placeOfferingsParameters2 = btvoVar.getPlaceOfferingsParameters();
        dwpa ugcOfferingsParameters2 = btvoVar.getUgcOfferingsParameters();
        bhrs g2 = bhrt.g();
        g2.e(dgfb.DISH);
        g2.d(placeOfferingsParameters2.d());
        g2.c(placeOfferingsParameters2.b());
        g2.g(placeOfferingsParameters2.f());
        g2.f(placeOfferingsParameters2.e());
        g2.b(ugcOfferingsParameters2.a());
        this.b = g2.a();
    }

    static ddhj g(bhrt bhrtVar, cclp cclpVar) {
        if (!cclpVar.c(bhrtVar.a()) || cclpVar.b(bhrtVar.a()).isEmpty()) {
            return ddhj.VISIBILITY_HIDDEN;
        }
        if (bhrtVar.b()) {
            return ddhj.VISIBILITY_VISIBLE;
        }
        if (bhrtVar.c()) {
            return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        return ddhj.VISIBILITY_HIDDEN;
    }

    static ddhj h(bhrt bhrtVar, cclp cclpVar) {
        if (!cclpVar.c(bhrtVar.a()) || !bhrtVar.b() || !cclpVar.b(bhrtVar.a()).isEmpty() || !bhrtVar.f()) {
            return ddhj.VISIBILITY_HIDDEN;
        }
        if (bhrtVar.d()) {
            return ddhj.VISIBILITY_VISIBLE;
        }
        if (bhrtVar.e()) {
            return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        return ddhj.VISIBILITY_HIDDEN;
    }

    public final ddhj a(cclp cclpVar) {
        return g(this.a, cclpVar);
    }

    public final ddhj b(cclp cclpVar) {
        return h(this.a, cclpVar);
    }

    public final boolean c(cclp cclpVar) {
        return a(cclpVar) == ddhj.VISIBILITY_VISIBLE || b(cclpVar) == ddhj.VISIBILITY_VISIBLE;
    }

    public final ddhj d(cclp cclpVar) {
        return g(this.b, cclpVar);
    }

    public final ddhj e(cclp cclpVar) {
        return h(this.b, cclpVar);
    }

    public final boolean f(cclp cclpVar) {
        return d(cclpVar) == ddhj.VISIBILITY_VISIBLE || e(cclpVar) == ddhj.VISIBILITY_VISIBLE;
    }
}
