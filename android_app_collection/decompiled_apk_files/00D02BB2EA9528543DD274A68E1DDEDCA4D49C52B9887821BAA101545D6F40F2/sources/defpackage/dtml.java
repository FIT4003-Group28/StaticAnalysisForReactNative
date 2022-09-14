package defpackage;
/* compiled from: PG */
/* renamed from: dtml  reason: default package */
/* loaded from: classes6.dex */
public enum dtml implements dsrb {
    UNKNOWN_ACTION_TYPE(0),
    LAUNCH_LOCATION_HISTORY_SETTINGS(1),
    DISMISS_LOCATION_HISTORY_PROMO(2);
    
    private final int d;

    dtml(int i) {
        this.d = i;
    }

    public static dtml b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LAUNCH_LOCATION_HISTORY_SETTINGS;
            }
            if (i == 2) {
                return DISMISS_LOCATION_HISTORY_PROMO;
            }
            return null;
        }
        return UNKNOWN_ACTION_TYPE;
    }

    public static dsrd c() {
        return dtmk.a;
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
