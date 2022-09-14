package c.d.j.e;

import c.d.d.d.i;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static Pattern f3243c;

    /* renamed from: a  reason: collision with root package name */
    public final int f3244a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3245b;

    public a(int i, int i2) {
        this.f3244a = i;
        this.f3245b = i2;
    }

    public static a a(int i) {
        i.a(i >= 0);
        return new a(i, Integer.MAX_VALUE);
    }

    public static a a(String str) {
        if (str == null) {
            return null;
        }
        if (f3243c == null) {
            f3243c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f3243c.split(str);
            i.a(split.length == 4);
            i.a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            i.a(parseInt2 > parseInt);
            i.a(parseInt3 > parseInt2);
            return parseInt2 < parseInt3 - 1 ? new a(parseInt, parseInt2) : new a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e2);
        }
    }

    public static a b(int i) {
        i.a(i > 0);
        return new a(0, i);
    }

    private static String c(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    public String a() {
        return String.format(null, "bytes=%s-%s", c(this.f3244a), c(this.f3245b));
    }

    public boolean a(a aVar) {
        return aVar != null && this.f3244a <= aVar.f3244a && this.f3245b >= aVar.f3245b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3244a == aVar.f3244a && this.f3245b == aVar.f3245b;
    }

    public int hashCode() {
        return c.d.d.k.b.a(this.f3244a, this.f3245b);
    }

    public String toString() {
        return String.format(null, "%s-%s", c(this.f3244a), c(this.f3245b));
    }
}
