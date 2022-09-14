package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import c.e.a.c.j;
import c.e.a.c.k;
import com.google.android.material.internal.g;
/* loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: e  reason: collision with root package name */
    private int f7982e;

    /* renamed from: f  reason: collision with root package name */
    private int f7983f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7984g;

    /* renamed from: h  reason: collision with root package name */
    private d f7985h;
    private final b i;
    private e j;
    private int k;
    private boolean l;

    /* loaded from: classes.dex */
    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.l) {
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.k != id) {
                    return;
                }
                ChipGroup.this.setCheckedId(-1);
                return;
            }
            if (ChipGroup.this.k != -1 && ChipGroup.this.k != id && ChipGroup.this.f7984g) {
                ChipGroup chipGroup = ChipGroup.this;
                chipGroup.a(chipGroup.k, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(ChipGroup chipGroup, int i);
    }

    /* loaded from: classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f7987b;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7987b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7987b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.e.a.c.b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new b();
        this.j = new e();
        this.k = -1;
        this.l = false;
        TypedArray c2 = g.c(context, attributeSet, k.ChipGroup, i, j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = c2.getDimensionPixelOffset(k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c2.getDimensionPixelOffset(k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c2.getDimensionPixelOffset(k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c2.getBoolean(k.ChipGroup_singleLine, false));
        setSingleSelection(c2.getBoolean(k.ChipGroup_singleSelection, false));
        int resourceId = c2.getResourceId(k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.k = resourceId;
        }
        c2.recycle();
        super.setOnHierarchyChangeListener(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.l = true;
            ((Chip) findViewById).setChecked(z);
            this.l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.k = i;
        d dVar = this.f7985h;
        if (dVar == null || !this.f7984g) {
            return;
        }
        dVar.a(this, i);
    }

    @Override // com.google.android.material.internal.c
    public boolean a() {
        return super.a();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.k;
                if (i2 != -1 && this.f7984g) {
                    a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public void b() {
        this.l = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.l = false;
        setCheckedId(-1);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f7984g) {
            return this.k;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f7982e;
    }

    public int getChipSpacingVertical() {
        return this.f7983f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.k;
        if (i != -1) {
            a(i, true);
            setCheckedId(this.k);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f7982e != i) {
            this.f7982e = i;
            setItemSpacing(i);
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
        if (this.f7983f != i) {
            this.f7983f = i;
            setLineSpacing(i);
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

    public void setOnCheckedChangeListener(d dVar) {
        this.f7985h = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f7987b = onHierarchyChangeListener;
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

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f7984g != z) {
            this.f7984g = z;
            b();
        }
    }
}
