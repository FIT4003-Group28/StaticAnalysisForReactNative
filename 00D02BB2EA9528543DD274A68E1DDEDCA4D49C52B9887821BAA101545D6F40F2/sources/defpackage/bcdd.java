package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bcdd  reason: default package */
/* loaded from: classes3.dex */
public final class bcdd extends RelativeLayout {
    public bcdd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i) != 0) {
            cqkp i3 = cqkx.i(this);
            if (i3 instanceof bcdf) {
                bcdf bcdfVar = (bcdf) i3;
                dcdc<bcdh> a = bcdfVar.a();
                dbsk.a(a.size() == getChildCount());
                ArrayList arrayList = new ArrayList();
                int size2 = a.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(a.get(i4).c());
                }
                if (arrayList.size() == 1) {
                    float floatValue = ((Float) arrayList.get(0)).floatValue();
                    getChildAt(0).setLayoutParams(new RelativeLayout.LayoutParams(View.MeasureSpec.getSize(i), (int) Math.floor(size / floatValue)));
                } else if (arrayList.size() == 2) {
                    float floatValue2 = ((Float) arrayList.get(0)).floatValue();
                    float floatValue3 = ((Float) arrayList.get(1)).floatValue();
                    int size3 = View.MeasureSpec.getSize(i);
                    int e = bcde.b.e(getContext());
                    int i5 = size3 - e;
                    int floor = (int) Math.floor(i5 / (floatValue2 + floatValue3));
                    int i6 = (int) (floor * floatValue2);
                    int i7 = i5 - i6;
                    float f = size3;
                    if (i6 / f < 0.333f) {
                        floor = (int) Math.floor((f * 0.333f) / floatValue2);
                        i6 = (int) (floor * floatValue2);
                        i7 = i5 - i6;
                    } else if (i7 / f < 0.333f) {
                        floor = (int) Math.floor((f * 0.333f) / floatValue3);
                        i7 = (int) (floor * floatValue3);
                        i6 = i5 - i7;
                    }
                    int max = Math.max(bcde.d.e(getContext()), floor);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, max);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i7, max);
                    layoutParams.setMarginEnd(e);
                    layoutParams2.addRule(17, getChildAt(0).getId());
                    getChildAt(0).setLayoutParams(layoutParams);
                    getChildAt(1).setLayoutParams(layoutParams2);
                } else if (arrayList.size() == 3) {
                    float floatValue4 = ((Float) arrayList.get(0)).floatValue();
                    float floatValue5 = ((Float) arrayList.get(1)).floatValue();
                    float floatValue6 = ((Float) arrayList.get(2)).floatValue();
                    boolean booleanValue = bcdfVar.b().booleanValue();
                    int size4 = View.MeasureSpec.getSize(i);
                    int e2 = bcde.b.e(getContext());
                    int[] e3 = bcde.e(new double[]{floatValue4, floatValue5, floatValue6, size4, e2});
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(e3[0], e3[1]);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(e3[2], e3[3]);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(e3[4], e3[5]);
                    if (!booleanValue) {
                        layoutParams3.setMarginEnd(e2);
                        layoutParams4.addRule(17, getChildAt(0).getId());
                        layoutParams5.addRule(17, getChildAt(0).getId());
                    } else {
                        layoutParams3.setMarginStart(e2);
                        layoutParams3.addRule(17, getChildAt(1).getId());
                        layoutParams3.addRule(17, getChildAt(2).getId());
                    }
                    layoutParams4.bottomMargin = e2;
                    layoutParams5.addRule(3, getChildAt(1).getId());
                    getChildAt(0).setLayoutParams(layoutParams3);
                    getChildAt(1).setLayoutParams(layoutParams4);
                    getChildAt(2).setLayoutParams(layoutParams5);
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
