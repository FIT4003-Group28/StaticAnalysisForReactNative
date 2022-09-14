package ezvcard.util;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class TelUri {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean[] f5589a = new boolean[128];

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f5590b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5591c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5592d;
    private final String e;
    private final String f;
    private final Map<String, String> g;

    static {
        for (int i = 48; i <= 57; i++) {
            f5589a[i] = true;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f5589a[i2] = true;
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f5589a[i3] = true;
        }
        for (int i4 = 0; i4 < "!$&'()*+-.:[]_~/".length(); i4++) {
            f5589a["!$&'()*+-.:[]_~/".charAt(i4)] = true;
        }
        f5590b = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private TelUri(a aVar) {
        this.f5591c = aVar.f5593a;
        this.f5592d = aVar.f5594b;
        this.e = aVar.f5595c;
        this.f = aVar.f5596d;
        this.g = Collections.unmodifiableMap(aVar.e);
    }

    public static TelUri a(String str) {
        if (str.length() < "tel:".length() || !str.substring(0, "tel:".length()).equalsIgnoreCase("tel:")) {
            throw ezvcard.b.INSTANCE.d(18, "tel:");
        }
        a aVar = new a();
        c cVar = new c();
        String str2 = null;
        for (int length = "tel:".length(); length < str.length(); length++) {
            char charAt = str.charAt(length);
            if (charAt == '=' && aVar.f5593a != null && str2 == null) {
                str2 = cVar.c();
            } else if (charAt == ';') {
                a(cVar, str2, aVar);
                str2 = null;
            } else {
                cVar.a(charAt);
            }
        }
        a(cVar, str2, aVar);
        return aVar.a();
    }

    private static void a(String str, String str2, a aVar) {
        String c2 = c(str2);
        if (!"ext".equalsIgnoreCase(str)) {
            if (!"isub".equalsIgnoreCase(str)) {
                if ("phone-context".equalsIgnoreCase(str)) {
                    aVar.f5596d = c2;
                    return;
                } else {
                    aVar.e.put(str, c2);
                    return;
                }
            }
            aVar.f5595c = c2;
            return;
        }
        aVar.f5594b = c2;
    }

    private static void a(c cVar, String str, a aVar) {
        String c2 = cVar.c();
        if (aVar.f5593a == null) {
            aVar.f5593a = c2;
        } else if (str == null) {
            if (c2.length() <= 0) {
                return;
            }
            a(c2, "", aVar);
        } else {
            a(str, c2, aVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(this.f5591c);
        if (this.f5592d != null) {
            a("ext", this.f5592d, sb);
        }
        if (this.e != null) {
            a("isub", this.e, sb);
        }
        if (this.f != null) {
            a("phone-context", this.f, sb);
        }
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            a(entry.getKey(), entry.getValue(), sb);
        }
        return sb.toString();
    }

    private static void a(String str, String str2, StringBuilder sb) {
        sb.append(';');
        sb.append(str);
        sb.append('=');
        sb.append(b(str2));
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.f5592d == null ? 0 : this.f5592d.toLowerCase().hashCode()) + 31) * 31) + (this.e == null ? 0 : this.e.toLowerCase().hashCode())) * 31) + (this.f5591c == null ? 0 : this.f5591c.toLowerCase().hashCode())) * 31) + (this.g == null ? 0 : h.a(this.g).hashCode())) * 31;
        if (this.f != null) {
            i = this.f.toLowerCase().hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TelUri telUri = (TelUri) obj;
        if (this.f5592d == null) {
            if (telUri.f5592d != null) {
                return false;
            }
        } else if (!this.f5592d.equalsIgnoreCase(telUri.f5592d)) {
            return false;
        }
        if (this.e == null) {
            if (telUri.e != null) {
                return false;
            }
        } else if (!this.e.equalsIgnoreCase(telUri.e)) {
            return false;
        }
        if (this.f5591c == null) {
            if (telUri.f5591c != null) {
                return false;
            }
        } else if (!this.f5591c.equalsIgnoreCase(telUri.f5591c)) {
            return false;
        }
        if (this.g == null) {
            if (telUri.g != null) {
                return false;
            }
        } else if (telUri.g == null || this.g.size() != telUri.g.size() || !h.a(this.g).equals(h.a(telUri.g))) {
            return false;
        }
        if (this.f == null) {
            if (telUri.f != null) {
                return false;
            }
        } else if (!this.f.equalsIgnoreCase(telUri.f)) {
            return false;
        }
        return true;
    }

    private static String b(String str) {
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= f5589a.length || !f5589a[charAt]) {
                if (sb == null) {
                    sb = new StringBuilder(str.length() * 2);
                    sb.append(str.substring(0, i));
                }
                String num = Integer.toString(charAt, 16);
                sb.append('%');
                sb.append(num);
            } else if (sb != null) {
                sb.append(charAt);
            }
        }
        return sb == null ? str : sb.toString();
    }

    private static String c(String str) {
        Matcher matcher = f5590b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer(str.length());
            }
            matcher.appendReplacement(stringBuffer, Character.toString((char) Integer.parseInt(matcher.group(1), 16)));
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f5593a;

        /* renamed from: b  reason: collision with root package name */
        private String f5594b;

        /* renamed from: c  reason: collision with root package name */
        private String f5595c;

        /* renamed from: d  reason: collision with root package name */
        private String f5596d;
        private Map<String, String> e;
        private b f;

        private a() {
            this.f = new b("a-zA-Z0-9-");
            this.e = new TreeMap();
        }

        public TelUri a() {
            return new TelUri(this);
        }
    }
}
