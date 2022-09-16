package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: szl  reason: default package */
/* loaded from: classes7.dex */
public class szl extends szn implements syz {
    public final byyp a;
    private final bzgl b;
    private final Activity c;
    private final cqat d;
    private final tlv e;
    private final amve f;
    private final zdq g;
    @dzsi
    private final sun h;

    public szl(Activity activity, cqat cqatVar, twk twkVar, byyp byypVar, bzgl bzglVar, cqhn cqhnVar, ahvo ahvoVar, suw suwVar, dxio<cztz> dxioVar, gdc gdcVar, tlv tlvVar, amve amveVar) {
        this.e = tlvVar;
        this.f = amveVar;
        this.c = activity;
        this.d = cqatVar;
        this.b = bzglVar;
        this.a = byypVar;
        dqvj c = dqvj.c(amveVar.b().b);
        c = c == null ? dqvj.DRIVE : c;
        this.h = (c == dqvj.DRIVE || c == dqvj.BICYCLE || c == dqvj.TWO_WHEELER || c == dqvj.WALK || c == dqvj.TRANSIT) ? twkVar.a(tlvVar, amveVar, dtyc.cP, null, true) : null;
        this.g = new sxl(ahvoVar, suwVar, activity, cqhnVar, dxioVar, gdcVar);
    }

    @Override // defpackage.syz
    public Boolean OJ() {
        boolean z = false;
        if (b().booleanValue() && this.b.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.syz
    @dzsi
    public sun a() {
        return this.h;
    }

    @Override // defpackage.syz
    public Boolean b() {
        bzdk c = this.a.c();
        dbsg<amub> A = this.e.A(this.f, this.c);
        boolean z = false;
        if (A.a() && c.a(A.b())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.szn
    public Boolean c() {
        return true;
    }

    @Override // defpackage.syz
    @dzsi
    public zdq d() {
        if (OJ().booleanValue()) {
            return this.g;
        }
        return null;
    }

    @Override // defpackage.syz
    @dzsi
    public CharSequence e() {
        int i;
        if (b().booleanValue()) {
            long b = this.a.c().d().a - this.d.b();
            if (b < 0) {
                b = 0;
            }
            i = (int) eaow.e(b).g();
        } else {
            dgas x = vyb.x(this.f);
            i = x != null ? x.b : -1;
        }
        if (i >= 0) {
            return bvtb.e(this.c.getResources(), i, bvsz.ABBREVIATED).toString();
        }
        return null;
    }

    @Override // defpackage.syz
    public CharSequence f() {
        dgaw dgawVar;
        if (b().booleanValue()) {
            return bvtb.i(this.c, eaow.e(this.a.c().d().a).g());
        }
        dpci dpciVar = this.f.b().f;
        if (dpciVar == null) {
            dpciVar = dpci.i;
        }
        if ((dpciVar.a & 32) != 0) {
            dgawVar = dpciVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = dpciVar.c;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        }
        return bvtb.h(this.c, dgawVar);
    }

    @Override // defpackage.syz
    public CharSequence g() {
        return this.c.getString(R.string.ACCESSIBILITY_TRANSIT_GUIDANCE_OFF);
    }

    @Override // defpackage.syz
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: szk
            private final szl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl szlVar = this.a;
                if (szlVar.b().booleanValue()) {
                    szlVar.a.f(bzdd.b);
                }
            }
        };
    }

    public void i() {
        cqkx.p(this);
    }
}
