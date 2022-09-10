package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.gmm.mapsactivity.locationhistory.receipts.ReceiptUploadTutorialController$GmmIdViewFinder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aojp  reason: default package */
/* loaded from: classes2.dex */
public final class aojp extends csle implements bzml {
    private final fd a;
    private final bzmm b;
    private final cjqq c;
    private final btvo d;

    public aojp(fd fdVar, bzmm bzmmVar, cjqq cjqqVar, btvo btvoVar) {
        this.a = fdVar;
        this.b = bzmmVar;
        this.c = cjqqVar;
        this.d = btvoVar;
    }

    private final View i() {
        gga ggaVar = (gga) this.a.J();
        dbsk.s(ggaVar);
        fd K = ggaVar.K();
        dbsk.s(K);
        View view = K.P;
        dbsk.s(view);
        return view;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TIMELINE_RECEIPT_UPLOAD_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.b.b(dqkc.TIMELINE_RECEIPT_UPLOAD_PROMO) == bzmk.VISIBLE ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        ColorStateList colorStateList;
        boolean z = false;
        if (bzmkVar != bzmk.VISIBLE) {
            return false;
        }
        ff J = this.a.J();
        dbsk.s(J);
        String string = J.getString(R.string.TIMELINE_LEARN_MORE);
        final String k = cjxr.k(this.d);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new URLSpan(k) { // from class: com.google.android.apps.gmm.mapsactivity.locationhistory.receipts.ReceiptUploadTutorialController$1
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, 0, spannableString.length(), 33);
        bvsu c = new bvsx(J.getResources()).c(anfx.MAPS_ACTIVITY_TIMELINE_RECEIPT_FEATURE_HIGHLIGHT_BODY);
        c.a(spannableString);
        Spannable c2 = c.c();
        cslc cslcVar = new cslc(new ReceiptUploadTutorialController$GmmIdViewFinder());
        cslcVar.b = J.getString(anfx.MAPS_ACTIVITY_TIMELINE_RECEIPT_FEATURE_HIGHLIGHT_HEADER);
        cslcVar.e = c2;
        int c3 = akm.c(J, R.color.google_blue600);
        cslcVar.v = cslo.GoogleMaterial;
        TypedValue a = dacz.a(J, R.attr.colorSurface);
        TypedValue a2 = dacz.a(J, R.attr.colorOnSurfaceVariant);
        if (a2 == null || a == null) {
            Resources resources = J.getResources();
            if (Build.VERSION.SDK_INT >= 23) {
                colorStateList = resources.getColorStateList(R.color.google_grey700, null);
            } else {
                colorStateList = resources.getColorStateList(R.color.google_grey700);
            }
            cslcVar.g = colorStateList;
            cslcVar.k = kc.f(-1, J.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_outer_color_default_alpha));
            cslcVar.n = kc.f(ka.b(J.getResources(), R.color.google_grey900), J.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_outer_color_default_alpha));
        } else {
            int i = a.data;
            cslcVar.g = ColorStateList.valueOf(a2.data);
            cslcVar.k = i;
            cslcVar.n = kc.f(-16777216, J.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_scrim_default_alpha));
        }
        int f = kc.f(c3, 255);
        cslcVar.c = ColorStateList.valueOf(f);
        cslcVar.i = ColorStateList.valueOf(f);
        cslcVar.j = ColorStateList.valueOf(f);
        cslcVar.a = f;
        cslcVar.o = 1.15f;
        cslcVar.u = csmk.PULSE_WITH_INNER_CIRCLE;
        int f2 = kc.f(c3, J.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_element_color_override_inner_circle_default_alpha));
        int f3 = kc.f(c3, J.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha));
        cslcVar.l = f2;
        cslcVar.m = f3;
        cslcVar.c = ColorStateList.valueOf(akm.c(J, R.color.google_grey900));
        cslcVar.a = akm.c(J, R.color.google_grey500);
        cslcVar.n = 0;
        int i2 = anfw.timeline_receipt_live_camera_tutorial_center_threshold;
        if (i2 != 0) {
            z = true;
        }
        czhx.a(z);
        cslcVar.r = i2;
        cslcVar.o = 1.0f;
        csld a3 = cslcVar.a();
        od.v(i().findViewById(R.id.live_camera_record_button), 2);
        fd fdVar = this.a;
        if (fdVar.S() && !fdVar.u) {
            a3.c().d(fdVar.J(), fdVar.R());
        }
        return true;
    }

    @Override // defpackage.csle
    public final void g() {
        od.m(i(), 0);
        this.b.f(dqkc.TIMELINE_RECEIPT_UPLOAD_PROMO);
    }

    @Override // defpackage.csle
    public final void h() {
        od.m(i(), 4);
        this.c.g().d(cjtd.a(dtxv.Q));
    }
}
