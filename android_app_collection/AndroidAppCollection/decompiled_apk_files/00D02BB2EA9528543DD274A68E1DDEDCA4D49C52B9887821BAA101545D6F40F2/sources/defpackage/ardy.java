package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ardy  reason: default package */
/* loaded from: classes.dex */
public enum ardy {
    DEFAULT_BLUE_DOT(ardz.MAP, R.drawable.new_blue_dot, "MyLocation blue dot", dtxv.dZ, R.drawable.new_gray_dot, "MyLocation stale grey dot", dtxv.ef, ardx.DEFAULT_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    DEFAULT_WHITE_DOT(ardz.MAP, R.drawable.white_dot, "MyLocation white dot", dtxv.dZ, R.drawable.new_gray_dot, "MyLocation stale grey dot", dtxv.ef, ardx.DEFAULT_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    TWO_WHEELER_DOT(ardz.DIRECTIONS_TWO_WHEELER, R.drawable.two_wheeler_blue_dot, "Two wheeler MyLocation blue dot", dtxv.en, R.drawable.two_wheeler_grey_dot, "Two wheeler MyLocation stale grey dot", dtxv.eo, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    DRIVING_DOT(ardz.DIRECTIONS_DRIVE, R.drawable.drive_blue_dot, "Driving MyLocation blue dot", dtxv.ed, R.drawable.drive_grey_dot, "Driving MyLocation stale grey dot", dtxv.ee, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    WALKING_DOT(ardz.DIRECTIONS_WALK, R.drawable.walking_blue_dot, "Walking MyLocation blue dot", dtxv.ep, R.drawable.walking_grey_dot, "Walking MyLocation stale grey dot", dtxv.eq, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    TAXI_DOT(ardz.DIRECTIONS_TAXI, R.drawable.taxi_blue_dot, "Taxi MyLocation blue dot", dtxv.ek, R.drawable.taxi_grey_dot, "Taxi MyLocation stale grey dot", dtxv.el, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    BIKING_DOT(ardz.DIRECTIONS_BICYCLE, R.drawable.biking_blue_dot, "Biking MyLocation blue dot", dtxv.dX, R.drawable.biking_grey_dot, "Biking MyLocation stale grey dot", dtxv.dY, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    OFF_ROUTE_DRIVING_DOT(ardz.SAFETY_OFF_ROUTE_DRIVE, R.drawable.drive_red_dot, "Off route driving MyLocation red dot", dtxv.ei, R.drawable.drive_grey_dot, "Off route driving MyLocation stale grey dot", dtxv.ee, ardx.TRAVEL_MODE_CONE, R.drawable.new_blue_dot_glow, R.color.new_location_accuracy_fill, R.color.new_location_accuracy_line),
    INCOGNITO(ardz.INCOGNITO, R.drawable.incognito_dot, "MyLocation incognito mode dot", dtxv.eg, R.drawable.incognito_dot, "MyLocation stale grey dot", dtxv.eh, ardx.INCOGNITO_CONE, R.drawable.incognito_dot_glow, R.color.incognito_location_accuracy_fill, R.color.incognito_location_accuracy_line);
    
    public final ardz j;
    public final int k;
    public final String l;
    public final ddho m;
    public final int n;
    public final String o;
    public final ddho p;
    public final ardx q;
    public final int r;
    public final int s;
    public final int t;

    ardy(ardz ardzVar, int i, String str, ddho ddhoVar, int i2, String str2, ddho ddhoVar2, ardx ardxVar, int i3, int i4, int i5) {
        this.j = ardzVar;
        this.k = i;
        this.l = str;
        this.m = ddhoVar;
        this.n = i2;
        this.o = str2;
        this.p = ddhoVar2;
        this.q = ardxVar;
        this.r = i3;
        this.s = i4;
        this.t = i5;
    }
}
