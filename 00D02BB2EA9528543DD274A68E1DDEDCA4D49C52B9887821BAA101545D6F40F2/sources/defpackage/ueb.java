package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ueb  reason: default package */
/* loaded from: classes7.dex */
public final class ueb extends jgq {
    private dcdc<Integer> c;

    public ueb(Context context) {
        this(context, null);
    }

    private final boolean l(int i, int i2, HashMap<Integer, View> hashMap, ArrayList<Integer> arrayList, int i3, int i4) {
        int i5 = 0;
        for (int i6 = i - 1; i6 >= 0; i6--) {
            View view = hashMap.get(arrayList.get(i6));
            int i7 = (i2 - i5) / (i6 + 1);
            int measuredWidth = view == null ? 0 : view.getMeasuredWidth();
            if (measuredWidth > i7 && (view instanceof uec)) {
                ((uec) view).b(i7);
                measureChild(view, i3, i4);
                i5 += view.getMeasuredWidth();
            } else {
                i5 += measuredWidth;
            }
        }
        return i5 <= i2;
    }

    @Override // defpackage.jgq
    protected final void g() {
        super.h();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof uec) {
                ((uec) childAt).c();
            }
        }
    }

    @Override // defpackage.jgq
    protected final int i(int i, int i2, int i3, int i4) {
        ArrayList<Integer> arrayList = new ArrayList<>(this.c);
        HashMap<Integer, View> hashMap = new HashMap<>();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            hashMap.put(Integer.valueOf(childAt.getId()), childAt);
            if (!arrayList.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        int childCount = i3 - (this.a * (getChildCount() - 1));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        int i6 = i4;
        int i7 = 0;
        for (int size = arrayList.size() - 1; size >= 0 && i6 > childCount; size--) {
            View view = hashMap.get(Integer.valueOf(arrayList.get(size).intValue()));
            if (view != null) {
                int measuredWidth = view.getMeasuredWidth();
                if (true == l(size, childCount - i7, hashMap, arrayList, makeMeasureSpec, i2)) {
                    i6 = childCount;
                }
                if (view instanceof uec) {
                    ((uec) view).a();
                    measureChild(view, makeMeasureSpec, i2);
                }
                int measuredWidth2 = view.getMeasuredWidth();
                i7 += measuredWidth2;
                i6 = l(size, childCount - i7, hashMap, arrayList, makeMeasureSpec, i2) ? childCount : i6 - (measuredWidth - measuredWidth2);
            }
        }
        return i6;
    }

    public void setOrderOfPrecedence(List<Integer> list) {
        this.c = dcdc.r(list);
    }

    public ueb(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ueb(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = dcdc.e();
    }
}
