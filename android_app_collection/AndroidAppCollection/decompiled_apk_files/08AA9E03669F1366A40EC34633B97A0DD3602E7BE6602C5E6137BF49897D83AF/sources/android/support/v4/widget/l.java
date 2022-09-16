package android.support.v4.widget;

import android.os.Build;
import android.support.v4.j.s;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final d f674a;

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private static Method f676a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f677b;

        public void a(PopupWindow popupWindow, boolean z) {
        }

        d() {
        }

        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((android.support.v4.j.e.a(i3, s.c(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        public void a(PopupWindow popupWindow, int i) {
            if (!f677b) {
                try {
                    f676a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    f676a.setAccessible(true);
                } catch (Exception unused) {
                }
                f677b = true;
            }
            if (f676a != null) {
                try {
                    f676a.invoke(popupWindow, Integer.valueOf(i));
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class a extends d {
        a() {
        }

        @Override // android.support.v4.widget.l.d
        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f675a;

        b() {
        }

        static {
            try {
                f675a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f675a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        @Override // android.support.v4.widget.l.d
        public void a(PopupWindow popupWindow, boolean z) {
            if (f675a != null) {
                try {
                    f675a.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.widget.l.b, android.support.v4.widget.l.d
        public void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @Override // android.support.v4.widget.l.d
        public void a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f674a = new c();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f674a = new b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f674a = new a();
        } else {
            f674a = new d();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f674a.a(popupWindow, view, i, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        f674a.a(popupWindow, z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        f674a.a(popupWindow, i);
    }
}
