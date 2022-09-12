package defpackage;
/* compiled from: PG */
/* renamed from: dqek  reason: default package */
/* loaded from: classes6.dex */
public enum dqek implements dsrb {
    UNKNOWN_PREDICTION_JUSTIFICATION_TYPE(0),
    EMAIL_EVENT(1),
    CALENDAR_EVENT(2),
    LOCATION_HISTORY(3),
    RECENT_HISTORY(4),
    COMMUTE_SETTINGS(5);
    
    public final int g;

    dqek(int i) {
        this.g = i;
    }

    public static dqek b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EMAIL_EVENT;
            }
            if (i == 2) {
                return CALENDAR_EVENT;
            }
            if (i == 3) {
                return LOCATION_HISTORY;
            }
            if (i == 4) {
                return RECENT_HISTORY;
            }
            if (i == 5) {
                return COMMUTE_SETTINGS;
            }
            return null;
        }
        return UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
    }

    public static dsrd c() {
        return dqej.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
