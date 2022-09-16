package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: tpc  reason: default package */
/* loaded from: classes4.dex */
public class tpc extends TextView {
    public tpc(Context context) {
        super(context);
    }

    public tpc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public tpc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, tpd.a, 0, 0);
        boolean z2 = true;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (dimensionPixelSize3 >= 0 && dimensionPixelSize3 != fontMetricsInt) {
            setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
        }
        int i2 = getPaint().getFontMetricsInt().top;
        int i3 = getPaint().getFontMetricsInt().bottom;
        if (!getIncludeFontPadding()) {
            i2 = getPaint().getFontMetricsInt().ascent;
            i3 = getPaint().getFontMetricsInt().descent;
        }
        float f = getContext().getResources().getDisplayMetrics().density / getContext().getResources().getDisplayMetrics().scaledDensity;
        if (f != 1.0f) {
            i2 = Math.round(i2 * f);
            i3 = Math.round(i3 * f);
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (dimensionPixelSize > Math.abs(i2)) {
            paddingTop = dimensionPixelSize - (-i2);
            z = true;
        }
        if (dimensionPixelSize2 > Math.abs(i3)) {
            paddingBottom = dimensionPixelSize2 - i3;
        } else {
            z2 = z;
        }
        if (z2) {
            setPadding(getPaddingLeft(), paddingTop, getPaddingRight(), paddingBottom);
        }
    }
}
