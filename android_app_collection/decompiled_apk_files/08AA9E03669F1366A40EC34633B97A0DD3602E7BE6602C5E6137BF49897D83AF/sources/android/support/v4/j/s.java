package android.support.v4.j;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    static final j f526a;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class j {

        /* renamed from: b  reason: collision with root package name */
        static boolean f530b = false;

        /* renamed from: c  reason: collision with root package name */
        private static Field f531c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f532d;
        private static WeakHashMap<View, String> e;
        private static final AtomicInteger f = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        WeakHashMap<View, w> f533a = null;

        public x a(View view, x xVar) {
            return xVar;
        }

        public void a(View view, float f2) {
        }

        public void a(View view, int i) {
        }

        public void a(View view, p pVar) {
        }

        public int b(View view) {
            return 0;
        }

        public x b(View view, x xVar) {
            return xVar;
        }

        public void e(View view) {
        }

        public boolean f(View view) {
            return false;
        }

        public boolean g(View view) {
            return true;
        }

        public int h(View view) {
            return 0;
        }

        public int i(View view) {
            return 0;
        }

        public float m(View view) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        j() {
        }

        public void a(View view, android.support.v4.j.b bVar) {
            view.setAccessibilityDelegate(bVar == null ? null : bVar.a());
        }

        public void a(View view) {
            view.postInvalidate();
        }

        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, a());
        }

        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, a() + j);
        }

        long a() {
            return ValueAnimator.getFrameDelay();
        }

        public ViewParent c(View view) {
            return view.getParent();
        }

        public int d(View view) {
            if (!f532d) {
                try {
                    f531c = View.class.getDeclaredField("mMinHeight");
                    f531c.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f532d = true;
            }
            if (f531c != null) {
                try {
                    return ((Integer) f531c.get(view)).intValue();
                } catch (Exception unused2) {
                    return 0;
                }
            }
            return 0;
        }

        public void a(View view, String str) {
            if (e == null) {
                e = new WeakHashMap<>();
            }
            e.put(view, str);
        }

        public String l(View view) {
            if (e == null) {
                return null;
            }
            return e.get(view);
        }

        public boolean n(View view) {
            if (view instanceof android.support.v4.j.j) {
                return ((android.support.v4.j.j) view).isNestedScrollingEnabled();
            }
            return false;
        }

        public void a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public ColorStateList p(View view) {
            if (view instanceof r) {
                return ((r) view).getSupportBackgroundTintList();
            }
            return null;
        }

        public void a(View view, ColorStateList colorStateList) {
            if (view instanceof r) {
                ((r) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void a(View view, PorterDuff.Mode mode) {
            if (view instanceof r) {
                ((r) view).setSupportBackgroundTintMode(mode);
            }
        }

        public PorterDuff.Mode q(View view) {
            if (view instanceof r) {
                return ((r) view).getSupportBackgroundTintMode();
            }
            return null;
        }

        public void o(View view) {
            if (view instanceof android.support.v4.j.j) {
                ((android.support.v4.j.j) view).stopNestedScroll();
            }
        }

        public boolean j(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean k(View view) {
            return view.getWindowToken() != null;
        }

        public void b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                r(view);
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                }
                r((View) parent);
            }
        }

        public void c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                r(view);
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                }
                r((View) parent);
            }
        }

        private static void r(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class a extends j {
        a() {
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.j.s.j
        public void a(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @Override // android.support.v4.j.s.j
        public int b(View view) {
            return view.getImportantForAccessibility();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        @Override // android.support.v4.j.s.j
        public ViewParent c(View view) {
            return view.getParentForAccessibility();
        }

        @Override // android.support.v4.j.s.j
        public int d(View view) {
            return view.getMinimumHeight();
        }

        @Override // android.support.v4.j.s.j
        public void e(View view) {
            view.requestFitSystemWindows();
        }

        @Override // android.support.v4.j.s.j
        public boolean f(View view) {
            return view.getFitsSystemWindows();
        }

        @Override // android.support.v4.j.s.j
        public boolean g(View view) {
            return view.hasOverlappingRendering();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.j.s.j
        public int h(View view) {
            return view.getLayoutDirection();
        }

        @Override // android.support.v4.j.s.j
        public int i(View view) {
            return view.getWindowSystemUiVisibility();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class d extends c {
        d() {
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class e extends d {
        e() {
        }

        @Override // android.support.v4.j.s.b, android.support.v4.j.s.j
        public void a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        @Override // android.support.v4.j.s.j
        public boolean j(View view) {
            return view.isLaidOut();
        }

        @Override // android.support.v4.j.s.j
        public boolean k(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class f extends e {

        /* renamed from: c  reason: collision with root package name */
        private static ThreadLocal<Rect> f527c;

        f() {
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, String str) {
            view.setTransitionName(str);
        }

        @Override // android.support.v4.j.s.j
        public String l(View view) {
            return view.getTransitionName();
        }

        @Override // android.support.v4.j.s.b, android.support.v4.j.s.j
        public void e(View view) {
            view.requestApplyInsets();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, float f) {
            view.setElevation(f);
        }

        @Override // android.support.v4.j.s.j
        public float m(View view) {
            return view.getElevation();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, final p pVar) {
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.j.s.f.1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        return (WindowInsets) x.a(pVar.a(view2, x.a(windowInsets)));
                    }
                });
            }
        }

        @Override // android.support.v4.j.s.j
        public boolean n(View view) {
            return view.isNestedScrollingEnabled();
        }

        @Override // android.support.v4.j.s.j
        public void o(View view) {
            view.stopNestedScroll();
        }

        @Override // android.support.v4.j.s.j
        public ColorStateList p(View view) {
            return view.getBackgroundTintList();
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // android.support.v4.j.s.j
        public void a(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // android.support.v4.j.s.j
        public PorterDuff.Mode q(View view) {
            return view.getBackgroundTintMode();
        }

        @Override // android.support.v4.j.s.j
        public x a(View view, x xVar) {
            WindowInsets windowInsets = (WindowInsets) x.a(xVar);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return x.a(windowInsets);
        }

        @Override // android.support.v4.j.s.j
        public x b(View view, x xVar) {
            WindowInsets windowInsets = (WindowInsets) x.a(xVar);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (dispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(dispatchApplyWindowInsets);
            }
            return x.a(windowInsets);
        }

        @Override // android.support.v4.j.s.j
        public void b(View view, int i) {
            boolean z;
            Rect b2 = b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.b(view, i);
            if (!z || !b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(b2);
        }

        @Override // android.support.v4.j.s.j
        public void c(View view, int i) {
            boolean z;
            Rect b2 = b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.c(view, i);
            if (!z || !b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(b2);
        }

        private static Rect b() {
            if (f527c == null) {
                f527c = new ThreadLocal<>();
            }
            Rect rect = f527c.get();
            if (rect == null) {
                rect = new Rect();
                f527c.set(rect);
            }
            rect.setEmpty();
            return rect;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class g extends f {
        g() {
        }

        @Override // android.support.v4.j.s.f, android.support.v4.j.s.j
        public void b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        @Override // android.support.v4.j.s.f, android.support.v4.j.s.j
        public void c(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class h extends g {
        h() {
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class i extends h {
        i() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f526a = new i();
        } else if (Build.VERSION.SDK_INT >= 24) {
            f526a = new h();
        } else if (Build.VERSION.SDK_INT >= 23) {
            f526a = new g();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f526a = new f();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f526a = new e();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f526a = new d();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f526a = new c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f526a = new b();
        } else if (Build.VERSION.SDK_INT >= 15) {
            f526a = new a();
        } else {
            f526a = new j();
        }
    }

    public static void a(View view, android.support.v4.j.b bVar) {
        f526a.a(view, bVar);
    }

    public static void a(View view) {
        f526a.a(view);
    }

    public static void a(View view, Runnable runnable) {
        f526a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j2) {
        f526a.a(view, runnable, j2);
    }

    public static int b(View view) {
        return f526a.b(view);
    }

    public static void a(View view, int i2) {
        f526a.a(view, i2);
    }

    public static int c(View view) {
        return f526a.h(view);
    }

    public static ViewParent d(View view) {
        return f526a.c(view);
    }

    public static int e(View view) {
        return f526a.d(view);
    }

    public static void a(View view, float f2) {
        f526a.a(view, f2);
    }

    public static float f(View view) {
        return f526a.m(view);
    }

    public static void a(View view, String str) {
        f526a.a(view, str);
    }

    public static String g(View view) {
        return f526a.l(view);
    }

    public static int h(View view) {
        return f526a.i(view);
    }

    public static void i(View view) {
        f526a.e(view);
    }

    public static boolean j(View view) {
        return f526a.f(view);
    }

    public static void a(View view, p pVar) {
        f526a.a(view, pVar);
    }

    public static x a(View view, x xVar) {
        return f526a.a(view, xVar);
    }

    public static x b(View view, x xVar) {
        return f526a.b(view, xVar);
    }

    public static boolean k(View view) {
        return f526a.g(view);
    }

    public static void a(View view, Drawable drawable) {
        f526a.a(view, drawable);
    }

    public static ColorStateList l(View view) {
        return f526a.p(view);
    }

    public static void a(View view, ColorStateList colorStateList) {
        f526a.a(view, colorStateList);
    }

    public static PorterDuff.Mode m(View view) {
        return f526a.q(view);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        f526a.a(view, mode);
    }

    public static boolean n(View view) {
        return f526a.n(view);
    }

    public static void o(View view) {
        f526a.o(view);
    }

    public static boolean p(View view) {
        return f526a.j(view);
    }

    public static void b(View view, int i2) {
        f526a.c(view, i2);
    }

    public static void c(View view, int i2) {
        f526a.b(view, i2);
    }

    public static boolean q(View view) {
        return f526a.k(view);
    }
}
