package defpackage;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afhi  reason: default package */
/* loaded from: classes2.dex */
public final class afhi {
    private static final dcdc<String> a = dcdc.g(",", " ");
    private static final dcdn<String, Integer> b = dcdn.l("N", 1, "S", -1);
    private static final dcdn<String, Integer> c = dcdn.l("E", 1, "W", -1);

    @dzsi
    public static akqq a(UrlQuerySanitizer urlQuerySanitizer, String str) {
        int i;
        String value = urlQuerySanitizer.getValue(str);
        if (value == null) {
            return null;
        }
        int indexOf = value.indexOf(64);
        if (indexOf >= 0 && value.length() > (i = indexOf + 1)) {
            value = value.substring(i);
        }
        return b(value);
    }

    @dzsi
    public static akqq b(@dzsi String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("loc:")) {
            trim = dbrb.o("()").h(trim.substring(4));
        }
        try {
            dcpe<String> listIterator = a.listIterator();
            int i = -1;
            while (listIterator.hasNext() && (i = trim.indexOf(listIterator.next())) <= 0) {
            }
            if (i > 0 && i != trim.length() - 1) {
                String substring = trim.substring(0, i);
                String substring2 = trim.substring(i + 1);
                dcdn<String, Integer> dcdnVar = b;
                String x = x(substring, dcdnVar);
                if (x != null) {
                    substring = substring.substring(0, substring.length() - 1);
                }
                dcdn<String, Integer> dcdnVar2 = c;
                String x2 = x(substring2, dcdnVar2);
                if (x2 != null) {
                    substring2 = substring2.substring(0, substring2.length() - 1);
                }
                if (substring.equals("0") && substring2.equals("0")) {
                    return null;
                }
                int V = akra.V(substring);
                int V2 = akra.V(substring2);
                if (x != null) {
                    V *= dcdnVar.get(x).intValue();
                }
                if (x2 != null) {
                    V2 *= dcdnVar2.get(x2).intValue();
                }
                return akqq.c(V, V2);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @dzsi
    public static Boolean c(UrlQuerySanitizer urlQuerySanitizer, String str) {
        String value = urlQuerySanitizer.getValue(str);
        if (value == null) {
            return null;
        }
        return Boolean.valueOf(value.equals("1"));
    }

    public static amvh[] d(amvh[] amvhVarArr, String[] strArr) {
        amvh[] amvhVarArr2 = new amvh[amvhVarArr.length];
        for (int i = 0; i < amvhVarArr.length; i++) {
            amvg amvgVar = new amvg(amvhVarArr[i]);
            if (i < strArr.length) {
                e(strArr[i], amvgVar);
            }
            amvhVarArr2[i] = amvgVar.a();
        }
        return amvhVarArr2;
    }

    public static void e(String str, amvg amvgVar) {
        try {
            dtbs dtbsVar = (dtbs) dsqw.cq(dtbs.g, ddae.e.j(str));
            int i = dtbsVar.a;
            if ((i & 2) != 0 && (i & 4) != 0) {
                amvgVar.d = akqq.c(dtbsVar.b, dtbsVar.c);
            }
            int i2 = dtbsVar.a;
            if ((i2 & 16) != 0 && (i2 & 32) != 0) {
                amvgVar.c = new akqi(dtbsVar.e, dtbsVar.f);
            } else if ((i2 & 8) == 0) {
            } else {
                amvgVar.c = new akqi(dtbsVar.d);
            }
        } catch (dsrm | IllegalArgumentException unused) {
        }
    }

    @dzsi
    public static afhh f(String str) {
        String str2;
        String str3;
        String str4;
        if (dbsj.d(str)) {
            return null;
        }
        if (str.indexOf(40) >= 0 && str.indexOf(41) >= 0) {
            int indexOf = str.indexOf(40);
            int lastIndexOf = str.lastIndexOf(41);
            if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                str3 = str;
                str4 = null;
            } else {
                str4 = str.substring(indexOf + 1, lastIndexOf).trim();
                str3 = str.substring(0, indexOf);
            }
            akqq b2 = b(str3);
            afhh afhhVar = b2 == null ? null : new afhh(str4, b2);
            if (afhhVar != null) {
                return afhhVar;
            }
        }
        int indexOf2 = str.indexOf(64);
        if (indexOf2 != -1) {
            str2 = indexOf2 == 0 ? null : str.substring(0, indexOf2).trim();
            str = str.substring(indexOf2 + 1);
        } else {
            str2 = null;
        }
        akqq b3 = b(str);
        if (b3 != null) {
            return new afhh(str2, b3);
        }
        return null;
    }

    @dzsi
    public static afht g(@dzsi String str) {
        char[] charArray;
        if (str == null) {
            return null;
        }
        HashSet c2 = dcnm.c();
        dqvj dqvjVar = null;
        boolean z = false;
        for (char c3 : str.toCharArray()) {
            if (c3 == 'b') {
                dqvjVar = dqvj.BICYCLE;
            } else if (c3 == 'd') {
                dqvjVar = dqvj.DRIVE;
            } else if (c3 == 'f') {
                c2.add(afhq.AVOID_FERRIES);
            } else if (c3 == 'l') {
                dqvjVar = dqvj.TWO_WHEELER;
            } else if (c3 == 'r') {
                dqvjVar = dqvj.TRANSIT;
            } else if (c3 == 't') {
                c2.add(afhq.AVOID_TOLLS);
            } else if (c3 == 'h') {
                c2.add(afhq.AVOID_HIGHWAYS);
            } else if (c3 == 'i') {
                z = true;
            } else if (c3 == 'w') {
                dqvjVar = dqvj.WALK;
            } else if (c3 == 'x') {
                dqvjVar = dqvj.TAXI;
            }
        }
        if (dqvjVar != null) {
            return new afht(dqvjVar, z, c2);
        }
        return null;
    }

    public static String h(@dzsi dqvj dqvjVar) {
        if (dqvjVar == null) {
            return null;
        }
        int ordinal = dqvjVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 7 ? "d" : "x" : "r" : "w" : "b";
    }

    public static String i(@dzsi dqvj dqvjVar) {
        if (dqvjVar == null) {
            return null;
        }
        int ordinal = dqvjVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ordinal != 7 ? "d" : "x" : "l" : "r" : "w" : "b";
    }

    public static String[] j(UrlQuerySanitizer urlQuerySanitizer, String str, String str2) {
        String value = urlQuerySanitizer.getValue(str);
        if (value == null) {
            return null;
        }
        return value.split(Pattern.quote(str2), -1);
    }

    @dzsi
    public static akqi k(UrlQuerySanitizer urlQuerySanitizer, String str) {
        String value = urlQuerySanitizer.getValue(str);
        if (dbsj.d(value) || ",".equals(value.substring(value.length() - 1))) {
            return null;
        }
        String[] split = value.split(",");
        try {
            return akqi.b(split[split.length - 1]);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String l(akqi akqiVar) {
        dtbr bZ = dtbs.g.bZ();
        long j = akqiVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbs dtbsVar = (dtbs) bZ.b;
        int i = dtbsVar.a | 16;
        dtbsVar.a = i;
        dtbsVar.e = j;
        long j2 = akqiVar.c;
        dtbsVar.a = i | 32;
        dtbsVar.f = j2;
        return ddae.e.i(bZ.bK().bS());
    }

    @dzsi
    public static akqq m(UrlQuerySanitizer urlQuerySanitizer, String str) {
        String value = urlQuerySanitizer.getValue(str);
        if (dbsj.d(value)) {
            return null;
        }
        return b(value);
    }

    public static boolean n(afia afiaVar) {
        return ddjr.GSA_OFFLINE_SEARCH.equals(afiaVar.x);
    }

    public static dwxv o(@dzsi String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (dwxv) dsqw.cq(dwxv.e, Base64.decode(str, 11));
            } catch (dsrm unused) {
                return dwxv.e;
            } catch (IllegalArgumentException unused2) {
                return dwxv.e;
            }
        }
        return dwxv.e;
    }

    @dzsi
    public static afht p(UrlQuerySanitizer urlQuerySanitizer) {
        char[] charArray;
        String value = urlQuerySanitizer.getValue("dirflg");
        if (value != null) {
            HashSet c2 = dcnm.c();
            dqvj dqvjVar = null;
            boolean z = false;
            for (char c3 : value.toCharArray()) {
                if (c3 == 'b') {
                    dqvjVar = dqvj.BICYCLE;
                } else if (c3 == 'd') {
                    dqvjVar = dqvj.DRIVE;
                } else if (c3 == 'f') {
                    c2.add(afhq.AVOID_FERRIES);
                } else if (c3 == 'r') {
                    dqvjVar = dqvj.TRANSIT;
                } else if (c3 == 't') {
                    c2.add(afhq.AVOID_TOLLS);
                } else if (c3 == 'h') {
                    c2.add(afhq.AVOID_HIGHWAYS);
                } else if (c3 == 'i') {
                    z = true;
                } else if (c3 == 'w') {
                    dqvjVar = dqvj.WALK;
                } else if (c3 == 'x') {
                    dqvjVar = dqvj.TAXI;
                }
            }
            if (dqvjVar != null) {
                return new afht(dqvjVar, z, c2);
            }
        }
        return null;
    }

    @dzsi
    public static ddjr q(UrlQuerySanitizer urlQuerySanitizer) {
        return afhw.a(urlQuerySanitizer.getValue("entry"));
    }

    @dzsi
    public static Float r(UrlQuerySanitizer urlQuerySanitizer) {
        String value = urlQuerySanitizer.getValue("z");
        if (value == null) {
            return null;
        }
        try {
            return Float.valueOf(Math.max(Math.min(Float.parseFloat(value), 22.0f), 1.0f));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static afie s(UrlQuerySanitizer urlQuerySanitizer) {
        String value = urlQuerySanitizer.getValue("myl");
        if (dbsj.d(value)) {
            return afie.NONE;
        }
        String lowerCase = value.trim().toLowerCase(Locale.US);
        if ("saddr".equals(lowerCase)) {
            return afie.SOURCE;
        }
        if ("daddr".equals(lowerCase)) {
            return afie.DESTINATION;
        }
        return afie.NONE;
    }

    @dzsi
    public static amvh t(UrlQuerySanitizer urlQuerySanitizer, String str) {
        String value = urlQuerySanitizer.getValue("saddr");
        if (dbsj.d(value)) {
            return null;
        }
        amvg amvgVar = new amvg(y(value));
        if (str != null) {
            e(str, amvgVar);
        }
        return amvgVar.a();
    }

    public static amvh[] u(UrlQuerySanitizer urlQuerySanitizer) {
        String value = urlQuerySanitizer.getValue("daddr");
        if (dbsj.d(value)) {
            return new amvh[0];
        }
        String[] split = value.split(Pattern.quote(" to:"), 0);
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(y(str));
        }
        return (amvh[]) arrayList.toArray(new amvh[arrayList.size()]);
    }

    public static UserOrientation v(UrlQuerySanitizer urlQuerySanitizer) {
        String[] j = j(urlQuerySanitizer, "cbp", ",");
        if (j == null || j.length != 5) {
            return new UserOrientation();
        }
        try {
            float f = 0.0f;
            float parseFloat = dbsj.d(j[1]) ? 0.0f : Float.parseFloat(j[1]);
            float f2 = -Math.min(90.0f, Math.max(-90.0f, dbsj.d(j[4]) ? 0.0f : Float.parseFloat(j[4])));
            if (!dbsj.d(j[3])) {
                f = Float.parseFloat(j[3]);
            }
            return new UserOrientation(parseFloat, f2, 90.0f / ((float) Math.pow(2.0d, f)));
        } catch (NumberFormatException unused) {
            return new UserOrientation();
        }
    }

    @dzsi
    public static dgge w(UrlQuerySanitizer urlQuerySanitizer) {
        if (!urlQuerySanitizer.hasParameter("panofe")) {
            return null;
        }
        try {
            return dgge.b(Integer.parseInt(urlQuerySanitizer.getValue("panofe")));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dzsi
    private static String x(String str, Map<String, Integer> map) {
        String upperCase = str.substring(str.length() - 1).toUpperCase(Locale.ENGLISH);
        if (((dcdn) map).keySet().contains(upperCase)) {
            return upperCase;
        }
        return null;
    }

    private static amvh y(String str) {
        amvg amvgVar = new amvg();
        afhh f = f(str);
        if (f == null) {
            amvgVar.b = str;
            amvgVar.j = str;
            amvgVar.k = false;
        } else {
            String str2 = f.a;
            if (str2 != null) {
                amvgVar.j = str2;
            }
            amvgVar.k = false;
            amvgVar.d = f.b;
        }
        return amvgVar.a();
    }
}
