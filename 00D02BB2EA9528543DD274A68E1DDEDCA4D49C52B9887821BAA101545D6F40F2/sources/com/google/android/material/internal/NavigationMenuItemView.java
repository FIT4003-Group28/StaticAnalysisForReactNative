package com.google.android.material.internal;

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
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationMenuItemView extends daam implements vu {
    private static final int[] d = {16842912};
    public boolean c;
    private int e;
    private boolean i;
    private final CheckedTextView j;
    private FrameLayout k;
    private vi l;
    private Drawable m;
    private final ne n;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.vu
    public final vi a() {
        return this.l;
    }

    @Override // defpackage.vu
    public final boolean b() {
        return false;
    }

    @Override // defpackage.vu
    public final void f(vi viVar) {
        StateListDrawable stateListDrawable;
        this.l = viVar;
        int i = viVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != viVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            od.U(this, stateListDrawable);
        }
        setCheckable(viVar.isCheckable());
        setChecked(viVar.isChecked());
        setEnabled(viVar.isEnabled());
        setTitle(viVar.d);
        setIcon(viVar.getIcon());
        View actionView = viVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(viVar.l);
        afb.a(this, viVar.m);
        vi viVar2 = this.l;
        if (viVar2.d != null || viVar2.getIcon() != null || this.l.getActionView() == null) {
            this.j.setVisibility(0);
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                return;
            }
            aaa aaaVar = (aaa) frameLayout.getLayoutParams();
            aaaVar.width = -2;
            this.k.setLayoutParams(aaaVar);
            return;
        }
        this.j.setVisibility(8);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            return;
        }
        aaa aaaVar2 = (aaa) frameLayout2.getLayoutParams();
        aaaVar2.width = -1;
        this.k.setLayoutParams(aaaVar2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        vi viVar = this.l;
        if (viVar != null && viVar.isCheckable() && this.l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.c != z) {
            this.c = z;
            this.n.a(this.j, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.j.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            int i = this.e;
            drawable.setBounds(0, 0, i, i);
        } else if (this.i) {
            if (this.m == null) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.navigation_empty_icon, getContext().getTheme());
                this.m = drawable2;
                if (drawable2 != null) {
                    int i2 = this.e;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.m;
        }
        this.j.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.j.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.e = i;
    }

    public void setMaxLines(int i) {
        this.j.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.i = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        qf.a(this.j, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.j.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        daao daaoVar = new daao(this);
        this.n = daaoVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.j = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        od.c(checkedTextView, daaoVar);
    }
}
