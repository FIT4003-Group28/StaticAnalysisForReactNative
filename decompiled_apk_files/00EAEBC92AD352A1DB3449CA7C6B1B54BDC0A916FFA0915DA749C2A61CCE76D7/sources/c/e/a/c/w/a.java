package c.e.a.c.w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import c.e.a.c.b;
import c.e.a.c.j;
import c.e.a.c.k;
import com.google.android.material.internal.g;
/* loaded from: classes.dex */
public class a extends s {

    /* renamed from: g  reason: collision with root package name */
    private static final int f4780g = j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f4781h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f4782e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4783f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(g.b(context, attributeSet, i, f4780g), attributeSet, i);
        TypedArray c2 = g.c(getContext(), attributeSet, k.MaterialRadioButton, i, f4780g, new int[0]);
        this.f4783f = c2.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4782e == null) {
            int a2 = c.e.a.c.q.a.a(this, b.colorControlActivated);
            int a3 = c.e.a.c.q.a.a(this, b.colorOnSurface);
            int a4 = c.e.a.c.q.a.a(this, b.colorSurface);
            int[] iArr = new int[f4781h.length];
            iArr[0] = c.e.a.c.q.a.a(a4, a2, 1.0f);
            iArr[1] = c.e.a.c.q.a.a(a4, a3, 0.54f);
            iArr[2] = c.e.a.c.q.a.a(a4, a3, 0.38f);
            iArr[3] = c.e.a.c.q.a.a(a4, a3, 0.38f);
            this.f4782e = new ColorStateList(f4781h, iArr);
        }
        return this.f4782e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f4783f || c.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4783f = z;
        c.a(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
