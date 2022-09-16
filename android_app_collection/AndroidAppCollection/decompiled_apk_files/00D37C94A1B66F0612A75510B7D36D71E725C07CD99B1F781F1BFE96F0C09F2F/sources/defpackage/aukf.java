package defpackage;
/* compiled from: PG */
/* renamed from: aukf  reason: default package */
/* loaded from: classes2.dex */
public enum aukf implements aopm {
    REACHABILITY_DETECTION_EVENT_TYPE_UNKNOWN(0),
    REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST(1),
    REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST(2),
    REACHABILITY_DETECTION_EVENT_TYPE_REFRESH(3);
    
    public final int e;

    aukf(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auii.j;
    }

    public static aukf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST;
            }
            if (i == 2) {
                return REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST;
            }
            if (i == 3) {
                return REACHABILITY_DETECTION_EVENT_TYPE_REFRESH;
            }
            return null;
        }
        return REACHABILITY_DETECTION_EVENT_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
