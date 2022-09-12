package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cpjo  reason: default package */
/* loaded from: classes5.dex */
public final class cpjo {
    public static Status a(int i) {
        String str;
        if (i != 4009) {
            switch (i) {
                case 4000:
                    str = "TARGET_NODE_NOT_CONNECTED";
                    break;
                case 4001:
                    str = "DUPLICATE_LISTENER";
                    break;
                case 4002:
                    str = "UNKNOWN_LISTENER";
                    break;
                case 4003:
                    str = "DATA_ITEM_TOO_LARGE";
                    break;
                case 4004:
                    str = "INVALID_TARGET_NODE";
                    break;
                case 4005:
                    str = "ASSET_UNAVAILABLE";
                    break;
                default:
                    str = cnoc.getStatusCodeString(i);
                    break;
            }
        } else {
            str = "UNSUPPORTED_BY_TARGET";
        }
        return new Status(i, str);
    }
}
