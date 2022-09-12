package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: grg  reason: default package */
/* loaded from: classes6.dex */
public final class grg extends LinearLayout {
    public grg(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmh<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh<>(grg.class, cqmpVarArr);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                i3 = 0;
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                TextView textView = (TextView) childAt.findViewById(R.id.action_button_label);
                if (textView == null) {
                    super.onMeasure(i, i2);
                    return;
                }
                int maxWidth = textView.getMaxWidth();
                textView.setMaxWidth(Integer.MAX_VALUE);
                measureChild(childAt, i, i2);
                i3 = textView.getMeasuredHeight();
                textView.setMaxWidth(maxWidth);
            } else {
                i4++;
            }
        }
        if (i3 != 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getVisibility() != 8) {
                    measureChild(childAt2, i, i2);
                    TextView textView2 = (TextView) childAt2.findViewById(R.id.action_button_label);
                    if (textView2 != null) {
                        i5 = Math.max(textView2.getMeasuredHeight(), i5);
                    }
                }
            }
            if (i5 > i3) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    ((TextView) getChildAt(i7).findViewById(R.id.action_button_label)).setTextSize(12.0f);
                }
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public grg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
