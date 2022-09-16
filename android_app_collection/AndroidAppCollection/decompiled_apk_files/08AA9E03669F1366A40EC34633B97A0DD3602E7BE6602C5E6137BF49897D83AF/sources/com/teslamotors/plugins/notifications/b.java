package com.teslamotors.plugins.notifications;

import android.content.res.Resources;
import d.a.d.a;
/* compiled from: NotificationType.java */
/* loaded from: classes.dex */
public enum b {
    CHARGING_STARTED("ALERT_CHARGING_STARTED", a.C0122a.notification_without_range_charging_started, a.C0122a.notification_charging_started),
    CHARGING_INTERRUPTED("ALERT_CHARGING_INTERRUPTED", a.C0122a.notification_without_range_charging_interrupted, a.C0122a.notification_charging_interrupted),
    CHARGING_COMPLETE("ALERT_CHARGING_COMPLETE", a.C0122a.notification_without_range_charging_complete, a.C0122a.notification_charging_complete),
    FAST_CHARGING_TAPER("ALERT_FAST_CHARGING_TAPER", a.C0122a.notification_fast_charging_taper),
    ALARM("ALERT_ALARM", a.C0122a.notification_alarm),
    UPDATE_AVAILABLE("ALERT_UPDATE_AVAILABLE", a.C0122a.notification_update_available),
    UPDATE_COMPLETED("ALERT_UPDATE_COMPLETED", a.C0122a.notification_update_completed),
    UPDATE_FAILED("ALERT_UPDATE_FAILED", a.C0122a.notification_update_failed),
    TRIP_CHARGING_COMPLETE("ALERT_TRIP_CHARGING_COMPLETE", a.C0122a.notification_trip_charging_complete),
    PLEASE_MOVE_CAR("ALERT_PLEASE_MOVE_CAR", a.C0122a.notification_please_move_car),
    AUTOPARK_FORWARD_STARTED("ALERT_AUTOPARK_FORWARD_STARTED", a.C0122a.notification_autopark_started),
    AUTOPARK_REVERSE_STARTED("ALERT_AUTOPARK_REVERSE_STARTED", a.C0122a.notification_autopark_started),
    AUTOPARK_COMPLETE_SUCCESS("ALERT_AUTOPARK_COMPLETED_SUCCESS", a.C0122a.notification_autopark_complete),
    AUTOPARK_COMPLETE_FAILURE("ALERT_AUTOPARK_COMPLETED_FAILURE", a.C0122a.notification_autopark_aborted),
    AUTOPARK_FAILED_PLUGGED_IN("ALERT_AUTOPARK_FAILED_PLUGGED_IN", a.C0122a.notification_autopark_failed_plugged_in),
    AUTOPARK_FAILED_GENERAL_ERROR("ALERT_AUTOPARK_FAILED_GENERAL_ERROR", a.C0122a.notification_autopark_failed_general_error),
    AUTOPARK_PANIC("ALERT_AUTOPARK_PANIC", a.C0122a.notification_autopark_panic),
    HOMELINK_TRIGGERED("ALERT_HOMELINK_TRIGGERED", a.C0122a.notification_homelink_triggered),
    UNKNOWN("UNKNOWN", -1, -1);
    
    private String t;
    private int u;
    private int v;

    b(String str, int i) {
        this(str, i, -1);
    }

    b(String str, int i, int i2) {
        this.t = str;
        this.u = i;
        this.v = i2;
    }

    public static b a(String str) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.t.equalsIgnoreCase(str)) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    public String a(Resources resources, String str, String str2) {
        if (str == null || str.length() <= 0 || this.v <= 0) {
            if (str2 != null) {
                return a(resources, this.u).replace("%door_string%", str2);
            }
            return a(resources, this.u);
        }
        return a(resources, this.v).replace("%range_string%", str);
    }

    private static String a(Resources resources, int i) {
        return resources.getString(i);
    }
}
