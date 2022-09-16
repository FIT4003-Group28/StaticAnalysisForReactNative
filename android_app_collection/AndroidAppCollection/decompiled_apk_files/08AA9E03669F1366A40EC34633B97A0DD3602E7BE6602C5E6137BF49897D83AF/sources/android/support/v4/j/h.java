package android.support.v4.j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
/* compiled from: MenuItemCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final c f517a;

    /* compiled from: MenuItemCompat.java */
    /* loaded from: classes.dex */
    interface c {
        void a(MenuItem menuItem, char c2, int i);

        void a(MenuItem menuItem, ColorStateList colorStateList);

        void a(MenuItem menuItem, PorterDuff.Mode mode);

        void a(MenuItem menuItem, CharSequence charSequence);

        void b(MenuItem menuItem, char c2, int i);

        void b(MenuItem menuItem, CharSequence charSequence);
    }

    /* compiled from: MenuItemCompat.java */
    /* loaded from: classes.dex */
    static class b implements c {
        @Override // android.support.v4.j.h.c
        public void a(MenuItem menuItem, char c2, int i) {
        }

        @Override // android.support.v4.j.h.c
        public void a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        @Override // android.support.v4.j.h.c
        public void a(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        @Override // android.support.v4.j.h.c
        public void a(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // android.support.v4.j.h.c
        public void b(MenuItem menuItem, char c2, int i) {
        }

        @Override // android.support.v4.j.h.c
        public void b(MenuItem menuItem, CharSequence charSequence) {
        }

        b() {
        }
    }

    /* compiled from: MenuItemCompat.java */
    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void a(MenuItem menuItem, char c2, int i) {
            menuItem.setAlphabeticShortcut(c2, i);
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void b(MenuItem menuItem, char c2, int i) {
            menuItem.setNumericShortcut(c2, i);
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        @Override // android.support.v4.j.h.b, android.support.v4.j.h.c
        public void a(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f517a = new a();
        } else {
            f517a = new b();
        }
    }

    public static MenuItem a(MenuItem menuItem, android.support.v4.j.c cVar) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            return ((android.support.v4.d.a.b) menuItem).a(cVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).a(charSequence);
        } else {
            f517a.a(menuItem, charSequence);
        }
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).b(charSequence);
        } else {
            f517a.b(menuItem, charSequence);
        }
    }

    public static void a(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).setNumericShortcut(c2, i);
        } else {
            f517a.b(menuItem, c2, i);
        }
    }

    public static void b(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).setAlphabeticShortcut(c2, i);
        } else {
            f517a.a(menuItem, c2, i);
        }
    }

    public static void a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).setIconTintList(colorStateList);
        } else {
            f517a.a(menuItem, colorStateList);
        }
    }

    public static void a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            ((android.support.v4.d.a.b) menuItem).setIconTintMode(mode);
        } else {
            f517a.a(menuItem, mode);
        }
    }
}
