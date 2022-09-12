package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: awmj  reason: default package */
/* loaded from: classes3.dex */
public final class awmj {
    public static final EnumSet<cvhz> a = EnumSet.of(cvhz.REQUEST_ERROR, cvhz.RESPONSE_OPEN_ERROR, cvhz.RESPONSE_CLOSE_ERROR, cvhz.FILE_SYSTEM_ERROR, cvhz.DISK_IO_ERROR, cvhz.NETWORK_IO_ERROR, cvhz.UNKNOWN_IO_ERROR);

    public static int a(cvhz cvhzVar) {
        cvhz cvhzVar2 = cvhz.UNKNOWN;
        switch (cvhzVar.ordinal()) {
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            default:
                return 0;
            case 7:
                return 2;
            case 8:
                return 1;
            case 9:
                return 4;
            case 10:
                return 3;
        }
    }

    public static drtc b(int i) {
        cvhz cvhzVar = cvhz.UNKNOWN;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return drtc.ALREADY_EXISTS;
            }
            if (i2 == 3) {
                return drtc.INVALID_ARGUMENT;
            }
            return drtc.OK;
        }
        return drtc.UNKNOWN;
    }
}
