package defpackage;
/* compiled from: PG */
/* renamed from: aojh  reason: default package */
/* loaded from: classes.dex */
public enum aojh implements aopm {
    UNKNOWN(0),
    DELIVERED_FCM_PUSH(1),
    SCHEDULED_RECEIVER(2),
    FETCHED_LATEST_THREADS(3),
    FETCHED_UPDATED_THREADS(4),
    LOCAL_NOTIFICATION_CREATED(5),
    LOCAL_NOTIFICATION_UPDATED(6);
    
    public final int h;

    aojh(int i2) {
        this.h = i2;
    }

    public static aojh a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return DELIVERED_FCM_PUSH;
            case 2:
                return SCHEDULED_RECEIVER;
            case 3:
                return FETCHED_LATEST_THREADS;
            case 4:
                return FETCHED_UPDATED_THREADS;
            case 5:
                return LOCAL_NOTIFICATION_CREATED;
            case 6:
                return LOCAL_NOTIFICATION_UPDATED;
            default:
                return null;
        }
    }

    public static aopo b() {
        return aoix.e;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
