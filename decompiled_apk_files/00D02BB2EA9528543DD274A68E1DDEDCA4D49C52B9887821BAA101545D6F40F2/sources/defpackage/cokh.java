package defpackage;
/* compiled from: PG */
/* renamed from: cokh  reason: default package */
/* loaded from: classes5.dex */
public final class cokh extends cnoc {
    public static String a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1003:
            default:
                return cnoc.getStatusCodeString(i);
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
    }
}
