package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hwg  reason: default package */
/* loaded from: classes.dex */
public final class hwg implements akwu {
    final /* synthetic */ btvo a;

    public hwg(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.akwu
    public final akwr a() {
        dkiy enableFeatureParameters = this.a.getEnableFeatureParameters();
        dwwr vectorMapsParameters = this.a.getVectorMapsParameters();
        djsr spotlightHighlightingParameters = this.a.getSpotlightHighlightingParameters();
        duxo mapContentAnnotationParameters = this.a.getMapContentAnnotationParameters();
        akwi akwiVar = new akwi();
        boolean z = false;
        akwiVar.j(false);
        akwiVar.o(false);
        akwiVar.i(true);
        akwiVar.h(0);
        akwiVar.n(false);
        akwiVar.b(false);
        akwiVar.k(false);
        akwiVar.m(false);
        akwiVar.l(false);
        akwiVar.c(false);
        akwiVar.a(false);
        akwiVar.f(false);
        akwiVar.d(false);
        akwiVar.g(false);
        akwiVar.e(false);
        akwiVar.j(enableFeatureParameters.al);
        akwiVar.o(enableFeatureParameters.A);
        dwwg dwwgVar = vectorMapsParameters.m;
        if (dwwgVar == null) {
            dwwgVar = dwwg.e;
        }
        akwiVar.i(dwwgVar.b);
        akwiVar.h(enableFeatureParameters.aw);
        akwiVar.n(enableFeatureParameters.t);
        akwiVar.b(this.a.getLoggingParameters().w);
        akwiVar.k(this.a.getLoggingParameters().y);
        akwiVar.m(this.a.getLoggingParameters().z);
        akwiVar.l(this.a.getLoggingParameters().x);
        akwiVar.c(spotlightHighlightingParameters.a && !spotlightHighlightingParameters.b);
        if (spotlightHighlightingParameters.a && spotlightHighlightingParameters.b) {
            z = true;
        }
        akwiVar.a(z);
        akwiVar.f(spotlightHighlightingParameters.d);
        akwiVar.d(mapContentAnnotationParameters.c);
        akwiVar.g(mapContentAnnotationParameters.d);
        akwiVar.e(this.a.getMapContentParameters().a);
        String str = akwiVar.a == null ? " onlineThickTilesAtZ14Enabled" : "";
        if (akwiVar.b == null) {
            str = str.concat(" zenrinCarNavSensorRestrictionsEnabled");
        }
        if (akwiVar.c == null) {
            str = String.valueOf(str).concat(" interpolateStylesOnDemand");
        }
        if (akwiVar.d == null) {
            str = String.valueOf(str).concat(" glideMemoryCacheSize");
        }
        if (akwiVar.e == null) {
            str = String.valueOf(str).concat(" spotlightPersonalizedSmartmaps");
        }
        if (akwiVar.f == null) {
            str = String.valueOf(str).concat(" disableViewportLoggingForNewLabelInSnapshot");
        }
        if (akwiVar.g == null) {
            str = String.valueOf(str).concat(" skipCameraAnimationSteadyStateCheckForViewportLogging");
        }
        if (akwiVar.h == null) {
            str = String.valueOf(str).concat(" skipNonCameraSteadyStateChecksForViewportLogging");
        }
        if (akwiVar.i == null) {
            str = String.valueOf(str).concat(" skipDiffCheckForViewportLogging");
        }
        if (akwiVar.j == null) {
            str = String.valueOf(str).concat(" enableAreaHighlighting");
        }
        if (akwiVar.k == null) {
            str = String.valueOf(str).concat(" counterfactuallyLogAreaHighlighting");
        }
        if (akwiVar.l == null) {
            str = String.valueOf(str).concat(" enableIconicPlaces");
        }
        if (akwiVar.m == null) {
            str = String.valueOf(str).concat(" enableBasemapPersonalization");
        }
        if (akwiVar.n == null) {
            str = String.valueOf(str).concat(" enableLocalRecommendations");
        }
        if (akwiVar.o == null) {
            str = String.valueOf(str).concat(" enableBusynessOverlay");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new akwj(akwiVar.a.booleanValue(), akwiVar.b.booleanValue(), akwiVar.c.booleanValue(), akwiVar.d.intValue(), akwiVar.e.booleanValue(), akwiVar.f.booleanValue(), akwiVar.g.booleanValue(), akwiVar.h.booleanValue(), akwiVar.i.booleanValue(), akwiVar.j.booleanValue(), akwiVar.k.booleanValue(), akwiVar.l.booleanValue(), akwiVar.m.booleanValue(), akwiVar.n.booleanValue(), akwiVar.o.booleanValue());
    }

    @Override // defpackage.akwu
    public final akwp b() {
        btwd navigationParameters = this.a.getNavigationParameters();
        akwg akwgVar = new akwg();
        float f = 65.0f;
        akwgVar.b(65.0f);
        akwgVar.a(true);
        akwgVar.a(navigationParameters.r());
        for (dvdf dvdfVar : navigationParameters.a.R) {
            dvdi dvdiVar = dvdfVar.c;
            if (dvdiVar == null) {
                dvdiVar = dvdi.d;
            }
            f = Math.max(f, dvdiVar.b);
        }
        akwgVar.b(f);
        String str = akwgVar.a == null ? " maxCameraTilt" : "";
        if (akwgVar.b == null) {
            str = str.concat(" animateCameraPositionEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new akwh(akwgVar.a.floatValue(), akwgVar.b.booleanValue());
    }

    @Override // defpackage.akwu
    public final akwx c() {
        btwd navigationParameters = this.a.getNavigationParameters();
        dwwr vectorMapsParameters = this.a.getVectorMapsParameters();
        akww j = akwx.j();
        j.g(navigationParameters.a.aF);
        j.c(this.a.getSatelliteParameters().a);
        j.j(this.a.getTrafficParameters().a);
        j.d(vectorMapsParameters.d);
        j.b(vectorMapsParameters.n);
        j.i(this.a.getTileTypeExpirationParameters());
        j.f(vectorMapsParameters.e);
        j.e(vectorMapsParameters.a);
        j.h(vectorMapsParameters.b);
        return j.a();
    }

    @Override // defpackage.akwu
    public final akwt d() {
        duxo mapContentAnnotationParameters = this.a.getMapContentAnnotationParameters();
        dwwr vectorMapsParameters = this.a.getVectorMapsParameters();
        akws j = akwt.j();
        j.f(this.a.getPromotedPlacesParameters().d);
        j.c(mapContentAnnotationParameters.b);
        j.b(mapContentAnnotationParameters.a);
        int a = dwwm.a(vectorMapsParameters.f);
        boolean z = true;
        if (a != 0 && a != 1) {
            z = false;
        }
        j.h(z);
        j.g(vectorMapsParameters.l);
        j.d(vectorMapsParameters.g);
        j.e(vectorMapsParameters.h);
        j.a(vectorMapsParameters.y);
        akwk akwkVar = (akwk) j;
        String str = akwkVar.a == null ? " inheritOrganicRank" : "";
        if (akwkVar.b == null) {
            str = str.concat(" disableAllAnnotations");
        }
        if (akwkVar.c == null) {
            str = String.valueOf(str).concat(" annotationExperimentIds");
        }
        if (akwkVar.d == null) {
            str = String.valueOf(str).concat(" spotlightSecondaryLabelEnabled");
        }
        if (akwkVar.e == null) {
            str = String.valueOf(str).concat(" reservedLabelBoundingBoxPixelSize");
        }
        if (akwkVar.f == null) {
            str = String.valueOf(str).concat(" disableSecondaryLabelClickability");
        }
        if (akwkVar.g == null) {
            str = String.valueOf(str).concat(" animationFrameworkEnabled");
        }
        if (akwkVar.h == null) {
            str = String.valueOf(str).concat(" iconBaseUrl");
        }
        if (akwkVar.i == null) {
            str = String.valueOf(str).concat(" promotedPinsUsesPerPinData");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new akwl(akwkVar.a.booleanValue(), akwkVar.b.booleanValue(), akwkVar.c, akwkVar.d.booleanValue(), akwkVar.e.intValue(), akwkVar.f.booleanValue(), akwkVar.g.booleanValue(), akwkVar.h, akwkVar.i.booleanValue());
    }

    @Override // defpackage.akwu
    public final dmxf e() {
        return this.a.getPaintParameters();
    }

    @Override // defpackage.akwu
    public final dwko f() {
        return this.a.getTileZoomProgressionParameters();
    }

    @Override // defpackage.akwu
    public final akwv g() {
        return new akwv();
    }
}
