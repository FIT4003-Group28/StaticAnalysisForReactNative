package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aomw  reason: default package */
/* loaded from: classes.dex */
public final class aomw {
    public static final amqf a;
    public static final ampm b;
    public static final ampm c;
    private static final amqf d;
    private static final amqf e;
    private static final ampm f;
    private static final amuk g;

    static {
        amqf a2 = amqf.b('=').a();
        aqxo.s(true, "must be greater than zero: %s", 2);
        a = new amqf(a2.c, a2.b, a2.a, 2);
        d = amqf.b('/');
        e = amqf.b('-');
        b = ampm.b("/");
        f = ampm.b("-");
        c = ampm.b("=");
        g = amuk.A(new aomv("s", false), new aomv("w", false), new aomv("c", true), new aomv("d", true), new aomv("h", false), new aomv("s", true), new aomv("h", true), new aomv("p", true), new aomv("pp", true), new aomv("pf", true), new aomv("n", true), new aomv("r", false), new aomv("r", true), new aomv("o", true), new aomv("o", false), new aomv("j", false), new aomv("x", false), new aomv("y", false), new aomv("z", false), new aomv("g", true), new aomv("e", false), new aomv("f", false), new aomv("k", true), new aomv("u", true), new aomv("ut", true), new aomv("i", true), new aomv("a", true), new aomv("b", true), new aomv("b", false), new aomv("c", false), new aomv("t", false), new aomv("nt0", false), new aomv("v", true), new aomv("q", false), new aomv("fh", true), new aomv("fv", true), new aomv("fg", true), new aomv("ci", true), new aomv("rw", true), new aomv("rwu", true), new aomv("rwa", true), new aomv("nw", true), new aomv("rh", true), new aomv("no", true), new aomv("ns", true), new aomv("k", false), new aomv("p", false), new aomv("l", false), new aomv("v", false), new aomv("nu", true), new aomv("ft", true), new aomv("cc", true), new aomv("nd", true), new aomv("ip", true), new aomv("nc", true), new aomv("a", false), new aomv("rj", true), new aomv("rp", true), new aomv("rg", true), new aomv("pd", true), new aomv("pa", true), new aomv("m", false), new aomv("vb", false), new aomv("vl", false), new aomv("lf", true), new aomv("mv", true), new aomv("id", true), new aomv("al", true), new aomv("ic", false), new aomv("pg", true), new aomv("mo", true), new aomv("iv", false), new aomv("il", false), new aomv("ba", false));
    }

    protected aomw() {
    }

    public aomw(byte[] bArr) {
        this();
    }

