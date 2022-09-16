package defpackage;
/* compiled from: PG */
/* renamed from: dvej  reason: default package */
/* loaded from: classes.dex */
public enum dvej implements dsrb {
    UNKNOWN_TRAFFIC_RADAR_CAMERA_VARIANT(0),
    NORTH_UP_ZOOMED_OUT(1),
    TRACK_UP_ZOOMED_OUT(2);
    
    private final int d;

    dvej(int i) {
        this.d = i;
    }

    public static dvej b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NORTH_UP_ZOOMED_OUT;
            }
            if (i == 2) {
                return TRACK_UP_ZOOMED_OUT;
            }
            return null;
        }
        return UNKNOWN_TRAFFIC_RADAR_CAMERA_VARIANT;
    }

    public static dsrd c() {
        return dvei.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
