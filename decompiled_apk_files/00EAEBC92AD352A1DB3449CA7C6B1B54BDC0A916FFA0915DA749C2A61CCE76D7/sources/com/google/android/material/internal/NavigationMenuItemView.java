package com.google.android.material.internal;

import a.g.m.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements o.a {
    private static final int[] G = {16842912};
    private FrameLayout A;
    private j B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final a.g.m.a F;
    private int w;
    private boolean x;
    boolean y;
    private final CheckedTextView z;

    /* loaded from: classes.dex */
    class a extends a.g.m.a {
        a() {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            cVar.b(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(c.e.a.c.h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.e.a.c.d.design_navigation_icon_size));
        this.z = (CheckedTextView) findViewById(c.e.a.c.f.design_menu_item_text);
        this.z.setDuplicateParentStateEnabled(true);
        v.a(this.z, this.F);
    }

    private void d() {
        i0.a aVar;
        int i;
        if (f()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout == null) {
                return;
            }
            aVar = (i0.a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.z.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (i0.a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i;
        this.A.setLayoutParams(aVar);
    }

    private StateListDrawable e() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(a.a.a.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean f() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(c.e.a.c.f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void a(j jVar, int i) {
        this.B = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            v.a(this, e());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        z0.a(this, jVar.getTooltipText());
        d();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        j jVar = this.B;
        if (jVar != null && jVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.y != z) {
            this.y = z;
            this.F.a(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
                androidx.core.graphics.drawable.a.a(drawable, this.C);
            }
            int i = this.w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.x) {
            if (this.E == null) {
                this.E = a.g.e.f.f.b(getResources(), c.e.a.c.e.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.E;
                if (drawable2 != null) {
                    int i2 = this.w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        androidx.core.widget.i.a(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.w = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = this.C != null;
        j jVar = this.B;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.x = z;
    }

    public void setTextAppearance(int i) {
        androidx.core.widget.i.d(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
