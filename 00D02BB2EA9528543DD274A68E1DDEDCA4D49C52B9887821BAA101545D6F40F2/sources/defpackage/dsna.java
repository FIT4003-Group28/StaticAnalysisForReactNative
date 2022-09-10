package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsna  reason: default package */
/* loaded from: classes.dex */
public class dsna<T> {
    private static final dbtm a = dbtm.a('=').e().j();
    private static final dbtm b = dbtm.a('/');
    private static final dbtm c = dbtm.a('-');
    private static final dbrz d;
    private static final dbrz e;
    private static final dbrz f;
    private static final dcdc<dsmy> g;

    static {
        dbtm.a(':');
        d = dbrz.e("/");
        e = dbrz.e("-");
        f = dbrz.e("=");
        g = dcdc.p(new dsmy("s", false), new dsmy("w", false), new dsmy("c", true), new dsmy("d", true), new dsmy("h", false), new dsmy("s", true), new dsmy("h", true), new dsmy("p", true), new dsmy("pp", true), new dsmy("pf", true), new dsmy("n", true), new dsmy("r", false), new dsmy("r", true), new dsmy("o", true), new dsmy("o", false), new dsmy("j", false), new dsmy("x", false), new dsmy("y", false), new dsmy("z", false), new dsmy("g", true), new dsmy("e", false), new dsmy("f", false), new dsmy("k", true), new dsmy("u", true), new dsmy("ut", true), new dsmy("i", true), new dsmy("a", true), new dsmy("b", true), new dsmy("b", false), new dsmy("c", false), new dsmy("t", false), new dsmy("nt0", false), new dsmy("v", true), new dsmy("q", false), new dsmy("fh", true), new dsmy("fv", true), new dsmy("fg", true), new dsmy("ci", true), new dsmy("rw", true), new dsmy("rwu", true), new dsmy("rwa", true), new dsmy("nw", true), new dsmy("rh", true), new dsmy("no", true), new dsmy("ns", true), new dsmy("k", false), new dsmy("p", false), new dsmy("l", false), new dsmy("v", false), new dsmy("nu", true), new dsmy("ft", true), new dsmy("cc", true), new dsmy("nd", true), new dsmy("ip", true), new dsmy("nc", true), new dsmy("a", false), new dsmy("rj", true), new dsmy("rp", true), new dsmy("rg", true), new dsmy("pd", true), new dsmy("pa", true), new dsmy("m", false), new dsmy("vb", false), new dsmy("vl", false), new dsmy("lf", true), new dsmy("mv", true), new dsmy("id", true), new dsmy("al", true), new dsmy("ic", false), new dsmy("pg", true), new dsmy("mo", true), new dsmy("iv", false), new dsmy("il", false), new dsmy("ba", false));
    }

    public static boolean e(String str) {
        return dsnn.a(str);
    }

