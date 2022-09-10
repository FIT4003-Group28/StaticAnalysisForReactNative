package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
/* renamed from: brsd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brsd implements View.OnLayoutChangeListener {
    static final View.OnLayoutChangeListener a = new brsd();

    private brsd() {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = brsf.b;
        ViewParent parent = view.getParent();
        if (parent instanceof HorizontalScrollView) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) parent;
            if (true == bvox.a(view)) {
                i = i3;
            }
            horizontalScrollView.scrollTo(i, i2);
        }
    }
}
