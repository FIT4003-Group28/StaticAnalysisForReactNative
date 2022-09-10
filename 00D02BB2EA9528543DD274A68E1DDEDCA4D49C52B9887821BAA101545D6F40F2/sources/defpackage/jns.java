package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: jns  reason: default package */
/* loaded from: classes7.dex */
public final class jns extends jnq {
    public jns(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> H(cqmp<T>... cqmpVarArr) {
        return new cqmh(jns.class, cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        bas basVar = ((jnq) this).w;
        View view = null;
        if (basVar != null) {
            int i3 = 0;
            while (true) {
                if (i3 < getChildCount()) {
                    View childAt = getChildAt(i3);
                    cqkp i4 = cqkx.i(childAt);
                    if (i4 != null && basVar.OX(i4) == e()) {
                        view = childAt;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        }
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
    }
}
