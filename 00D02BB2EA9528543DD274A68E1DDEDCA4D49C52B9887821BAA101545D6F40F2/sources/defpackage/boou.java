package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: boou  reason: default package */
/* loaded from: classes3.dex */
public class boou implements boqj {
    private static final dcep<String> e = dcep.C("he", "iw");
    private final Context f;
    @dzsi
    private Runnable g;
    @dzsi
    private Runnable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private cqjg l;
    private boolean m;
    private boolean n;
    private final Set<byea> o;
    @dzsi
    private List<jae> p;
    @dzsi
    private boor q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;

    public boou(Context context) {
        this(context, false, false, false);
    }

    public static boou a(Context context) {
        return new boou(context, true, true, true);
    }

    public static boou b(Context context, int i, int i2, int i3, int i4) {
        return new boou(context, true, true, true, i, i2, i3, i4);
    }

    public static boou c(Context context) {
        return new boou(context, true, false, false);
    }

    public static boou d(Context context) {
        boou c = c(context);
        c.w = true;
        return c;
    }

    public static boou e(Context context, booq booqVar, boolean z, boolean z2, boolean z3) {
        boou boouVar;
        bonn a = booqVar.a();
        if (a == null) {
            boouVar = new boou(context, false, z2, true);
        } else {
            boouVar = new boou(context, false, z2, true, a.a(), a.b(), a.c(), a.d());
        }
        boouVar.B(booqVar.b());
        boouVar.v = true;
        boouVar.w = z;
        return boouVar;
    }

