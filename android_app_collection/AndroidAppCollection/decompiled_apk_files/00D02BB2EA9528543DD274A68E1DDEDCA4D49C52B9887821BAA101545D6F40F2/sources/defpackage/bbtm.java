package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: bbtm  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbtm implements Serializable {
    public static bbtl v(String str) {
        return w(Uri.parse(str));
    }

    public static bbtl w(Uri uri) {
        String uri2 = uri.toString();
        bbse bbseVar = new bbse();
        bbseVar.b("");
        bbseVar.r(dddn.UNKNOWN);
        bbseVar.m(dcmr.a);
        bbseVar.s(crtx.UNKNOWN);
        if (uri2 != null) {
            bbseVar.c = uri2;
            bbseVar.h(uri2);
            bbseVar.b = "content".equals(uri.getScheme()) ? dbsg.i(uri2) : dbpy.a;
            return bbseVar;
        }
        throw new NullPointerException("Null originalUriString");
    }

    public static bbtm x(Uri uri) {
        return w(uri).a();
    }

    public static bbtm y(String str) {
        return v(str).a();
    }

    public final String A() {
        return l().c(s());
    }

    @dzsi
    public final dfxs B() {
        return (dfxs) bvrt.f(t(), (dssr) dfxs.h.cu(7), dfxs.h);
    }

    public final dbsg<Integer> C() {
        if (!i().a()) {
            return dbpy.a;
        }
        int intValue = i().b().intValue();
        if (intValue != 0) {
            if (intValue != 90) {
                if (intValue != 180) {
                    if (intValue != 270) {
                        return dbpy.a;
                    }
                }
            }
            return h();
        }
        return g();
    }

    public final dbsg<Integer> D() {
        if (!i().a()) {
            return dbpy.a;
        }
        int intValue = i().b().intValue();
        if (intValue != 0) {
            if (intValue != 90) {
                if (intValue != 180) {
                    if (intValue != 270) {
                        return dbpy.a;
                    }
                }
            }
            return g();
        }
        return h();
    }

    public final dbsg<Float> E() {
        int intValue = C().c(0).intValue();
        int intValue2 = D().c(0).intValue();
        if (intValue == 0 || intValue2 == 0) {
            return dbpy.a;
        }
        return dbsg.i(Float.valueOf(intValue / intValue2));
    }

    public final bbtm F(String str) {
        if (str.equals(e())) {
            return this;
        }
        EnumSet noneOf = EnumSet.noneOf(dwye.class);
        noneOf.addAll(f());
        if (str.isEmpty()) {
            noneOf.remove(dwye.CAPTION);
        } else {
            noneOf.add(dwye.CAPTION);
        }
        bbtl u = u();
        u.b(str);
        u.m(noneOf);
        return u.a();
    }

    public final bbtm G(Uri uri) {
        dbsg<String> dbsgVar;
        if (uri.equals(z())) {
            return this;
        }
        EnumSet noneOf = EnumSet.noneOf(dwye.class);
        noneOf.addAll(f());
        noneOf.add(dwye.EDIT);
        String uri2 = uri.toString();
        boolean equals = "content".equals(uri.getScheme());
        bbtl u = u();
        u.m(noneOf);
        u.e(dbpy.a);
        u.h(uri2);
        if (equals) {
            dbsgVar = dbsg.i(uri2);
        } else {
            dbsgVar = dbpy.a;
        }
        u.j(dbsgVar);
        return u.a();
    }

    public abstract String a();

    @dzsi
    public abstract Long b();

    @dzsi
    public abstract Long c();

    public abstract dddn d();

    public abstract String e();

    public abstract dcep<dwye> f();

    public abstract dbsg<Integer> g();

    public abstract dbsg<Integer> h();

    public abstract dbsg<Integer> i();

    public abstract dbsg<Long> j();

    @dzsi
    public abstract dspd k();

    public abstract dbsg<String> l();

    public abstract crtx m();

    public abstract dbsg<bbti> n();

    public abstract dbsg<akqq> o();

    public abstract dbsg<String> p();

    public abstract dbsg<String> q();

    public abstract dbsg<String> r();

    public abstract String s();

    @dzsi
    public abstract bvrt<dfxs> t();

    public abstract bbtl u();

    public final Uri z() {
        return Uri.parse(a());
    }
}
