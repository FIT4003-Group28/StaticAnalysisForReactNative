package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ckfh  reason: default package */
/* loaded from: classes.dex */
public final class ckfh {
    public static final ckha A;
    public static final ckha B;
    public static final ckha C;
    public static final ckha D;
    public static final ckha E;
    public static final ckha F;
    public static final ckha G;
    public static final ckha H;
    public static final ckha I;
    public static final ckha J;
    public static final ckha K;
    public static final ckha L;
    public static final ckha M;
    public static final ckha N;
    public static final ckha O;
    public static final ckha P;
    public static final ckha Q;
    public static final ckha R;
    public static final ckha S;
    public static final ckha T;
    public static final ckha U;
    public static final ckha V;
    public static final ckha W;
    public static final ckha X;
    public static final ckha Y;
    public static final ckha Z;
    static final dcdn<ckfd, Map<dktk, Map<ckfg, ckha>>> a;
    public static final ckha aA;
    public static final ckha aB;
    public static final ckha aC;
    public static final ckha aD;
    public static final ckha aE;
    public static final ckha aF;
    public static final ckha aG;
    public static final ckha aH;
    public static final ckgz aI;
    public static final ckgu aJ;
    public static final ckgz aK;
    public static final ckhg aL;
    public static final ckgz aM;
    public static final ckhg aN;
    public static final ckgz aO;
    public static final ckhg aP;
    public static final ckgz aQ;
    public static final ckgz aR;
    public static final ckgz aS;
    public static final ckgt aT;
    public static final ckha aa;
    public static final ckha ab;
    public static final ckha ac;
    public static final ckha ad;
    public static final ckha ae;
    public static final ckha af;
    public static final ckha ag;
    public static final ckha ah;
    public static final ckha ai;
    public static final ckha aj;
    public static final ckha ak;
    public static final ckha al;
    public static final ckha am;
    public static final ckha an;
    public static final ckha ao;
    public static final ckha ap;
    public static final ckha aq;
    public static final ckha ar;
    public static final ckha as;
    public static final ckha at;
    public static final ckha au;
    public static final ckha av;
    public static final ckha aw;
    public static final ckha ax;
    public static final ckha ay;
    public static final ckha az;
    static final dcdn<ckfd, Map<dktk, Map<ckfg, ckha>>> b;
    static final dcdn<ckfd, Map<dktk, Map<ckfg, ckgz>>> c;
    public static final ckha d;
    public static final ckha e;
    public static final ckha f;
    public static final ckhf g;
    public static final ckhf h;
    public static final ckhf i;
    public static final ckhf j;
    public static final ckgz k;
    public static final ckgz l;
    public static final ckgz m;
    public static final ckgz n;
    public static final ckha o;
    public static final ckha p;
    public static final ckha q;
    public static final ckha r;
    public static final ckha s;
    public static final ckha t;
    public static final ckha u;
    public static final ckha v;
    public static final ckha w;
    public static final ckha x;
    public static final ckha y;
    public static final ckha z;

