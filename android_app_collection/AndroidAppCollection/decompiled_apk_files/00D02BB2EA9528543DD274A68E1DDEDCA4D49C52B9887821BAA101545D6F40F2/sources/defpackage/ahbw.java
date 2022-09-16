package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahbw  reason: default package */
/* loaded from: classes2.dex */
public class ahbw implements agyw, agyz {
    public final agwa a;
    public final gga b;
    public final bvrb c;
    public final dkzq d;
    private final gfq j;
    private final btxv k;
    private final dxio<akzh> l;
    private final akox m;
    private final iwv n;
    private final ges o;
    boolean e = false;
    public boolean f = true;
    private boolean p = false;
    private int r = 1;
    public List<dkzo> g = dcdc.e();
    @dzsi
    private dehn<dlbu> q = null;
    public boolean h = false;
    public final Set<ahbv> i = new LinkedHashSet();

    public ahbw(cqhn cqhnVar, agwa agwaVar, gfq gfqVar, gga ggaVar, dxio<akzh> dxioVar, akox akoxVar, bvrb bvrbVar, iwv iwvVar, btxv btxvVar, dkzq dkzqVar, ges gesVar) {
        this.a = agwaVar;
        this.j = gfqVar;
        this.b = ggaVar;
        this.l = dxioVar;
        this.m = akoxVar;
        this.c = bvrbVar;
        this.n = iwvVar;
        this.k = btxvVar;
        this.d = dkzqVar;
        this.o = gesVar;
    }

    @Override // defpackage.agyw
    public jar a() {
        return this.n;
    }

    @Override // defpackage.agyw
    public agzi b() {
        return new ahbt(this);
    }

