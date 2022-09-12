package defpackage;
/* compiled from: PG */
/* renamed from: dqym  reason: default package */
/* loaded from: classes6.dex */
public enum dqym implements dsrb {
    UNKNOWN_COLLECTION_REASON(0),
    APP_FOREGROUNDED(1),
    SHARE_CREATION(2),
    SILENT_OVENFRESH_RECEIVED(3),
    JOURNEY_SHARE_COMPLETED(17),
    FIX_NOT_SHARING_FROM_THIS_DEVICE(18),
    ENABLING_PERSONAL_SAFETY_SHARE(20),
    IOS_FOREGROUND_OVENFRESH(4),
    IOS_BACKGROUND_APP_REFRESH(5),
    IOS_SIGNIFICANT_LOCATION_CHANGE(6),
    IOS_VISIT(7),
    IOS_MONITORED_REGION(8),
    REPORTING_RULE_DEVICE_ON_THE_MOVE(9),
    REPORTING_RULE_DEVICE_STILL(10),
    REPORTING_RULE_GEOFENCE_ALERT_REGION(11),
    REPORTING_RULE_OVENFRESH_RECEIVED_RECENTLY(12),
    REPORTING_RULE_SHARE_CREATED_RECENTLY(13),
    REPORTING_RULE_SHARE_WILL_FINISH_SOON(14),
    CONFIGURED_DEFAULT_BURST(15),
    APP_IN_FOREGROUND(16),
    IN_ACTIVE_NAVIGATION(19),
    FAMILY_LINK_LOCATION_REFRESH(21),
    FAMILY_LINK_PERIODIC_UPLOAD(22);
    
    public final int x;

    dqym(int i) {
        this.x = i;
    }

    public static dqym b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COLLECTION_REASON;
            case 1:
                return APP_FOREGROUNDED;
            case 2:
                return SHARE_CREATION;
            case 3:
                return SILENT_OVENFRESH_RECEIVED;
            case 4:
                return IOS_FOREGROUND_OVENFRESH;
            case 5:
                return IOS_BACKGROUND_APP_REFRESH;
            case 6:
                return IOS_SIGNIFICANT_LOCATION_CHANGE;
            case 7:
                return IOS_VISIT;
            case 8:
                return IOS_MONITORED_REGION;
            case 9:
                return REPORTING_RULE_DEVICE_ON_THE_MOVE;
            case 10:
                return REPORTING_RULE_DEVICE_STILL;
            case 11:
                return REPORTING_RULE_GEOFENCE_ALERT_REGION;
            case 12:
                return REPORTING_RULE_OVENFRESH_RECEIVED_RECENTLY;
            case 13:
                return REPORTING_RULE_SHARE_CREATED_RECENTLY;
            case 14:
                return REPORTING_RULE_SHARE_WILL_FINISH_SOON;
            case 15:
                return CONFIGURED_DEFAULT_BURST;
            case 16:
                return APP_IN_FOREGROUND;
            case 17:
                return JOURNEY_SHARE_COMPLETED;
            case 18:
                return FIX_NOT_SHARING_FROM_THIS_DEVICE;
            case 19:
                return IN_ACTIVE_NAVIGATION;
            case 20:
                return ENABLING_PERSONAL_SAFETY_SHARE;
            case 21:
                return FAMILY_LINK_LOCATION_REFRESH;
            case 22:
                return FAMILY_LINK_PERIODIC_UPLOAD;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqyl.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
