package defpackage;
/* compiled from: PG */
/* renamed from: avbg  reason: default package */
/* loaded from: classes2.dex */
public enum avbg implements aopm {
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN(0),
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED(1),
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED(2);
    
    private final int e;

    avbg(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auwh.t;
    }

    public static avbg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED;
            }
            if (i == 2) {
                return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED;
            }
            return null;
        }
        return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN;
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
