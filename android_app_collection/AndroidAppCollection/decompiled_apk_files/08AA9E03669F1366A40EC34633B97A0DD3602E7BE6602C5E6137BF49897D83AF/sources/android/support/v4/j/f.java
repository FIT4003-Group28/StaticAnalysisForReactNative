package android.support.v4.j;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
/* compiled from: LayoutInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final b f514a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f515b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f516c;

    static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f516c) {
            try {
                f515b = LayoutInflater.class.getDeclaredField("mFactory2");
                f515b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f516c = true;
        }
        if (f515b != null) {
            try {
                f515b.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* compiled from: LayoutInflaterCompat.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                f.a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                f.a(layoutInflater, factory2);
            }
        }
    }

    /* compiled from: LayoutInflaterCompat.java */
    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.j.f.b
        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f514a = new a();
        } else {
            f514a = new b();
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f514a.a(layoutInflater, factory2);
    }
}
