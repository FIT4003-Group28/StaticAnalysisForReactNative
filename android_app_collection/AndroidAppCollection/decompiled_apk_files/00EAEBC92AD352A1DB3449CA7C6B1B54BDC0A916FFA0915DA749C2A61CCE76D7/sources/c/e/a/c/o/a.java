package c.e.a.c.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import c.e.a.c.b;
import c.e.a.c.j;
import c.e.a.c.k;
/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: g  reason: collision with root package name */
    private static final int f4758g = j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f4759h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f4760e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4761f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(com.google.android.material.internal.g.b(context, attributeSet, i, f4758g), attributeSet, i);
        Context context2 = getContext();
        TypedArray c2 = com.google.android.material.internal.g.c(context2, attributeSet, k.MaterialCheckBox, i, f4758g, new int[0]);
        if (c2.hasValue(k.MaterialCheckBox_buttonTint)) {
            c.a(this, c.e.a.c.x.c.a(context2, c2, k.MaterialCheckBox_buttonTint));
        }
        this.f4761f = c2.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4760e == null) {
            int[] iArr = new int[f4759h.length];
            int a2 = c.e.a.c.q.a.a(this, b.colorControlActivated);
            int a3 = c.e.a.c.q.a.a(this, b.colorSurface);
            int a4 = c.e.a.c.q.a.a(this, b.colorOnSurface);
            iArr[0] = c.e.a.c.q.a.a(a3, a2, 1.0f);
            iArr[1] = c.e.a.c.q.a.a(a3, a4, 0.54f);
            iArr[2] = c.e.a.c.q.a.a(a3, a4, 0.38f);
            iArr[3] = c.e.a.c.q.a.a(a3, a4, 0.38f);
            this.f4760e = new ColorStateList(f4759h, iArr);
        }
        return this.f4760e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f4761f || c.b(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4761f = z;
        c.a(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
