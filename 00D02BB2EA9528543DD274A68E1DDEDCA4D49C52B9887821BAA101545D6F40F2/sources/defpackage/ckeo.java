package defpackage;
/* compiled from: PG */
/* renamed from: ckeo  reason: default package */
/* loaded from: classes4.dex */
public final class ckeo {
    public static final ckgu F;
    public static final ckha G;
    public static final ckha H;
    public static final ckgz I;
    public static final ckgz J;
    public static final ckha K;
    public static final ckha L;
    public static final ckgz M;
    public static final ckgz N;
    public static final ckgz O;
    public static final ckgu P;
    public static final ckgz Q;
    public static final ckgz R;
    private static final dcdn<domy, ckei> S;
    public static final ckgt a = new ckgt("CommuteSettingsNotificationsEnabledReadCount", ckgy.COMMUTE);
    public static final ckgt b = new ckgt("CommuteSettingsCacheReloadCount", ckgy.COMMUTE);
    public static final ckgz c = new ckgz("CommuteSettingsSyncEventCount", ckgy.COMMUTE);
    public static final ckgz d = new ckgz("FrequentTripOperationCount", ckgy.COMMUTE);
    public static final ckgz e = new ckgz("FrequentTripSyncOperationCount", ckgy.COMMUTE);
    public static final ckgz f = new ckgz("FrequentTripSyncUpdateCount", ckgy.COMMUTE);
    public static final ckgu g = new ckgu("CommuteSetupForceSyncs", ckgy.COMMUTE);
    public static final ckgz h = new ckgz("CommuteSetupRouteReverserWorkToHomeResult", ckgy.COMMUTE);
    public static final ckgz i = new ckgz("CommuteSetupStationPickerFetchNearbyStationsResult", ckgy.COMMUTE);
    public static final ckgz j = new ckgz("CommuteSetupStationPickerFetchStationDetailsResult", ckgy.COMMUTE);
    public static final ckgz k = new ckgz("CommuteSetupTransitRouteChoiceHomeToWorkType", ckgy.COMMUTE);
    public static final ckgz l = new ckgz("CommuteSetupTransitRouteChoiceWorkToHomeType", ckgy.COMMUTE);
    public static final ckgz m = new ckgz("CommuteSetupTransitRouteChoiceHomeToWorkTripfinderIndex", ckgy.COMMUTE);
    public static final ckgz n = new ckgz("CommuteSetupTransitRouteChoiceWorkToHomeTripfinderIndex", ckgy.COMMUTE);
    public static final ckgz o = new ckgz("CommuteFrequentTripOperations", ckgy.COMMUTE);
    public static final ckgz p = new ckgz("CommuteFrequentTripComplexSetup", ckgy.COMMUTE);
    public static final ckhg q = new ckhg("CommuteHubDrivingImmersiveLatency", ckgy.COMMUTE);
    public static final ckhg r = new ckhg("CommuteHubCyclingImmersiveLatency", ckgy.COMMUTE);
    public static final ckhg s = new ckhg("CommuteHubTwoWheelerImmersiveLatency", ckgy.COMMUTE);
    public static final ckhg t = new ckhg("CommuteHubTransitImmersiveLatency", ckgy.COMMUTE);
    public static final ckhg u = new ckhg("CommuteHubZeroStateLatency", ckgy.COMMUTE);
    public static final ckhg v = new ckhg("CommuteHubDrivingImmersiveSelectedLatency", ckgy.COMMUTE);
    public static final ckhg w = new ckhg("CommuteHubCyclingImmersiveSelectedLatency", ckgy.COMMUTE);
    public static final ckhg x = new ckhg("CommuteHubTwoWheelerImmersiveSelectedLatency", ckgy.COMMUTE);
    public static final ckhg y = new ckhg("CommuteHubTransitImmersiveSelectedLatency", ckgy.COMMUTE);
    public static final ckhg z = new ckhg("CommuteHubZeroStateSelectedLatency", ckgy.COMMUTE);
    public static final ckhg A = new ckhg("CommuteHubTransitInitialFetchDelay", ckgy.COMMUTE);
    public static final ckhg B = new ckhg("CommuteHubTransitInitialServerResponseLatency", ckgy.COMMUTE);
    public static final ckha C = new ckha("CommuteHubTransitInitialServerResponseSize", ckgy.COMMUTE, new cnkg(10000, 0, 2000000));
    public static final ckgz D = new ckgz("CommuteNotificationPayloadDepartureClickTrackingReceived", ckgy.COMMUTE);
    public static final ckgz E = new ckgz("CommuteNotificationPayloadNoDepartureClickTrackingReceived", ckgy.COMMUTE);

    static {
        new ckgu("CommuteEtaShareMalformedIntentCount", ckgy.COMMUTE);
        F = new ckgu("CommuteNotificationRepeatedTransitDisruptionSuppressed", ckgy.COMMUTE);
        G = new ckha("TransitCommuteNotificationServerToClientLatencySecs", ckgy.COMMUTE);
        H = new ckha("TransitCommuteNotificationExpiredPayloadDelaySecs", ckgy.COMMUTE);
        I = new ckgz("TransitCommuteNotificationStep", ckgy.COMMUTE);
        J = new ckgz("TransitCommuteNotificationTimeRendering", ckgy.COMMUTE);
        K = new ckha("TransitCommuteNotificationRefreshEarlySecs", ckgy.COMMUTE);
        L = new ckha("TransitCommuteNotificationRefreshLateSecs", ckgy.COMMUTE);
        new ckgz("CommuteHubZeroStateModePicker", ckgy.COMMUTE);
        M = new ckgz("CommuteSetupStationPickerSource", ckgy.COMMUTE);
        dcdg p2 = dcdn.p();
        p2.f(domy.DRIVE, ckei.DRIVE);
        p2.f(domy.TRANSIT, ckei.TRANSIT);
        p2.f(domy.WALKING, ckei.WALKING);
        p2.f(domy.BIKING, ckei.BIKING);
        p2.f(domy.TWO_WHEELER, ckei.TWO_WHEELER);
        p2.f(domy.MULTIMODAL, ckei.MULTIMODAL);
        S = dcjz.c(p2.b());
        N = new ckgz("CommuteInferredModeReceived", ckgy.COMMUTE);
        O = new ckgz("CommuteModeProvenance", ckgy.COMMUTE);
        P = new ckgu("CommuteImmersiveNonTransitRefreshCount", ckgy.COMMUTE);
        Q = new ckgz("CommuteSetupExitResultCount", ckgy.COMMUTE);
        R = new ckgz("CommuteTabTravelModeCount", ckgy.COMMUTE);
    }

    public static ckei a(domy domyVar) {
        return S.getOrDefault(domyVar, ckei.UNKNOWN);
    }
}
