package a.g.g.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public interface b extends MenuItem {
    b a(a.g.m.b bVar);

    a.g.m.b a();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    /* renamed from: setActionView */
    MenuItem mo38setActionView(int i);

    @Override // android.view.MenuItem
    /* renamed from: setActionView */
    MenuItem mo39setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i);

    @Override // android.view.MenuItem
    /* renamed from: setContentDescription */
    b mo40setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    /* renamed from: setShowAsActionFlags */
    MenuItem mo41setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    /* renamed from: setTooltipText */
    b mo42setTooltipText(CharSequence charSequence);
}
