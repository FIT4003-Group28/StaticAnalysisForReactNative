package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: itx  reason: default package */
/* loaded from: classes6.dex */
final class itx implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Number number = (Number) cqjz.g(view).m(iub.b);
        view.setTranslationY(view.getMeasuredHeight() * (number == null ? 0.0f : number.floatValue()));
    }
}
