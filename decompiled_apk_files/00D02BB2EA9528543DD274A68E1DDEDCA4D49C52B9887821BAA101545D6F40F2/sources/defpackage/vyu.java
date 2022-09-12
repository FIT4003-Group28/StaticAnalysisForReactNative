package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vyu  reason: default package */
/* loaded from: classes7.dex */
public final class vyu {
    public static final cqtd a;
    public static final cqtd b;
    public static final cqtd c;
    public static final cqtd d;
    public static final dcdn<dpyy, cqtd> e;
    public static final cqtd f;
    public static final cqtd g;
    public static final cqtd h;
    public static final cqtd i;
    public static final dcdn<dpyy, cqtd> j;

    static {
        cqtd a2 = iut.a(cqrt.i(iup.e(R.raw.occupancy_1), cqrt.c(R.color.occupancy_tint_color)));
        a = a2;
        cqtd a3 = iut.a(cqrt.i(iup.e(R.raw.occupancy_2), cqrt.c(R.color.occupancy_tint_color)));
        b = a3;
        cqtd a4 = iut.a(cqrt.i(iup.e(R.raw.occupancy_3), cqrt.c(R.color.occupancy_tint_color)));
        c = a4;
        cqtd a5 = iut.a(cqrt.i(iup.e(R.raw.occupancy_4), cqrt.c(R.color.occupancy_tint_color)));
        d = a5;
        dcdg p = dcdn.p();
        p.f(dpyy.EMPTY, a2);
        p.f(dpyy.MANY_SEATS_AVAILABLE, a2);
        p.f(dpyy.FEW_SEATS_AVAILABLE, a3);
        p.f(dpyy.STANDING_ROOM_ONLY, a4);
        p.f(dpyy.CRUSHED_STANDING_ROOM_ONLY, a5);
        p.f(dpyy.FULL, a5);
        p.f(dpyy.NOT_ACCEPTING_PASSENGERS, a5);
        e = p.b();
        cqtd a6 = iut.a(cqrt.i(iup.e(R.raw.daynight_occupancy_1), cqrt.c(R.color.daynight_occupancy_tint_color)));
        f = a6;
        cqtd a7 = iut.a(cqrt.i(iup.e(R.raw.daynight_occupancy_2), cqrt.c(R.color.daynight_occupancy_tint_color)));
        g = a7;
        cqtd a8 = iut.a(cqrt.i(iup.e(R.raw.daynight_occupancy_3), cqrt.c(R.color.daynight_occupancy_tint_color)));
        h = a8;
        cqtd a9 = iut.a(cqrt.i(iup.e(R.raw.daynight_occupancy_4), cqrt.c(R.color.daynight_occupancy_tint_color)));
        i = a9;
        dcdg p2 = dcdn.p();
        p2.f(dpyy.EMPTY, a6);
        p2.f(dpyy.MANY_SEATS_AVAILABLE, a6);
        p2.f(dpyy.FEW_SEATS_AVAILABLE, a7);
        p2.f(dpyy.STANDING_ROOM_ONLY, a8);
        p2.f(dpyy.CRUSHED_STANDING_ROOM_ONLY, a9);
        p2.f(dpyy.FULL, a9);
        p2.f(dpyy.NOT_ACCEPTING_PASSENGERS, a9);
        j = p2.b();
    }
}
