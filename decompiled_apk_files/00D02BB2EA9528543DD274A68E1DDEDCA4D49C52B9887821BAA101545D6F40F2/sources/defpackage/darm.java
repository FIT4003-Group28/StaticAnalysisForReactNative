package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: darm  reason: default package */
/* loaded from: classes5.dex */
final class darm {
    public static final darm a = new darm();
    public final String b;

    public darm() {
        String property = System.getProperty("java.version");
        String b = property.startsWith("9") ? "9.0.0" : b(property);
        String a2 = dbtn.OS_NAME.a();
        String a3 = dbtn.OS_VERSION.a();
        String str = darc.d;
        StringBuilder sb = new StringBuilder("java/");
        sb.append(b(b));
        sb.append(" http-google-%s/");
        sb.append(b(str));
        if (a2 != null && a3 != null) {
            sb.append(" ");
            sb.append(a(a2));
            sb.append("/");
            sb.append(b(a3));
        }
        this.b = sb.toString();
    }

    public static String a(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }
}