    public static List<String> f(String str, boolean z) {
        dbsk.b(str != null, "options is null");
        ArrayList a2 = dchl.a();
        Iterator<String> it = c.g(str).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.isEmpty()) {
                String str2 = "";
                if (next.startsWith("O") || next.startsWith("J")) {
                    while (next.length() < 12) {
                        next = e.i(next, it.hasNext() ? it.next() : str2, new Object[0]);
                    }
                }
                if (next.equals("pi") || next.equals("ya") || next.equals("ro")) {
                    dbrz dbrzVar = e;
                    if (it.hasNext()) {
                        str2 = it.next();
                    }
                    next = dbrzVar.i(next, str2, new Object[0]);
                }
                if (!z || Character.isUpperCase(next.charAt(0))) {
                    a2.add(next);
                }
            }
        }
        return a2;
    }

    public static final String g(dsmz<T> dsmzVar) {
        ArrayList c2 = dchl.c(a.g(dsmzVar.a()));
        return c2.size() == 2 ? (String) c2.get(1) : "";
    }

    public static final String h(List<String> list) {
        if (list.size() == 4) {
            list.add("");
        } else if (list.size() == 5) {
            list.add(4, "");
        }
        return list.get(4);
    }

    static final List<String> i(dsmz<T> dsmzVar) {
        dbsk.s(dsmzVar);
        ArrayList c2 = dchl.c(b.g(dsmzVar.a()));
        return (c2.size() <= 0 || !((String) c2.get(0)).isEmpty()) ? c2 : c2.subList(1, c2.size());
    }

    public static final boolean j(List<String> list) {
        int size = list.size();
        return size > 0 && size <= 1 && !list.get(0).isEmpty();
    }

    public static final boolean k(List<String> list) {
        int size = list.size();
        if (size < 4) {
            return false;
        }
        return size == 4 ? !list.get(3).isEmpty() : size <= 6;
    }

    static String l(String str, String str2) {
        dbsk.b(str != null, "oldOptions is null");
        dbsk.b(str2 != null, "newOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        List<String> f2 = f(str, true);
        if (f2.isEmpty()) {
            return str2;
        }
        f2.addAll(f(str2, false));
        dbsk.b(true, "options is null");
        dbyv N = dbyv.N();
        ArrayList a2 = dchl.a();
        for (String str3 : f2) {
            dcdc<dsmy> dcdcVar = g;
            int size = dcdcVar.size();
            dsmy dsmyVar = null;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                dsmy dsmyVar2 = dcdcVar.get(i);
                if (str3.toLowerCase().startsWith(dsmyVar2.a)) {
                    if (!dsmyVar2.b) {
                        dsmyVar = dsmyVar2;
                    } else if (str3.length() == dsmyVar2.a.length()) {
                        dsmyVar = dsmyVar2;
                        break;
                    }
                }
                i++;
            }
            if (dsmyVar != null) {
                N.n(dsmyVar, str3);
            } else {
                a2.add(str3);
            }
        }
        ArrayList a3 = dchl.a();
        dcdc<dsmy> dcdcVar2 = g;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str4 = "";
            for (V v : N.c(dcdcVar2.get(i2))) {
                if (Character.isUpperCase(v.charAt(0))) {
                    a3.add(v);
                } else {
                    str4 = v;
                }
            }
            if (!str4.isEmpty()) {
                a3.add(str4);
            }
        }
        a3.addAll(a2);
        return e.g(a3);
    }

    public static final List<String> n(dsmz<T> dsmzVar) {
        if (dsmzVar.a() == null) {
            throw new dsmx("url path is null");
        }
        List<String> i = i(dsmzVar);
        if (i.isEmpty() || !"u".equals(i.get(0))) {
            if (!i.isEmpty() && "image".equals(i.get(0))) {
                i.remove(0);
            }
        } else {
            i.remove(1);
            i.remove(0);
        }
        if (i.size() == 2) {
            i.remove(0);
        }
        return i;
    }

    public final T m(dsnh dsnhVar, dsmz<T> dsmzVar) {
        boolean z = true;
        dbsk.b(true, "options is null");
        dbsk.b(dsmzVar != null, "url is null");
        List<String> n = n(dsmzVar);
        if (k(n)) {
            dbsk.b(true, "options is null");
            dbsk.b(dsmzVar != null, "url is null");
            dbsk.b(dsmzVar.a() != null, "url path is null");
            List<String> i = i(dsmzVar);
            if (i.size() <= 0 || !i.get(0).equals("image")) {
                z = false;
            } else {
                i.remove(0);
            }
            String l = l(h(i), dsnhVar.m());
            i.set(4, l);
            if (l.equals("") && i.size() > 5) {
                i.remove(4);
            }
            if (z) {
                i.add(0, "image");
            }
            String valueOf = String.valueOf(d.g(i));
            return dsmzVar.b(valueOf.length() != 0 ? "/".concat(valueOf) : new String("/")).c();
        } else if (j(n)) {
            dbsk.b(true, "options is null");
            dbsk.b(dsmzVar != null, "url is null");
            if (dsmzVar.a() == null) {
                z = false;
            }
            dbsk.b(z, "url path is null");
            ArrayList c2 = dchl.c(a.g(dsmzVar.a()));
            String l2 = l(g(dsmzVar), dsnhVar.m());
            String str = (String) c2.get(0);
            if (!l2.isEmpty()) {
                str = f.i(str, l2, new Object[0]);
            }
            return dsmzVar.b(str).c();
        } else {
            throw new dsmx(dsmzVar.toString());
        }
    }
}