    @Override // defpackage.boqj
    public CompoundButton.OnCheckedChangeListener A() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: boos
            private final boou a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.B(Boolean.valueOf(z));
            }
        };
    }

    public void B(Boolean bool) {
        this.m = bool.booleanValue();
        if (bool.booleanValue()) {
            this.n = false;
        }
        cqkx.p(this);
    }

    @Override // defpackage.boqj
    public CompoundButton.OnCheckedChangeListener C() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: boot
            private final boou a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.D(z);
            }
        };
    }

    public void D(boolean z) {
        this.n = z;
        if (z) {
            this.m = false;
        }
        cqkx.p(this);
    }

    public void E(int i, int i2) {
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.boqj
    public Boolean F() {
        return Boolean.valueOf(this.l == boqj.b);
    }

    @Override // defpackage.boqj
    public Integer G() {
        return Integer.valueOf(this.t);
    }

    @Override // defpackage.boqj
    public Integer H() {
        return Integer.valueOf(this.u);
    }

    @Override // defpackage.boqj
    public String I() {
        return bvtb.j(this.f, this.t, this.u, 0);
    }

    @Override // defpackage.boqj
    public void J(int i, int i2) {
        this.t = i;
        this.u = i2;
        cqkx.p(this);
    }

    public void K(int i, int i2) {
        this.r = i;
        this.s = i2;
    }

    @Override // defpackage.boqj
    public Boolean L() {
        return Boolean.valueOf(this.l == boqj.c);
    }

    @Override // defpackage.boqj
    public Integer M() {
        return Integer.valueOf(this.r);
    }

    @Override // defpackage.boqj
    public Integer N() {
        return Integer.valueOf(this.s);
    }

    @Override // defpackage.boqj
    public String O() {
        return bvtb.j(this.f, this.r, this.s, 0);
    }

    @Override // defpackage.boqj
    public void P(int i, int i2) {
        this.r = i;
        this.s = i2;
        cqkx.p(this);
    }

    @Override // defpackage.boqj
    public Boolean Q() {
        return Boolean.valueOf(DateFormat.is24HourFormat(this.f));
    }

    @Override // defpackage.boqj
    public Integer R() {
        return Integer.valueOf(true != e.contains(Locale.getDefault().getLanguage()) ? 3 : 0);
    }

    public boou S() {
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = boqj.a;
        return this;
    }

    public boou T() {
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = boqj.b;
        return this;
    }

    public boou U() {
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = boqj.c;
        return this;
    }

    /* renamed from: V */
    public boou clone() {
        boou boouVar = new boou(this.f);
        boouVar.W(this);
        return boouVar;
    }

    public boou W(boou boouVar) {
        this.i = boouVar.i().booleanValue();
        this.j = boouVar.j().booleanValue();
        this.k = boouVar.k().booleanValue();
        this.l = boouVar.n();
        r(dcnm.e(boouVar.v()), boouVar.s().booleanValue());
        E(boouVar.G().intValue(), boouVar.H().intValue());
        K(boouVar.M().intValue(), boouVar.N().intValue());
        return this;
    }

    @Override // defpackage.boqj
    public Boolean X() {
        boolean z = true;
        if (this.l == boqj.a && v().isEmpty() && !this.w) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean equals(@dzsi Object obj) {
        if (obj != null && (obj instanceof boqj)) {
            boqj boqjVar = (boqj) obj;
            if (this.i == boqjVar.i().booleanValue() && this.j == boqjVar.j().booleanValue() && this.k == boqjVar.k().booleanValue() && this.l == boqjVar.n() && this.o.size() == boqjVar.v().size() && this.o.containsAll(boqjVar.v()) && this.m == boqjVar.s().booleanValue() && this.t == boqjVar.G().intValue() && this.u == boqjVar.H().intValue() && this.r == boqjVar.M().intValue() && this.s == boqjVar.N().intValue()) {
                return true;
            }
        }
        return false;
    }

    public void f(Runnable runnable) {
        this.g = runnable;
    }

    public void g(Runnable runnable) {
        this.h = runnable;
    }

    @Override // defpackage.boqj
    public Boolean h() {
        return Boolean.valueOf(!this.o.isEmpty());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, this.o, Boolean.valueOf(this.m), Integer.valueOf(this.t), Integer.valueOf(this.u), Integer.valueOf(this.r), Integer.valueOf(this.s)});
    }

    @Override // defpackage.boqj
    public Boolean i() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.boqj
    public Boolean j() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.boqj
    public Boolean k() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.boqj
    public Boolean l() {
        return Boolean.valueOf(this.w);
    }

    @Override // defpackage.boqj
    public Boolean m() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.boqj
    public cqjg n() {
        return this.l;
    }

    @Override // defpackage.boqj
    public cqkl o() {
        this.l = boqj.d;
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.boqj
    public cqkl p() {
        cqjg cqjgVar = this.l;
        if (cqjgVar == null) {
            return cqkl.a;
        }
        if (cqjgVar.equals(boqj.a)) {
            if (s().booleanValue()) {
                this.l = boqj.d;
            } else {
                this.l = j().booleanValue() ? boqj.b : boqj.d;
            }
        } else if (this.l.equals(boqj.b)) {
            this.l = (!k().booleanValue() || s().booleanValue() || t().booleanValue()) ? boqj.d : boqj.c;
        } else if (this.l.equals(boqj.c)) {
            this.l = boqj.d;
        }
        if (this.l == boqj.d) {
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            cqkx.p(this);
        }
        return cqkl.a;
    }

    public void q() {
        r(EnumSet.noneOf(byea.class), false);
    }

    public void r(Set<byea> set, boolean z) {
        this.m = z;
        this.o.clear();
        this.o.addAll(set);
    }

    @Override // defpackage.boqj
    public Boolean s() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.boqj
    public Boolean t() {
        return Boolean.valueOf(this.n);
    }

    public void u() {
        z(byea.MONDAY, false);
        z(byea.TUESDAY, false);
        z(byea.WEDNESDAY, false);
        z(byea.THURSDAY, false);
        z(byea.FRIDAY, false);
        z(byea.SATURDAY, false);
        z(byea.SUNDAY, false);
    }

    @Override // defpackage.boqj
    public Set<byea> v() {
        return this.o;
    }

    @Override // defpackage.boqj
    public String w() {
        return new bydk(this.f).f(v(), s(), false);
    }

    @Override // defpackage.boqj
    public List<jae> x() {
        if (this.p == null) {
            ArrayList a = dchl.a();
            this.p = a;
            a.add(new booo(byea.MONDAY, this.f.getString(R.string.MONDAY), this));
            this.p.add(new booo(byea.TUESDAY, this.f.getString(R.string.TUESDAY), this));
            this.p.add(new booo(byea.WEDNESDAY, this.f.getString(R.string.WEDNESDAY), this));
            this.p.add(new booo(byea.THURSDAY, this.f.getString(R.string.THURSDAY), this));
            this.p.add(new booo(byea.FRIDAY, this.f.getString(R.string.FRIDAY), this));
            this.p.add(new booo(byea.SATURDAY, this.f.getString(R.string.SATURDAY), this));
            this.p.add(new booo(byea.SUNDAY, this.f.getString(R.string.SUNDAY), this));
        }
        return this.p;
    }

    @Override // defpackage.boqj
    @dzsi
    public jae y() {
        if (this.w) {
            return null;
        }
        if (this.q == null) {
            this.q = new boor(this, this.f.getString(R.string.OPEN_24_HOURS));
        }
        return this.q;
    }

    @Override // defpackage.boqj
    public void z(byea byeaVar, boolean z) {
        if (z) {
            this.o.add(byeaVar);
        } else if (this.o.contains(byeaVar)) {
            this.o.remove(byeaVar);
        }
        cqkx.p(this);
    }

    public boou(Context context, boolean z, boolean z2, boolean z3) {
        this(context, z, z2, z3, 8, 0, 18, 0);
    }

    public boou(Context context, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        cqjg cqjgVar;
        this.o = new HashSet();
        this.f = context;
        this.i = z;
        this.j = z2;
        this.k = z3;
        if (z) {
            this.l = boqj.a;
        } else {
            if (z2) {
                cqjgVar = boqj.b;
            } else {
                cqjgVar = z3 ? boqj.c : boqj.d;
            }
            this.l = cqjgVar;
        }
        q();
        E(i, i2);
        K(i3, i4);
    }
}
