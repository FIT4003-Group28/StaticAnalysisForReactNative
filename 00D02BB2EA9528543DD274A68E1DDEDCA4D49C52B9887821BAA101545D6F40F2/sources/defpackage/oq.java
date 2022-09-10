package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oq  reason: default package */
/* loaded from: classes7.dex */
public class oq extends ov {
    private static boolean b = false;
    private static Method e;
    private static Class<?> f;
    private static Class<?> g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    private kd j;

    public oq(ow owVar, WindowInsets windowInsets) {
        super(owVar);
        this.j = null;
        this.a = windowInsets;
    }

    private static void n() {
        try {
            e = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            f = Class.forName("android.view.ViewRootImpl");
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = f.getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ClassNotFoundException e2) {
            o(e2);
        } catch (NoSuchFieldException e3) {
            o(e3);
        } catch (NoSuchMethodException e4) {
            o(e4);
        }
        b = true;
    }

    private static void o(Exception exc) {
        String str = "Failed to get visible insets. (Reflection error). " + exc.getMessage();
    }

    @Override // defpackage.ov
    public final boolean a() {
        return this.a.isRound();
    }

    @Override // defpackage.ov
    public final kd b() {
        if (this.j == null) {
            this.j = kd.a(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.j;
    }

    @Override // defpackage.ov
    public ow c(int i2, int i3, int i4, int i5) {
        op omVar;
        ow a = ow.a(this.a);
        if (Build.VERSION.SDK_INT >= 30) {
            omVar = new oo(a);
        } else if (Build.VERSION.SDK_INT >= 29) {
            omVar = new on(a);
        } else {
            omVar = new om(a);
        }
        ol.b(ow.q(b(), i2, i3, i4, i5), omVar);
        omVar.c(ow.q(i(), i2, i3, i4, i5));
        return ol.a(omVar);
    }

    @Override // defpackage.ov
    public void d(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!b) {
                n();
            }
            Method method = e;
            if (method == null || g == null || h == null) {
                return;
            }
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    return;
                }
                Rect rect = (Rect) h.get(i.get(invoke));
                if (rect == null) {
                    return;
                }
                kd.b(rect);
                return;
            } catch (IllegalAccessException e2) {
                o(e2);
                return;
            } catch (InvocationTargetException e3) {
                o(e3);
                return;
            }
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.ov
    public final void e() {
    }
}
