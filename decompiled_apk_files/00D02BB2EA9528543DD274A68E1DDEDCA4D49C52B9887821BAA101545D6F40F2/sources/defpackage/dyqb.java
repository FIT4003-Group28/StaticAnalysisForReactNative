package defpackage;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyqb  reason: default package */
/* loaded from: classes6.dex */
public final class dyqb {
    private static final long a = TimeUnit.SECONDS.toNanos(1);

    @dzsi
    public static List<?> a(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof List)) {
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
        }
        return (List) obj;
    }

    @dzsi
    public static List<Map<String, ?>> b(Map<String, ?> map, String str) {
        List a2 = a(map, str);
        if (a2 == null) {
            return null;
        }
        i(a2);
        return a2;
    }

    @dzsi
    public static List<String> c(Map<String, ?> map, String str) {
        List a2 = a(map, str);
        if (a2 == null) {
            return null;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!(a2.get(i) instanceof String)) {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", a2.get(i), Integer.valueOf(i), a2));
            }
        }
        return a2;
    }

    @dzsi
    public static Map<String, ?> d(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
        }
        return (Map) obj;
    }

    @dzsi
    public static Double e(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", obj, str, map));
        }
        return (Double) obj;
    }

    public static Integer f(Map<String, ?> map, String str) {
        Double e = e(map, str);
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        if (intValue == e.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Number expected to be integer: ");
        sb.append(valueOf);
        throw new ClassCastException(sb.toString());
    }

    @dzsi
    public static String g(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
        }
        return (String) obj;
    }

    public static Long h(Map<String, ?> map, String str) {
        boolean z;
        int i;
        String g = g(map, str);
        if (g != null) {
            try {
                boolean z2 = false;
                if (!g.isEmpty() && g.charAt(g.length() - 1) == 's') {
                    if (g.charAt(0) == '-') {
                        g = g.substring(1);
                        z = true;
                    } else {
                        z = false;
                    }
                    String substring = g.substring(0, g.length() - 1);
                    String str2 = "";
                    int indexOf = substring.indexOf(46);
                    if (indexOf != -1) {
                        str2 = substring.substring(indexOf + 1);
                        substring = substring.substring(0, indexOf);
                    }
                    long parseLong = Long.parseLong(substring);
                    if (str2.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i2 = 0; i2 < 9; i2++) {
                            i *= 10;
                            if (i2 < str2.length()) {
                                if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                                    throw new ParseException("Invalid nanoseconds.", 0);
                                }
                                i += str2.charAt(i2) - '0';
                            }
                        }
                    }
                    if (parseLong < 0) {
                        String valueOf = String.valueOf(g);
                        throw new ParseException(valueOf.length() != 0 ? "Invalid duration string: ".concat(valueOf) : new String("Invalid duration string: "), 0);
                    }
                    if (z) {
                        parseLong = -parseLong;
                        i = -i;
                    }
                    long j = i;
                    try {
                        long j2 = a;
                        if (j <= (-j2) || j >= j2) {
                            parseLong = deba.a(parseLong, j / j2);
                            i = (int) (j % j2);
                        }
                        if (parseLong > 0 && i < 0) {
                            i = (int) (i + j2);
                            parseLong--;
                        }
                        if (parseLong < 0 && i > 0) {
                            i = (int) (i - j2);
                            parseLong++;
                        }
                        if (parseLong >= -315576000000L && parseLong <= 315576000000L) {
                            long j3 = i;
                            if (j3 >= -999999999 && j3 < j2 && ((parseLong >= 0 && i >= 0) || (parseLong <= 0 && i <= 0))) {
                                long nanos = TimeUnit.SECONDS.toNanos(parseLong);
                                long j4 = nanos + j3;
                                boolean z3 = (j3 ^ nanos) < 0;
                                if ((nanos ^ j4) >= 0) {
                                    z2 = true;
                                }
                                if (!(z3 | z2)) {
                                    j4 = (1 ^ (j4 >>> 63)) + Long.MAX_VALUE;
                                }
                                return Long.valueOf(j4);
                            }
                        }
                        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(parseLong), Integer.valueOf(i)));
                    } catch (IllegalArgumentException unused) {
                        throw new ParseException("Duration value is out of range.", 0);
                    }
                }
                throw new ParseException(g.length() != 0 ? "Invalid duration string: ".concat(g) : new String("Invalid duration string: "), 0);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public static void i(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    @dzsi
    public static Boolean j(Map<String, ?> map) {
        if (!map.containsKey("waitForReady")) {
            return null;
        }
        Object obj = map.get("waitForReady");
        if (!(obj instanceof Boolean)) {
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, "waitForReady", map));
        }
        return (Boolean) obj;
    }
}
