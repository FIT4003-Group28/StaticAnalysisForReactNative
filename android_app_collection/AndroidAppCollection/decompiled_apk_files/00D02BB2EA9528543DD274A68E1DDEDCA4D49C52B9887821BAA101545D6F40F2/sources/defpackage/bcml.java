package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bcml  reason: default package */
/* loaded from: classes3.dex */
public class bcml implements bclt {
    private static final jic a = new jic(null, ckqc.FIFE, 0);
    private final Context b;
    private final bcli c;
    private final bcku d;
    private final bclc e;
    private final String f;
    private boolean g;
    private final dspd h;
    private final dbsg<String> i;
    @dzsi
    private final ilo j;
    private final ckql k;
    private final int l;
    @dzsi
    private String m;
    private volatile jic n;
    private volatile bcls o;

    public bcml(bcli bcliVar, bcku bckuVar, bckr bckrVar, dweu dweuVar, @dzsi ilo iloVar, Activity activity, bcld bcldVar) {
        dweo dweoVar;
        dweo dweoVar2;
        dwet dwetVar;
        this.b = activity;
        this.c = bcliVar;
        this.d = bckuVar;
        bclc a2 = bcldVar.a(bckrVar);
        this.e = a2;
        this.f = dweuVar.g;
        this.m = dweuVar.i;
        int a3 = dwep.a(dweuVar.b);
        boolean z = a3 == 2;
        if (a3 == 0) {
            throw null;
        }
        this.g = z;
        this.h = dweuVar.d;
        this.j = iloVar;
        this.i = dbsg.i(dweuVar.f);
        ckql ckqlVar = new ckql();
        ckqlVar.f = true;
        ckqlVar.c = jmj.a(activity, R.styleable.AppCompatTheme_viewInflaterClass);
        ckqlVar.d = a2.a;
        this.k = ckqlVar;
        this.l = jmj.a(activity, 2);
        int a4 = dwep.a(dweuVar.b);
        int i = a4 - 1;
        if (a4 == 0) {
            throw null;
        }
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (dweuVar.b == 6) {
                dwetVar = (dwet) dweuVar.c;
            } else {
                dwetVar = dwet.e;
            }
            this.n = new jic(dwetVar.d, ckqc.FIFE, 0);
            return;
        }
        if (dweuVar.b == 5) {
            dweoVar = (dweo) dweuVar.c;
        } else {
            dweoVar = dweo.d;
        }
        if ((dweoVar.a & 1) == 0) {
            return;
        }
        if (dweuVar.b == 5) {
            dweoVar2 = (dweo) dweuVar.c;
        } else {
            dweoVar2 = dweo.d;
        }
        dwfl dwflVar = dweoVar2.b;
        this.n = D(dwflVar == null ? dwfl.w : dwflVar, ckqlVar);
    }

    private static jic D(@dzsi dwfl dwflVar, ckql ckqlVar) {
        return dwflVar == null ? a : new jic(dwflVar.h, jfv.b(dwflVar), null, 250, null, ckqlVar);
    }

    private static boolean E(double d, double d2, double d3) {
        return d >= d2 && d < d3;
    }

    @Override // defpackage.bclt
    public Integer A() {
        return this.e.a();
    }

    @Override // defpackage.bclt
    public Integer B() {
        return this.e.b();
    }

    @Override // defpackage.bclt
    public cqtv C() {
        return cqrp.c(Integer.valueOf(this.e.b).intValue());
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.abpx
    public String b() {
        return this.f;
    }

    @Override // defpackage.abpx
    public jic c() {
        return this.n == null ? a : this.n;
    }

    @Override // defpackage.abpx
    public cqkl d(cjqm cjqmVar) {
        if (this.o != null) {
            this.o.c(k());
        }
        return cqkl.a;
    }

    @Override // defpackage.abpx
    public cjtd e() {
        return this.d.a(this.j, this.i);
    }

    @Override // defpackage.bclt
    public void f(dwfl dwflVar) {
        this.n = D(dwflVar, this.k);
    }

    @Override // defpackage.bclt
    public void g(boolean z) {
        this.g = false;
    }

    @Override // defpackage.bclt
    public void h(String str) {
        this.m = str;
    }

    @Override // defpackage.bclt
    public void i(bcls bclsVar) {
        this.o = bclsVar;
    }

    @Override // defpackage.bclt
    public Boolean j() {
        return Boolean.valueOf(this.c.a(k()));
    }

    @Override // defpackage.bclt
    public dspd k() {
        return this.h;
    }

    @Override // defpackage.bclt
    public CharSequence l() {
        String str;
        if (s().booleanValue()) {
            String str2 = this.f;
            String t = t();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(t).length());
            sb.append(str2);
            sb.append("; ");
            sb.append(t);
            str = sb.toString();
        } else {
            str = this.f;
        }
        if (j().booleanValue()) {
            return this.d.c(str);
        }
        return this.d.d(str);
    }

    @Override // defpackage.bclt
    public Boolean m() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bclt
    public cqss n() {
        double c = this.e.c();
        if (E(c, dcyn.a, 0.2d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.google_transparent);
        }
        if (E(c, 0.2d, 0.35d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.google_grey800);
        }
        if (E(c, 0.35d, 0.5d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.google_grey700);
        }
        return cqrt.c(com.google.android.apps.maps.R.color.google_white);
    }

    @Override // defpackage.bclt
    public cqss o() {
        if (E(this.e.c(), dcyn.a, 0.5d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.google_white);
        }
        return cqrt.c(com.google.android.apps.maps.R.color.google_transparent);
    }

    @Override // defpackage.bclt
    public cqss p() {
        if (E(this.e.c(), dcyn.a, 0.2d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.google_transparent);
        }
        return cqrt.c(com.google.android.apps.maps.R.color.mod_daynight_grey700);
    }

    @Override // defpackage.bclt
    public cqss q() {
        if (E(this.e.c(), dcyn.a, 0.5d)) {
            return cqrt.c(com.google.android.apps.maps.R.color.mod_daynight_grey700);
        }
        return cqrt.c(com.google.android.apps.maps.R.color.google_transparent);
    }

    @Override // defpackage.bclt
    public Boolean r() {
        if (E(this.e.c(), dcyn.a, 0.5d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bclt
    public Boolean s() {
        return Boolean.valueOf(!dbsj.d(this.m));
    }

    @Override // defpackage.bclt
    public String t() {
        return dbsj.e(this.m);
    }

    @Override // defpackage.bclt
    public Integer u() {
        bclc bclcVar = this.e;
        double d = bclcVar.f;
        double d2 = bclcVar.g;
        double c = bclcVar.c();
        Double.isNaN(d2);
        Double.isNaN(d);
        return Integer.valueOf((int) (d + (d2 * c)));
    }

    @Override // defpackage.bclt
    public Integer v() {
        bclc bclcVar = this.e;
        double d = bclcVar.h;
        double d2 = bclcVar.i;
        double c = bclcVar.c();
        Double.isNaN(d2);
        Double.isNaN(d);
        return Integer.valueOf((int) (d + (d2 * c)));
    }

    @Override // defpackage.bclt
    public Integer w() {
        return Integer.valueOf(this.e.a().intValue() + this.l);
    }

    @Override // defpackage.bclt
    public Integer x() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.bclt
    public Integer y() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.bclt
    public Integer z() {
        return Integer.valueOf(this.e.b().intValue() + this.l);
    }
}
