package com.google.android.apps.gmm.location.rawlocationevents;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "expected-location", b = ckok.HIGH)
/* loaded from: classes.dex */
public class ExpectedLocationEvent extends ahsm {
    @dzsi
    private final Boolean inTunnel;
    @dzsi
    private final Double modalDistanceAlongSelectedRouteMeters;
    @dzsi
    private final Double onSelectedRouteConfidence;
    @dzsi
    private final Long tileDataVersion;

    private ExpectedLocationEvent(GmmLocation gmmLocation, @dzsi Boolean bool, @dzsi Long l, @dzsi Double d, @dzsi Double d2) {
        super(gmmLocation);
        this.inTunnel = bool;
        this.tileDataVersion = l;
        this.onSelectedRouteConfidence = d;
        this.modalDistanceAlongSelectedRouteMeters = d2;
    }

    protected static GmmLocation buildLocation(String str, double d, double d2, @dzsi Long l, @dzsi Double d3, @dzsi Float f, @dzsi Float f2, @dzsi Float f3, @dzsi Integer num, @dzsi Integer num2, @dzsi Boolean bool, @dzsi Boolean bool2, @dzsi Boolean bool3) {
        amvs locationBuilder = locationBuilder(str, d, d2, l, d3, f, f2, f3, Float.NaN, Float.NaN, Float.NaN, num, num2);
        if (bool != null) {
            locationBuilder.x(bool.booleanValue());
        }
        if (bool2 != null) {
            locationBuilder.s(bool2.booleanValue());
        }
        if (bool3 != null) {
            locationBuilder.r(bool3.booleanValue());
        }
        return locationBuilder.d();
    }

    public ExpectedLocationEvent copyWithNewTime(long j) {
        amvs amvsVar = new amvs();
        amvsVar.j(this.location);
        amvsVar.C(j);
        return new ExpectedLocationEvent(amvsVar.d(), this.inTunnel, this.tileDataVersion, this.onSelectedRouteConfidence, this.modalDistanceAlongSelectedRouteMeters);
    }

    @ckom(a = "failsafes")
    @dzsi
    public Boolean getFailsafesGenerated() {
        GmmLocation gmmLocation = (GmmLocation) this.location;
        if (!gmmLocation.h()) {
            return null;
        }
        return Boolean.valueOf(gmmLocation.o());
    }

    @ckom(a = "routeDist")
    @dzsi
    public Double getModalDistanceAlongSelectedRouteMeters() {
        return this.modalDistanceAlongSelectedRouteMeters;
    }

    @ckom(a = "routeConf")
    @dzsi
    public Double getOnSelectedRouteConfidence() {
        return this.onSelectedRouteConfidence;
    }

    @ckom(a = "tileVer")
    @dzsi
    public Long getTileVer() {
        return this.tileDataVersion;
    }

    @ckon(a = "failsafes")
    public boolean hasFailsafesGenerated() {
        GmmLocation gmmLocation = (GmmLocation) this.location;
        return gmmLocation.h() && gmmLocation.o();
    }

    @ckon(a = "sc")
    public boolean hasInStartupConfusion() {
        return ((GmmLocation) this.location).h();
    }

    @ckon(a = "inTunnel")
    public boolean hasInTunnel() {
        return this.inTunnel != null;
    }

    @ckon(a = "routeDist")
    public boolean hasModalDistanceAlongSelectedRouteMeters() {
        return this.modalDistanceAlongSelectedRouteMeters != null;
    }

    @ckon(a = "onRoad")
    public boolean hasOnRoad() {
        return ((GmmLocation) this.location).h();
    }

    @ckon(a = "routeConf")
    public boolean hasOnSelectedRouteConfidence() {
        return this.onSelectedRouteConfidence != null;
    }

    @ckon(a = "tileVer")
    public boolean hasTileVer() {
        return this.tileDataVersion != null;
    }

    @ckom(a = "sc")
    @dzsi
    public Boolean isInStartupConfusion() {
        GmmLocation gmmLocation = (GmmLocation) this.location;
        if (!gmmLocation.h()) {
            return null;
        }
        return Boolean.valueOf(gmmLocation.l());
    }

    @ckom(a = "inTunnel")
    @dzsi
    public Boolean isInTunnel() {
        return this.inTunnel;
    }

    @ckom(a = "onRoad")
    @dzsi
    public Boolean isOnRoad() {
        GmmLocation gmmLocation = (GmmLocation) this.location;
        if (!gmmLocation.h()) {
            return null;
        }
        return Boolean.valueOf(gmmLocation.e());
    }

    @Override // defpackage.ahsm
    protected void toStringExtras(dbsb dbsbVar) {
        if (hasTileVer()) {
            dbsbVar.b("tileDataVersion", getTileVer());
        }
        if (hasInTunnel()) {
            dbsbVar.b("inTunnel", isInTunnel());
        }
        if (hasOnRoad()) {
            dbsbVar.b("onRoad", isOnRoad());
        }
        if (hasInStartupConfusion()) {
            dbsbVar.b("inStartupConfusion", isInStartupConfusion());
        }
        if (hasFailsafesGenerated()) {
            dbsbVar.b("failsafesGenerated", getFailsafesGenerated());
        }
        if (hasOnSelectedRouteConfidence()) {
            dbsbVar.b("onSelectedRouteConfidence", getOnSelectedRouteConfidence());
        }
        if (hasModalDistanceAlongSelectedRouteMeters()) {
            dbsbVar.b("modalDistanceAlongSelectedRouteMeters", getModalDistanceAlongSelectedRouteMeters());
        }
    }

    public ExpectedLocationEvent(@ckoo(a = "provider") String str, @ckoo(a = "lat") double d, @ckoo(a = "lng") double d2, @dzsi @ckoo(a = "time") Long l, @dzsi @ckoo(a = "altitude") Double d3, @dzsi @ckoo(a = "bearing") Float f, @dzsi @ckoo(a = "speed") Float f2, @dzsi @ckoo(a = "accuracy") Float f3, @ckoo(a = "speedAcc") float f4, @ckoo(a = "bearingAcc") float f5, @ckoo(a = "vertAcc") float f6, @dzsi @ckoo(a = "numSatellites") Integer num, @dzsi @ckoo(a = "fusedLocationType") Integer num2, @dzsi @ckoo(a = "inTunnel") Boolean bool, @dzsi @ckoo(a = "tileVer") Long l2, @dzsi @ckoo(a = "onRoad") Boolean bool2, @dzsi @ckoo(a = "sc") Boolean bool3, @dzsi @ckoo(a = "failsafes") Boolean bool4, @dzsi @ckoo(a = "routeConf") Double d4, @dzsi @ckoo(a = "routeDist") Double d5) {
        this(buildLocation(str, d, d2, (Long) null, d3, f, f2, f3, (Integer) null, num2, bool2, bool3, bool4), bool, l2, d4, d5);
    }

    public static ExpectedLocationEvent fromGmmLocation(GmmLocation gmmLocation) {
        amvu amvuVar = gmmLocation.l;
        long j = amvuVar == null ? 0L : amvuVar.j;
        return new ExpectedLocationEvent(gmmLocation, Boolean.valueOf(gmmLocation.g()), gmmLocation.q(), (j < 0 || !gmmLocation.y(j)) ? null : Double.valueOf(gmmLocation.z(j)), (j < 0 || !gmmLocation.G(j)) ? null : Double.valueOf(gmmLocation.H(j)));
    }
}
