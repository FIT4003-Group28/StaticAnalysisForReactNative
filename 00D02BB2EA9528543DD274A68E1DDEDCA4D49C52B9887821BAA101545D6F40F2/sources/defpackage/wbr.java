package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wbr  reason: default package */
/* loaded from: classes7.dex */
public class wbr implements wcn, cqfc {
    public static final wbo a = wbo.e(2131232673, cqrt.c(R.color.google_blue600), cqrt.c(R.color.google_grey300), irg.a());
    public static final wbo b = wbo.e(2131232672, cqrt.c(R.color.saved_route_heart_selected_icon), cqrt.c(R.color.saved_route_heart_selected_button_border), cqrt.c(R.color.saved_route_heart_selected_button_fill));
    public static final wbo c = wbo.e(2131232922, cqrt.c(R.color.google_blue600), cqrt.c(R.color.google_grey300), irg.a());
    public static final wbo d = wbo.e(2131232921, cqrt.c(R.color.saved_route_star_selected_icon), cqrt.c(R.color.saved_route_star_selected_button_border), cqrt.c(R.color.saved_route_star_selected_button_fill));
    public static final wbo e = wbo.e(2131232305, cqrt.c(R.color.google_blue600), cqrt.c(R.color.google_grey300), irg.a());
    public static final wbo f = wbo.e(2131232304, cqrt.c(R.color.saved_route_pin_selected_icon), cqrt.c(R.color.saved_route_pin_selected_button_border), cqrt.c(R.color.saved_route_pin_selected_button_fill));
    private final wbp g;
    private final wbq h;
    private final Resources i;
    private final boolean j;
    private boolean k;
    private final int l;

    public wbr(wbp wbpVar, cqhn cqhnVar, wbq wbqVar, Resources resources, boolean z, boolean z2, int i) {
        this.g = wbpVar;
        this.h = wbqVar;
        this.i = resources;
        this.j = z;
        this.k = z2;
        this.l = i;
    }

    public void b(boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
        cqkx.p(this);
    }

    @Override // defpackage.wcn
    public Boolean c() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.wcn
    public Boolean d() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.wcn
    public cqtd e() {
        wbo wboVar;
        if (this.k) {
            wbp wbpVar = this.g;
            wbp wbpVar2 = wbp.HEART;
            wboVar = wbpVar.e;
        } else {
            wbp wbpVar3 = this.g;
            wbp wbpVar4 = wbp.HEART;
            wboVar = wbpVar3.d;
        }
        wbm wbmVar = (wbm) wboVar;
        cqtd n = cqtt.n(cquy.a(), wbmVar.c, cqrp.d(1.0d));
        cqrp d2 = cqrp.d(1.0d);
        cqtd p = cqtt.p(cquy.a(), wbmVar.d);
        cqrp d3 = cqrp.d(1.0d);
        cqtd i = cqrt.i(cqrt.f(wbmVar.a), wbmVar.b);
        cqrp d4 = cqrp.d(9.0d);
        return cqtt.d(cqtt.e(n, d2, d2, d2, d2), cqtt.e(p, d3, d3, d3, d3), cqtt.e(i, d4, d4, d4, d4));
    }

    @Override // defpackage.wcn
    public CharSequence f() {
        if (this.k) {
            return this.i.getString(R.string.SAVED_ROUTE_BUTTON);
        }
        return this.i.getString(R.string.SAVE_ROUTE_BUTTON);
    }

    @Override // defpackage.wcn
    public CharSequence g() {
        if (this.k) {
            return this.i.getString(R.string.SAVED_ROUTE_BUTTON_CONTENT_DESCRIPTION);
        }
        if (this.l == 0) {
            return this.i.getString(R.string.SAVE_FIRST_ROUTE_BUTTON_CONTENT_DESCRIPTION);
        }
        return this.i.getString(R.string.SAVE_SECOND_ROUTE_BUTTON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.wcn
    public cjtd h() {
        cjta b2 = cjtd.b();
        b2.d = dtxl.bH;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.k ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b2.a = bZ.bK();
        return b2.a();
    }

    @Override // defpackage.wcn
    public cqkl i() {
        this.h.a();
        return cqkl.a;
    }

    @Override // defpackage.wcn
    public cqfc j() {
        return this;
    }

    @Override // defpackage.cqfc
    public void a(View view, boolean z) {
        ObjectAnimator objectAnimator = null;
        if (!this.j && z) {
            objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
            objectAnimator.setInterpolator(irf.a);
            objectAnimator.setDuration(eaow.d(1L).b);
        }
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }
}
