package defpackage;
/* compiled from: PG */
/* renamed from: alyl  reason: default package */
/* loaded from: classes.dex */
public abstract class alyl {
    public static final alyl o = q().b();

    public static alyk q() {
        alvg alvgVar = new alvg();
        alvgVar.c("");
        alvgVar.e(false);
        return alvgVar;
    }

    @dzsi
    public abstract dfpo a();

    @dzsi
    public abstract akqi b();

    @dzsi
    public abstract dxdm c();

    @dzsi
    public abstract dniu d();

    @dzsi
    public abstract dniu e();

    @dzsi
    public abstract dnbh f();

    public abstract dcdc<Integer> g();

    @dzsi
    public abstract dmxh h();

    public abstract int hashCode();

    @dzsi
    public abstract String i();

    @dzsi
    public abstract String j();

    public abstract String k();

    public abstract boolean l();

    @dzsi
    public abstract String m();

    @dzsi
    public abstract drkg n();

    public abstract alyk o();

    public final alyl p(alyl alylVar) {
        alyk o2 = o();
        o2.g(alylVar.i());
        o2.d(alylVar.j());
        o2.c(alylVar.k());
        return o2.b();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("highlightIdForRAP", b());
        b.b("mapsEngineInfo", c());
        b.b("entityForSpotlightHighlighting", d());
        b.b("contextForSpotlightHighlighting", e());
        b.b("spotlightClientType", f());
        b.b("spotlightExperiments", g());
        b.b("customRestyleDescription", j());
        b.b("apiMapId", k());
        b.h("isMapModeServerStyleableByMapsApi", l());
        b.b("streamingSearchRequest", a());
        b.b("majorEventPaintRequest", h());
        b.b("paintTemplateFingerprint", m());
        b.b("travelHighlightInfo", n());
        return b.toString();
    }
}
