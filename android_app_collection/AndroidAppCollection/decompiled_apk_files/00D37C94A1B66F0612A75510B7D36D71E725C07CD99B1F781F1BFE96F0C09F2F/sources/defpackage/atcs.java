package defpackage;
/* compiled from: PG */
/* renamed from: atcs  reason: default package */
/* loaded from: classes2.dex */
public enum atcs implements aopm {
    MDX_NOTIFICATION_GEL_ACTION_UNKNOWN(0),
    MDX_NOTIFICATION_GEL_ACTION_CLICKED(1),
    MDX_NOTIFICATION_GEL_ACTION_NAVIGATED_TO_WATCH(2),
    MDX_NOTIFICATION_GEL_ACTION_USER_CANCELLED(3),
    MDX_NOTIFICATION_GEL_ACTION_CONNECTION_STARTED(4),
    MDX_NOTIFICATION_GEL_ACTION_REVOKED_TTL(5),
    MDX_NOTIFICATION_GEL_ACTION_REVOKED_DEVICE_NOT_FOUND(6),
    MDX_NOTIFICATION_GEL_ACTION_REVOKED_STARTED_CASTING(7),
    MDX_NOTIFICATION_GEL_ACTION_REVOKED_SIGNED_OUT(8);
    
    public final int j;

    atcs(int i) {
        this.j = i;
    }

    public static aopo a() {
        return atck.g;
    }

    public static atcs b(int i) {
        switch (i) {
            case 0:
                return MDX_NOTIFICATION_GEL_ACTION_UNKNOWN;
            case 1:
                return MDX_NOTIFICATION_GEL_ACTION_CLICKED;
            case 2:
                return MDX_NOTIFICATION_GEL_ACTION_NAVIGATED_TO_WATCH;
            case 3:
                return MDX_NOTIFICATION_GEL_ACTION_USER_CANCELLED;
            case 4:
                return MDX_NOTIFICATION_GEL_ACTION_CONNECTION_STARTED;
            case 5:
                return MDX_NOTIFICATION_GEL_ACTION_REVOKED_TTL;
            case 6:
                return MDX_NOTIFICATION_GEL_ACTION_REVOKED_DEVICE_NOT_FOUND;
            case 7:
                return MDX_NOTIFICATION_GEL_ACTION_REVOKED_STARTED_CASTING;
            case 8:
                return MDX_NOTIFICATION_GEL_ACTION_REVOKED_SIGNED_OUT;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
