package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dacv  reason: default package */
/* loaded from: classes5.dex */
public final class dacv extends xq {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public dacv(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.c || getButtonTintList() != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public dacv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.c = z;
        if (!z) {
            setButtonTintList(null);
            return;
        }
        if (this.b == null) {
            int c = dacz.c(this, R.attr.colorControlActivated);
            int c2 = dacz.c(this, R.attr.colorOnSurface);
            int c3 = dacz.c(this, R.attr.colorSurface);
            int[][] iArr = a;
            int length = iArr.length;
            this.b = new ColorStateList(iArr, new int[]{czxb.b(c3, c, 1.0f), czxb.b(c3, c2, 0.54f), czxb.b(c3, c2, 0.38f), czxb.b(c3, c2, 0.38f)});
        }
        setButtonTintList(this.b);
    }

    public dacv(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018741), attributeSet, i);
        Context context2 = getContext();
        TypedArray a2 = daaz.a(context2, attributeSet, dacw.a, i, 2132018741, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(dada.a(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }
}
