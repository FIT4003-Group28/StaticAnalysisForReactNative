package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeek  reason: default package */
/* loaded from: classes2.dex */
public final class aeek implements bzml {
    public final dxio<bzmm> a;
    private final dxio<acyp> b;
    private final gga c;
    private final dxio<cjnf> d;

    public aeek(dxio<bzmm> dxioVar, dxio<acyp> dxioVar2, gga ggaVar, dxio<cjnf> dxioVar3) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = ggaVar;
        this.d = dxioVar3;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSPORTATION_TAB_COMMUTE_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
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
        if (this.a.a().d(dqkc.TRANSPORTATION_TAB_COMMUTE_TOOLTIP) == 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View findViewById = this.c.findViewById(R.id.transportation_tab_strip_button);
        if (findViewById == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.d(findViewById);
        i.c(R.string.TRANSPORATION_TAB_COMMUTE_TOOLTIP_PROMO_TEXT);
        i.b(true);
        cjnb cjnbVar = (cjnb) i;
        cjnbVar.b = cjtd.a(dtyc.fu);
        cjnbVar.c = new Runnable(this) { // from class: aeej
            private final aeek a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.TRANSPORTATION_TAB_COMMUTE_TOOLTIP);
            }
        };
        this.d.a().a(i.a());
        return true;
    }
}
