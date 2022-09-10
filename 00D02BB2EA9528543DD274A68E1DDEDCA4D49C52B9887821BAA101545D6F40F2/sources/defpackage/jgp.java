package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: jgp  reason: default package */
/* loaded from: classes7.dex */
public final class jgp extends jgq {
    private boolean c;
    private boolean d;

    public jgp(Context context) {
        this(context, null);
    }

    @dzsi
    private final View l() {
        dcdc<View> dcdcVar = this.b;
        if (dcdcVar.isEmpty()) {
            return null;
        }
        return dcdcVar.get(dcdcVar.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgq
    public final int a(int i) {
        if (this.d) {
            return j(i);
        }
        return super.a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        super.onLayout(z, i, i2, i3, i4);
        if (this.c) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            dcdc<View> dcdcVar = this.b;
            if (dcdcVar.isEmpty()) {
                return;
            }
            boolean d = cjxu.d(this);
            int i5 = 0;
            if (d) {
                View l = l();
                width = l == null ? 0 : l.getLeft();
            } else {
                View l2 = l();
                paddingLeft = l2 == null ? 0 : l2.getRight();
            }
            int i6 = width - paddingLeft;
            while (i5 < dcdcVar.size()) {
                View view = dcdcVar.get(i5);
                i5++;
                int size = (i5 * i6) / (dcdcVar.size() + 1);
                if (d) {
                    left = view.getLeft() - size;
                } else {
                    left = view.getLeft() + size;
                }
                view.layout(left, view.getTop(), view.getWidth() + left, view.getBottom());
            }
        }
    }

    public void setAlwaysShowEllipsis(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        requestLayout();
        invalidate();
    }

    public void setEvenSpacing(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        requestLayout();
        invalidate();
    }

    public jgp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jgp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cpj.a, i, 0);
        setEvenSpacing(obtainStyledAttributes.getBoolean(1, false));
        setAlwaysShowEllipsis(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }
}
