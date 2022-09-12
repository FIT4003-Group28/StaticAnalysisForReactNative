package defpackage;
/* compiled from: PG */
/* renamed from: akaf  reason: default package */
/* loaded from: classes2.dex */
public enum akaf {
    LOCATION_PERMISSION_NOT_GRANTED(true, true),
    BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED(true, true),
    ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED(true, true),
    DEVICE_LOCATION_DISABLED(true, true),
    NOT_PRIMARY_REPORTING_DEVICE(true, false),
    REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT(true, true),
    NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE(false, false),
    NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING(false, false),
    NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING(false, false),
    NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_INVALID_ACCOUNT_TYPE(false, false),
    PRIMARY_BUT_NOT_REPORTING(true, false),
    ULR_NOT_ENABLED(true, true),
    ULR_NOT_ALLOWED(false, false),
    BATTERY_SAVER_ENABLED(true, true),
    UNKNOWN_ERROR(false, false);
    
    public final boolean p;
    public final boolean q;

    akaf(boolean z, boolean z2) {
        this.p = z;
        this.q = z2;
    }
}
