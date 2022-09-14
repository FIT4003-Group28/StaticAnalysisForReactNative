package ezvcard.util;

import com.baidu.platform.comapi.location.CoordinateType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class GeoUri {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean[] f5573a = new boolean[128];

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f5574b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f5575c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f5576d;
    private final Double e;
    private final String f;
    private final Double g;
    private final Map<String, String> h;

    static {
        for (int i = 48; i <= 57; i++) {
            f5573a[i] = true;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f5573a[i2] = true;
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f5573a[i3] = true;
        }
        for (int i4 = 0; i4 < "!$&'()*+-.:[]_~".length(); i4++) {
            f5573a["!$&'()*+-.:[]_~".charAt(i4)] = true;
        }
        f5574b = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private GeoUri(a aVar) {
        this.f5575c = aVar.f5577a == null ? Double.valueOf(0.0d) : aVar.f5577a;
        this.f5576d = aVar.f5578b == null ? Double.valueOf(0.0d) : aVar.f5578b;
        this.e = aVar.f5579c;
        this.f = aVar.f5580d;
        this.g = aVar.e;
        this.h = Collections.unmodifiableMap(aVar.f);
    }

    public static GeoUri a(String str) {
        if (str.length() < "geo:".length() || !str.substring(0, "geo:".length()).equalsIgnoreCase("geo:")) {
            throw ezvcard.b.INSTANCE.d(18, "geo:");
        }
        a aVar = new a(null, null);
        c cVar = new c();
        String str2 = null;
        boolean z = false;
        for (int length = "geo:".length(); length < str.length(); length++) {
            char charAt = str.charAt(length);
            if (charAt == ',' && !z) {
                a(cVar, aVar);
            } else if (charAt == ';') {
                if (z) {
                    a(cVar, str2, aVar);
                    str2 = null;
                } else {
                    a(cVar, aVar);
                    if (aVar.f5578b == null) {
                        throw ezvcard.b.INSTANCE.d(21, new Object[0]);
                    }
                    z = true;
                }
            } else if (charAt == '=' && z && str2 == null) {
                str2 = cVar.c();
            } else {
                cVar.a(charAt);
            }
        }
        if (z) {
            a(cVar, str2, aVar);
        } else {
            a(cVar, aVar);
            if (aVar.f5578b == null) {
                throw ezvcard.b.INSTANCE.d(21, new Object[0]);
            }
        }
        return aVar.a();
    }

    private static void a(c cVar, a aVar) {
        String c2 = cVar.c();
        if (aVar.f5577a == null) {
            try {
                aVar.f5577a = Double.valueOf(Double.parseDouble(c2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(ezvcard.b.INSTANCE.c(22, "A"), e);
            }
        } else if (aVar.f5578b == null) {
            try {
                aVar.f5578b = Double.valueOf(Double.parseDouble(c2));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(ezvcard.b.INSTANCE.c(22, "B"), e2);
            }
        } else if (aVar.f5579c != null) {
        } else {
            try {
                aVar.f5579c = Double.valueOf(Double.parseDouble(c2));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(ezvcard.b.INSTANCE.c(22, "C"), e3);
            }
        }
    }

    private static void a(String str, String str2, a aVar) {
        String c2 = c(str2);
        if (!"crs".equalsIgnoreCase(str)) {
            if ("u".equalsIgnoreCase(str)) {
                try {
                    aVar.e = Double.valueOf(c2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            aVar.f.put(str, c2);
            return;
        }
        aVar.f5580d = c2;
    }

    private static void a(c cVar, String str, a aVar) {
        String c2 = cVar.c();
        if (str == null) {
            if (c2.length() <= 0) {
                return;
            }
            a(c2, "", aVar);
            return;
        }
        a(str, c2, aVar);
    }

    public Double a() {
        return this.f5575c;
    }

    public Double b() {
        return this.f5576d;
    }

    public String toString() {
        return a(6);
    }

    public String a(int i) {
        j jVar = new j(i);
        StringBuilder sb = new StringBuilder("geo:");
        sb.append(jVar.format(this.f5575c));
        sb.append(',');
        sb.append(jVar.format(this.f5576d));
        if (this.e != null) {
            sb.append(',');
            sb.append(this.e);
        }
        if (this.f != null && !this.f.equalsIgnoreCase(CoordinateType.WGS84)) {
            a("crs", this.f, sb);
        }
        if (this.g != null) {
            a("u", jVar.format(this.g), sb);
        }
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            a(entry.getKey(), entry.getValue(), sb);
        }
        return sb.toString();
    }

    private void a(String str, String str2, StringBuilder sb) {
        sb.append(';');
        sb.append(str);
        sb.append('=');
        sb.append(b(str2));
    }

    private static String b(String str) {
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= f5573a.length || !f5573a[charAt]) {
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
        Matcher matcher = f5574b.matcher(str);
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

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f5575c == null ? 0 : this.f5575c.hashCode()) + 31) * 31) + (this.f5576d == null ? 0 : this.f5576d.hashCode())) * 31) + (this.e == null ? 0 : this.e.hashCode())) * 31) + (this.f == null ? 0 : this.f.toLowerCase().hashCode())) * 31) + (this.h == null ? 0 : h.a(this.h).hashCode())) * 31;
        if (this.g != null) {
            i = this.g.hashCode();
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
        GeoUri geoUri = (GeoUri) obj;
        if (this.f5575c == null) {
            if (geoUri.f5575c != null) {
                return false;
            }
        } else if (!this.f5575c.equals(geoUri.f5575c)) {
            return false;
        }
        if (this.f5576d == null) {
            if (geoUri.f5576d != null) {
                return false;
            }
        } else if (!this.f5576d.equals(geoUri.f5576d)) {
            return false;
        }
        if (this.e == null) {
            if (geoUri.e != null) {
                return false;
            }
        } else if (!this.e.equals(geoUri.e)) {
            return false;
        }
        if (this.f == null) {
            if (geoUri.f != null) {
                return false;
            }
        } else if (!this.f.equalsIgnoreCase(geoUri.f)) {
            return false;
        }
        if (this.g == null) {
            if (geoUri.g != null) {
                return false;
            }
        } else if (!this.g.equals(geoUri.g)) {
            return false;
        }
        if (this.h == null) {
            if (geoUri.h != null) {
                return false;
            }
        } else if (geoUri.h == null || this.h.size() != geoUri.h.size() || !h.a(this.h).equals(h.a(geoUri.h))) {
            return false;
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Double f5577a;

        /* renamed from: b  reason: collision with root package name */
        private Double f5578b;

        /* renamed from: c  reason: collision with root package name */
        private Double f5579c;

        /* renamed from: d  reason: collision with root package name */
        private String f5580d;
        private Double e;
        private Map<String, String> f;
        private b g;

        public a(Double d2, Double d3) {
            this.g = new b("a-zA-Z0-9-");
            this.f = new LinkedHashMap(0);
            a(d2);
            b(d3);
        }

        public a(GeoUri geoUri) {
            this.g = new b("a-zA-Z0-9-");
            a(geoUri.f5575c);
            b(geoUri.f5576d);
            this.f5579c = geoUri.e;
            this.f5580d = geoUri.f;
            this.e = geoUri.g;
            this.f = new LinkedHashMap(geoUri.h);
        }

        public a a(Double d2) {
            this.f5577a = d2;
            return this;
        }

        public a b(Double d2) {
            this.f5578b = d2;
            return this;
        }

        public GeoUri a() {
            return new GeoUri(this);
        }
    }
}
