package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
@Deprecated
/* renamed from: coor  reason: default package */
/* loaded from: classes5.dex */
public final class coor extends cnoc {
    public static Status a(int i) {
        String str;
        if (i == 9051) {
            str = "PLACE_ALIAS_NOT_FOUND";
        } else if (i == 9150) {
            str = "PLACEFENCING_NOT_AVAILABLE";
        } else if (i == 9101) {
            str = "PLACE_PROXIMITY_UNKNOWN";
        } else if (i == 9102) {
            str = "NEARBY_ALERTS_NOT_AVAILABLE";
        } else if (i == 9201) {
            str = "PLACES_API_PERSONALIZED_DATA_ACCESS_APPROVED";
        } else if (i != 9202) {
            switch (i) {
                case 9000:
                    str = "PLACES_API_QUOTA_FAILED";
                    break;
                case 9001:
                    str = "PLACES_API_USAGE_LIMIT_EXCEEDED";
                    break;
                case 9002:
                    str = "PLACES_API_KEY_INVALID";
                    break;
                case 9003:
                    str = "PLACES_API_ACCESS_NOT_CONFIGURED";
                    break;
                case 9004:
                    str = "PLACES_API_INVALID_ARGUMENT";
                    break;
                case 9005:
                    str = "PLACES_API_RATE_LIMIT_EXCEEDED";
                    break;
                case 9006:
                    str = "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
                    break;
                case 9007:
                    str = "PLACES_API_KEY_EXPIRED";
                    break;
                case 9008:
                    str = "PLACES_API_INVALID_APP";
                    break;
                case 9009:
                    str = "INSUFFICIENT_LOCATION_PERMISSION_FOR_BACKGROUND_PLACES";
                    break;
                default:
                    str = cnoc.getStatusCodeString(i);
                    break;
            }
        } else {
            str = "PLACES_API_PERSONALIZED_DATA_ACCESS_REJECTED";
        }
        cnwc.a(str);
        return new Status(i, str);
    }
}
