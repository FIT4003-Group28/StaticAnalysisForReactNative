package defpackage;
/* compiled from: PG */
/* renamed from: ckkt  reason: default package */
/* loaded from: classes4.dex */
public final class ckkt {
    public static final ckhg a;
    public static final ckhg b;
    public static final ckhg c;
    public static final ckhg d;
    private static final ckha e;
    private static final ckha f;
    private static final ckha g;
    private static final ckha h;
    private static final ckha i;
    private static final ckha j;
    private static final ckha k;
    private static final ckha l;

    static {
        new ckgz("VmsOffroadTileRequestStatus", ckgy.VMS);
        new ckgz("VmsTileBakeStatus", ckgy.VMS);
        new ckha("VmsGnssToPublishingLocationLatency", ckgy.VMS);
        new ckgz("VmsLocationPacketSegmentSnappingStatus", ckgy.VMS);
        new ckgu("VmsDistanceBetweenConsecutiveLocationUpdatesCounter", ckgy.VMS);
        new ckhf("VmsSnaptileIdFetchLatency", ckgy.VMS);
        new ckhf("VmsHalfBakedTileFetchLatency", ckgy.VMS);
        new ckhf("VmsFullyBakingTileRegionLatency", ckgy.VMS);
        new ckgu("VmsTilesProcessedPerBasemapRequest", ckgy.VMS);
        new ckgz("VmsLocationPublisherDataVersionExtractionFailure", ckgy.VMS);
        new ckgz("VmsIdGeneratorError", ckgy.VMS);
        new ckgz("VmsLocationPublisherEventsWhenCoreNotReady", ckgy.VMS);
        new ckgz("VmsLocalFramePublisherEventsWhenCoreNotReady", ckgy.VMS);
        new ckgz("VmsBasemapPublisherEventsWhenCoreNotReady", ckgy.VMS);
        a = new ckhg("VmsLocationUpdateToBasemapPacketLatency", ckgy.VMS);
        b = new ckhg("VmsLocationUpdateToLocationPacketLatency", ckgy.VMS);
        c = new ckhg("VmsLocationUpdateToLocalFramePacketLatency", ckgy.VMS);
        d = new ckhg("VmsLocationUpdateToPrtPacketLatency", ckgy.VMS);
        new ckgz("VmsTransactionTooLargeDroppedPacketType", ckgy.VMS);
        new ckgz("VmsCoreActionWhenServicesNotReady", ckgy.VMS);
        new ckgz("VmsTileTypeInSnappedLocationUpdates", ckgy.VMS);
        ckha ckhaVar = new ckha("VmsLocalFramePacketSize", ckgy.VMS);
        e = ckhaVar;
        ckha ckhaVar2 = new ckha("VmsVehicleLocationPacketSize", ckgy.VMS);
        f = ckhaVar2;
        ckha ckhaVar3 = new ckha("VmsSegmentGeometryPacketSize", ckgy.VMS);
        g = ckhaVar3;
        ckha ckhaVar4 = new ckha("VmsSegmentAttributePacketSize", ckgy.VMS);
        h = ckhaVar4;
        ckha ckhaVar5 = new ckha("VmsSegmentConnectivityPacketSize", ckgy.VMS);
        i = ckhaVar5;
        ckha ckhaVar6 = new ckha("VmsPredictedRouteTreePacketSize", ckgy.VMS);
        j = ckhaVar6;
        ckha ckhaVar7 = new ckha("VmsLinearFeatureSpeedPacketSize", ckgy.VMS);
        k = ckhaVar7;
        ckha ckhaVar8 = new ckha("VmsNavigationPacketSize", ckgy.VMS);
        l = ckhaVar8;
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dgpz.LOCAL_FRAME_TYPE, ckhaVar);
        dcdgVar.f(dgpz.VEHICLE_LOCATION_TYPE, ckhaVar2);
        dcdgVar.f(dgpz.PREDICTED_ROUTE_TREE_TYPE, ckhaVar6);
        dcdgVar.f(dgpz.SEGMENT_GEOMETRY_TYPE, ckhaVar3);
        dcdgVar.f(dgpz.SEGMENT_ATTRIBUTE_TYPE, ckhaVar4);
        dcdgVar.f(dgpz.SEGMENT_CONNECTIVITY_TYPE, ckhaVar5);
        dcdgVar.f(dgpz.LINEAR_FEATURE_SPEED_TYPE, ckhaVar7);
        dcdgVar.f(dgpz.NAVIGATION_TYPE, ckhaVar8);
        dcdgVar.b();
        new ckgz("VmsDroppedLayerOfferingType", ckgy.VMS);
        new ckgz("VmsSensorDataListenerDetectionProcessingStatus", ckgy.VMS);
        new ckha("VmsDetectionToPublishingSensorObservationLatencyMillis", ckgy.VMS);
        new ckhg("VmsSignPacketArrivalToSensorObservationPublishingLatency", ckgy.VMS);
        new ckgu("VmsSignDetectionPacketCounter", ckgy.VMS);
        new ckhg("VmsLongHorizonEventRouteChangedLatency", ckgy.VMS);
        new ckhg("VmsLongHorizonEventNavigationSessionStateLatency", ckgy.VMS);
        new ckhg("VmsLongHorizonEventTrafficUpdatedLatency", ckgy.VMS);
    }
}
