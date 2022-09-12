package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dasb  reason: default package */
/* loaded from: classes5.dex */
public final class dasb {
    private static final Pattern a = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern b = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern c;
    private static final Pattern d;
    private String e;
    private String f;
    private final SortedMap<String, String> g = new TreeMap();
    private String h;

    static {
        StringBuilder sb = new StringBuilder(37);
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        c = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 22);
        sb4.append("\\s*;\\s*(");
        sb4.append("[^\\s/=;\"]+");
        sb4.append(")=(");
        sb4.append(sb3);
        sb4.append(")");
        d = Pattern.compile(sb4.toString());
    }

    public dasb(String str) {
        this.e = "application";
        this.f = "octet-stream";
        Matcher matcher = c.matcher(str);
        dbsk.b(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = a;
        dbsk.b(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.e = group;
        this.h = null;
        String group2 = matcher.group(2);
        dbsk.b(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f = group2;
        this.h = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = d.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                f(group4, group5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return b.matcher(str).matches();
    }

    public static boolean e(String str) {
        return str != null && new dasb("application/json; charset=UTF-8").c(new dasb(str));
    }

    public final String b() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('/');
        sb.append(this.f);
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            String value = entry.getValue();
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=");
            if (!a(value)) {
                String replace = value.replace("\\", "\\\\").replace("\"", "\\\"");
                StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 2);
                sb2.append("\"");
                sb2.append(replace);
                sb2.append("\"");
                value = sb2.toString();
            }
            sb.append(value);
        }
        String sb3 = sb.toString();
        this.h = sb3;
        return sb3;
    }

    public final boolean c(dasb dasbVar) {
        return dasbVar != null && this.e.equalsIgnoreCase(dasbVar.e) && this.f.equalsIgnoreCase(dasbVar.f);
    }

    public final Charset d() {
        String str = this.g.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dasb)) {
            return false;
        }
        dasb dasbVar = (dasb) obj;
        return c(dasbVar) && this.g.equals(dasbVar.g);
    }

    public final void f(String str, String str2) {
        if (str2 == null) {
            this.h = null;
            this.g.remove(str.toLowerCase(Locale.US));
            return;
        }
        dbsk.b(b.matcher(str).matches(), "Name contains reserved characters");
        this.h = null;
        this.g.put(str.toLowerCase(Locale.US), str2);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b();
    }
}
