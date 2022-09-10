package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: jga  reason: default package */
/* loaded from: classes7.dex */
public final class jga extends jgi {
    private final HashSet<View> a;
    private final ArrayList<View> b;

    public jga(Context context) {
        super(context);
        this.a = new HashSet<>();
        this.b = new ArrayList<>();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jga.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Boolean bool) {
        return cqjv.j(iug.HIDE_IF_CLIPPED, bool);
    }

    public static boolean c(View view) {
        Boolean bool = (Boolean) view.getTag(R.id.hide_if_clipped);
        return bool != null && bool.booleanValue();
    }

    private static boolean g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof jfz) && ((jfz) layoutParams).a;
    }

    public static void setHideIfClipped(View view, Boolean bool) {
        view.setTag(R.id.hide_if_clipped, bool);
    }

    public static void setOverlayAboveLastUnclippedSibling(View view, Boolean bool) {
        jfz jfzVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jfzVar = new jfz();
        } else {
            jfzVar = new jfz(layoutParams);
        }
        jfzVar.a = bool.booleanValue();
        view.setLayoutParams(jfzVar);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgi, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.clear();
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && !g(childAt)) {
                childAt.setTag(R.id.is_hidden_after_clipped, false);
                if (c(childAt)) {
                    int i6 = childAt.getLayoutParams().width;
                    int i7 = childAt.getLayoutParams().height;
                    int i8 = 1073741824;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6 >= 0 ? 1073741824 : 0);
                    if (i7 < 0) {
                        i8 = 0;
                    }
                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, i8));
                }
                int measuredWidth2 = childAt.getMeasuredWidth();
                if (childAt.getRight() - measuredWidth2 >= 0 && childAt.getLeft() + measuredWidth2 <= measuredWidth) {
                    view = childAt;
                } else if (c(childAt)) {
                    this.a.add(childAt);
                    childAt.setTag(R.id.is_hidden_after_clipped, true);
                }
            }
        }
        this.b.clear();
        ArrayList<View> arrayList = this.b;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt2 = getChildAt(i9);
            if (g(childAt2)) {
                arrayList.add(childAt2);
            }
        }
        ArrayList<View> arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList2.get(i10);
            if (view == null) {
                this.a.add(view2);
            } else {
                view2.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
    }

    public jga(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashSet<>();
        this.b = new ArrayList<>();
    }
}
