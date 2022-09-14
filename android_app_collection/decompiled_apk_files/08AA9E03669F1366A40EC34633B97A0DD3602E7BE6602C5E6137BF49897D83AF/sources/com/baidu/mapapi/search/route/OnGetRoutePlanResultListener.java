package com.baidu.mapapi.search.route;
/* loaded from: classes.dex */
public interface OnGetRoutePlanResultListener {
    void onGetBikingRouteResult(BikingRouteResult bikingRouteResult);

    void onGetDrivingRouteResult(DrivingRouteResult drivingRouteResult);

    void onGetTransitRouteResult(TransitRouteResult transitRouteResult);

    void onGetWalkingRouteResult(WalkingRouteResult walkingRouteResult);
}
