package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nas  reason: default package */
/* loaded from: classes7.dex */
public final class nas implements nap {
    private final Boolean a = false;
    private final nce b;
    private final int c;
    private final nar d;
    private final jzp e;
    private final boolean f;
    private final bvsl g;
    private final Context h;
    @dzsi
    private CharSequence i;
    @dzsi
    private CharSequence j;
    @dzsi
    private CharSequence k;
    @dzsi
    private CharSequence l;
    @dzsi
    private cqss m;
    private final View.OnFocusChangeListener n;

    public nas(btvo btvoVar, nce nceVar, final int i, final nar narVar, jzp jzpVar, boolean z, bvsl bvslVar, Context context, boolean z2) {
        this.b = nceVar;
        this.c = i;
        this.d = narVar;
        this.e = jzpVar;
        this.f = z;
        this.g = bvslVar;
        this.h = context;
        this.n = new View.OnFocusChangeListener(narVar, i) { // from class: naq
            private final nar a;
            private final int b;

            {
                this.a = narVar;
                this.b = i;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                nar narVar2 = this.a;
                int i2 = this.b;
                if (z3) {
                    narVar2.a(i2);
                }
            }
        };
        w(true);
    }

    private final void y() {
        this.d.b(this.c);
    }

    @Override // defpackage.nap
    public CharSequence a() {
        return alez.b(this.h.getResources(), this.c);
    }

    @Override // defpackage.nap
    public Boolean b() {
        return Boolean.valueOf(this.c == this.b.a() + (-1));
    }

    @Override // defpackage.nap
    @dzsi
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.nap
    @dzsi
    public cqss d() {
        return this.m;
    }

    @Override // defpackage.nap
    @dzsi
    public CharSequence e() {
        return this.j;
    }

    @Override // defpackage.nap
    public Boolean f() {
        return this.a;
    }

    @Override // defpackage.nap
    @dzsi
    public CharSequence g() {
        return this.l;
    }

    @Override // defpackage.nap
    public Boolean h() {
        return Boolean.valueOf(this.l != null);
    }

    @Override // defpackage.nap
    public Boolean i() {
        return false;
    }

    @Override // defpackage.nap
    public Boolean j() {
        return false;
    }

    @Override // defpackage.nap
    public Boolean k() {
        for (int i = 0; i < this.b.a(); i++) {
            if (this.b.g(i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nap
    @dzsi
    public CharSequence l() {
        return this.k;
    }

    @Override // defpackage.nap
    public Boolean m() {
        boolean z = false;
        if (n().booleanValue() && this.b.h(this.c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nap
    public Boolean n() {
        return Boolean.valueOf(this.c < this.b.a());
    }

    @Override // defpackage.nap
    public Boolean o() {
        return Boolean.valueOf(this.b.m() == this.c);
    }

    @Override // defpackage.nap
    public Boolean p() {
        return Boolean.valueOf(this.b.o() == this.c);
    }

    @Override // defpackage.nap
    public Boolean q() {
        return Boolean.valueOf(this.e.h());
    }

    @Override // defpackage.nap
    public Boolean r() {
        boolean z = false;
        if (n().booleanValue() && this.b.i(this.c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nap
    public Boolean s() {
        boolean z = false;
        if (p().booleanValue() && r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nap
    public cqkl t() {
        if (cqsz.d().a(this.h) >= cqrp.d(445.0d).a(this.h)) {
            y();
            return cqkl.a;
        }
        if (p().booleanValue()) {
            y();
        } else {
            x();
        }
        return cqkl.a;
    }

    @Override // defpackage.nap
    public View.OnFocusChangeListener u() {
        return this.n;
    }

    @Override // defpackage.nap
    public cjtd v() {
        cjta b = cjtd.b();
        if (p().booleanValue()) {
            amve t = this.b.t(this.c);
            String str = null;
            if (t != null && t.l()) {
                str = t.m();
            }
            b.g(str);
        }
        b.i(this.c);
        b.d = p().booleanValue() ? dtxm.dw : dtxm.dB;
        return b.a();
    }

    public void w(boolean z) {
        if (n().booleanValue()) {
            int b = this.b.b(this.c);
            boolean z2 = this.f && this.c != this.b.m();
            if (z2) {
                nce nceVar = this.b;
                b -= nceVar.b(nceVar.m());
            }
            String[] g = bvtb.g(this.h, b, z2, false, false, z2 ? bvsz.MINIMAL : bvsz.ABBREVIATED);
            if (g[1] != null) {
                this.i = TextUtils.concat(g[0], " ", g[1]);
            } else {
                this.i = g[0];
            }
            this.m = nql.b(z2 ? null : this.b.l(this.c));
            this.j = this.g.h(this.b.d(this.c), this.b.e(this.c), null, null);
            if (!n().booleanValue() || !this.b.g(this.c)) {
                if (k().booleanValue()) {
                    this.k = this.h.getString(R.string.ROUTE_CALLOUT_NON_TOLL_LABEL);
                } else {
                    this.k = null;
                }
            } else {
                String charSequence = this.b.u(this.c).toString();
                this.k = charSequence;
                if (TextUtils.isEmpty(charSequence)) {
                    this.k = this.h.getString(R.string.ROUTE_CALLOUT_TOLL_LABEL);
                }
            }
            if (!z) {
                return;
            }
            String f = this.b.f(this.c);
            if (dbsj.d(f)) {
                this.l = null;
                return;
            } else {
                this.l = this.h.getString(R.string.VIA_ROADS, f);
                return;
            }
        }
        this.i = null;
        this.j = null;
        this.l = null;
        this.k = null;
    }

    public void x() {
        this.d.a(this.c);
    }
}
