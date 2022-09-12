package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ardx  reason: default package */
/* loaded from: classes.dex */
public enum ardx {
    DEFAULT_CONE(R.drawable.blue_arrow, R.drawable.blue_cone_60, R.drawable.blue_cone_90, R.drawable.blue_cone_120, R.drawable.blue_cone_150, R.drawable.blue_cone_150, R.drawable.blue_arrow, R.drawable.blue_cone_60_satellite, R.drawable.blue_cone_90_satellite, R.drawable.blue_cone_120_satellite, R.drawable.blue_cone_150_satellite, R.drawable.blue_cone_150_satellite),
    TRAVEL_MODE_CONE(R.drawable.travel_mode_blue_arrow, R.drawable.travel_mode_blue_cone_60, R.drawable.travel_mode_blue_cone_90, R.drawable.travel_mode_blue_cone_120, R.drawable.travel_mode_blue_cone_150, R.drawable.travel_mode_blue_cone_150, R.drawable.travel_mode_blue_arrow, R.drawable.travel_mode_blue_cone_60_satellite, R.drawable.travel_mode_blue_cone_90_satellite, R.drawable.travel_mode_blue_cone_120_satellite, R.drawable.travel_mode_blue_cone_150_satellite, R.drawable.travel_mode_blue_cone_150_satellite),
    INCOGNITO_CONE(R.drawable.incognito_arrow, R.drawable.incognito_cone_60, R.drawable.incognito_cone_90, R.drawable.incognito_cone_120, R.drawable.incognito_cone_150, R.drawable.incognito_cone_150, R.drawable.incognito_arrow, R.drawable.incognito_cone_60_satellite, R.drawable.incognito_cone_90_satellite, R.drawable.incognito_cone_120_satellite, R.drawable.incognito_cone_150_satellite, R.drawable.incognito_cone_150_satellite);
    
    public final dcdn<Integer, Integer> d;
    public final dcdn<Integer, Integer> e;

    ardx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        dcdg p = dcdn.p();
        p.f(4, Integer.valueOf(i));
        p.f(3, Integer.valueOf(i2));
        p.f(2, Integer.valueOf(i3));
        p.f(1, Integer.valueOf(i4));
        p.f(0, Integer.valueOf(i5));
        p.f(-1, Integer.valueOf(i6));
        this.d = p.b();
        dcdg p2 = dcdn.p();
        p2.f(4, Integer.valueOf(i7));
        p2.f(3, Integer.valueOf(i8));
        p2.f(2, Integer.valueOf(i9));
        p2.f(1, Integer.valueOf(i10));
        p2.f(0, Integer.valueOf(i11));
        p2.f(-1, Integer.valueOf(i12));
        this.e = p2.b();
    }
}
