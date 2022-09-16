package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axxk  reason: default package */
/* loaded from: classes.dex */
public class axxk implements bzml {
    public final dxio<bzmm> a;
    private final jlp b;
    private final dxio<cjqq> c;
    private final Activity d;
    private final dxio<axwq> e;

    public axxk(jlp jlpVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, gga ggaVar, dxio<axwq> dxioVar3) {
        this.b = jlpVar;
        this.a = dxioVar;
        this.c = dxioVar2;
        this.d = ggaVar;
        this.e = dxioVar3;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.NEW_TRIP_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.e.a().y().f();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.NEW_TRIP_TOOLTIP) <= 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        cjta b = cjtd.b();
        b.d = dtxw.dC;
        View findViewById = this.d.findViewById(R.id.search_omnibox_menu_button);
        if (findViewById == null) {
            return false;
        }
        if (bzmkVar != bzmk.VISIBLE) {
            if (bzmkVar != bzmk.REPRESSED) {
                return false;
            }
            cjqp f = this.c.a().f(findViewById);
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            f.d(b.a());
            return true;
        }
        int a = jmj.a(this.d, -10);
        jlo a2 = this.b.a(this.d.getString(R.string.NEW_TRIP_TOOLTIP_PROMO_TEXT), findViewById);
        a2.i();
        a2.r();
        a2.o(true);
        a2.e(new Runnable(this) { // from class: axxj
            private final axxk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.NEW_TRIP_TOOLTIP);
            }
        }, dege.a);
        a2.p();
        a2.l(a);
        a2.t(jln.GM2_BLUE);
        a2.a();
        this.c.a().f(findViewById).d(b.a());
        return true;
    }
}
