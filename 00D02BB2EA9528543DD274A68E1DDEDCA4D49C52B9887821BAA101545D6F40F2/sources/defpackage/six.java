package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: six  reason: default package */
/* loaded from: classes7.dex */
public final class six implements bzml {
    public final dxio<bzmm> a;
    private final gga b;
    private final dxio<cjnf> c;

    public six(dxio<bzmm> dxioVar, gga ggaVar, dxio<cjnf> dxioVar2) {
        this.a = dxioVar;
        this.b = ggaVar;
        this.c = dxioVar2;
    }

    private final View g() {
        return this.b.findViewById(R.id.transportation_tab_suggestion_save_trip_button);
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.SAVE_TRIP_BUTTON_SUGGESTION_TOOLTIP;
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
        View g = g();
        if (g == null || g.getMeasuredHeight() == 0) {
            return false;
        }
        int[] iArr = new int[2];
        g.getLocationOnScreen(iArr);
        return iArr[1] + g.getMeasuredHeight() < Resources.getSystem().getDisplayMetrics().heightPixels - this.b.findViewById(R.id.footer_container).getMeasuredHeight();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.SAVE_TRIP_BUTTON_SUGGESTION_TOOLTIP) == 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View g = g();
        if (g == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.d(g);
        i.c(R.string.TRANSPORATION_TAB_SAVE_TRIP_BUTTON_TOOLTIP_PROMO_TEXT);
        i.b(true);
        cjnb cjnbVar = (cjnb) i;
        cjnbVar.b = cjtd.a(dtyc.fL);
        cjnbVar.c = new Runnable(this) { // from class: siw
            private final six a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.SAVE_TRIP_BUTTON_SUGGESTION_TOOLTIP);
            }
        };
        this.c.a().a(i.a());
        return true;
    }
}
