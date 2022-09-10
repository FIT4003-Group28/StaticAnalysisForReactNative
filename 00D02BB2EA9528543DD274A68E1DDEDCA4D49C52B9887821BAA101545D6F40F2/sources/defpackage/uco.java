package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uco  reason: default package */
/* loaded from: classes7.dex */
public enum uco {
    NO_WAYPOINT_FOUND(R.string.ERROR_CANT_FIND_WAYPOINT_TITLE, Integer.valueOf((int) R.string.ERROR_CANT_FIND_WAYPOINT_DESCRIPTION), cqrt.g(2131232366, ibm.p()), false),
    NO_ROUTES_FOUND(R.string.ERROR_NO_ROUTE_AVAILABLE_TITLE, Integer.valueOf((int) R.string.ERROR_NO_ROUTE_AVAILABLE_DESCRIPTION), cqrt.g(2131232366, ibm.p()), false),
    NO_CONNECTION(R.string.ERROR_CANT_REACH_SERVERS_TITLE, Integer.valueOf((int) R.string.ERROR_CANT_REACH_SERVERS_DESCRIPTION), iup.e(R.raw.error_offline_desert), true);
    
    final int d;
    @dzsi
    final Integer e;
    final cqtd f;
    final boolean g;

    uco(int i, @dzsi Integer num, cqtd cqtdVar, boolean z) {
        this.d = i;
        this.e = num;
        this.f = cqtdVar;
        this.g = z;
    }
}
