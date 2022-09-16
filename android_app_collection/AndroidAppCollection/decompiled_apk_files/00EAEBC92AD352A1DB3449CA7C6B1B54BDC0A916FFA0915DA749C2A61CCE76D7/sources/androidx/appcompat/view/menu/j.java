package androidx.appcompat.view.menu;

import a.g.m.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o;
/* loaded from: classes.dex */
public final class j implements a.g.g.a.b {
    private View A;
    private a.g.m.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1062a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1063b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1064c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1065d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1066e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1067f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1068g;

    /* renamed from: h  reason: collision with root package name */
    private char f1069h;
    private char j;
    private Drawable l;
    g n;
    private s o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;
    private int i = 4096;
    private int k = 4096;
    private int m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0014b {
        a() {
        }

        @Override // a.g.m.b.InterfaceC0014b
        public void onActionProviderVisibilityChanged(boolean z) {
            j jVar = j.this;
            jVar.n.d(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.z = 0;
        this.n = gVar;
        this.f1062a = i2;
        this.f1063b = i;
        this.f1064c = i3;
        this.f1065d = i4;
        this.f1066e = charSequence;
        this.z = i5;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.a(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.a(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    private static void a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // a.g.g.a.b
    public a.g.g.a.b a(a.g.m.b bVar) {
        a.g.m.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.f();
        }
        this.A = null;
        this.B = bVar;
        this.n.b(true);
        a.g.m.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.a(new a());
        }
        return this;
    }

    @Override // a.g.g.a.b
    public a.g.m.b a() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a(o.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public void a(s sVar) {
        this.o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    public void a(boolean z) {
        this.D = z;
        this.n.b(false);
    }

    public void b() {
        this.n.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        int i = this.y;
        this.y = (z ? 2 : 0) | (i & (-3));
        if (i != this.y) {
            this.n.b(false);
        }
    }

    public int c() {
        return this.f1065d;
    }

    public void c(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char d() {
        return this.n.p() ? this.j : this.f1069h;
    }

    public void d(boolean z) {
        this.y = z ? this.y | 32 : this.y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        int i;
        char d2 = d();
        if (d2 == 0) {
            return "";
        }
        Resources resources = this.n.e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.a.h.abc_prepend_shortcut_label));
        }
        int i2 = this.n.p() ? this.k : this.i;
        a(sb, i2, 65536, resources.getString(a.a.h.abc_menu_meta_shortcut_label));
        a(sb, i2, 4096, resources.getString(a.a.h.abc_menu_ctrl_shortcut_label));
        a(sb, i2, 2, resources.getString(a.a.h.abc_menu_alt_shortcut_label));
        a(sb, i2, 1, resources.getString(a.a.h.abc_menu_shift_shortcut_label));
        a(sb, i2, 4, resources.getString(a.a.h.abc_menu_sym_shortcut_label));
        a(sb, i2, 8, resources.getString(a.a.h.abc_menu_function_shortcut_label));
        if (d2 == '\b') {
            i = a.a.h.abc_menu_delete_shortcut_label;
        } else if (d2 == '\n') {
            i = a.a.h.abc_menu_enter_shortcut_label;
        } else if (d2 != ' ') {
            sb.append(d2);
            return sb.toString();
        } else {
            i = a.a.h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(boolean z) {
        int i = this.y;
        this.y = (z ? 0 : 8) | (i & (-9));
        return i != this.y;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.n.b(this);
    }

    public boolean f() {
        a.g.m.b bVar;
        if ((this.z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.a(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            g gVar = this.n;
            if (gVar.a(gVar, this)) {
                return true;
            }
            Runnable runnable = this.p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1068g != null) {
                try {
                    this.n.e().startActivity(this.f1068g);
                    return true;
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            a.g.m.b bVar = this.B;
            return bVar != null && bVar.d();
        }
        return true;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        a.g.m.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        this.A = bVar.a(this);
        return this.A;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1063b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return a(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable c2 = a.a.k.a.a.c(this.n.e(), this.m);
        this.m = 0;
        this.l = c2;
        return a(c2);
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1068g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1062a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1069h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1064c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1066e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1067f;
        if (charSequence == null) {
            charSequence = this.f1066e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public boolean h() {
        return (this.y & 32) == 32;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public boolean i() {
        return (this.y & 4) != 0;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        a.g.m.b bVar = this.B;
        return (bVar == null || !bVar.e()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        return (this.z & 1) == 1;
    }

    public boolean k() {
        return (this.z & 2) == 2;
    }

    public boolean l() {
        return this.n.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.n.q() && d() != 0;
    }

    public boolean n() {
        return (this.z & 4) == 4;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setActionView */
    public a.g.g.a.b mo38setActionView(int i) {
        Context e2 = this.n.e();
        mo39setActionView(LayoutInflater.from(e2).inflate(i, (ViewGroup) new LinearLayout(e2), false));
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setActionView */
    public a.g.g.a.b mo39setActionView(View view) {
        int i;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i = this.f1062a) > 0) {
            view.setId(i);
        }
        this.n.c(this);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setActionView  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MenuItem mo38setActionView(int i) {
        mo38setActionView(i);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setActionView  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MenuItem mo39setActionView(View view) {
        mo39setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.j == c2 && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        this.y = (z ? 1 : 0) | (i & (-2));
        if (i != this.y) {
            this.n.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.a((MenuItem) this);
        } else {
            b(z);
        }
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public a.g.g.a.b mo40setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MenuItem mo40setContentDescription(CharSequence charSequence) {
        mo40setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.y = z ? this.y | 16 : this.y & (-17);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1068g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1069h == c2) {
            return this;
        }
        this.f1069h = c2;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f1069h == c2 && this.i == i) {
            return this;
        }
        this.f1069h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1069h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1069h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.z = i;
            this.n.c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setShowAsActionFlags */
    public a.g.g.a.b mo41setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setShowAsActionFlags  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MenuItem mo41setShowAsActionFlags(int i) {
        mo41setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.n.e().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1066e = charSequence;
        this.n.b(false);
        s sVar = this.o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1067f = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public a.g.g.a.b mo42setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // a.g.g.a.b, android.view.MenuItem
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MenuItem mo42setTooltipText(CharSequence charSequence) {
        mo42setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (e(z)) {
            this.n.d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1066e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
