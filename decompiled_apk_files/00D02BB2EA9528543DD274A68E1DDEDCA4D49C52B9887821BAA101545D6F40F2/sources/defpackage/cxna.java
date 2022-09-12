package defpackage;
/* compiled from: PG */
/* renamed from: cxna  reason: default package */
/* loaded from: classes5.dex */
public final class cxna {
    public static boolean a(@dzsi String str) {
        if (str != null && str.length() == 17) {
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                if (i2 % 3 == 0) {
                    if (str.charAt(i) != '-' && str.charAt(i) != ':') {
                        return false;
                    }
                } else if ((str.charAt(i) < '0' || str.charAt(i) > '9') && ((str.charAt(i) < 'A' || str.charAt(i) > 'F') && (str.charAt(i) < 'a' || str.charAt(i) > 'f'))) {
                    return false;
                }
                i = i2;
            }
            return true;
        }
        return false;
    }
}
