package defpackage;
/* compiled from: PG */
/* renamed from: aosz  reason: default package */
/* loaded from: classes.dex */
public enum aosz implements aopm {
    CB_NONE(0),
    CB_RESERVED_FOR_TESTING_IN_PRODUCT_CONTROL(12),
    CB_GOOGLE_TOS_AND_PP(1),
    CB_CHECKBOX(2),
    CB_SUPPLEMENTAL_WEB_AND_APP_ACTIVITY_DEVICE_LEVEL(3),
    CB_PLAY_TOS(4),
    CB_GLOBAL_LOCATION(5),
    CB_LOCATION_REPORTING_DEVICE_LEVEL(7),
    CB_LOCATION_ACCURACY(8),
    CB_EARTHQUAKE_ALERTS(18),
    CB_WIFI_SCANNING(9),
    CB_GLOBAL_WIFI(10),
    CB_BACKUP_AND_RESTORE(11),
    CB_BACKUP_TO_GOOGLE(25),
    CB_WEAR_CLOUD_SYNC(13),
    CB_FIT_APP_USAGE_AND_DIAGNOSTICS(14),
    CB_GBOARD_USER_METRICS_SETTINGS(15),
    CB_DEVICE_CONTACTS_INFO(16),
    CB_FI_TOS(17),
    CB_FI_NETWORK_DIAGNOSTICS(19),
    CB_FIND_MY_DEVICE(20),
    CB_PAY_TOS(21),
    CB_WEB_AND_APP_ACTIVITY(22),
    CB_GLOBAL_BLUETOOTH(23),
    CB_BLUETOOTH_SCANNING(24),
    CB_UNICORN_SUPERVISION(26);
    
    public final int A;

    aosz(int i) {
        this.A = i;
    }

    public static aopo a() {
        return aoli.r;
    }

    public static aosz b(int i) {
        switch (i) {
            case 0:
                return CB_NONE;
            case 1:
                return CB_GOOGLE_TOS_AND_PP;
            case 2:
                return CB_CHECKBOX;
            case 3:
                return CB_SUPPLEMENTAL_WEB_AND_APP_ACTIVITY_DEVICE_LEVEL;
            case 4:
                return CB_PLAY_TOS;
            case 5:
                return CB_GLOBAL_LOCATION;
            case 6:
            default:
                return null;
            case 7:
                return CB_LOCATION_REPORTING_DEVICE_LEVEL;
            case 8:
                return CB_LOCATION_ACCURACY;
            case 9:
                return CB_WIFI_SCANNING;
            case 10:
                return CB_GLOBAL_WIFI;
            case 11:
                return CB_BACKUP_AND_RESTORE;
            case 12:
                return CB_RESERVED_FOR_TESTING_IN_PRODUCT_CONTROL;
            case 13:
                return CB_WEAR_CLOUD_SYNC;
            case 14:
                return CB_FIT_APP_USAGE_AND_DIAGNOSTICS;
            case 15:
                return CB_GBOARD_USER_METRICS_SETTINGS;
            case 16:
                return CB_DEVICE_CONTACTS_INFO;
            case 17:
                return CB_FI_TOS;
            case 18:
                return CB_EARTHQUAKE_ALERTS;
            case 19:
                return CB_FI_NETWORK_DIAGNOSTICS;
            case 20:
                return CB_FIND_MY_DEVICE;
            case 21:
                return CB_PAY_TOS;
            case 22:
                return CB_WEB_AND_APP_ACTIVITY;
            case 23:
                return CB_GLOBAL_BLUETOOTH;
            case 24:
                return CB_BLUETOOTH_SCANNING;
            case 25:
                return CB_BACKUP_TO_GOOGLE;
            case 26:
                return CB_UNICORN_SUPERVISION;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
