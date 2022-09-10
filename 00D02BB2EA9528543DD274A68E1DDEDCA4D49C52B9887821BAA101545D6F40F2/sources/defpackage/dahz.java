package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dahz  reason: default package */
/* loaded from: classes5.dex */
public final class dahz extends AppCompatTextView {
    public dahz(Context context) {
        this(context, null);
    }

    private final void a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, daia.a);
        int c = c(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (c >= 0) {
            setLineHeight(c);
        }
    }

    private static boolean b(Context context) {
        return dacz.d(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int c(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (b(context)) {
            a(context.getTheme(), i);
        }
    }

    public dahz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public dahz(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (b(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, daia.b, i, 0);
            int c = c(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (c != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, daia.b, i, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId == -1) {
                return;
            }
            a(theme, resourceId);
        }
    }
}
