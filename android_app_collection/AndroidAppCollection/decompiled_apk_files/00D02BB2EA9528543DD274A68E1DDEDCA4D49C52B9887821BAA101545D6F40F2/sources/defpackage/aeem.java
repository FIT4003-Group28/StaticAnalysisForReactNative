package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeem  reason: default package */
/* loaded from: classes2.dex */
public final class aeem implements bzml {
    public final dxio<bzmm> a;
    private final dxio<acyp> b;
    private final gga c;
    private final dxio<cjnf> d;
    private final dxio<wdt> e;

    public aeem(dxio<bzmm> dxioVar, dxio<acyp> dxioVar2, gga ggaVar, dxio<cjnf> dxioVar3, dxio<wdt> dxioVar4) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = ggaVar;
        this.d = dxioVar3;
        this.e = dxioVar4;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSPORTATION_TAB_NEW_TRIP_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.b.a().d();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.e.a().g() || this.a.a().d(dqkc.TRANSPORTATION_TAB_NEW_TRIP_TOOLTIP) != 0) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View findViewById = this.c.findViewById(R.id.transportation_tab_strip_button);
        if (findViewById == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.d(findViewById);
        i.c(R.string.TRANSPORATION_TAB_NEW_TRIP_TOOLTIP_PROMO_TEXT);
        i.b(true);
        cjnb cjnbVar = (cjnb) i;
        cjnbVar.b = cjtd.a(dtyc.fE);
        cjnbVar.c = new Runnable(this) { // from class: aeel
            private final aeem a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.TRANSPORTATION_TAB_NEW_TRIP_TOOLTIP);
            }
        };
        this.d.a().a(i.a());
        return true;
    }
}