    public static List a(String str, boolean z) {
        aqxo.q(str != null, "options is null");
        ArrayList o = amxp.o();
        Iterator it = e.f(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f.e(str2, it.hasNext() ? it.next() : obj, new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    ampm ampmVar = f;
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                    str2 = ampmVar.e(str2, obj, new Object[0]);
                }
                if (!z || Character.isUpperCase(str2.charAt(0))) {
                    o.add(str2);
                }
            }
        }
        return o;
    }

    public static final String b(tit titVar) {
        ArrayList p = amxp.p(a.f(titVar.a()));
        return p.size() == 2 ? (String) p.get(1) : "";
    }

    public static final String c(List list) {
        if (list.size() == 4) {
            list.add("");
        } else if (list.size() == 5) {
            list.add(4, "");
        }
        return (String) list.get(4);
    }

    public static final List d(tit titVar) {
        ArrayList p = amxp.p(d.f(titVar.a()));
        return (p.size() <= 0 || !((String) p.get(0)).isEmpty()) ? p : p.subList(1, p.size());
    }

    public static final boolean e(List list) {
        int size = list.size();
        return size > 0 && size <= 1 && !((String) list.get(0)).isEmpty();
    }

    public static final boolean f(List list) {
        int size = list.size();
        if (size < 4) {
            return false;
        }
        return size == 4 ? !((String) list.get(3)).isEmpty() : size <= 6;
    }

    public static String g(String str, String str2) {
        aqxo.q(str != null, "oldOptions is null");
        aqxo.q(str2 != null, "newOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        List<String> a2 = a(str, true);
        if (a2.isEmpty()) {
            return str2;
        }
        a2.addAll(a(str2, false));
        aqxo.q(true, "options is null");
        amry u = amry.u();
        ArrayList o = amxp.o();
        for (String str3 : a2) {
            amuk amukVar = g;
            int i = ((amxx) amukVar).c;
            aomv aomvVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                aomv aomvVar2 = (aomv) amukVar.get(i2);
                if (str3.toLowerCase().startsWith(aomvVar2.a)) {
                    if (!aomvVar2.b) {
                        aomvVar = aomvVar2;
                    } else if (str3.length() == aomvVar2.a.length()) {
                        aomvVar = aomvVar2;
                        break;
                    }
                }
                i2++;
            }
            if (aomvVar != null) {
                u.p(aomvVar, str3);
            } else {
                o.add(str3);
            }
        }
        ArrayList o2 = amxp.o();
        amuk amukVar2 = g;
        int i3 = ((amxx) amukVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str4 = "";
            for (String str5 : u.e((aomv) amukVar2.get(i4))) {
                if (Character.isUpperCase(str5.charAt(0))) {
                    o2.add(str5);
                } else {
                    str4 = str5;
                }
            }
            if (!str4.isEmpty()) {
                o2.add(str4);
            }
        }
        o2.addAll(o);
        return f.d(o2);
    }

    public static final List h(tit titVar) {
        if (titVar.a() == null) {
            throw new aomu("url path is null");
        }
        List d2 = d(titVar);
        if (d2.isEmpty() || !"u".equals(d2.get(0))) {
            if (!d2.isEmpty() && "image".equals(d2.get(0))) {
                d2.remove(0);
            }
        } else {
            d2.remove(1);
            d2.remove(0);
        }
        if (d2.size() == 2) {
            d2.remove(0);
        }
        return d2;
    }

    public final boolean i(Uri uri) {
        tit titVar = new tit(uri);
        aqxo.p(true);
        return aonh.a(titVar.toString());
    }

    public final Uri j(aonc aoncVar, Uri uri) {
        try {
            tit titVar = new tit(uri);
            boolean z = true;
            aqxo.q(true, "options is null");
            aqxo.q(true, "url is null");
            List h = h(titVar);
            if (f(h)) {
                aqxo.q(true, "options is null");
                aqxo.q(true, "url is null");
                aqxo.q(titVar.a() != null, "url path is null");
                List d2 = d(titVar);
                if (d2.size() <= 0 || !((String) d2.get(0)).equals("image")) {
                    z = false;
                } else {
                    d2.remove(0);
                }
                String g2 = g(c(d2), aoncVar.a(""));
                d2.set(4, g2);
                if (g2.equals("") && d2.size() > 5) {
                    d2.remove(4);
                }
                if (z) {
                    d2.add(0, "image");
                }
                String valueOf = String.valueOf(b.d(d2));
                return titVar.b(valueOf.length() != 0 ? "/".concat(valueOf) : new String("/")).a;
            } else if (e(h)) {
                aqxo.q(true, "options is null");
                aqxo.q(true, "url is null");
                if (titVar.a() == null) {
                    z = false;
                }
                aqxo.q(z, "url path is null");
                ArrayList p = amxp.p(a.f(titVar.a()));
                String g3 = g(b(titVar), aoncVar.a(""));
                String str = (String) p.get(0);
                if (!g3.isEmpty()) {
                    str = c.e(str, g3, new Object[0]);
                }
                return titVar.b(str).a;
            } else {
                throw new aomu(titVar.toString());
            }
        } catch (aomu e2) {
            throw new tiu(e2);
        }
    }
}
