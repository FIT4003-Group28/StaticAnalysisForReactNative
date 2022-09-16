package defpackage;
/* compiled from: PG */
/* renamed from: qjj  reason: default package */
/* loaded from: classes7.dex */
public enum qjj {
    TRAFFIC_TO_PLACE(1),
    TRANSIT_TO_PLACE(2),
    TRANSIT_TO_PLACE_DISRUPTION(3),
    TIME_TO_LEAVE(4);
    
    public final int e;

    qjj(int i) {
        this.e = i;
    }

    @dzsi
    public static qjj a(int i) {
        if (i != 1) {
            if (i == 2) {
                return TRANSIT_TO_PLACE;
            }
            if (i == 3) {
                return TRANSIT_TO_PLACE_DISRUPTION;
            }
            if (i == 4) {
                return TIME_TO_LEAVE;
            }
            return null;
        }
        return TRAFFIC_TO_PLACE;
    }
}
