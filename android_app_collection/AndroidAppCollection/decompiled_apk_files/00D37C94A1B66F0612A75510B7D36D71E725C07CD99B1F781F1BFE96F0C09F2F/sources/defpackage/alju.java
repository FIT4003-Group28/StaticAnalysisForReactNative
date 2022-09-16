package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alju  reason: default package */
/* loaded from: classes.dex */
public final class alju extends tz {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public alju(Context context, AttributeSet attributeSet) {
        super(alqt.a(context, attributeSet, R.attr.checkboxStyle, 2132084400), attributeSet);
        Context context2 = getContext();
        TypedArray a2 = alli.a(context2, attributeSet, aljv.a, R.attr.checkboxStyle, 2132084400, new int[0]);
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
            int[][] iArr = a;
            int length = iArr.length;
            int k = almu.k(this, R.attr.colorControlActivated);
            int k2 = almu.k(this, R.attr.colorSurface);
            int k3 = almu.k(this, R.attr.colorOnSurface);
            this.b = new ColorStateList(iArr, new int[]{amxp.z(k2, k, 1.0f), amxp.z(k2, k3, 0.54f), amxp.z(k2, k3, 0.38f), amxp.z(k2, k3, 0.38f)});
        }
        setButtonTintList(this.b);
    }
}
