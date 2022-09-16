package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: almh  reason: default package */
/* loaded from: classes.dex */
public final class almh extends uj {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public almh(Context context, AttributeSet attributeSet) {
        super(alqt.a(context, attributeSet, R.attr.radioButtonStyle, 2132084401), attributeSet);
        Context context2 = getContext();
        TypedArray a2 = alli.a(context2, attributeSet, almi.a, R.attr.radioButtonStyle, 2132084401, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(almu.f(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.c || getButtonTintList() != null) {
            return;
        }
        this.c = true;
        if (this.b == null) {
            int k = almu.k(this, R.attr.colorControlActivated);
            int k2 = almu.k(this, R.attr.colorOnSurface);
            int k3 = almu.k(this, R.attr.colorSurface);
            int[][] iArr = a;
            int length = iArr.length;
            this.b = new ColorStateList(iArr, new int[]{amxp.z(k3, k, 1.0f), amxp.z(k3, k2, 0.54f), amxp.z(k3, k2, 0.38f), amxp.z(k3, k2, 0.38f)});
        }
        setButtonTintList(this.b);
    }
}
