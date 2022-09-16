package a.r;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class k implements i {

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f642c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f643d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f644e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f645f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f646g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f647h;

    /* renamed from: b  reason: collision with root package name */
    private final View f648b;

    private k(View view) {
        this.f648b = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(View view, ViewGroup viewGroup, Matrix matrix) {
        a();
        Method method = f644e;
        if (method != null) {
            try {
                return new k((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void a() {
        if (!f645f) {
            try {
                b();
                f644e = f642c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f644e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e2);
            }
            f645f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        c();
        Method method = f646g;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    private static void b() {
        if (!f643d) {
            try {
                f642c = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
            }
            f643d = true;
        }
    }

    private static void c() {
        if (!f647h) {
            try {
                b();
                f646g = f642c.getDeclaredMethod("removeGhost", View.class);
                f646g.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
            }
            f647h = true;
        }
    }

    @Override // a.r.i
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // a.r.i
    public void setVisibility(int i) {
        this.f648b.setVisibility(i);
    }
}
