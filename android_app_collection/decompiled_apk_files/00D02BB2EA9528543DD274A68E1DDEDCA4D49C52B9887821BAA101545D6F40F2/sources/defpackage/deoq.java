package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: deoq  reason: default package */
/* loaded from: classes6.dex */
public final class deoq {
    public static delr statusToFirebaseException(Status status, String str) {
        cnwc.a(status);
        String str2 = status.h;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        int i = status.g;
        if (i != 17510) {
            if (i == 17511) {
                return new dema(str);
            }
            if (i == 17602) {
                return new dely(str);
            }
            switch (i) {
                case 17513:
                    return new dels(str);
                case 17514:
                    return new delq(str);
                case 17515:
                    return new delz(str);
                case 17516:
                    return new delx(str);
                case 17517:
                    return new delw(str);
                case 17518:
                    return new delu(str);
                case 17519:
                    return new delv(str);
                default:
                    return new delr(str);
            }
        }
        return new delt(str);
    }

    public static String truncate(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        if (i <= 0) {
            return "";
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(str.charAt(i2)) && Character.isLowSurrogate(str.charAt(i))) {
            i = i2;
        }
        return str.substring(0, i);
    }
}
