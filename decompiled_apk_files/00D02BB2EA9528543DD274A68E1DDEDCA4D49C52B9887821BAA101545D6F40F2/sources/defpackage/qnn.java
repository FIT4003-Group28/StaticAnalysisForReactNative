package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qnn  reason: default package */
/* loaded from: classes7.dex */
public enum qnn {
    NETWORK_ERROR(true, iup.f(R.raw.commute_no_departures_error, qno.a, qno.a), R.string.DATA_REQUEST_ERROR_TITLE, -1, dtyc.ch, dtyc.ci, R.string.COMMUTE_NO_ROUTE_ACTION, cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x()), cjtd.a(dtyc.cl)),
    NO_DEPARTURES(false, iup.f(R.raw.commute_no_upcoming_departures_error, qno.a, qno.a), R.string.DEPARTURE_LIST_NO_UPCOMING_DEPARTURES, -1, dtyc.cj, null, R.string.COMMUTE_NO_ROUTE_ACTION, cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x()), cjtd.a(dtyc.cl)),
    NO_ROUTES(false, iup.f(R.raw.commute_no_routes_error, qno.a, qno.a), R.string.COMMUTE_NO_ROUTE_TITLE, R.string.COMMUTE_NO_ROUTE_SUBTITLE, dtyc.ck, null, R.string.COMMUTE_NO_ROUTE_SETTINGS_ACTION, cqrt.g(2131232419, ibm.x()), cjtd.a(dtyc.cm)),
    NO_ROUTES_AND_CLOSE_TO_DESTINATION(false, iup.f(R.raw.commute_no_departures_and_close_to_destination_error, qno.a, qno.a), R.string.COMMUTE_CLOSE_TO_DESTINATION_NO_ROUTE_TITLE, R.string.COMMUTE_CLOSE_TO_DESTINATION_NO_ROUTE_SUBTITLE, dtyc.ck, null, R.string.COMMUTE_NO_ROUTE_ACTION, cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x()), cjtd.a(dtyc.cl)),
    LOCATION_NOT_AVAILABLE(true, iup.f(R.raw.commute_no_departures_error, qno.a, qno.a), R.string.ERROR_LOCATION_NOT_AVAILABLE_TITLE, -1, dtyc.ce, dtyc.cf, R.string.COMMUTE_NO_ROUTE_ACTION, cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x()), cjtd.a(dtyc.cl));
    
    public final boolean f;
    @dzsi
    public final cqtd g;
    public final int h;
    public final int i;
    public final ddho j;
    @dzsi
    public final ddho k;
    public final int l;
    @dzsi
    public final cqtd m;
    public final cjtd n;

    qnn(boolean z, @dzsi cqtd cqtdVar, int i, int i2, ddho ddhoVar, @dzsi ddho ddhoVar2, int i3, @dzsi cqtd cqtdVar2, cjtd cjtdVar) {
        this.f = z;
        this.g = cqtdVar;
        this.h = i;
        this.i = i2;
        this.j = ddhoVar;
        this.k = ddhoVar2;
        this.l = i3;
        this.m = cqtdVar2;
        this.n = cjtdVar;
    }
}
