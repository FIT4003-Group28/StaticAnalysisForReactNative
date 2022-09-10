package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: acrg  reason: default package */
/* loaded from: classes2.dex */
public class acrg implements acqw {
    public static final int a;
    public static final int b;
    private static final dcdn<dpol, Integer> q;
    public final Activity c;
    public final cqkf<acqx> d;
    public final acrm e;
    public final dvvq f;
    @dzsi
    public final Integer g;
    public final String h;
    @dzsi
    public final dvvs i;
    acrt j;
    @dzsi
    public Integer l;
    @dzsi
    public Integer o;
    private final int r;
    @dzsi
    private cpub<cpvm, Double> s;
    @dzsi
    private cptt<cpvm, Double> t;
    @dzsi
    public cpph<cpvm, Double> k = null;
    public boolean m = true;
    public final acqv n = new acrb(this);
    cpst<cpvm, Double> p = new acrc(this);

    static {
        dcdg p = dcdn.p();
        p.f(dpol.MONDAY, Integer.valueOf((int) R.string.BUSYNESS_MONDAYS));
        p.f(dpol.TUESDAY, Integer.valueOf((int) R.string.BUSYNESS_TUESDAYS));
        p.f(dpol.WEDNESDAY, Integer.valueOf((int) R.string.BUSYNESS_WEDNESDAYS));
        p.f(dpol.THURSDAY, Integer.valueOf((int) R.string.BUSYNESS_THURSDAYS));
        p.f(dpol.FRIDAY, Integer.valueOf((int) R.string.BUSYNESS_FRIDAYS));
        p.f(dpol.SATURDAY, Integer.valueOf((int) R.string.BUSYNESS_SATURDAYS));
        p.f(dpol.SUNDAY, Integer.valueOf((int) R.string.BUSYNESS_SUNDAYS));
        q = p.b();
        a = R.color.qu_daynight_google_blue_300;
        b = R.color.qu_daynight_google_blue_500;
    }

    public acrg(cqkj cqkjVar, cqhn cqhnVar, Activity activity, dvvq dvvqVar, @dzsi Integer num, String str, @dzsi dvvs dvvsVar) {
        Integer num2 = null;
        this.o = null;
        this.c = activity;
        this.f = dvvqVar;
        this.g = num;
        this.r = acpe.a(activity, 3);
        this.h = str;
        this.i = dvvsVar;
        this.l = dvvsVar != null ? Integer.valueOf(dvvsVar.b) : num2;
        this.j = new acrt(activity.getResources());
        cqkf<acqx> e = cqkjVar.e(new acpv());
        this.d = e;
        acrm acrmVar = new acrm(activity);
        this.e = acrmVar;
        e.e(acrmVar);
        Integer num3 = this.l;
        if (num3 != null) {
            this.o = num3;
        } else if (num == null) {
        } else {
            this.o = num;
        }
    }

