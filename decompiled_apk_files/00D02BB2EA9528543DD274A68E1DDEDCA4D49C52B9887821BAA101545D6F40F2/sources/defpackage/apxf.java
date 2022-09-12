package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: apxf  reason: default package */
/* loaded from: classes2.dex */
public final class apxf extends itb {
    static {
        dccx F = dcdc.F();
        cuhf g = cuhg.g();
        g.e("Raw text without formatting");
        F.g(g.a());
        dccx F2 = dcdc.F();
        for (int i = 1; i < cuhp.values().length; i++) {
            cuhp cuhpVar = cuhp.values()[i];
            cuhf g2 = cuhg.g();
            String valueOf = String.valueOf(cuhpVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Predefined style - ");
            sb.append(valueOf);
            g2.e(sb.toString());
            g2.d(cuhpVar);
            F2.g(g2.a());
        }
        F.i(F2.f());
        dccx F3 = dcdc.F();
        cuhf g3 = cuhg.g();
        g3.e("Line style - Indentation");
        g3.c(dcdc.f(cube.a(12)));
        F3.g(g3.a());
        cuhf g4 = cuhg.g();
        g4.e("Line style - Bullet");
        g4.c(dcdc.f(cuba.a));
        F3.g(g4.a());
        cuhf g5 = cuhg.g();
        g5.e("Line style - Indentation + Bullet");
        g5.c(dcdc.g(cuba.a, cube.a(12)));
        F3.g(g5.a());
        F.i(F3.f());
        dccx F4 = dcdc.F();
        F4.g(e(cuhq.p(), "bold"));
        F4.g(e(cuhq.q(), "italic"));
        F4.g(e(cuhq.r(), "underline"));
        F4.g(e(cuhq.s(), "strikethrough"));
        F4.g(e(cuhq.t(), "superscript"));
        F4.g(e(cuhq.u(), "subscript"));
        F4.g(e(cubt.a(Color.parseColor("#55ff0000")), "color #55ff0000"));
        F4.g(e(cubt.b(Color.parseColor("#123456")), "background color #123456"));
        F4.g(e(cubt.c(20), "font size 20"));
        F4.g(f(cuhu.PLATFORM_DEFAULT_LIGHT, cuhu.PLATFORM_DEFAULT_BOLD));
        F4.g(f(cuhu.GOOGLE_SANS_BOLD, cuhu.GOOGLE_SANS_REGULAR));
        F.i(F4.f());
        dcdc<cuhg> f = F.f();
        cuhe c = cuhv.c();
        c.b(f);
        cuhv a = c.a();
        cuhf g6 = cuhg.g();
        g6.e("Indented red italic underlined caption text");
        g6.d(cuhp.CAPTION_TEXT);
        g6.c(dcdc.f(cube.a(30)));
        cuhh e = cuhi.e();
        e.c(9);
        e.b(31);
        e.d(dcdc.g(cubt.a(-65536), cuhq.r()));
        cuhi a2 = e.a();
        cuhh e2 = cuhi.e();
        e2.c(13);
        e2.b(20);
        e2.d(dcdc.f(cuhq.q()));
        g6.b(dcdc.g(a2, e2.a()));
        cuhg a3 = g6.a();
        cuhf g7 = cuhg.g();
        g7.e("Roboto Medium size 20 bold subtitle");
        g7.d(cuhp.SUBTITLE);
        cuhh e3 = cuhi.e();
        e3.c(14);
        e3.b(21);
        e3.d(dcdc.f(cubt.c(20)));
        cuhi a4 = e3.a();
        cuhh e4 = cuhi.e();
        e4.c(22);
        e4.b(26);
        e4.d(dcdc.f(cuhq.p()));
        cuhi a5 = e4.a();
        cuhh e5 = cuhi.e();
        e5.c(0);
        e5.b(26);
        e5.d(dcdc.f(cubt.d(dcdc.f(cuhu.PLATFORM_DEFAULT_MEDIUM))));
        g7.b(dcdc.h(a4, a5, e5.a()));
        cuhg a6 = g7.a();
        cuhf g8 = cuhg.g();
        g8.e("Bullet with colors");
        g8.c(dcdc.f(cuba.a));
        cuhh e6 = cuhi.e();
        e6.c(7);
        e6.b(18);
        e6.d(dcdc.f(cubt.b(-7829368)));
        cuhi a7 = e6.a();
        cuhh e7 = cuhi.e();
        e7.c(12);
        e7.b(18);
        e7.d(dcdc.f(cubt.a(-16776961)));
        g8.b(dcdc.g(a7, e7.a()));
        cuhg a8 = g8.a();
        cuhe c2 = cuhv.c();
        c2.b(dcdc.h(a3, a6, a8));
        cuhv a9 = c2.a();
        cuhf g9 = cuhg.g();
        g9.e("Quote request");
        cuhh e8 = cuhi.e();
        e8.c(0);
        e8.b(13);
        e8.d(dcdc.g(cuhq.p(), cubt.c(14)));
        g9.b(dcdc.f(e8.a()));
        cuhg a10 = g9.a();
        cuhf g10 = cuhg.g();
        g10.e("");
        cuhg a11 = g10.a();
        cuhe c3 = cuhv.c();
        c3.b(dcdc.i(a10, a11, i("Zip code:", "94043"), i("Project details:", "Prefer service on the weekends")));
        dcdn.m("Basic (individual styles)", a, "Advanced (combined styles)", a9, "Example: quote request", c3.a());
    }

    private static cuhg f(cuhu... cuhuVarArr) {
        cuhq d = cubt.d(dcdc.t(cuhuVarArr));
        String valueOf = String.valueOf(cuhuVarArr[0]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("typeface ");
        sb.append(valueOf);
        return e(d, sb.toString());
    }

    private static cuhg i(String str, String str2) {
        String format = String.format("%s %s", str, str2);
        cuhf g = cuhg.g();
        g.e(format);
        cuhh e = cuhi.e();
        e.c(0);
        e.b(format.length());
        e.d(dcdc.f(cubt.c(12)));
        cuhi a = e.a();
        cuhh e2 = cuhi.e();
        e2.c(0);
        e2.b(str.length());
        e2.d(dcdc.f(cuhq.p()));
        g.b(dcdc.g(a, e2.a()));
        return g.a();
    }

    private static cuhg e(cuhq cuhqVar, String str) {
        cuhf g = cuhg.g();
        String valueOf = String.valueOf(str);
        g.e(valueOf.length() != 0 ? "Text style - ".concat(valueOf) : new String("Text style - "));
        cuhh e = cuhi.e();
        e.c(5);
        e.b(10);
        e.d(dcdc.f(cuhqVar));
        g.b(dcdc.f(e.a()));
        return g.a();
    }
}
