package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.j.c;
import android.support.v7.view.menu.n;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class h implements android.support.v4.d.a.b {
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    private View A;
    private android.support.v4.j.c B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    g f771a;

    /* renamed from: b  reason: collision with root package name */
    private final int f772b;

    /* renamed from: c  reason: collision with root package name */
    private final int f773c;

    /* renamed from: d  reason: collision with root package name */
    private final int f774d;
    private final int e;
    private CharSequence f;
    private CharSequence g;
    private Intent h;
    private char i;
    private char k;
    private Drawable m;
    private s o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;
    private int j = 4096;
    private int l = 4096;
    private int n = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.z = 0;
        this.f771a = gVar;
        this.f772b = i2;
        this.f773c = i;
        this.f774d = i3;
        this.e = i4;
        this.f = charSequence;
        this.z = i5;
    }

    public boolean b() {
        if ((this.q == null || !this.q.onMenuItemClick(this)) && !this.f771a.a(this.f771a, this)) {
            if (this.p != null) {
                this.p.run();
                return true;
            }
            if (this.h != null) {
                try {
                    this.f771a.d().startActivity(this.h);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            return this.B != null && this.B.d();
        }
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.f771a.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f773c;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f772b;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f774d;
    }

    public int c() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.k == c2) {
            return this;
        }
        this.k = Character.toLowerCase(c2);
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.k == c2 && this.l == i) {
            return this;
        }
        this.k = Character.toLowerCase(c2);
        this.l = KeyEvent.normalizeMetaState(i);
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.i;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.i == c2) {
            return this;
        }
        this.i = c2;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.i == c2 && this.j == i) {
            return this;
        }
        this.i = c2;
        this.j = KeyEvent.normalizeMetaState(i);
        this.f771a.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.i = c2;
        this.k = Character.toLowerCase(c3);
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.i = c2;
        this.j = KeyEvent.normalizeMetaState(i);
        this.k = Character.toLowerCase(c3);
        this.l = KeyEvent.normalizeMetaState(i2);
        this.f771a.b(false);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char d() {
        return this.f771a.a() ? this.k : this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        char d2 = d();
        if (d2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(F);
        if (d2 == '\b') {
            sb.append(H);
        } else if (d2 == '\n') {
            sb.append(G);
        } else if (d2 == ' ') {
            sb.append(I);
        } else {
            sb.append(d2);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f771a.b() && d() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public void a(s sVar) {
        this.o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a(n.a aVar) {
        if (aVar != null && aVar.a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f = charSequence;
        this.f771a.b(false);
        if (this.o != null) {
            this.o.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f771a.d().getString(i));
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.g != null ? this.g : this.f;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f;
        }
        this.f771a.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        if (this.m != null) {
            return a(this.m);
        }
        if (this.n == 0) {
            return null;
        }
        Drawable b2 = android.support.v7.b.a.b.b(this.f771a.d(), this.n);
        this.n = 0;
        this.m = b2;
        return a(b2);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.n = 0;
        this.m = drawable;
        this.x = true;
        this.f771a.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.m = null;
        this.n = i;
        this.x = true;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = android.support.v4.b.a.a.f(drawable).mutate();
            if (this.v) {
                android.support.v4.b.a.a.a(drawable, this.t);
            }
            if (this.w) {
                android.support.v4.b.a.a.a(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        this.y = (z ? 1 : 0) | (this.y & (-2));
        if (i != this.y) {
            this.f771a.b(false);
        }
        return this;
    }

    public void a(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public boolean g() {
        return (this.y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.f771a.a((MenuItem) this);
        } else {
            b(z);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        int i = this.y;
        this.y = (z ? 2 : 0) | (this.y & (-3));
        if (i != this.y) {
            this.f771a.b(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.B == null || !this.B.b()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(boolean z) {
        int i = this.y;
        this.y = (z ? 0 : 8) | (this.y & (-9));
        return i != this.y;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.f771a.a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        if (this.f != null) {
            return this.f.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public void h() {
        this.f771a.b(this);
    }

    public boolean i() {
        return this.f771a.n();
    }

    public boolean j() {
        return (this.y & 32) == 32;
    }

    public boolean k() {
        return (this.z & 1) == 1;
    }

    public boolean l() {
        return (this.z & 2) == 2;
    }

    public void d(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public boolean m() {
        return (this.z & 4) == 4;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.z = i;
                this.f771a.b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    /* renamed from: a */
    public android.support.v4.d.a.b setActionView(View view) {
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && this.f772b > 0) {
            view.setId(this.f772b);
        }
        this.f771a.b(this);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    /* renamed from: a */
    public android.support.v4.d.a.b setActionView(int i) {
        Context d2 = this.f771a.d();
        setActionView(LayoutInflater.from(d2).inflate(i, (ViewGroup) new LinearLayout(d2), false));
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.B == null) {
            return null;
        }
        this.A = this.B.a(this);
        return this.A;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.support.v4.d.a.b
    public android.support.v4.j.c a() {
        return this.B;
    }

    @Override // android.support.v4.d.a.b
    public android.support.v4.d.a.b a(android.support.v4.j.c cVar) {
        if (this.B != null) {
            this.B.f();
        }
        this.A = null;
        this.B = cVar;
        this.f771a.b(true);
        if (this.B != null) {
            this.B.a(new c.b() { // from class: android.support.v7.view.menu.h.1
                @Override // android.support.v4.j.c.b
                public void a(boolean z) {
                    h.this.f771a.a(h.this);
                }
            });
        }
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    /* renamed from: b */
    public android.support.v4.d.a.b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!n()) {
            return false;
        }
        if (this.C != null && !this.C.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f771a.c(this);
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        if (this.C != null && !this.C.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f771a.d(this);
    }

    public boolean n() {
        if ((this.z & 8) != 0) {
            if (this.A == null && this.B != null) {
                this.A = this.B.a(this);
            }
            return this.A != null;
        }
        return false;
    }

    public void e(boolean z) {
        this.D = z;
        this.f771a.b(false);
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: a */
    public android.support.v4.d.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    /* renamed from: b */
    public android.support.v4.d.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.f771a.b(false);
        return this;
    }

    @Override // android.support.v4.d.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }
}
