package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alqr  reason: default package */
/* loaded from: classes.dex */
public final class alqr extends AppCompatTextView {
    public alqr(Context context, AttributeSet attributeSet) {
        super(alqt.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, alqs.b, 16842884, 0);
            int a = a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, alqs.b, 16842884, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId == -1) {
                return;
            }
            b(theme, resourceId);
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = almu.e(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, alqs.a);
        int a = a(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            kz.r(this, a);
        }
    }

    private static boolean c(Context context) {
        return almu.n(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (c(context)) {
            b(context.getTheme(), i);
        }
    }
}
