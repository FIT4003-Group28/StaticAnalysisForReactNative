package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: rmd  reason: default package */
/* loaded from: classes7.dex */
final class rmd implements View.OnLayoutChangeListener {
    final /* synthetic */ rmf a;

    public rmd(rmf rmfVar) {
        this.a = rmfVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a.g;
        int paddingLeft = view2.getPaddingLeft();
        int paddingTop = this.a.g.getPaddingTop();
        int paddingRight = this.a.g.getPaddingRight();
        rmf rmfVar = this.a;
        view2.setPadding(paddingLeft, paddingTop, paddingRight, rmfVar.ad + rmfVar.f.getHeight());
    }
}
