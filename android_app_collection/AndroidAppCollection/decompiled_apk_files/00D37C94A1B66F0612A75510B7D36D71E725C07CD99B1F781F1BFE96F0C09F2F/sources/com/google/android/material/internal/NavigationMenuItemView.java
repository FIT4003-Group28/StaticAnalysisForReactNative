package com.google.android.material.internal;

import android.content.Context;
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
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends alla implements su {
    private static final int[] d = {16842912};
    public boolean c;
    private int e;
    private final CheckedTextView f;
    private FrameLayout g;
    private si h;
    private final jo i;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.su
    public final si a() {
        return this.h;
    }

    @Override // defpackage.su
    public final boolean e() {
        return false;
    }

    @Override // defpackage.su
    public final void f(si siVar) {
        StateListDrawable stateListDrawable;
        this.h = siVar;
        int i = siVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != siVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            lj.O(this, stateListDrawable);
        }
        boolean isCheckable = siVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.i.f(this.f, 2048);
        }
        boolean isChecked = siVar.isChecked();
        refreshDrawableState();
        this.f.setChecked(isChecked);
        setEnabled(siVar.isEnabled());
        this.f.setText(siVar.d);
        Drawable icon = siVar.getIcon();
        if (icon != null) {
            int i2 = this.e;
            icon.setBounds(0, 0, i2, i2);
        }
        this.f.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = siVar.getActionView();
        if (actionView != null) {
            if (this.g == null) {
                this.g = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.g.removeAllViews();
            this.g.addView(actionView);
        }
        setContentDescription(siVar.l);
        hx.a(this, siVar.m);
        si siVar2 = this.h;
        if (siVar2.d != null || siVar2.getIcon() != null || this.h.getActionView() == null) {
            this.f.setVisibility(0);
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                return;
            }
            wl wlVar = (wl) frameLayout.getLayoutParams();
            wlVar.width = -2;
            this.g.setLayoutParams(wlVar);
            return;
        }
        this.f.setVisibility(8);
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            return;
        }
        wl wlVar2 = (wl) frameLayout2.getLayoutParams();
        wlVar2.width = -1;
        this.g.setLayoutParams(wlVar2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        si siVar = this.h;
        if (siVar != null && siVar.isCheckable() && this.h.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        allb allbVar = new allb(this);
        this.i = allbVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        lj.M(checkedTextView, allbVar);
    }
}
