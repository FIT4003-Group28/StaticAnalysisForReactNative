package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
/* compiled from: PG */
/* renamed from: vi  reason: default package */
/* loaded from: classes7.dex */
public final class vi implements kz {
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public char h;
    public final vf j;
    public wb k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public nf o;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private MenuItem.OnMenuItemClickListener u;
    public int g = 4096;
    public int i = 4096;
    private int t = 0;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 16;
    public boolean p = false;

    public vi(vf vfVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.j = vfVar;
        this.a = i2;
        this.b = i;
        this.q = i3;
        this.c = i4;
        this.d = charSequence;
        this.n = i5;
    }

    public static void g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private final Drawable v(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = ks.b(drawable).mutate();
            if (this.x) {
                drawable.setTintList(this.v);
            }
            if (this.y) {
                drawable.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // defpackage.kz
    public final nf a() {
        return this.o;
    }

    @Override // defpackage.kz
    public final void b(CharSequence charSequence) {
        this.l = charSequence;
        this.j.r(false);
    }

    @Override // defpackage.kz
    public final void c(nf nfVar) {
        nf nfVar2 = this.o;
        if (nfVar2 != null) {
            nfVar2.a = null;
        }
        this.B = null;
        this.o = nfVar;
        this.j.r(true);
        nf nfVar3 = this.o;
        if (nfVar3 != null) {
            nfVar3.h(new vh(this));
        }
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.n & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.j.A(this);
    }

    @Override // defpackage.kz
    public final void d(CharSequence charSequence) {
        this.m = charSequence;
        this.j.r(false);
    }

    public final boolean e() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            vf vfVar = this.j;
            if (vfVar.l(vfVar, this)) {
                return true;
            }
            Intent intent = this.e;
            if (intent != null) {
                try {
                    this.j.a.startActivity(intent);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            nf nfVar = this.o;
            return nfVar != null && nfVar.e();
        }
        return true;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final boolean expandActionView() {
        if (!s()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.j.z(this);
    }

    public final char f() {
        return this.j.j() ? this.h : this.f;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final View getActionView() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        nf nfVar = this.o;
        if (nfVar == null) {
            return null;
        }
        View b = nfVar.b(this);
        this.B = b;
        return b;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return v(drawable);
        }
        int i = this.t;
        if (i == 0) {
            return null;
        }
        Drawable b = sl.b(this.j.a, i);
        this.t = 0;
        this.s = b;
        return v(b);
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.e;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.k;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.m;
    }

    public final boolean h() {
        return this.j.k() && f() != 0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.k != null;
    }

    public final void i(wb wbVar) {
        this.k = wbVar;
        wbVar.setHeaderTitle(this.d);
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        nf nfVar = this.o;
        return (nfVar == null || !nfVar.c()) ? (this.A & 8) == 0 : (this.A & 8) == 0 && this.o.d();
    }

    public final CharSequence j(vu vuVar) {
        return (vuVar == null || !vuVar.b()) ? this.d : getTitleCondensed();
    }

    public final void k(boolean z) {
        this.A = (true != z ? 0 : 4) | (this.A & (-5));
    }

    public final boolean l() {
        return (this.A & 4) != 0;
    }

    final void m(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 0 : 2) | (i & (-3));
        this.A = i2;
        if (i != i2) {
            this.j.r(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 8 : 0) | (i & (-9));
        this.A = i2;
        return i != i2;
    }

    public final boolean o() {
        return (this.A & 32) == 32;
    }

    public final boolean p() {
        return (this.n & 1) == 1;
    }

    public final boolean q() {
        return (this.n & 2) == 2;
    }

    public final void r(boolean z) {
        this.A = z ? this.A | 32 : this.A & (-33);
    }

    public final boolean s() {
        nf nfVar;
        if ((this.n & 8) != 0) {
            if (this.B == null && (nfVar = this.o) != null) {
                this.B = nfVar.b(this);
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.j.a;
        u(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        u(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.j.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A = i2;
        if (i != i2) {
            this.j.r(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.A & 4) != 0) {
            vf vfVar = this.j;
            int i = this.b;
            int size = vfVar.c.size();
            vfVar.s();
            for (int i2 = 0; i2 < size; i2++) {
                vi viVar = vfVar.c.get(i2);
                if (viVar.b == i && viVar.l() && viVar.isCheckable()) {
                    viVar.m(viVar == this);
                }
            }
            vfVar.t();
        } else {
            m(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.A |= 16;
        } else {
            this.A &= -17;
        }
        this.j.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.j.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.e = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f == c) {
            return this;
        }
        this.f = c;
        this.j.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f = c;
        this.h = Character.toLowerCase(c2);
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.j.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        this.j.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        d(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (n(z)) {
            this.j.C();
        }
        return this;
    }

    public final void t(boolean z) {
        this.p = z;
        this.j.r(false);
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(View view) {
        int i;
        this.B = view;
        this.o = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.j.B();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f == c && this.g == i) {
            return this;
        }
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(i);
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.n = i;
            this.j.B();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.j.r(false);
        wb wbVar = this.k;
        if (wbVar != null) {
            wbVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.i = KeyEvent.normalizeMetaState(i);
        this.j.r(false);
        return this;
    }

    @Override // defpackage.kz, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(i);
        this.h = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j.r(false);
        return this;
    }
}