    @Override // defpackage.agyw
    public CharSequence c() {
        if (!this.f) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_OFFLINE_ERROR_TEXT);
        }
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_UNSUPPORTED_COUNTRY_ERROR_TEXT);
        }
        if (i2 == 3) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_TOO_SMALL_ERROR_TEXT);
        }
        if (i2 == 4) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_TOO_BIG_ERROR_TEXT);
        }
        if (i2 == 5) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_LOW_DENSITY_ERROR_TEXT);
        }
        return (!this.g.isEmpty() || this.r == 1) ? "" : this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_UNSUPPORTED_COUNTRY_ERROR_TEXT);
    }

    @Override // defpackage.agyw
    public Boolean e() {
        boolean z = true;
        if (!this.f) {
            return true;
        }
        int i = this.r;
        if (i == 1) {
            return false;
        }
        if (i == 2 && !this.g.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agyw
    public CharSequence f() {
        return this.b.getString(this.d == dkzq.POSITIVE ? R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_VIEWFINDER_INSTRUCTIONS : R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_VIEWFINDER_INSTRUCTIONS_FOR_NEGATIVE_PREFERENCE);
    }

    @Override // defpackage.agyz
    public cqkl g() {
        n();
        return cqkl.a;
    }

    @Override // defpackage.agyz
    public CharSequence h() {
        if (this.d == dkzq.POSITIVE) {
            return this.b.getString(R.string.LOCALSTREAM_POSITIVE_EXPLICIT_PREFERENCE_TITLE);
        }
        return this.b.getString(R.string.LOCALSTREAM_NEGATIVE_EXPLICIT_PREFERENCE_TITLE);
    }

    public void i() {
        if (this.e) {
            return;
        }
        this.e = true;
        akox akoxVar = this.m;
        akyc l = akyt.l(akoxVar.n().i, this.m.n().k);
        l.b = 0;
        akoxVar.p(l);
    }

    public Boolean j() {
        boolean z = true;
        if (!this.p && this.r != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void k(boolean z) {
        if (z != this.p) {
            p();
            this.r = 2;
            this.p = z;
            cqkx.p(this);
        }
    }

    public boolean l() {
        akqs o = o();
        ahbv ahbvVar = null;
        double d = dcyn.a;
        for (ahbv ahbvVar2 : this.i) {
            akqs a = ahbvVar2.a();
            double h = akqs.h(o, a);
            double g = h / ((o.g() + a.g()) - h);
            double d2 = g > d ? g : d;
            if (g > d) {
                ahbvVar = ahbvVar2;
            }
            d = d2;
        }
        if (ahbvVar == null || d <= 0.6d) {
            return false;
        }
        q(ahbvVar.b());
        this.i.remove(ahbvVar);
        this.i.add(ahbvVar);
        return true;
    }

    public void m() {
        dehn<dlbu> dehnVar = this.q;
        if (dehnVar != null && !dehnVar.isCancelled()) {
            this.q.cancel(true);
        }
        akqs o = o();
        dehn<dlbu> j = this.a.j(o, this.d);
        this.q = j;
        deha.q(j, new ahbs(this, o), this.c.h());
    }

    public final void n() {
        ges gesVar = this.o;
        if (gesVar.aD) {
            gfq.m(gesVar);
        }
    }

    public akqs o() {
        Rect rect;
        alrh ak = this.m.ak();
        dbsk.s(ak);
        if (btpf.c(this.b).f) {
            int e = agff.f.e(this.b);
            int e2 = agft.a.e(this.b);
            int e3 = agff.b.e(this.b);
            int y = (int) (((this.l.a().y() - agff.d.e(this.b)) - e) / 2.0f);
            int i = e2 + e3;
            rect = new Rect(y, i, y + e, e + i);
        } else {
            int e4 = agff.e.e(this.b);
            int e5 = agft.a.e(this.b);
            int e6 = agff.a.e(this.b);
            int y2 = (int) ((this.l.a().y() - e4) / 2.0f);
            int i2 = e5 + e6;
            rect = new Rect(y2, i2, y2 + e4, e4 + i2);
        }
        akqq a = ak.a(new Point(rect.left, rect.bottom));
        dbsk.s(a);
        akqq a2 = ak.a(new Point(rect.right, rect.top));
        dbsk.s(a2);
        akqr a3 = akqs.a();
        a3.d(a);
        a3.d(a2);
        return a3.b();
    }

    public final void p() {
        this.k.a(new btxt(this) { // from class: ahbp
            private final ahbw a;

            {
                this.a = this;
            }

            @Override // defpackage.btxt
            public final void a(final int i) {
                final ahbw ahbwVar = this.a;
                ahbwVar.c.h().execute(new Runnable(ahbwVar, i) { // from class: ahbr
                    private final ahbw a;
                    private final int b;

                    {
                        this.a = ahbwVar;
                        this.b = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ahbw ahbwVar2 = this.a;
                        boolean z = true;
                        if (this.b != 1) {
                            z = false;
                        }
                        ahbwVar2.f = z;
                        cqkx.p(ahbwVar2);
                    }
                });
            }
        });
    }

    public final void q(dlbu dlbuVar) {
        this.p = false;
        int a = dlbt.a(dlbuVar.b);
        if (a == 0) {
            a = 1;
        }
        this.r = a;
        this.g = dcbg.b(dlbuVar.a).s(ahbq.a).z();
        cqkx.p(this);
    }

    public final void r(int i) {
        Toast.makeText(this.b, i, 1).show();
    }

    @Override // defpackage.agyw
    public CharSequence d() {
        if (!this.f) {
            return "";
        }
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_UNSUPPORTED_COUNTRY_ERROR_ACTION_SUGGESTION_TEXT);
        }
        if (i2 == 3) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_TOO_SMALL_ERROR_ACTION_SUGGESTION_TEXT);
        }
        if (i2 == 4) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_TOO_BIG_ERROR_ACTION_SUGGESTION_TEXT);
        }
        if (i2 == 5) {
            return this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_LOW_DENSITY_ERROR_ACTION_SUGGESTION_TEXT);
        }
        return (!this.g.isEmpty() || this.r == 1) ? "" : this.b.getString(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_UNSUPPORTED_COUNTRY_ERROR_ACTION_SUGGESTION_TEXT);
    }
}
