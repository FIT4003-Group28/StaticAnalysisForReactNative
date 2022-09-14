package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ateb  reason: default package */
/* loaded from: classes2.dex */
public enum ateb {
    STRAIGHT(R.raw.da_lane_straight, R.raw.lane_straight, 0.5f, 0.5f),
    STRAIGHT_TALL(R.raw.da_lane_straight_tall, R.raw.lane_straight_tall, 0.5f, 0.5f),
    SLIGHT(R.raw.da_lane_slight, R.raw.lane_slight, 0.19398242f, 0.25f),
    SLIGHT_TALL(R.raw.da_lane_slight_tall, R.raw.lane_slight_tall, 0.19398242f, 0.25f),
    NORMAL(R.raw.da_lane_normal, R.raw.lane_normal, 0.13906863f, 0.25f),
    NORMAL_SHORT(R.raw.da_lane_normal_short, R.raw.lane_normal_short, 0.16216215f, 0.25f),
    SHARP(R.raw.da_lane_sharp, R.raw.lane_sharp, 0.17234106f, 0.25f),
    SHARP_SHORT(R.raw.da_lane_sharp_short, R.raw.lane_sharp_short, 0.18305323f, 0.375f),
    UTURN(R.raw.da_lane_uturn, R.raw.lane_uturn, 0.13980909f, 0.25f),
    UTURN_SHORT(R.raw.da_lane_uturn_short, R.raw.lane_uturn_short, 0.1729085f, 0.375f),
    STUB(R.raw.da_lane_stub, R.raw.lane_stub, 0.5f, 0.5f),
    DOTS(R.raw.da_lane_dots, R.raw.lane_dots, 0.5f, 0.5f);
    
    public final int m;
    public final int n;
    public final float o;
    public final float p;

    ateb(int i, int i2, float f, float f2) {
        this.m = i;
        this.n = i2;
        this.o = f;
        this.p = f2;
    }
}
