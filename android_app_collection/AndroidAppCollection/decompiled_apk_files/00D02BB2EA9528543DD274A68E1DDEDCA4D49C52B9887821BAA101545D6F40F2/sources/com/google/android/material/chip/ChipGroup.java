package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ChipGroup extends daal {
    public int a;
    public boolean b;
    public boolean c;
    public final czww d;
    public int e;
    public boolean f;
    private int k;
    private czwy l;
    private czwz m;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        b(i, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.e;
                if (i2 != -1 && this.b) {
                    c(i2, false);
                }
                a(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i, boolean z) {
        this.e = i;
        czwy czwyVar = this.l;
        if (czwyVar == null || !this.b || !z) {
            return;
        }
        czwyVar.a();
    }

    public final void c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f = true;
            ((Chip) findViewById).setChecked(z);
            this.f = false;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof czwx);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new czwx();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new czwx(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.e;
        if (i != -1) {
            c(i, true);
            a(this.e);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pc a = pc.a(accessibilityNodeInfo);
        if (this.i) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        int i3 = this.j;
        int i4 = 1;
        if (true != this.b) {
            i4 = 2;
        }
        a.H(oz.b(i3, i, i4));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.a != i) {
            this.a = i;
            this.h = i;
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.k != i) {
            this.k = i;
            this.g = i;
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(czwy czwyVar) {
        this.l = czwyVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.m.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.c = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new czwx(layoutParams);
    }

    @Override // defpackage.daal
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.f = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f = false;
            a(-1);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018737), attributeSet, i);
        this.d = new czww(this);
        this.m = new czwz(this);
        this.e = -1;
        this.f = false;
        TypedArray a = daaz.a(getContext(), attributeSet, czxa.b, i, 2132018737, new int[0]);
        int dimensionPixelOffset = a.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(a.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(a.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(a.getBoolean(5, false));
        setSingleSelection(a.getBoolean(6, false));
        setSelectionRequired(a.getBoolean(4, false));
        int resourceId = a.getResourceId(0, -1);
        if (resourceId != -1) {
            this.e = resourceId;
        }
        a.recycle();
        super.setOnHierarchyChangeListener(this.m);
        od.m(this, 1);
    }
}
