package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ygd  reason: default package */
/* loaded from: classes7.dex */
final class ygd implements View.OnLayoutChangeListener {
    @dzsi
    private WeakReference<View> a = null;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WeakReference<View> weakReference;
        View findViewById = view.findViewById(yfk.a);
        if (findViewById == null) {
            view.setTouchDelegate(null);
            this.a = null;
        } else if (findViewById.getParent() != view) {
            dcqe dcqeVar = ygh.a;
            bvoo.h("ViewPager should be immediate child of view with setupTouchDelegateOnLayoutChangeListener", new Object[0]);
        } else if (view.getTouchDelegate() != null && (weakReference = this.a) != null && weakReference.get() == findViewById) {
        } else {
            view.setTouchDelegate(new ygc(new Rect(), findViewById, findViewById));
            this.a = new WeakReference<>(findViewById);
        }
    }
}
