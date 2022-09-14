package defpackage;
/* compiled from: PG */
/* renamed from: apzw  reason: default package */
/* loaded from: classes2.dex */
public final class apzw {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? "SWITCH_ACCOUNT" : "SIGN_IN" : "NO_ACTION";
    }

    public static int b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1488690457) {
            if (str.equals("SIGN_IN")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 1334385268) {
            if (hashCode == 1774777346 && str.equals("SWITCH_ACCOUNT")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("NO_ACTION")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return 2;
            }
            if (c != 2) {
                throw new IllegalArgumentException();
            }
            return 3;
        }
        return 1;
    }

    public static int c(int i) {
        return i - 1;
    }
}
