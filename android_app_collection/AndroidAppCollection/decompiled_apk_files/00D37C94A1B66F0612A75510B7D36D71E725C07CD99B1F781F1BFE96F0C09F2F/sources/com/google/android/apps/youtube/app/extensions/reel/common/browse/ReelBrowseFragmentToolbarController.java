package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelBrowseFragmentToolbarController implements f {
    public Toolbar a;
    public hit b;
    public final hir c;
    public final hhz d;
    private guy e;
    private final acth f;

    public ReelBrowseFragmentToolbarController(guy guyVar, hit hitVar, hir hirVar, hhz hhzVar, acth acthVar) {
        this.e = guyVar;
        this.b = hitVar;
        this.c = hirVar;
        this.f = acthVar;
        this.d = hhzVar;
    }

    public final void g() {
        guy guyVar = this.e;
        if (guyVar != null) {
            guyVar.aH();
            acth acthVar = this.f;
            if (acthVar == null) {
                return;
            }
            acthVar.oi().H(3, new acte(actj.MOBILE_BACK_BUTTON), null);
        }
    }

    public final void h() {
        Drawable mutate = this.a.getResources().getDrawable(2131232368).mutate();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        layoutParams.height = (int) dimension;
        this.a.setLayoutParams(layoutParams);
        mutate.setColorFilter(zhn.d(this.a.getContext(), R.attr.ytIconActiveOther), PorterDuff.Mode.SRC_ATOP);
        this.a.q(mutate);
        this.a.r(new gux(this, 1));
        this.a.o(R.string.accessibility_back);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.w("");
        this.a = null;
        this.e = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
