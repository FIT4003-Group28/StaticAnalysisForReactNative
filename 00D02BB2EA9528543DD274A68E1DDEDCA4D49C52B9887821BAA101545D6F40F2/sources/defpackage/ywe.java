package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ywe  reason: default package */
/* loaded from: classes7.dex */
final class ywe implements View.OnLayoutChangeListener {
    private final Rect a = new Rect();
    private final Rect b = new Rect();

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View findViewById = view.findViewById(yqw.c);
        if (findViewById != null && !(findViewById instanceof cqic)) {
            if (!(findViewById instanceof yqf)) {
                dcqe dcqeVar = ywh.a;
                bvoo.h("The expanded card should be an InterceptableLinearLayout.", new Object[0]);
                return;
            }
            View findViewById2 = findViewById.findViewById(yqw.b);
            if (findViewById2 == null) {
                dcqe dcqeVar2 = ywh.a;
                bvoo.h("No descendant view CHANGE_DIRECTION_CHIP_BUTTON_ID in expanded card.", new Object[0]);
                return;
            }
            findViewById2.getHitRect(this.b);
            ((ViewGroup) findViewById).offsetDescendantRectToMyCoords((View) findViewById2.getParent(), this.b);
            if (this.b.equals(this.a)) {
                return;
            }
            this.a.set(this.b);
            findViewById.setTouchDelegate(new TouchDelegate(this.b, findViewById2));
        }
    }
}
