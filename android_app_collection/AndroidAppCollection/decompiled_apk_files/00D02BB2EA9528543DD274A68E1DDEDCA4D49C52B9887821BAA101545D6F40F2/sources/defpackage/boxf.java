package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: boxf  reason: default package */
/* loaded from: classes3.dex */
public enum boxf {
    DIRECTIONALITY_HINT(R.string.RAP_ROAD_DIRECTIONALITY_PLACEHOLDER, 0, drlf.UNKNOWN_TRAFFIC_ACCESS, dtya.aJ),
    TWO_WAY_A_TO_B(R.string.RAP_ROAD_DIRECTIONALITY_TWO_WAY, 2131233029, drlf.TWO_WAY, dtya.aP),
    ONE_WAY_A_TO_B(R.string.RAP_ROAD_DIRECTIONALITY_ONE_WAY, 2131233026, drlf.ONE_WAY_FORWARD, dtya.aK),
    ONE_WAY_B_TO_A(R.string.RAP_ROAD_DIRECTIONALITY_ONE_WAY, 2131233027, drlf.ONE_WAY_REVERSE, dtya.aL),
    TWO_WAY_END_POINTS_UNLABELED(R.string.RAP_ROAD_DIRECTIONALITY_TWO_WAY, 2131233028, drlf.UNKNOWN_TRAFFIC_ACCESS, dtya.aQ),
    ONE_WAY_END_POINTS_UNLABELED(R.string.RAP_ROAD_DIRECTIONALITY_ONE_WAY, 2131233025, drlf.UNKNOWN_TRAFFIC_ACCESS, dtya.aM),
    UNKNOWN(0, 0, drlf.UNKNOWN_TRAFFIC_ACCESS, dtya.aJ);
    
    public final int i;
    public final int j;
    public final drlf k;
    public final ddho l;
    public static final boxf[] h = {TWO_WAY_A_TO_B, ONE_WAY_A_TO_B, ONE_WAY_B_TO_A};

    boxf(int i, int i2, drlf drlfVar, ddho ddhoVar) {
        this.i = i;
        this.j = i2;
        this.k = drlfVar;
        this.l = ddhoVar;
    }
}
