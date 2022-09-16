package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: rme  reason: default package */
/* loaded from: classes7.dex */
final class rme implements View.OnLayoutChangeListener {
    final /* synthetic */ rmf a;

    public rme(rmf rmfVar) {
        this.a = rmfVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (i9 == i10 || i10 == 0) {
            return;
        }
        View view2 = this.a.g;
        view2.setPadding(view2.getPaddingLeft(), (this.a.g.getPaddingTop() + i9) - i10, this.a.g.getPaddingRight(), this.a.g.getPaddingBottom());
    }
}