    static {
        ckfd[] ckfdVarArr;
        int i2;
        dktk[] dktkVarArr;
        int i3;
        dcdg dcdgVar;
        dcdg dcdgVar2;
        dcdg dcdgVar3;
        int i4;
        ckfd ckfdVar;
        int i5;
        dcdg dcdgVar4;
        dcdg p2 = dcdn.p();
        dcdg p3 = dcdn.p();
        dcdg p4 = dcdn.p();
        ckfd[] values = ckfd.values();
        int length = values.length;
        int i6 = 0;
        while (i6 < length) {
            ckfd ckfdVar2 = values[i6];
            dcdg p5 = dcdn.p();
            dcdg p6 = dcdn.p();
            dcdg p7 = dcdn.p();
            dktk[] values2 = dktk.values();
            int length2 = values2.length;
            int i7 = 0;
            while (i7 < length2) {
                dktk dktkVar = values2[i7];
                if (dktkVar == dktk.UNKNOWN_ASSISTIVE_TAB_TYPE) {
                    dcdgVar = p2;
                    dcdgVar2 = p3;
                    dcdgVar3 = p4;
                    ckfdVarArr = values;
                    i2 = length;
                    i4 = i6;
                    ckfdVar = ckfdVar2;
                    dcdgVar4 = p7;
                    dktkVarArr = values2;
                    i3 = length2;
                    i5 = i7;
                } else {
                    dcdg p8 = dcdn.p();
                    dcdg p9 = dcdn.p();
                    ckfdVarArr = values;
                    dcdg p10 = dcdn.p();
                    i2 = length;
                    ckfg[] values3 = ckfg.values();
                    dktkVarArr = values2;
                    int length3 = values3.length;
                    i3 = length2;
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = length3;
                        ckfg ckfgVar = values3[i8];
                        ckfg[] ckfgVarArr = values3;
                        int i10 = i6;
                        String str = ckfdVar2.d;
                        dcdg dcdgVar5 = p4;
                        String e2 = e(dktkVar);
                        dcdg dcdgVar6 = p3;
                        String str2 = ckfgVar.e;
                        int length4 = String.valueOf(str).length();
                        dcdg dcdgVar7 = p2;
                        int length5 = length4 + 10 + e2.length();
                        StringBuilder sb = new StringBuilder(length5 + String.valueOf(str2).length());
                        sb.append("Goldfinger");
                        sb.append(str);
                        sb.append(e2);
                        sb.append(str2);
                        p8.f(ckfgVar, new ckha(sb.toString(), ckgy.GOLDFINGER_SLICED_BY_LOAD_STATUS));
                        String str3 = ckfdVar2.d;
                        String e3 = e(dktkVar);
                        String str4 = ckfgVar.d;
                        int length6 = String.valueOf(str3).length();
                        dcdg dcdgVar8 = p7;
                        StringBuilder sb2 = new StringBuilder(length6 + 10 + e3.length() + String.valueOf(str4).length());
                        sb2.append("Goldfinger");
                        sb2.append(str3);
                        sb2.append(e3);
                        sb2.append(str4);
                        p9.f(ckfgVar, new ckha(sb2.toString(), ckgy.GOLDFINGER_SLICED_BY_LOAD_STATUS));
                        String str5 = ckfdVar2.d;
                        String e4 = e(dktkVar);
                        String str6 = ckfgVar.f;
                        int length7 = String.valueOf(str5).length();
                        ckfd ckfdVar3 = ckfdVar2;
                        StringBuilder sb3 = new StringBuilder(length7 + 10 + e4.length() + String.valueOf(str6).length());
                        sb3.append("Goldfinger");
                        sb3.append(str5);
                        sb3.append(e4);
                        sb3.append(str6);
                        p10.f(ckfgVar, new ckgz(sb3.toString(), ckgy.GOLDFINGER));
                        i8++;
                        length3 = i9;
                        values3 = ckfgVarArr;
                        i6 = i10;
                        p4 = dcdgVar5;
                        p3 = dcdgVar6;
                        i7 = i7;
                        ckfdVar2 = ckfdVar3;
                        p2 = dcdgVar7;
                        p7 = dcdgVar8;
                    }
                    dcdgVar = p2;
                    dcdgVar2 = p3;
                    dcdgVar3 = p4;
                    i4 = i6;
                    ckfdVar = ckfdVar2;
                    i5 = i7;
                    p5.f(dktkVar, p8.b());
                    p6.f(dktkVar, p9.b());
                    dcdgVar4 = p7;
                    dcdgVar4.f(dktkVar, p10.b());
                }
                i7 = i5 + 1;
                p7 = dcdgVar4;
                values = ckfdVarArr;
                length = i2;
                values2 = dktkVarArr;
                length2 = i3;
                i6 = i4;
                p4 = dcdgVar3;
                p3 = dcdgVar2;
                ckfdVar2 = ckfdVar;
                p2 = dcdgVar;
            }
            dcdg dcdgVar9 = p2;
            dcdg dcdgVar10 = p3;
            dcdg dcdgVar11 = p4;
            ckfd ckfdVar4 = ckfdVar2;
            dcdgVar9.f(ckfdVar4, p5.b());
            dcdgVar10.f(ckfdVar4, p6.b());
            dcdgVar11.f(ckfdVar4, p7.b());
            i6++;
            p2 = dcdgVar9;
            values = values;
            p4 = dcdgVar11;
            p3 = dcdgVar10;
            length = length;
        }
        dcdg dcdgVar12 = p3;
        a = p2.b();
        b = dcdgVar12.b();
        c = p4.b();
        d = new ckha("GoldfingerStartupActivityCreationToCacheDesired", ckgy.GOLDFINGER);
        e = new ckha("GoldfingerStartupActivityCreationToLoadFromCache", ckgy.GOLDFINGER);
        f = new ckha("GoldfingerStartupActivityCreationToLoadingComplete", ckgy.GOLDFINGER);
        g = new ckhf("GoldfingerStartupCacheDesiredToLocationAvailable", ckgy.GOLDFINGER);
        h = new ckhf("GoldfingerStartupCacheDesiredToViewportAvailable", ckgy.GOLDFINGER);
        i = new ckhf("GoldfingerStartupCacheDesiredToFileLoaded", ckgy.GOLDFINGER);
        j = new ckhf("GoldfingerStartupCacheDesiredToCacheAccessible", ckgy.GOLDFINGER);
        k = new ckgz("GoldfingerInitialStatePlaces", ckgy.GOLDFINGER);
        new ckgz("GoldfingerInitialStateTraffic", ckgy.GOLDFINGER);
        l = new ckgz("GoldfingerInitialStateInformalTransit", ckgy.GOLDFINGER);
        new ckgz("GoldfingerInitialStateTransit", ckgy.GOLDFINGER);
        new ckgz("GoldfingerTransitCommuteCardLoadingOutcome", ckgy.GOLDFINGER);
        m = new ckgz("GoldfingerUnknownErrorCardPlaces", ckgy.GOLDFINGER);
        new ckgz("GoldfingerUnknownErrorCardTraffic", ckgy.GOLDFINGER);
        n = new ckgz("GoldfingerUnknownErrorCardInformalTransit", ckgy.GOLDFINGER);
        new ckgz("GoldfingerUnknownErrorCardTransit", ckgy.GOLDFINGER);
        o = new ckha("GoldfingerAllRequestsPlacesTabEndToEndTime", ckgy.GOLDFINGER);
        p = new ckha("GoldfingerAllRequestsPlacesTabFailedAttemptsTime", ckgy.GOLDFINGER);
        q = new ckha("GoldfingerAllRequestsPlacesTabFinalAttemptTime", ckgy.GOLDFINGER);
        r = new ckha("GoldfingerAllRequestsPlacesTabDispatchTime", ckgy.GOLDFINGER);
        s = new ckha("GoldfingerAllRequestsPlacesTabRequirementsTime", ckgy.GOLDFINGER);
        t = new ckha("GoldfingerAllRequestsPlacesTabConnectionTime", ckgy.GOLDFINGER);
        u = new ckha("GoldfingerAllRequestsPlacesTabReadFromWireTime", ckgy.GOLDFINGER);
        v = new ckha("GoldfingerAllRequestsPlacesTabTransmissionTime", ckgy.GOLDFINGER);
        w = new ckha("GoldfingerAllRequestsPlacesTabServerFulfillmentTime", ckgy.GOLDFINGER);
        x = new ckha("GoldfingerStartupRequestPlacesTabEndToEndTime", ckgy.GOLDFINGER);
        y = new ckha("GoldfingerStartupRequestPlacesTabFailedAttemptsTime", ckgy.GOLDFINGER);
        z = new ckha("GoldfingerStartupRequestPlacesTabFinalAttemptTime", ckgy.GOLDFINGER);
        A = new ckha("GoldfingerStartupRequestPlacesTabDispatchTime", ckgy.GOLDFINGER);
        B = new ckha("GoldfingerStartupRequestPlacesTabRequirementsTime", ckgy.GOLDFINGER);
        C = new ckha("GoldfingerStartupRequestPlacesTabConnectionTime", ckgy.GOLDFINGER);
        D = new ckha("GoldfingerStartupRequestPlacesTabReadFromWireTime", ckgy.GOLDFINGER);
        E = new ckha("GoldfingerStartupRequestPlacesTabTransmissionTime", ckgy.GOLDFINGER);
        F = new ckha("GoldfingerStartupRequestPlacesTabServerFulfillmentTime", ckgy.GOLDFINGER);
        new ckgu("GoldfingerStartupRequestPlacesTabPromotedCount", ckgy.GOLDFINGER);
        G = new ckha("GoldfingerAllRequestsTrafficTabEndToEndTime", ckgy.GOLDFINGER);
        H = new ckha("GoldfingerAllRequestsTrafficTabFailedAttemptsTime", ckgy.GOLDFINGER);
        I = new ckha("GoldfingerAllRequestsTrafficTabFinalAttemptTime", ckgy.GOLDFINGER);
        J = new ckha("GoldfingerAllRequestsTrafficTabDispatchTime", ckgy.GOLDFINGER);
        K = new ckha("GoldfingerAllRequestsTrafficTabRequirementsTime", ckgy.GOLDFINGER);
        L = new ckha("GoldfingerAllRequestsTrafficTabConnectionTime", ckgy.GOLDFINGER);
        M = new ckha("GoldfingerAllRequestsTrafficTabReadFromWireTime", ckgy.GOLDFINGER);
        N = new ckha("GoldfingerAllRequestsTrafficTabTransmissionTime", ckgy.GOLDFINGER);
        O = new ckha("GoldfingerAllRequestsTrafficTabServerFulfillmentTime", ckgy.GOLDFINGER);
        P = new ckha("GoldfingerStartupRequestTrafficTabEndToEndTime", ckgy.GOLDFINGER);
        Q = new ckha("GoldfingerStartupRequestTrafficTabFailedAttemptsTime", ckgy.GOLDFINGER);
        R = new ckha("GoldfingerStartupRequestTrafficTabFinalAttemptTime", ckgy.GOLDFINGER);
        S = new ckha("GoldfingerStartupRequestTrafficTabDispatchTime", ckgy.GOLDFINGER);
        T = new ckha("GoldfingerStartupRequestTrafficTabRequirementsTime", ckgy.GOLDFINGER);
        U = new ckha("GoldfingerStartupRequestTrafficTabConnectionTime", ckgy.GOLDFINGER);
        V = new ckha("GoldfingerStartupRequestTrafficTabReadFromWireTime", ckgy.GOLDFINGER);
        W = new ckha("GoldfingerStartupRequestTrafficTabTransmissionTime", ckgy.GOLDFINGER);
        X = new ckha("GoldfingerStartupRequestTrafficTabServerFulfillmentTime", ckgy.GOLDFINGER);
        Y = new ckha("GoldfingerAllRequestsTransitTabEndToEndTime", ckgy.GOLDFINGER);
        Z = new ckha("GoldfingerAllRequestsTransitTabFailedAttemptsTime", ckgy.GOLDFINGER);
        aa = new ckha("GoldfingerAllRequestsTransitTabFinalAttemptTime", ckgy.GOLDFINGER);
        ab = new ckha("GoldfingerAllRequestsTransitTabDispatchTime", ckgy.GOLDFINGER);
        ac = new ckha("GoldfingerAllRequestsTransitTabRequirementsTime", ckgy.GOLDFINGER);
        ad = new ckha("GoldfingerAllRequestsTransitTabConnectionTime", ckgy.GOLDFINGER);
        ae = new ckha("GoldfingerAllRequestsTransitTabReadFromWireTime", ckgy.GOLDFINGER);
        af = new ckha("GoldfingerAllRequestsTransitTabTransmissionTime", ckgy.GOLDFINGER);
        ag = new ckha("GoldfingerAllRequestsTransitTabServerFulfillmentTime", ckgy.GOLDFINGER);
        ah = new ckha("GoldfingerStartupRequestTransitTabEndToEndTime", ckgy.GOLDFINGER);
        ai = new ckha("GoldfingerStartupRequestTransitTabFailedAttemptsTime", ckgy.GOLDFINGER);
        aj = new ckha("GoldfingerStartupRequestTransitTabFinalAttemptTime", ckgy.GOLDFINGER);
        ak = new ckha("GoldfingerStartupRequestTransitTabDispatchTime", ckgy.GOLDFINGER);
        al = new ckha("GoldfingerStartupRequestTransitTabRequirementsTime", ckgy.GOLDFINGER);
        am = new ckha("GoldfingerStartupRequestTransitTabConnectionTime", ckgy.GOLDFINGER);
        an = new ckha("GoldfingerStartupRequestTransitTabReadFromWireTime", ckgy.GOLDFINGER);
        ao = new ckha("GoldfingerStartupRequestTransitTabTransmissionTime", ckgy.GOLDFINGER);
        ap = new ckha("GoldfingerStartupRequestTransitTabServerFulfillmentTime", ckgy.GOLDFINGER);
        aq = new ckha("GoldfingerAllRequestsInformalTransitTabEndToEndTime", ckgy.GOLDFINGER);
        ar = new ckha("GoldfingerAllRequestsInformalTransitTabFailedAttemptsTime", ckgy.GOLDFINGER);
        as = new ckha("GoldfingerAllRequestsInformalTransitTabFinalAttemptTime", ckgy.GOLDFINGER);
        at = new ckha("GoldfingerAllRequestsInformalTransitTabDispatchTime", ckgy.GOLDFINGER);
        au = new ckha("GoldfingerAllRequestsInformalTransitTabRequirementsTime", ckgy.GOLDFINGER);
        av = new ckha("GoldfingerAllRequestsInformalTransitTabConnectionTime", ckgy.GOLDFINGER);
        aw = new ckha("GoldfingerAllRequestsInformalTransitTabReadFromWireTime", ckgy.GOLDFINGER);
        ax = new ckha("GoldfingerAllRequestsInformalTransitTabTransmissionTime", ckgy.GOLDFINGER);
        ay = new ckha("GoldfingerAllRequestsInformalTransitTabServerFulfillmentTime", ckgy.GOLDFINGER);
        az = new ckha("GoldfingerStartupRequestInformalTransitTabEndToEndTime", ckgy.GOLDFINGER);
        aA = new ckha("GoldfingerStartupRequestInformalTransitTabFailedAttemptsTime", ckgy.GOLDFINGER);
        aB = new ckha("GoldfingerStartupRequestInformalTransitTabFinalAttemptTime", ckgy.GOLDFINGER);
        aC = new ckha("GoldfingerStartupRequestInformalTransitTabDispatchTime", ckgy.GOLDFINGER);
        aD = new ckha("GoldfingerStartupRequestInformalTransitTabRequirementsTime", ckgy.GOLDFINGER);
        aE = new ckha("GoldfingerStartupRequestInformalTransitTabConnectionTime", ckgy.GOLDFINGER);
        aF = new ckha("GoldfingerStartupRequestInformalTransitTabReadFromWireTime", ckgy.GOLDFINGER);
        aG = new ckha("GoldfingerStartupRequestInformalTransitTabTransmissionTime", ckgy.GOLDFINGER);
        aH = new ckha("GoldfingerStartupRequestInformalTransitTabServerFulfillmentTime", ckgy.GOLDFINGER);
        aI = new ckgz("GoldfingerPlacesTabFetchAllCardsReason", ckgy.GOLDFINGER);
        aJ = new ckgu("GoldfingerExploreTabExpandAfterPanCount", ckgy.GOLDFINGER);
        aK = new ckgz("HomeScreenPrefetchExploreBelowFold", ckgy.HOME_SCREEN_PREFETCH);
        aL = new ckhg("ExploreBelowFoldPageLatency", ckgy.HOME_SCREEN_PREFETCH);
        aM = new ckgz("HomeScreenPrefetchSearchRecentHistory", ckgy.HOME_SCREEN_PREFETCH);
        aN = new ckhg("SearchZeroSuggestPageLatency", ckgy.HOME_SCREEN_PREFETCH);
        aO = new ckgz("HomeScreenPrefetchSearchZeroSuggestAds", ckgy.HOME_SCREEN_PREFETCH);
        aP = new ckhg("SearchZeroSuggestAdsLoadLatency", ckgy.HOME_SCREEN_PREFETCH);
        aQ = new ckgz("GoldfingerHomeTabStripTabCount", ckgy.GOLDFINGER);
        aR = new ckgz("HomeScreenBottomSheetCollapsed", ckgy.GOLDFINGER);
        aS = new ckgz("HomeScreenBottomSheetExpanded", ckgy.GOLDFINGER);
        aT = new ckgt("HomeScreenGoldfingerEnabled", ckgy.GOLDFINGER);
    }

    public static ckha a(dktk dktkVar, ckfd ckfdVar, ckfg ckfgVar) {
        return (ckha) d(b, dktkVar, ckfdVar, ckfgVar);
    }

    public static ckha b(dktk dktkVar, ckfd ckfdVar, ckfg ckfgVar) {
        return (ckha) d(a, dktkVar, ckfdVar, ckfgVar);
    }

    public static ckgz c(dktk dktkVar, ckfd ckfdVar, ckfg ckfgVar) {
        return (ckgz) d(c, dktkVar, ckfdVar, ckfgVar);
    }

    private static <MetricT> MetricT d(Map<ckfd, Map<dktk, Map<ckfg, MetricT>>> map, dktk dktkVar, ckfd ckfdVar, ckfg ckfgVar) {
        Map<dktk, Map<ckfg, MetricT>> map2 = map.get(ckfdVar);
        dbuh.d(map2);
        Map<ckfg, MetricT> map3 = map2.get(dktkVar);
        dbuh.d(map3);
        MetricT metrict = map3.get(ckfgVar);
        dbuh.d(metrict);
        return metrict;
    }

    private static String e(dktk dktkVar) {
        dktk dktkVar2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
        switch (dktkVar.ordinal()) {
            case 0:
                throw new IllegalStateException("Attempted to create startup metric for unknown tab type");
            case 1:
                return "PlacesTab";
            case 2:
                return "TrafficTab";
            case 3:
                return "TransitTab";
            case 4:
                return "FeedTab";
            case 5:
                return "CommuteTab";
            case 6:
                return "InboxTab";
            case 7:
                return "InformalTransitTab";
            case 8:
                return "MappersCommunityTab";
            case 9:
                return "SavedTripsTab";
            case 10:
                return "ContributeTab";
            case 11:
                return "SavedListsTab";
            case 12:
                return "UpdatesTab";
            case 13:
                return "TransportationTab";
            default:
                throw new IllegalStateException("Attempted to create startup metric for unknown tab type");
        }
    }
}
