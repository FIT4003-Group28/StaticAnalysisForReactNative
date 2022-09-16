package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
/* compiled from: PG */
/* renamed from: xjz  reason: default package */
/* loaded from: classes7.dex */
public final class xjz {
    public static final xjy a;
    public static final xjy b;
    public static final xjy c;
    private static final String d;
    private static final String e;

    static {
        String property = System.getProperty("line.separator", "\n");
        d = property;
        StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 3 + String.valueOf(property).length());
        sb.append(property);
        sb.append("{0}");
        sb.append(property);
        e = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(property).length() + 3 + String.valueOf(property).length());
        sb2.append(property);
        sb2.append("%'s");
        sb2.append(property);
        sb2.toString();
        a = new xjr();
        b = new xjs();
        c = new xjt();
    }

    public static float a(boolean z) {
        return z ? 1.5f : 1.1666666f;
    }

    @dzsi
    @Deprecated
    public static CharSequence b(@dzsi eapr eaprVar) {
        cqjb b2 = cqne.b(eaprVar);
        String str = new String();
        cqny.e(str, new xju(b2));
        return str;
    }

    @dzsi
    @Deprecated
    public static CharSequence c(@dzsi eapr eaprVar) {
        cqjb b2 = cqne.b(eaprVar);
        String str = new String();
        cqny.e(str, new xjv(b2));
        return str;
    }

    public static <T extends cqkp> cqjb<T, CharSequence> d(final cqlc<T, eapr> cqlcVar) {
        return new cqjb(cqlcVar) { // from class: xjj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar2 = this.a;
                xjy xjyVar = xjz.a;
                eapr eaprVar = (eapr) cqlcVar2.a(cqkpVar);
                if (eaprVar == null) {
                    return null;
                }
                return xjz.s(context, eaprVar, true);
            }
        };
    }

    public static <T extends cqkp> cqjb<T, CharSequence> e(final cqlc<T, eapq> cqlcVar) {
        return new cqjb(cqlcVar) { // from class: xjk
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                eapq eapqVar = (eapq) this.a.a(cqkpVar);
                if (eapqVar == null) {
                    return null;
                }
                bvsx bvsxVar = new bvsx(context.getResources());
                int f = (int) eapqVar.h().f();
                bvsv a2 = bvsxVar.a(context.getResources().getQuantityString(R.plurals.TRANSIT_FREQUENCY_DEPARTURE_MINUTES, f, Integer.valueOf(f)));
                a2.o(1.5f);
                a2.i();
                bvsu b2 = bvsxVar.b(xjz.r(context));
                b2.a(a2);
                return b2.c();
            }
        };
    }

    @dzsi
    public static xjy f(eapq eapqVar) {
        int v = v(eapqVar) - 1;
        if (v != 0) {
            if (v == 1) {
                return b;
            }
            if (v == 2) {
                return c;
            }
            return null;
        }
        return a;
    }

    @dzsi
    @Deprecated
    public static CharSequence g(@dzsi eapq eapqVar) {
        cqjb b2 = cqne.b(eapqVar);
        String str = new String();
        cqny.e(str, new xjw(b2));
        return str;
    }

    @dzsi
    @Deprecated
    public static CharSequence h(@dzsi eapq eapqVar) {
        cqjb b2 = cqne.b(eapqVar);
        String str = new String();
        cqny.e(str, new xjx(b2));
        return str;
    }

    @dzsi
    @Deprecated
    public static CharSequence i(@dzsi eapr eaprVar) {
        cqjb b2 = cqne.b(eaprVar);
        String str = new String();
        cqny.e(str, new xjn(b2));
        return str;
    }

    @dzsi
    @Deprecated
    public static CharSequence j(@dzsi eapr eaprVar) {
        cqjb b2 = cqne.b(eaprVar);
        String str = new String();
        cqny.e(str, new xjo(b2));
        return str;
    }

    @dzsi
    @Deprecated
    public static CharSequence k(@dzsi eapq eapqVar) {
        cqjb b2 = cqne.b(eapqVar);
        String str = new String();
        cqny.e(str, new xjp(b2));
        return str;
    }

    @Deprecated
    public static Integer l(@dzsi eapq eapqVar) {
        cqjb b2 = cqne.b(eapqVar);
        Integer num = new Integer(0);
        cqny.e(num, new xjq(b2));
        return num;
    }

    public static int m(Context context, eapq eapqVar) {
        String a2;
        int indexOf;
        xjy f = f(eapqVar);
        if (f == null || (indexOf = (a2 = f.a(context, (int) eapqVar.h().f())).indexOf("{0}")) == -1) {
            return 0;
        }
        return dbrb.n('\n').r(a2.substring(0, indexOf));
    }

    public static String n(Context context) {
        return ((SimpleDateFormat) DateFormat.getTimeFormat(context)).toPattern();
    }

    @Deprecated
    public static Integer o() {
        Integer num = new Integer(0);
        cqny.e(num, xjl.a);
        return num;
    }

    public static int p(Context context) {
        String n = n(context);
        int indexOf = n.indexOf(97);
        return (indexOf == -1 || indexOf == n.length() + (-1)) ? 0 : 1;
    }

    @Deprecated
    public static Integer q() {
        Integer num = new Integer(0);
        cqny.e(num, xjm.a);
        return num;
    }

    public static String r(Context context) {
        return context.getResources().getString(R.string.TRANSIT_FREQUENCY_DEPARTURE_STACK, "{0}");
    }

    public static CharSequence s(Context context, eapr eaprVar, boolean z) {
        return t(context, eaprVar, true != z ? 1.1666666f : 1.5f);
    }

    public static CharSequence t(Context context, eapr eaprVar, float f) {
        xjb.a();
        String n = n(context);
        bvsx bvsxVar = new bvsx(context.getResources());
        if (!n.contains("a")) {
            bvsv a2 = bvsxVar.a(u(eaprVar, n));
            a2.i();
            a2.o(f);
            return a2.c();
        }
        String u = u(eaprVar, n.replaceFirst("\\s*a\\s*", e).trim());
        String u2 = u(eaprVar, "a");
        bvsu b2 = bvsxVar.b(u);
        bvsw bvswVar = new bvsw();
        bvswVar.c();
        b2.b(bvswVar);
        bvsv a3 = bvsxVar.a(u2);
        a3.o(1.0f / f);
        b2.a(a3);
        b2.o(f);
        return b2.c();
    }

    static String u(eapr eaprVar, String str) {
        eatp b2 = eato.b(str);
        if (eaprVar instanceof eaol) {
            b2 = b2.d(eaprVar.v());
        }
        return b2.g(eaprVar.Tf());
    }

    public static int v(eapq eapqVar) {
        long f = eapqVar.h().f();
        if (f < -59 || f > -1) {
            if (f == 0) {
                return 2;
            }
            return (f < 1 || f > 59) ? 4 : 3;
        }
        return 1;
    }

    public static <T extends cqkp> cqjb<T, CharSequence> w(final cqlc<T, eapr> cqlcVar) {
        return new cqjb(cqlcVar) { // from class: xji
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar2 = this.a;
                xjy xjyVar = xjz.a;
                eapr eaprVar = (eapr) cqlcVar2.a(cqkpVar);
                if (eaprVar == null) {
                    return null;
                }
                return xjz.t(context, eaprVar, 1.8461539f);
            }
        };
    }
}
