package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: blze  reason: default package */
/* loaded from: classes3.dex */
public class blze implements blwt {
    public final Activity a;
    @dzsi
    public cqfc e;
    public final blzf f;
    @dzsi
    private View.OnTouchListener g;
    @dzsi
    private iyy j;
    @dzsi
    private List<String> k;
    @dzsi
    private String l;
    private final bvjj m;
    public float b = 0.0f;
    public float c = 0.0f;
    private blzm i = blzm.NONE;
    private int n = 5;
    private boolean h = true;
    public boolean d = false;

    public blze(Activity activity, bvjj bvjjVar, blzf blzfVar) {
        this.a = activity;
        this.m = bvjjVar;
        this.f = blzfVar;
    }

    private final void P() {
        this.m.S(bvjk.fk, true);
    }

    private final void Q(int i) {
        if (this.n != 4) {
            this.n = i;
        }
    }

    @Override // defpackage.blwt
    public cqkl A() {
        P();
        this.f.b.O();
        return cqkl.a;
    }

    @Override // defpackage.blwt
    public cqkl B() {
        P();
        this.f.n();
        return cqkl.a;
    }

    @Override // defpackage.blwt
    @dzsi
    public cjtd C() {
        return cjtd.a(z().booleanValue() ? dtxz.p : dtxz.i);
    }

    @Override // defpackage.blwt
    public Boolean D() {
        return Boolean.valueOf(this.n == 3);
    }

    @Override // defpackage.blwt
    public Boolean E(int i) {
        boolean z = false;
        if (this.n != 3) {
            return false;
        }
        List<String> list = this.k;
        if (list != null && i < list.size() && this.k.get(i) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwt
    public String F(int i) {
        List<String> list;
        return (!E(i).booleanValue() || (list = this.k) == null) ? "" : list.get(i);
    }

    public void G(List<String> list) {
        this.k = list;
        if (list == null || list.isEmpty()) {
            return;
        }
        Q(3);
    }

    public void H() {
        Q(5);
    }

    public void I(boolean z) {
        this.h = z;
    }

    public void J(boolean z) {
        this.d = z;
    }

    public void K(iyy iyyVar) {
        this.j = iyyVar;
        Q(1);
    }

    public void L(@dzsi String str) {
        this.l = str;
    }

    public void M(boolean z) {
        if (!z || this.m.m(bvjk.fk, false)) {
            return;
        }
        this.n = 4;
    }

    public void N(blzm blzmVar) {
        this.i = blzmVar;
        this.e = blzm.IN == blzmVar ? new blzc(this) : new blzd();
    }

    public boolean O() {
        return this.i != blzm.NONE;
    }

    @Override // defpackage.izu
    @dzsi
    public cqfc a() {
        return this.e;
    }

    @Override // defpackage.izu
    public cqkl b() {
        return d();
    }

    @Override // defpackage.izu
    public cqkl c() {
        this.f.n();
        return cqkl.a;
    }

    @Override // defpackage.izu
    public cqkl d() {
        this.f.b.N();
        return cqkl.a;
    }

    @Override // defpackage.izu
    public Boolean e() {
        return true;
    }

    @Override // defpackage.izu
    public Boolean f() {
        boolean z = true;
        if (!this.h && !this.d) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd i() {
        return cjtd.a(dtxz.j);
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd j() {
        return cjtd.a(dtxz.e);
    }

    @Override // defpackage.izu
    public Boolean k() {
        boolean z = false;
        if (!r().booleanValue() && !D().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izu
    public Integer l() {
        return Integer.valueOf(true != k().booleanValue() ? 2131231365 : 2131231318);
    }

    @Override // defpackage.izu
    public CharSequence m() {
        return this.a.getString(R.string.RIDDLER_FULL_SCREEN_THANKS);
    }

    @Override // defpackage.izu
    public CharSequence n() {
        if (!k().booleanValue()) {
            if (D().booleanValue()) {
                return this.a.getString(R.string.RIDDLER_IMPACT_SEARCH_HEADER);
            }
            if (!dbsj.d(this.l)) {
                return this.l;
            }
            if (r().booleanValue()) {
                return this.a.getString(R.string.RIDDLER_FULL_SCREEN_THANKS_CHECK_LIFETIME_STATS);
            }
            return this.a.getString(R.string.RIDDLER_FULL_SCREEN_YOUR_CONTRIBUTION);
        }
        return this.a.getString(R.string.RIDDLER_FULL_SCREEN_YOUR_CONTRIBUTION);
    }

    @Override // defpackage.izu
    public Integer o() {
        return Integer.valueOf((int) R.string.RIDDLER_FULL_SCREEN_MORE_QUESTIONS);
    }

    @Override // defpackage.izu
    public Integer p() {
        return Integer.valueOf((int) R.string.DONE);
    }

    @Override // defpackage.izu
    @dzsi
    public iyy q() {
        return this.j;
    }

    @Override // defpackage.izu
    public Boolean r() {
        boolean z = true;
        if (this.n != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd s() {
        return cjtd.a(dtxz.F);
    }

    @Override // defpackage.izu
    public Boolean t() {
        return false;
    }

    @Override // defpackage.izu
    public cqkl u() {
        return cqkl.a;
    }

    @Override // defpackage.blwt
    public Float v() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.blwt
    public Float w() {
        return Float.valueOf(this.c);
    }

    @Override // defpackage.blwt
    @dzsi
    public cqtd x() {
        if (k().booleanValue()) {
            return cqrt.g(l().intValue(), irg.P());
        }
        return cqrt.f(l().intValue());
    }

    @Override // defpackage.blwt
    public View.OnTouchListener y() {
        if (this.g == null) {
            this.g = new blww(this.a, new blza(this));
        }
        return this.g;
    }

    @Override // defpackage.blwt
    public Boolean z() {
        return Boolean.valueOf(this.n == 4);
    }
}
