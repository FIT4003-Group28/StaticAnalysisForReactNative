package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hqe  reason: default package */
/* loaded from: classes.dex */
public final class hqe extends LinearLayout {
    private static final cqkv e = new hqf();
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public hqe(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmh<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh<>(hqe.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.IS_HOME_SET, cqlcVar, e);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.IS_WORK_SET, cqlcVar, e);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.IS_SCHOOL_SET, cqlcVar, e);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.IS_GYM_SET, cqlcVar, e);
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(this.a));
        arrayList.add(Boolean.valueOf(this.b));
        arrayList.add(Boolean.valueOf(this.c));
        arrayList.add(Boolean.valueOf(this.d));
        for (int i = 0; i < 4; i++) {
            if (((Boolean) arrayList.get(i)).booleanValue()) {
                getChildAt(i).setVisibility(8);
            } else {
                getChildAt(i).setVisibility(0);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        f();
        int size = View.MeasureSpec.getSize(i);
        View childAt = getChildAt(4);
        childAt.measure(i, i2);
        int measuredWidth = size - childAt.getMeasuredWidth();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                i3 = -1;
                break;
            }
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(makeMeasureSpec, i2);
                measuredWidth -= childAt2.getMeasuredWidth();
                if (measuredWidth <= 0) {
                    break;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
            }
            i3++;
        }
        if (i3 != -1) {
            while (i3 < 4) {
                getChildAt(i3).setVisibility(8);
                i3++;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 5; i5++) {
            if (getChildAt(i5).getVisibility() == 0) {
                i4++;
            }
        }
        if (i4 == 1) {
            ((TextView) childAt.findViewById(R.id.search_label_promo_text)).setText(R.string.ALIAS_HEADER_ADD_TITLE);
        }
        super.onMeasure(i, i2);
    }

    public hqe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
