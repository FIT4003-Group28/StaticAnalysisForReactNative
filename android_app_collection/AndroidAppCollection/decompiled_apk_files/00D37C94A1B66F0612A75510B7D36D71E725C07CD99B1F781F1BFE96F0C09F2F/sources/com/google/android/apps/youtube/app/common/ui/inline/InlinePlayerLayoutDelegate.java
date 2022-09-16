package com.google.android.apps.youtube.app.common.ui.inline;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlayerLayoutDelegate implements f, fej {
    private final Rect a = new Rect();
    private final fzl b;

    public InlinePlayerLayoutDelegate(fzl fzlVar) {
        this.b = fzlVar;
    }

    @Override // defpackage.fej
    public final void g(View view) {
        fzl fzlVar = this.b;
        Rect rect = this.a;
        Rect a = fzlVar.a(fzlVar.b);
        Rect rect2 = fzlVar.b;
        rect.set(a);
        rect.offset(-rect2.left, -rect2.top);
        view.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
    }

    @Override // defpackage.fej
    public final void h(View view) {
        fzl fzlVar = this.b;
        Rect a = fzlVar.a(fzlVar.b);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(a.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(a.height(), 1073741824), 0, layoutParams.height));
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
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
