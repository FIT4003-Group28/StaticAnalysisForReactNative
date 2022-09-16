package defpackage;
/* compiled from: PG */
/* renamed from: apnb  reason: default package */
/* loaded from: classes.dex */
public enum apnb implements aopm {
    BEDTIME_REMINDER_EVENT_TYPE_UNKNOWN(0),
    BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION(1),
    BEDTIME_REMINDER_EVENT_TYPE_DISMISS(2),
    BEDTIME_REMINDER_EVENT_TYPE_SNOOZE(3);
    
    public final int e;

    apnb(int i) {
        this.e = i;
    }

    public static aopo a() {
        return apiv.n;
    }

    public static apnb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION;
            }
            if (i == 2) {
                return BEDTIME_REMINDER_EVENT_TYPE_DISMISS;
            }
            if (i == 3) {
                return BEDTIME_REMINDER_EVENT_TYPE_SNOOZE;
            }
            return null;
        }
        return BEDTIME_REMINDER_EVENT_TYPE_UNKNOWN;
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
