package defpackage;
/* compiled from: PG */
/* renamed from: ckgc  reason: default package */
/* loaded from: classes4.dex */
public enum ckgc {
    APP_FOREGROUNDED("APP_FOREGROUNDED", 0),
    ARRIVAL_SHARE("ARRIVAL_SHARE", 1),
    DEFAULT_BURST_RATE("DEFAULT_BURST_RATE", 2),
    JOURNEY_SHARE_COMPLETED("JOURNEY_SHARE_COMPLETED", 3),
    ON_THE_MOVE("ON_THE_MOVE", 4),
    SHORT_TEMPORARY_SHARE("SHORT_TEMPORARY_SHARE", 5),
    STILL("STILL", 6),
    OVENFRESH("OVENFRESH", 7),
    OVENFRESH_ONGOING("OVENFRESH_ONGOING", 8),
    GEOFENCE_ALERT_REGION("GEOFENCE_ALERT_REGION", 9),
    TESTING_GMM_REPORTING("TESTING_GMM_REPORTING", 10),
    APP_IN_FOREGROUND("APP_IN_FOREGROUND", 11),
    UNKNOWN("LOCATION_SHARING_UNKNOWN_REASON", 12);
    
    public final int n;
    public final String o;

    ckgc(String str, int i) {
        this.n = i;
        this.o = str;
    }
}
