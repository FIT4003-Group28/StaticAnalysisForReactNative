package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btwd  reason: default package */
/* loaded from: classes.dex */
public class btwd {
    private static final dbty<List<dvdf>> d = dbud.a(new btwb());
    public final dvek a;
    private final dbty<Map<btwc, dvdf>> b = dbud.a(new btvz(this));
    private final dbty<Map<btwc, dvdf>> c = dbud.a(new btwa(this));

    public btwd(dvek dvekVar) {
        this.a = dvekVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void Y(java.util.List<defpackage.dvdf> r4, defpackage.dvdk r5, defpackage.dvdm r6, defpackage.dvdo r7, float r8) {
        /*
            dvdf r0 = defpackage.dvdf.d
            dsqp r0 = r0.bZ()
            dvde r0 = (defpackage.dvde) r0
            boolean r1 = r5.c
            r2 = 0
            if (r1 == 0) goto L12
            r5.bF()
            r5.c = r2
        L12:
            MessageType extends dsqw<MessageType, BuilderType> r1 = r5.b
            dvdp r1 = (defpackage.dvdp) r1
            dvdp r3 = defpackage.dvdp.f
            int r3 = r7.g
            r1.e = r3
            int r3 = r1.a
            r3 = r3 | 8
            r1.a = r3
            dsqw r5 = r5.bK()
            dvdp r5 = (defpackage.dvdp) r5
            boolean r1 = r0.c
            if (r1 == 0) goto L31
            r0.bF()
            r0.c = r2
        L31:
            MessageType extends dsqw<MessageType, BuilderType> r1 = r0.b
            dvdf r1 = (defpackage.dvdf) r1
            r5.getClass()
            r1.b = r5
            int r5 = r1.a
            r5 = r5 | 1
            r1.a = r5
            dvdm r5 = defpackage.dvdm.CAMERA_3D
            r1 = 1115815936(0x42820000, float:65.0)
            r3 = 0
            if (r6 == r5) goto L49
        L47:
            r1 = 0
            goto L60
        L49:
            dvdo r5 = defpackage.dvdo.FAR_VIEW_MODE
            if (r7 != r5) goto L4e
            goto L60
        L4e:
            dvdo r5 = defpackage.dvdo.NORMAL
            if (r7 != r5) goto L53
            goto L60
        L53:
            dvdo r5 = defpackage.dvdo.APPROACH
            if (r7 != r5) goto L5a
            r1 = 1113325568(0x425c0000, float:55.0)
            goto L60
        L5a:
            dvdo r5 = defpackage.dvdo.INSPECT_STEP
            if (r7 != r5) goto L47
            r1 = 1109393408(0x42200000, float:40.0)
        L60:
            dvdi r5 = defpackage.dvdi.d
            dsqp r5 = r5.bZ()
            dvdh r5 = (defpackage.dvdh) r5
            boolean r6 = r5.c
            if (r6 == 0) goto L71
            r5.bF()
            r5.c = r2
        L71:
            MessageType extends dsqw<MessageType, BuilderType> r6 = r5.b
            dvdi r6 = (defpackage.dvdi) r6
            int r7 = r6.a
            r7 = r7 | 1
            r6.a = r7
            r6.b = r1
            r7 = r7 | 2
            r6.a = r7
            r6.c = r8
            dsqw r5 = r5.bK()
            dvdi r5 = (defpackage.dvdi) r5
            boolean r6 = r0.c
            if (r6 == 0) goto L92
            r0.bF()
            r0.c = r2
        L92:
            MessageType extends dsqw<MessageType, BuilderType> r6 = r0.b
            dvdf r6 = (defpackage.dvdf) r6
            r5.getClass()
            r6.c = r5
            int r5 = r6.a
            r5 = r5 | 2
            r6.a = r5
            dsqw r5 = r0.bK()
            dvdf r5 = (defpackage.dvdf) r5
            r4.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btwd.Y(java.util.List, dvdk, dvdm, dvdo, float):void");
    }

    private static final double Z(int i) {
        double d2 = i;
        Double.isNaN(d2);
        return d2 * 1.0E-6d;
    }

    public static void a(List<dvdf> list, dvdm dvdmVar, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        dvdk bZ = dvdp.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvdp dvdpVar = (dvdp) bZ.b;
        dvdpVar.b = dvdmVar.e;
        int i = dvdpVar.a | 1;
        dvdpVar.a = i;
        int i2 = i | 2;
        dvdpVar.a = i2;
        dvdpVar.c = z;
        dvdpVar.a = i2 | 4;
        dvdpVar.d = z2;
        Y(list, bZ, dvdmVar, dvdo.FAR_VIEW_MODE, f);
        Y(list, bZ, dvdmVar, dvdo.NORMAL, f2);
        Y(list, bZ, dvdmVar, dvdo.APPROACH, f3);
        Y(list, bZ, dvdmVar, dvdo.INSPECT_STEP, f4);
        Y(list, bZ, dvdmVar, dvdo.INSPECT_ROUTE, f5);
    }

    private final List<dvdf> aa() {
        return this.a.R.isEmpty() ? d.a() : this.a.R;
    }

    public final boolean A() {
        dusi dusiVar = this.a.U;
        if (dusiVar == null) {
            dusiVar = dusi.c;
        }
        return dusiVar.a;
    }

    public final boolean B() {
        dusi dusiVar = this.a.U;
        if (dusiVar == null) {
            dusiVar = dusi.c;
        }
        return dusiVar.b;
    }

    public final boolean C() {
        return this.a.V;
    }

    public final float D() {
        return this.a.Y;
    }

    public final float E() {
        return Math.min(1.0E-4f, this.a.Z);
    }

    public final int F() {
        return Math.max(500, this.a.ag);
    }

    public final boolean G() {
        return this.a.aC;
    }

    public final boolean H() {
        return this.a.aD;
    }

    public final boolean I() {
        return this.a.aE;
    }

    public final dhlz J() {
        dhlz dhlzVar = this.a.aJ;
        return dhlzVar == null ? dhlz.n : dhlzVar;
    }

    public final dveb K() {
        dveb dvebVar = this.a.aI;
        return dvebVar == null ? dveb.d : dvebVar;
    }

    public final boolean L() {
        return this.a.W;
    }

    public final dvdz M() {
        dvdz dvdzVar = this.a.aG;
        return dvdzVar == null ? dvdz.e : dvdzVar;
    }

    public final dvej N() {
        dvej b = dvej.b(this.a.aS);
        return b == null ? dvej.UNKNOWN_TRAFFIC_RADAR_CAMERA_VARIANT : b;
    }

    public final dveh O() {
        dveh dvehVar = this.a.aU;
        return dvehVar == null ? dveh.f : dvehVar;
    }

    public final boolean P() {
        return this.a.aV;
    }

    public final boolean Q() {
        return this.a.aY;
    }

    public final boolean R() {
        return this.a.ba;
    }

    public final boolean S() {
        return this.a.bb;
    }

    public final boolean T() {
        return this.a.bc;
    }

    public final boolean U() {
        return this.a.bk;
    }

    public final duue V() {
        duue duueVar = this.a.bl;
        return duueVar == null ? duue.g : duueVar;
    }

    public final dvtg W() {
        dvtg dvtgVar = this.a.bn;
        return dvtgVar == null ? dvtg.a : dvtgVar;
    }

    public final int X() {
        int a = dvds.a(this.a.aP);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final Map<btwc, dvdf> b(boolean z) {
        HashMap hashMap = new HashMap();
        List<dvdf> a = z ? d.a() : aa();
        for (dvdf dvdfVar : a) {
            dvdp dvdpVar = dvdfVar.b;
            if (dvdpVar == null) {
                dvdpVar = dvdp.f;
            }
            dvdm b = dvdm.b(dvdpVar.b);
            if (b == null) {
                b = dvdm.UNKNOWN_CAMERA_TYPE;
            }
            boolean z2 = dvdpVar.c;
            boolean z3 = dvdpVar.d;
            dvdo b2 = dvdo.b(dvdpVar.e);
            if (b2 == null) {
                b2 = dvdo.UNKNOWN_VIEW_MODE;
            }
            hashMap.put(new btwc(b, z2, z3, b2), dvdfVar);
        }
        a.size();
        hashMap.size();
        return hashMap;
    }

    public final int c() {
        return this.a.g;
    }

    public final int d() {
        return this.a.m;
    }

    public final int e() {
        return this.a.o;
    }

    public final int f() {
        return this.a.p;
    }

    public final float g() {
        return this.a.r;
    }

    public final float h() {
        return this.a.q * 0.01f;
    }

    public final int i() {
        return this.a.L;
    }

    public final int j() {
        return this.a.K;
    }

    public final int k() {
        return this.a.P;
    }

    public final int l() {
        return this.a.s;
    }

    public final double m() {
        return Z(this.a.u);
    }

    public final int n() {
        return this.a.v;
    }

    public final int o() {
        return this.a.w;
    }

    public final int p() {
        return this.a.x;
    }

    public final int q() {
        return this.a.y;
    }

    public final boolean r() {
        return this.a.A;
    }

    public final dvgi s() {
        dvgi dvgiVar = this.a.E;
        return dvgiVar == null ? dvgi.b : dvgiVar;
    }

    public final boolean t() {
        return this.a.T;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        double d2 = -this.a.a;
        Double.isNaN(d2);
        b.d("hmmBaselineTransitionLikelihood", Math.pow(10.0d, d2 * 0.1d));
        b.d("hmmOffTheRoadLikelihoodThreshold", Z(this.a.b));
        b.f("hmmNumCandidatesToKeep", this.a.c);
        b.f("hmmMaxRoadNetworkRadiusMeters", this.a.d);
        b.f("hmmConnectivityToleranceWorld", this.a.e);
        b.f("hmmRouteMatchingToleranceWorld", this.a.f);
        b.f("hmmRoadNetworkErrorStdMeters", c());
        b.f("hmmRoadNetworkBearingErrorStdDeg", this.a.h);
        b.d("hmmRouteLikelihoodWeight", Z(this.a.i));
        b.d("hmmTunnelEmissionLikelihood", Z(this.a.j));
        b.f("bearingNoiseThresholdCentimetersPerSec", this.a.k);
        b.f("bearingNoiseSpeedFalloffMs", this.a.l);
        b.f("gpsTimeoutMs", d());
        b.f("gpsMinUpdateIntervalMs", this.a.n);
        b.f("gpsMinSatellitesForAccurateGps", e());
        b.f("gpsAccuracyThresholdMeters", f());
        b.e("gpsAccuracyScaleFactor", h());
        b.e("gpsDefaultAccuracyIfMissing", g());
        b.f("navFirstTripUpdateIntervalSeconds", i());
        b.f("navTripUpdateIntervalSeconds", j());
        b.f("maxNavTripUpdateIntervalSeconds", k());
        b.f("navTrafficValidityPeriodSeconds", l());
        b.f("navTrafficStatusDistanceKm", this.a.t);
        b.d("navOnRouteConfidenceThreshold", m());
        b.f("prefetcherMaxKm", n());
        b.f("prefetcherMaxTilesPerRequest", o());
        b.f("prefetcherCacheProcessingDelayMs", p());
        b.f("prefetcherFetchProcessingDelayMs", q());
        b.f("vectorMinIconHeightForScalingPx", this.a.z);
        b.h("controllerUseAnimation", r());
        b.f("voiceRmiEnablePercent", this.a.C);
        b.f("offlineReroutingEnablePercent", this.a.D);
        b.h("disablePowerManager", this.a.F);
        b.f("polylineSnappingRerouteBaseMeters", this.a.G);
        b.h("rasterMaps", this.a.H);
        b.h("disableIndoorMaps", u());
        b.h("disableImplicitDirectionSearch", v());
        b.f("betterTripPromptTimeoutSeconds", w());
        b.f("estimatedBatteryLifeSeconds", this.a.N);
        b.f("predictedBatteryDrainPercentToTriggerPowerSavings", this.a.O);
        b.f("maxUseTrafficInSavedDirectionsSeconds", x());
        b.b("cameraParameters", aa());
        b.h("forceUnmute", z());
        b.h("phoneInertialSensorsForNavEnabled", C());
        b.h("enableTrafficRadar", this.a.aR);
        b.b("trafficRadarCameraVariant", N());
        b.h("useGoAsStartNavigationButtonLabel", this.a.aX);
        b.h("enableGreyOutSelectedRoute", Q());
        b.h("enableNavToAddAStop", R());
        b.h("enableCompassInNavigation", L());
        dved b2 = dved.b(this.a.bg);
        if (b2 == null) {
            b2 = dved.UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM;
        }
        b.b("getNavigationSdkLogMechanism", b2);
        return b.toString();
    }

    public final boolean u() {
        return this.a.I;
    }

    public final boolean v() {
        return this.a.J;
    }

    public final int w() {
        return this.a.M;
    }

    public final int x() {
        return this.a.Q;
    }

    public final dvdf y(dvdm dvdmVar, boolean z, boolean z2, dvdo dvdoVar) {
        btwc btwcVar = new btwc(dvdmVar, z, z2, dvdoVar);
        dvdf dvdfVar = this.b.a().get(btwcVar);
        if (dvdfVar == null) {
            dvdf dvdfVar2 = this.c.a().get(btwcVar);
            dbsk.s(dvdfVar2);
            return dvdfVar2;
        }
        return dvdfVar;
    }

    public final boolean z() {
        return this.a.S;
    }
}
