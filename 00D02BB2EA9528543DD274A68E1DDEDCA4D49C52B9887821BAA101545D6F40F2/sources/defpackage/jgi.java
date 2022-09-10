package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jgi  reason: default package */
/* loaded from: classes7.dex */
public class jgi extends LinearLayout {
    private boolean a;
    @dzsi
    private jgh[] b;

    public jgi(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgi.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqmn<T> e(cqtv cqtvVar) {
        return f(cqtvVar, cqta.f());
    }

    public static <T extends cqkp> cqmn<T> f(cqtv cqtvVar, cqss cqssVar) {
        return cqmn.a(cqgr.ez(2), cqgr.af(itd.a(cqtvVar, cqssVar)));
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (!this.a || getOrientation() != 0 || !cjxu.d(this)) {
            int showDividers = getShowDividers();
            if (i == 0) {
                return (showDividers & 1) != 0;
            } else if (i == getChildCount()) {
                return (showDividers & 4) != 0;
            } else if ((showDividers & 2) == 0) {
                return false;
            } else {
                do {
                    i--;
                    if (i < 0) {
                        return false;
                    }
                } while (getChildAt(i).getVisibility() == 8);
                return true;
            }
        }
        int showDividers2 = getShowDividers();
        if ((showDividers2 & 6) == 0) {
            return false;
        }
        int i2 = i + 1;
        while (true) {
            if (i2 < getChildCount()) {
                if (getChildAt(i2).getVisibility() != 8) {
                    break;
                }
                i2++;
            } else if ((showDividers2 & 4) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int length;
        super.onMeasure(i, i2);
        jgh[] jghVarArr = this.b;
        this.b = null;
        if (getShowDividers() == 0) {
            return;
        }
        int orientation = getOrientation();
        Drawable dividerDrawable = getDividerDrawable();
        if (orientation != 0) {
            if (orientation == 1 && dividerDrawable.getIntrinsicHeight() == 0) {
                return;
            }
        } else if (dividerDrawable.getIntrinsicWidth() == 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8 && ((LinearLayout.LayoutParams) childAt.getLayoutParams()).weight != 0.0f) {
                int childCount = getChildCount();
                if (jghVarArr == null) {
                    jghVarArr = new jgh[childCount];
                    length = 0;
                } else {
                    length = jghVarArr.length;
                    if (length != childCount) {
                        jghVarArr = (jgh[]) Arrays.copyOf(jghVarArr, childCount);
                    }
                }
                while (length < childCount) {
                    jghVarArr[length] = new jgh();
                    length++;
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    jgh jghVar = jghVarArr[i4];
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    jghVar.a = layoutParams.weight;
                    jghVar.b = layoutParams.width;
                    jghVar.c = layoutParams.height;
                    layoutParams.weight = 0.0f;
                    layoutParams.width = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredWidth(), 1073741824);
                    layoutParams.height = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                }
                super.onMeasure(i, i2);
                for (int i5 = 0; i5 < childCount; i5++) {
                    jgh jghVar2 = jghVarArr[i5];
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    layoutParams2.weight = jghVar2.a;
                    layoutParams2.width = jghVar2.b;
                    layoutParams2.height = jghVar2.c;
                }
                this.b = jghVarArr;
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int layoutDirection = getLayoutDirection();
        super.onRtlPropertiesChanged(i);
        if (i == layoutDirection || getOrientation() == 0) {
            return;
        }
        requestLayout();
    }

    public jgi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jgi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
