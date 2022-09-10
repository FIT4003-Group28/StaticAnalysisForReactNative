package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uk  reason: default package */
/* loaded from: classes7.dex */
public final class uk {
    nf A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ ul F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public uk(ul ulVar, Menu menu) {
        this.F = ulVar;
        this.a = menu;
        a();
    }

    public static final char e(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            if (this.F.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            ul ulVar = this.F;
            if (ulVar.f == null) {
                ulVar.f = ulVar.a(ulVar.e);
            }
            menuItem.setOnMenuItemClickListener(new uj(ulVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof vi) {
                ((vi) menuItem).k(true);
            } else if (menuItem instanceof vo) {
                vo voVar = (vo) menuItem;
                try {
                    if (voVar.e == null) {
                        voVar.e = voVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    voVar.e.invoke(voVar.d, true);
                } catch (Exception unused) {
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) d(str, ul.a, this.F.c));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        nf nfVar = this.A;
        if (nfVar != null && (menuItem instanceof kz)) {
            ((kz) menuItem).c(nfVar);
        }
        CharSequence charSequence = this.B;
        boolean z2 = menuItem instanceof kz;
        if (z2) {
            ((kz) menuItem).b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.C;
        if (z2) {
            ((kz) menuItem).d(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((kz) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((kz) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((kz) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            if (z2) {
                ((kz) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT < 26) {
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    public final SubMenu c() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        b(addSubMenu.getItem());
        return addSubMenu;
    }

    public final <T> T d(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception unused) {
            String str2 = "Cannot instantiate class: " + str;
            return null;
        }
    }
}
