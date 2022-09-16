package defpackage;
/* compiled from: PG */
/* renamed from: atpa  reason: default package */
/* loaded from: classes2.dex */
public enum atpa implements aopm {
    NOTIFICATION_OS_SETTING_STATE_UNKNOWN(0),
    NOTIFICATION_OS_SETTING_STATE_ENABLED(1),
    NOTIFICATION_OS_SETTING_STATE_DISABLED(2),
    NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED(3);
    
    public final int e;

    atpa(int i) {
        this.e = i;
    }

    public static aopo a() {
        return atov.c;
    }

    public static atpa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NOTIFICATION_OS_SETTING_STATE_ENABLED;
            }
            if (i == 2) {
                return NOTIFICATION_OS_SETTING_STATE_DISABLED;
            }
            if (i == 3) {
                return NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED;
            }
            return null;
        }
        return NOTIFICATION_OS_SETTING_STATE_UNKNOWN;
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
