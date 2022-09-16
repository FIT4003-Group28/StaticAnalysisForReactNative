package defpackage;
/* compiled from: PG */
/* renamed from: apnc  reason: default package */
/* loaded from: classes.dex */
public enum apnc implements aopm {
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_UNKNOWN(0),
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL(1),
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG(2);
    
    public final int d;

    apnc(int i) {
        this.d = i;
    }

    public static aopo a() {
        return apiv.o;
    }

    public static apnc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL;
            }
            if (i == 2) {
                return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG;
            }
            return null;
        }
        return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
