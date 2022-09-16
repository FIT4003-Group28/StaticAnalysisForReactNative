package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rjq  reason: default package */
/* loaded from: classes4.dex */
public final class rjq {
    public static final rjq a = new rjq(null, null);
    public final Boolean b;
    public final Boolean c;

    public rjq(Boolean bool, Boolean bool2) {
        this.b = bool;
        this.c = bool2;
    }

    public static rjq a(Bundle bundle) {
        return bundle == null ? a : new rjq(l(bundle.getString("ad_storage")), l(bundle.getString("analytics_storage")));
    }

    public static rjq b(String str) {
        Boolean bool;
        Boolean bool2 = null;
        if (str != null) {
            Boolean m = str.length() >= 3 ? m(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = m(str.charAt(3));
            }
            bool = bool2;
            bool2 = m;
        } else {
            bool = null;
        }
        return new rjq(bool2, bool);
    }

    static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static String e(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string == null || l(string) != null) {
            String string2 = bundle.getString("analytics_storage");
            if (string2 != null && l(string2) == null) {
                return string2;
            }
            return null;
        }
        return string;
    }

    public static boolean i(int i, int i2) {
        return i <= i2;
    }

    static final int k(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean l(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    private static Boolean m(char c) {
        if (c != '0') {
            if (c == '1') {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.FALSE;
    }

    private static final char n(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final rjq c(rjq rjqVar) {
        return new rjq(d(this.b, rjqVar.b), d(this.c, rjqVar.c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rjq)) {
            return false;
        }
        rjq rjqVar = (rjq) obj;
        return k(this.b) == k(rjqVar.b) && k(this.c) == k(rjqVar.c);
    }

    public final String f() {
        return "G1" + n(this.b) + n(this.c);
    }

    public final boolean g() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final boolean h() {
        Boolean bool = this.c;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return ((k(this.b) + 527) * 31) + k(this.c);
    }

    public final boolean j(rjq rjqVar) {
        if (this.b != Boolean.FALSE || rjqVar.b == Boolean.FALSE) {
            return this.c == Boolean.FALSE && rjqVar.c != Boolean.FALSE;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.b;
        String str = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.c;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
