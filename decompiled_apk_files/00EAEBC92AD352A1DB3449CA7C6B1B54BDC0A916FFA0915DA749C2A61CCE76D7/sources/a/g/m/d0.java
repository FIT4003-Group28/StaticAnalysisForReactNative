package a.g.m;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final k f320a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f321a;

        public a() {
            int i = Build.VERSION.SDK_INT;
            this.f321a = i >= 30 ? new d() : i >= 29 ? new c() : i >= 20 ? new b() : new e();
        }

        public a(d0 d0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f321a = i >= 30 ? new d(d0Var) : i >= 29 ? new c(d0Var) : i >= 20 ? new b(d0Var) : new e(d0Var);
        }

        @Deprecated
        public a a(a.g.f.b bVar) {
            this.f321a.c(bVar);
            return this;
        }

        public d0 a() {
            return this.f321a.b();
        }
    }

    /* loaded from: classes.dex */
    private static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        private static Field f322d = null;

        /* renamed from: e  reason: collision with root package name */
        private static boolean f323e = false;

        /* renamed from: f  reason: collision with root package name */
        private static Constructor<WindowInsets> f324f = null;

        /* renamed from: g  reason: collision with root package name */
        private static boolean f325g = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f326c;

        b() {
            this.f326c = c();
        }

        b(d0 d0Var) {
            this.f326c = d0Var.i();
        }

        private static WindowInsets c() {
            if (!f323e) {
                try {
                    f322d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f323e = true;
            }
            Field field = f322d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f325g) {
                try {
                    f324f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f325g = true;
            }
            Constructor<WindowInsets> constructor = f324f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // a.g.m.d0.e
        d0 b() {
            a();
            return d0.a(this.f326c);
        }

        @Override // a.g.m.d0.e
        void c(a.g.f.b bVar) {
            WindowInsets windowInsets = this.f326c;
            if (windowInsets != null) {
                this.f326c = windowInsets.replaceSystemWindowInsets(bVar.f201a, bVar.f202b, bVar.f203c, bVar.f204d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f327c;

        c() {
            this.f327c = new WindowInsets.Builder();
        }

        c(d0 d0Var) {
            WindowInsets i = d0Var.i();
            this.f327c = i != null ? new WindowInsets.Builder(i) : new WindowInsets.Builder();
        }

        @Override // a.g.m.d0.e
        void a(a.g.f.b bVar) {
            this.f327c.setMandatorySystemGestureInsets(bVar.a());
        }

        @Override // a.g.m.d0.e
        d0 b() {
            a();
            return d0.a(this.f327c.build());
        }

        @Override // a.g.m.d0.e
        void b(a.g.f.b bVar) {
            this.f327c.setSystemGestureInsets(bVar.a());
        }

        @Override // a.g.m.d0.e
        void c(a.g.f.b bVar) {
            this.f327c.setSystemWindowInsets(bVar.a());
        }

        @Override // a.g.m.d0.e
        void d(a.g.f.b bVar) {
            this.f327c.setTappableElementInsets(bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static class d extends c {
        d() {
        }

        d(d0 d0Var) {
            super(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f328a;

        /* renamed from: b  reason: collision with root package name */
        private a.g.f.b[] f329b;

        e() {
            this(new d0((d0) null));
        }

        e(d0 d0Var) {
            this.f328a = d0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected final void a() {
            /*
                r3 = this;
                a.g.f.b[] r0 = r3.f329b
                if (r0 == 0) goto L55
                r1 = 1
                int r1 = a.g.m.d0.l.a(r1)
                r0 = r0[r1]
                a.g.f.b[] r1 = r3.f329b
                r2 = 2
                int r2 = a.g.m.d0.l.a(r2)
                r1 = r1[r2]
                if (r0 == 0) goto L1d
                if (r1 == 0) goto L1d
                a.g.f.b r0 = a.g.f.b.a(r0, r1)
                goto L1f
            L1d:
                if (r0 == 0) goto L23
            L1f:
                r3.c(r0)
                goto L28
            L23:
                if (r1 == 0) goto L28
                r3.c(r1)
            L28:
                a.g.f.b[] r0 = r3.f329b
                r1 = 16
                int r1 = a.g.m.d0.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L37
                r3.b(r0)
            L37:
                a.g.f.b[] r0 = r3.f329b
                r1 = 32
                int r1 = a.g.m.d0.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L46
                r3.a(r0)
            L46:
                a.g.f.b[] r0 = r3.f329b
                r1 = 64
                int r1 = a.g.m.d0.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L55
                r3.d(r0)
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.m.d0.e.a():void");
        }

        void a(a.g.f.b bVar) {
        }

        d0 b() {
            a();
            return this.f328a;
        }

        void b(a.g.f.b bVar) {
        }

        void c(a.g.f.b bVar) {
        }

        void d(a.g.f.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: g  reason: collision with root package name */
        private static boolean f330g = false;

        /* renamed from: h  reason: collision with root package name */
        private static Method f331h;
        private static Class<?> i;
        private static Class<?> j;
        private static Field k;
        private static Field l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f332c;

        /* renamed from: d  reason: collision with root package name */
        private a.g.f.b f333d;

        /* renamed from: e  reason: collision with root package name */
        private d0 f334e;

        /* renamed from: f  reason: collision with root package name */
        private a.g.f.b f335f;

        f(d0 d0Var, f fVar) {
            this(d0Var, new WindowInsets(fVar.f332c));
        }

        f(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f333d = null;
            this.f332c = windowInsets;
        }

        private static void a(Exception exc) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + exc.getMessage(), exc);
        }

        private a.g.f.b b(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f330g) {
                    i();
                }
                Method method = f331h;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) k.get(l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return a.g.f.b.a(rect);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        a(e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void i() {
            try {
                f331h = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                i = Class.forName("android.view.ViewRootImpl");
                j = Class.forName("android.view.View$AttachInfo");
                k = j.getDeclaredField("mVisibleInsets");
                l = i.getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException e2) {
                a(e2);
            }
            f330g = true;
        }

        @Override // a.g.m.d0.k
        void a(a.g.f.b bVar) {
            this.f335f = bVar;
        }

        @Override // a.g.m.d0.k
        void a(d0 d0Var) {
            d0Var.a(this.f334e);
            d0Var.a(this.f335f);
        }

        @Override // a.g.m.d0.k
        void a(View view) {
            a.g.f.b b2 = b(view);
            if (b2 == null) {
                b2 = a.g.f.b.f200e;
            }
            a(b2);
        }

        @Override // a.g.m.d0.k
        void b(d0 d0Var) {
            this.f334e = d0Var;
        }

        @Override // a.g.m.d0.k
        final a.g.f.b f() {
            if (this.f333d == null) {
                this.f333d = a.g.f.b.a(this.f332c.getSystemWindowInsetLeft(), this.f332c.getSystemWindowInsetTop(), this.f332c.getSystemWindowInsetRight(), this.f332c.getSystemWindowInsetBottom());
            }
            return this.f333d;
        }

        @Override // a.g.m.d0.k
        boolean h() {
            return this.f332c.isRound();
        }
    }

    /* loaded from: classes.dex */
    private static class g extends f {
        private a.g.f.b m;

        g(d0 d0Var, g gVar) {
            super(d0Var, gVar);
            this.m = null;
        }

        g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.m = null;
        }

        @Override // a.g.m.d0.k
        d0 b() {
            return d0.a(this.f332c.consumeStableInsets());
        }

        @Override // a.g.m.d0.k
        d0 c() {
            return d0.a(this.f332c.consumeSystemWindowInsets());
        }

        @Override // a.g.m.d0.k
        final a.g.f.b e() {
            if (this.m == null) {
                this.m = a.g.f.b.a(this.f332c.getStableInsetLeft(), this.f332c.getStableInsetTop(), this.f332c.getStableInsetRight(), this.f332c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // a.g.m.d0.k
        boolean g() {
            return this.f332c.isConsumed();
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {
        h(d0 d0Var, h hVar) {
            super(d0Var, hVar);
        }

        h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // a.g.m.d0.k
        d0 a() {
            return d0.a(this.f332c.consumeDisplayCutout());
        }

        @Override // a.g.m.d0.k
        a.g.m.c d() {
            return a.g.m.c.a(this.f332c.getDisplayCutout());
        }

        @Override // a.g.m.d0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                return Objects.equals(this.f332c, ((h) obj).f332c);
            }
            return false;
        }

        @Override // a.g.m.d0.k
        public int hashCode() {
            return this.f332c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(d0 d0Var, i iVar) {
            super(d0Var, iVar);
        }

        i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {
        static final d0 n = d0.a(WindowInsets.CONSUMED);

        j(d0 d0Var, j jVar) {
            super(d0Var, jVar);
        }

        j(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // a.g.m.d0.f, a.g.m.d0.k
        final void a(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        static final d0 f336b = new a().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final d0 f337a;

        k(d0 d0Var) {
            this.f337a = d0Var;
        }

        d0 a() {
            return this.f337a;
        }

        void a(a.g.f.b bVar) {
        }

        void a(d0 d0Var) {
        }

        void a(View view) {
        }

        d0 b() {
            return this.f337a;
        }

        void b(d0 d0Var) {
        }

        d0 c() {
            return this.f337a;
        }

        a.g.m.c d() {
            return null;
        }

        a.g.f.b e() {
            return a.g.f.b.f200e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return h() == kVar.h() && g() == kVar.g() && androidx.core.util.c.a(f(), kVar.f()) && androidx.core.util.c.a(e(), kVar.e()) && androidx.core.util.c.a(d(), kVar.d());
        }

        a.g.f.b f() {
            return a.g.f.b.f200e;
        }

        boolean g() {
            return false;
        }

        boolean h() {
            return false;
        }

        public int hashCode() {
            return androidx.core.util.c.a(Boolean.valueOf(h()), Boolean.valueOf(g()), f(), e(), d());
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        static int a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                if (i == 8) {
                    return 3;
                }
                if (i == 16) {
                    return 4;
                }
                if (i == 32) {
                    return 5;
                }
                if (i == 64) {
                    return 6;
                }
                if (i == 128) {
                    return 7;
                }
                if (i == 256) {
                    return 8;
                }
                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
            }
            return 0;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            d0 d0Var = j.n;
        } else {
            d0 d0Var2 = k.f336b;
        }
    }

    public d0(d0 d0Var) {
        if (d0Var == null) {
            this.f320a = new k(this);
            return;
        }
        k kVar = d0Var.f320a;
        this.f320a = (Build.VERSION.SDK_INT < 30 || !(kVar instanceof j)) ? (Build.VERSION.SDK_INT < 29 || !(kVar instanceof i)) ? (Build.VERSION.SDK_INT < 28 || !(kVar instanceof h)) ? (Build.VERSION.SDK_INT < 21 || !(kVar instanceof g)) ? (Build.VERSION.SDK_INT < 20 || !(kVar instanceof f)) ? new k(this) : new f(this, (f) kVar) : new g(this, (g) kVar) : new h(this, (h) kVar) : new i(this, (i) kVar) : new j(this, (j) kVar);
        kVar.a(this);
    }

    private d0(WindowInsets windowInsets) {
        k fVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            fVar = new j(this, windowInsets);
        } else if (i2 >= 29) {
            fVar = new i(this, windowInsets);
        } else if (i2 >= 28) {
            fVar = new h(this, windowInsets);
        } else if (i2 >= 21) {
            fVar = new g(this, windowInsets);
        } else if (i2 < 20) {
            this.f320a = new k(this);
            return;
        } else {
            fVar = new f(this, windowInsets);
        }
        this.f320a = fVar;
    }

    public static d0 a(WindowInsets windowInsets) {
        return a(windowInsets, null);
    }

    public static d0 a(WindowInsets windowInsets, View view) {
        androidx.core.util.g.a(windowInsets);
        d0 d0Var = new d0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            d0Var.a(v.w(view));
            d0Var.a(view.getRootView());
        }
        return d0Var;
    }

    @Deprecated
    public d0 a() {
        return this.f320a.a();
    }

    @Deprecated
    public d0 a(int i2, int i3, int i4, int i5) {
        a aVar = new a(this);
        aVar.a(a.g.f.b.a(i2, i3, i4, i5));
        return aVar.a();
    }

    void a(a.g.f.b bVar) {
        this.f320a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d0 d0Var) {
        this.f320a.b(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        this.f320a.a(view);
    }

    @Deprecated
    public d0 b() {
        return this.f320a.b();
    }

    @Deprecated
    public d0 c() {
        return this.f320a.c();
    }

    @Deprecated
    public int d() {
        return this.f320a.f().f204d;
    }

    @Deprecated
    public int e() {
        return this.f320a.f().f201a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return androidx.core.util.c.a(this.f320a, ((d0) obj).f320a);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.f320a.f().f203c;
    }

    @Deprecated
    public int g() {
        return this.f320a.f().f202b;
    }

    public boolean h() {
        return this.f320a.g();
    }

    public int hashCode() {
        k kVar = this.f320a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public WindowInsets i() {
        k kVar = this.f320a;
        if (kVar instanceof f) {
            return ((f) kVar).f332c;
        }
        return null;
    }
}
