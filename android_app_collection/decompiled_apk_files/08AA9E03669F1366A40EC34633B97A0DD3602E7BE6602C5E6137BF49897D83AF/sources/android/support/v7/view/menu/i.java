package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
/* compiled from: MenuItemWrapperICS.java */
/* loaded from: classes.dex */
public class i extends android.support.v7.view.menu.c<android.support.v4.d.a.b> implements MenuItem {

    /* renamed from: c  reason: collision with root package name */
    private Method f776c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, android.support.v4.d.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((android.support.v4.d.a.b) this.f748b).getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((android.support.v4.d.a.b) this.f748b).getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((android.support.v4.d.a.b) this.f748b).getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((android.support.v4.d.a.b) this.f748b).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((android.support.v4.d.a.b) this.f748b).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((android.support.v4.d.a.b) this.f748b).getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((android.support.v4.d.a.b) this.f748b).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((android.support.v4.d.a.b) this.f748b).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((android.support.v4.d.a.b) this.f748b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((android.support.v4.d.a.b) this.f748b).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((android.support.v4.d.a.b) this.f748b).getIcon();
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((android.support.v4.d.a.b) this.f748b).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((android.support.v4.d.a.b) this.f748b).getIntent();
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((android.support.v4.d.a.b) this.f748b).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((android.support.v4.d.a.b) this.f748b).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((android.support.v4.d.a.b) this.f748b).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((android.support.v4.d.a.b) this.f748b).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((android.support.v4.d.a.b) this.f748b).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((android.support.v4.d.a.b) this.f748b).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((android.support.v4.d.a.b) this.f748b).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((android.support.v4.d.a.b) this.f748b).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((android.support.v4.d.a.b) this.f748b).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((android.support.v4.d.a.b) this.f748b).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((android.support.v4.d.a.b) this.f748b).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((android.support.v4.d.a.b) this.f748b).isCheckable();
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((android.support.v4.d.a.b) this.f748b).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((android.support.v4.d.a.b) this.f748b).isChecked();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((android.support.v4.d.a.b) this.f748b).setVisible(z);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((android.support.v4.d.a.b) this.f748b).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((android.support.v4.d.a.b) this.f748b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((android.support.v4.d.a.b) this.f748b).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((android.support.v4.d.a.b) this.f748b).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return a(((android.support.v4.d.a.b) this.f748b).getSubMenu());
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((android.support.v4.d.a.b) this.f748b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((android.support.v4.d.a.b) this.f748b).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((android.support.v4.d.a.b) this.f748b).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((android.support.v4.d.a.b) this.f748b).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((android.support.v4.d.a.b) this.f748b).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((android.support.v4.d.a.b) this.f748b).setActionView(i);
        View actionView = ((android.support.v4.d.a.b) this.f748b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((android.support.v4.d.a.b) this.f748b).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((android.support.v4.d.a.b) this.f748b).getActionView();
        return actionView instanceof b ? ((b) actionView).c() : actionView;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((android.support.v4.d.a.b) this.f748b).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        android.support.v4.j.c a2 = ((android.support.v4.d.a.b) this.f748b).a();
        if (a2 instanceof a) {
            return ((a) a2).f777a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((android.support.v4.d.a.b) this.f748b).expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((android.support.v4.d.a.b) this.f748b).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((android.support.v4.d.a.b) this.f748b).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((android.support.v4.d.a.b) this.f748b).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((android.support.v4.d.a.b) this.f748b).a(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((android.support.v4.d.a.b) this.f748b).getContentDescription();
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((android.support.v4.d.a.b) this.f748b).b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((android.support.v4.d.a.b) this.f748b).getTooltipText();
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((android.support.v4.d.a.b) this.f748b).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((android.support.v4.d.a.b) this.f748b).getIconTintList();
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((android.support.v4.d.a.b) this.f748b).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((android.support.v4.d.a.b) this.f748b).getIconTintMode();
    }

    public void a(boolean z) {
        try {
            if (this.f776c == null) {
                this.f776c = ((android.support.v4.d.a.b) this.f748b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f776c.invoke(this.f748b, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    a a(ActionProvider actionProvider) {
        return new a(this.f745a, actionProvider);
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class d extends android.support.v7.view.menu.d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f748b).onMenuItemClick(i.this.a(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class c extends android.support.v7.view.menu.d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f748b).onMenuItemActionExpand(i.this.a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f748b).onMenuItemActionCollapse(i.this.a(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class a extends android.support.v4.j.c {

        /* renamed from: a  reason: collision with root package name */
        final ActionProvider f777a;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f777a = actionProvider;
        }

        @Override // android.support.v4.j.c
        public View a() {
            return this.f777a.onCreateActionView();
        }

        @Override // android.support.v4.j.c
        public boolean d() {
            return this.f777a.onPerformDefaultAction();
        }

        @Override // android.support.v4.j.c
        public boolean e() {
            return this.f777a.hasSubMenu();
        }

        @Override // android.support.v4.j.c
        public void a(SubMenu subMenu) {
            this.f777a.onPrepareSubMenu(i.this.a(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    static class b extends FrameLayout implements android.support.v7.view.b {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f779a;

        b(View view) {
            super(view.getContext());
            this.f779a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // android.support.v7.view.b
        public void a() {
            this.f779a.onActionViewExpanded();
        }

        @Override // android.support.v7.view.b
        public void b() {
            this.f779a.onActionViewCollapsed();
        }

        View c() {
            return (View) this.f779a;
        }
    }
}
