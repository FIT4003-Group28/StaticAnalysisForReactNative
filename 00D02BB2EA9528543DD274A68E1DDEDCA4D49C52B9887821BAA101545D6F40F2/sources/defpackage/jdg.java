package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: jdg  reason: default package */
/* loaded from: classes.dex */
public final class jdg extends FrameLayout {
    public jdg(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jdg.class, cqmpVarArr);
    }

    private static boolean b(View view) {
        if (view.getVisibility() == 8) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (!b(viewGroup.getChildAt(i))) {
                    return false;
                }
            }
        } else if (view instanceof Chip) {
            czwv czwvVar = ((Chip) view).d;
            if (czwvVar != null && czwvVar.getIntrinsicWidth() > view.getMeasuredWidth()) {
                return false;
            }
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getMaxLines() == Integer.MAX_VALUE && textView.getLineCount() > 1) {
                return false;
            }
            Layout layout = textView.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                for (int i2 = 0; i2 < lineCount; i2++) {
                    if (layout.getEllipsisCount(i2) > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setVisibility(8);
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setVisibility(0);
            super.onMeasure(i, i2);
            if (i4 == childCount - 1 || b(childAt)) {
                return;
            }
            childAt.setVisibility(8);
        }
    }

    public jdg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jdg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
