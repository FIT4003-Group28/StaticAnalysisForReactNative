package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* renamed from: b  reason: collision with root package name */
    private static int f832b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f833c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f834d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f835e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f836a = activity;
    }

    private static void a() {
        try {
            f832b = 2;
            f834d = InputMethodManager.class.getDeclaredField("mServedView");
            f834d.setAccessible(true);
            f835e = InputMethodManager.class.getDeclaredField("mNextServedView");
            f835e.setAccessible(true);
            f833c = InputMethodManager.class.getDeclaredField("mH");
            f833c.setAccessible(true);
            f832b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        if (aVar != f.a.ON_DESTROY) {
            return;
        }
        if (f832b == 0) {
            a();
        }
        if (f832b != 1) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f836a.getSystemService("input_method");
        try {
            Object obj = f833c.get(inputMethodManager);
            if (obj == null) {
                return;
            }
            synchronized (obj) {
                try {
                    try {
                        View view = (View) f834d.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            f835e.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (ClassCastException unused2) {
                } catch (IllegalAccessException unused3) {
                }
            }
        } catch (IllegalAccessException unused4) {
        }
    }
}
