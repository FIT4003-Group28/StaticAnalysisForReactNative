package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: eadz  reason: default package */
/* loaded from: classes6.dex */
public final class eadz {
    public static final /* synthetic */ int f = 0;
    private static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    @dzsi
    public final List<String> d;
    public final String e;
    private final String h;
    private final String i;
    @dzsi
    private final String j;

    public eadz(eady eadyVar) {
        this.a = eadyVar.a;
        this.h = m(eadyVar.b, false);
        this.i = m(eadyVar.c, false);
        this.b = eadyVar.d;
        this.c = eadyVar.a();
        r(eadyVar.f, false);
        List<String> list = eadyVar.g;
        String str = null;
        this.d = list != null ? r(list, true) : null;
        String str2 = eadyVar.h;
        this.j = str2 != null ? m(str2, false) : str;
        this.e = eadyVar.toString();
    }

    public static int f(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> k(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    static String m(String str, boolean z) {
        return n(str, 0, str.length(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                } else {
                    z = true;
                }
            }
            eaiz eaizVar = new eaiz();
            eaizVar.R(str, i, i3);
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt == 37) {
                    int i4 = i3 + 2;
                    if (i4 < i2) {
                        int x = eafa.x(str.charAt(i3 + 1));
                        int x2 = eafa.x(str.charAt(i4));
                        if (x == -1 || x2 == -1) {
                            codePointAt = 37;
                            eaizVar.S(codePointAt);
                            i3 += Character.charCount(codePointAt);
                        } else {
                            eaizVar.M((x << 4) + x2);
                            i3 = i4;
                            codePointAt = 37;
                            i3 += Character.charCount(codePointAt);
                        }
                    } else {
                        codePointAt = 37;
                    }
                }
                if (codePointAt == 43 && z) {
                    eaizVar.M(32);
                    i3 += Character.charCount(codePointAt);
                }
                eaizVar.S(codePointAt);
                i3 += Character.charCount(codePointAt);
            }
            return eaizVar.p();
        }
        return str.substring(i, i2);
    }

    static boolean o(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && eafa.x(str.charAt(i + 1)) != -1 && eafa.x(str.charAt(i3)) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String p(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return q(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String q(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i3;
        int i4 = i;
        while (i4 < i2) {
            int codePointAt = str.codePointAt(i4);
            boolean z6 = true;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !o(str, i4, i2)))))) {
                z5 = z3;
            } else if (codePointAt != 43 || !z3) {
                i4 += Character.charCount(codePointAt);
            } else {
                z5 = true;
            }
            eaiz eaizVar = new eaiz();
            eaizVar.R(str, i, i4);
            eaiz eaizVar2 = null;
            while (i4 < i2) {
                int codePointAt2 = str.codePointAt(i4);
                if (z) {
                    if (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12) {
                        if (codePointAt2 == 13) {
                            codePointAt2 = 13;
                            i4 += Character.charCount(codePointAt2);
                            z6 = true;
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    z6 = true;
                }
                if (codePointAt2 != 43 || !z5) {
                    if (codePointAt2 >= 32 && codePointAt2 != 127 && (codePointAt2 < 128 || !z4)) {
                        if (str2.indexOf(codePointAt2) == -1) {
                            if (codePointAt2 != 37) {
                                i3 = codePointAt2;
                            } else if (z && (!z2 || o(str, i4, i2))) {
                                i3 = 37;
                            }
                            eaizVar.S(codePointAt2);
                            codePointAt2 = i3;
                            i4 += Character.charCount(codePointAt2);
                            z6 = true;
                        }
                    }
                    if (eaizVar2 == null) {
                        eaizVar2 = new eaiz();
                    }
                    eaizVar2.S(codePointAt2);
                    while (!eaizVar2.c()) {
                        int h = eaizVar2.h() & 255;
                        eaizVar.M(37);
                        char[] cArr = g;
                        eaizVar.M(cArr[h >> 4]);
                        eaizVar.M(cArr[h & 15]);
                    }
                    i4 += Character.charCount(codePointAt2);
                    z6 = true;
                } else {
                    eaizVar.V(z6 != z ? "%2B" : "+");
                    i4 += Character.charCount(codePointAt2);
                    z6 = true;
                }
            }
            return eaizVar.p();
        }
        return str.substring(i, i2);
    }

    private static final List<String> r(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final URL a() {
        try {
            return new URL(this.e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI b() {
        eady eadyVar = new eady();
        eadyVar.a = this.a;
        eadyVar.b = d();
        eadyVar.c = e();
        eadyVar.d = this.b;
        eadyVar.e = this.c != f(this.a) ? this.c : -1;
        eadyVar.f.clear();
        eadyVar.f.addAll(h());
        eadyVar.d(i());
        eadyVar.h = this.j == null ? null : this.e.substring(this.e.indexOf(35) + 1);
        int size = eadyVar.f.size();
        for (int i = 0; i < size; i++) {
            eadyVar.f.set(i, p(eadyVar.f.get(i), "[]", true, true, false, true));
        }
        List<String> list = eadyVar.g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = eadyVar.g.get(i2);
                if (str != null) {
                    eadyVar.g.set(i2, p(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = eadyVar.h;
        if (str2 != null) {
            eadyVar.h = p(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String eadyVar2 = eadyVar.toString();
        try {
            return new URI(eadyVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(eadyVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean c() {
        return this.a.equals("https");
    }

    public final String d() {
        if (this.h.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.e;
        return this.e.substring(length, eafa.q(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.i.isEmpty()) {
            return "";
        }
        int indexOf = this.e.indexOf(58, this.a.length() + 3);
        return this.e.substring(indexOf + 1, this.e.indexOf(64));
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof eadz) && ((eadz) obj).e.equals(this.e);
    }

    public final String g() {
        int indexOf = this.e.indexOf(47, this.a.length() + 3);
        String str = this.e;
        return this.e.substring(indexOf, eafa.q(str, indexOf, str.length(), "?#"));
    }

    public final List<String> h() {
        int indexOf = this.e.indexOf(47, this.a.length() + 3);
        String str = this.e;
        int q = eafa.q(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < q) {
            int i = indexOf + 1;
            int r = eafa.r(this.e, i, q, '/');
            arrayList.add(this.e.substring(i, r));
            indexOf = r;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @dzsi
    public final String i() {
        if (this.d == null) {
            return null;
        }
        int indexOf = this.e.indexOf(63) + 1;
        String str = this.e;
        return this.e.substring(indexOf, eafa.r(str, indexOf, str.length(), '#'));
    }

    @dzsi
    public final eady l(String str) {
        try {
            eady eadyVar = new eady();
            eadyVar.e(this, str);
            return eadyVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.e;
    }
}