    private final void j(Integer[] numArr) {
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i].intValue() < numArr[i - 1].intValue()) {
                Integer num = this.l;
                if (num != null && dbsd.a(num, numArr[i])) {
                    this.l = Integer.valueOf(this.l.intValue() + 24);
                }
                numArr[i] = Integer.valueOf(numArr[i].intValue() + 24);
            }
        }
    }

    private final Integer[] k() {
        Integer[] numArr = new Integer[this.f.c.size()];
        for (int i = 0; i < this.f.c.size(); i++) {
            numArr[i] = Integer.valueOf(this.f.c.get(i).b);
        }
        return numArr;
    }

    private final cpph<cpvm, Double> l() {
        Activity activity = this.c;
        cppi cppiVar = new cppi(activity);
        cppiVar.b = new cpte(cpqk.a(activity, 2.0f));
        cppiVar.a();
        cpph<cpvm, Double> cpphVar = new cpph<>(activity, cppiVar);
        cpphVar.setLegendSymbolRenderer(new cptf());
        cpphVar.d().d = false;
        return cpphVar;
    }

    private final int m(int i) {
        return Math.round(cpqk.a(this.c, i));
    }

    private final boolean n() {
        if (this.g != null) {
            for (int i = 0; i < this.f.c.size(); i++) {
                dvvs dvvsVar = this.f.c.get(i);
                if (dvvsVar.b == this.g.intValue()) {
                    return dvvsVar.c > 0;
                }
            }
        }
        return false;
    }

    @Override // defpackage.acqw
    public acmy<cpvm, Double> a() {
        cpvi a2;
        if (!b().booleanValue()) {
            return new acmy<>();
        }
        Integer[] k = k();
        j(k);
        acmx a3 = acmy.a();
        a3.c("BarChartRenderer", l());
        Double[] dArr = new Double[this.f.c.size()];
        for (int i = 0; i < this.f.c.size(); i++) {
            dArr[i] = Double.valueOf(this.f.c.get(i).c);
        }
        cpvn a4 = cpvz.a("BarChartRenderer", k, dArr);
        a4.i(cpvf.e, new acre(this, h().booleanValue(), this.c.getResources()));
        a3.d("BarChartRenderer", a4);
        a3.b = cprw.b(new acrf(this));
        int length = k.length;
        Double[] dArr2 = new Double[length];
        for (int i2 = 0; i2 < k.length; i2++) {
            dArr2[i2] = Double.valueOf(k[i2].intValue());
        }
        ArrayList b2 = cpwi.b(length);
        for (int i3 = 0; i3 < length; i3++) {
            b2.add(dArr2[i3]);
        }
        a3.a = new cprs(b2);
        acrl acrlVar = new acrl(this.c);
        cprr a5 = cprr.a(this.c, null);
        a5.k.setColor(this.c.getResources().getColor(R.color.qu_daynight_grey_400));
        a5.e = acpe.a(this.c, 6);
        acrlVar.a = a5;
        a3.c = acrlVar;
        a3.b(new acrr(this.c), "goal_dash_line");
        dvvs dvvsVar = this.i;
        a3.j = cprk.a(Double.valueOf((double) dcyn.a), Double.valueOf((dvvsVar == null || dvvsVar.c < 150) ? 110.0d : 120.0d));
        a3.d = this.r;
        a3.e = cpsm.d((int) cpqk.a(this.c, 1.0f));
        a3.f = this.p;
        a3.g = true;
        a3.b(new cpsz(new acqz(this), new cpsv()), "selection_highlight");
        if (this.s == null) {
            cpub<cpvm, Double> cpubVar = new cpub<>(this.c);
            cpubVar.c = cpsn.b;
            cpubVar.d = 2;
            cpubVar.a = false;
            this.s = cpubVar;
            cpubVar.setLayoutParams(new cppw(-1, -1, (byte) 2, -1));
            this.s.b.setColor(ibm.j().b(this.c));
        }
        a3.b(this.s, "line_highlighter");
        if (this.t == null) {
            this.t = new cptt<>(this.c);
            cptp<T, D> cptpVar = new cptp(this) { // from class: acra
                private final acrg a;

                {
                    this.a = this;
                }

                @Override // defpackage.cptp
                public final View a(List list) {
                    acrg acrgVar = this.a;
                    boolean z = false;
                    acrgVar.m = false;
                    cqkx.p(acrgVar.n);
                    int intValue = ((Double) ((cpto) list.get(0)).b).intValue();
                    acrgVar.o = Integer.valueOf(intValue);
                    Integer num = acrgVar.l;
                    if (num != null && num.intValue() == intValue) {
                        z = true;
                    }
                    acrgVar.e.d(acrgVar.i(intValue), z, z ? acrgVar.h : null);
                    cqkx.p(acrgVar.e);
                    return acrgVar.d.c();
                }
            };
            cptt<cpvm, Double> cpttVar = this.t;
            cpttVar.f.getLayoutParams().height = m(90);
            cpttVar.c = cptpVar;
            cpttVar.b = cpsn.b;
            cpty cptyVar = this.t.a;
            cptyVar.d = ibm.b().b(this.c);
            cptyVar.a = m(6);
            cptyVar.b = m(12);
            cptyVar.c = m(7);
            cptyVar.e = ibm.j().b(this.c);
        }
        a3.b(this.t, "touch_card");
        a3.i = Integer.valueOf(m(90));
        a3.h = Integer.valueOf(m(20));
        if (h().booleanValue()) {
            this.k = l();
            HashMap hashMap = new HashMap();
            hashMap.put("LIVE_BUSYNESS_SEGMENT_DRAWER", this.j);
            this.k.setBarDrawer(new cput(hashMap));
            a3.c("LiveBusynessRenderer", this.k);
            Integer num = this.l;
            if (num == null) {
                a2 = cpvo.a("LiveBusynessRenderer");
            } else {
                a2 = cpvz.a("LiveBusynessRenderer", new Integer[]{num}, new Double[]{Double.valueOf(Math.min(this.i.c, (int) com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMajor))});
                a2.j(cpph.b, "LIVE_BUSYNESS_SEGMENT_DRAWER");
            }
            a3.d("LiveBusynessRenderer", a2);
        }
        return a3.a();
    }

    @Override // defpackage.acqw
    public Boolean b() {
        boolean z = false;
        if (this.f.c.size() > 0 && !this.f.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acqw
    public CharSequence c() {
        if (b().booleanValue()) {
            return "";
        }
        if ((this.f.a & 1) == 0) {
            String valueOf = String.valueOf(this.c.getString(R.string.BUSYNESS_NO_DATA));
            String valueOf2 = String.valueOf(this.c.getString(R.string.BUSYNESS_CHOOSE_ANOTHER_DAY));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        Activity activity = this.c;
        dcdn<dpol, Integer> dcdnVar = q;
        dpol b2 = dpol.b(this.f.b);
        if (b2 == null) {
            b2 = dpol.DAY_OF_WEEK_UNSPECIFIED;
        }
        String string = activity.getString(dcdnVar.get(b2).intValue());
        if (this.f.d) {
            return this.c.getString(R.string.BUSYNESS_CLOSED_ON_DAY, new Object[]{string});
        }
        return this.c.getString(R.string.BUSYNESS_NOT_ENOUGH_DATA_FOR_DAY, new Object[]{string});
    }

    @Override // defpackage.acqw
    public CharSequence d() {
        Activity activity = this.c;
        dcdn<dpol, Integer> dcdnVar = q;
        dpol b2 = dpol.b(this.f.b);
        if (b2 == null) {
            b2 = dpol.DAY_OF_WEEK_UNSPECIFIED;
        }
        String string = activity.getString(dcdnVar.get(b2).intValue());
        String g = g();
        if (this.i == null || g.isEmpty()) {
            return this.c.getString(R.string.BUSYNESS_A11Y_POPULAR_TIMES_DAY, new Object[]{string});
        }
        return this.c.getString(R.string.BUSYNESS_A11Y_POPULAR_TIMES_NOW, new Object[]{string, g});
    }

    @Override // defpackage.acqw
    public acqv e() {
        return this.n;
    }

    @Override // defpackage.acqw
    public View.OnAttachStateChangeListener f() {
        return new acrd(this);
    }

    public String g() {
        return !n() ? "" : this.h;
    }

    public Boolean h() {
        Integer num;
        dvvs dvvsVar;
        boolean z = false;
        if (b().booleanValue() && (num = this.g) != null && (dvvsVar = this.i) != null && dvvsVar.b == num.intValue() && (this.i.a & 2) != 0 && !dbsj.d(this.h) && n()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public final dvvs i(int i) {
        Integer[] k = k();
        j(k);
        for (int i2 = 0; i2 < k.length; i2++) {
            if (k[i2].intValue() == i) {
                return this.f.c.get(i2);
            }
        }
        return null;
    }
}
