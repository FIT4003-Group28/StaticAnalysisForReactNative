package a.r;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes.dex */
class t implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    private Rect f680a;

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f2));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f2));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f2));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f2));
        Rect rect3 = this.f680a;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f680a;
    }
}
