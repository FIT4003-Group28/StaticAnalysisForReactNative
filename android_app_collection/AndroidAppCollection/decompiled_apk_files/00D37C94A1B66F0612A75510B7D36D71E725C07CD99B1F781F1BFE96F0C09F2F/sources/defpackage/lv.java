package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lv  reason: default package */
/* loaded from: classes3.dex */
public class lv extends ma {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    gz b;
    private gz j;
    private mb k;

    public lv(mb mbVar, WindowInsets windowInsets) {
        super(mbVar);
        this.j = null;
        this.a = windowInsets;
    }

    private static void t() {
        try {
            f = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        c = true;
    }

    private static final gz u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!c) {
                t();
            }
            Method method = f;
            if (method != null && g != null && h != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) h.get(i.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return gz.c(rect);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.ma
    public final gz a() {
        if (this.j == null) {
            this.j = gz.d(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.j;
    }

    @Override // defpackage.ma
    public mb b(int i2, int i3, int i4, int i5) {
        lr lrVar = new lr(mb.q(this.a));
        lrVar.c(mb.j(a(), i2, i3, i4, i5));
        lrVar.b(mb.j(j(), i2, i3, i4, i5));
        return lrVar.a();
    }

    @Override // defpackage.ma
    public void c(View view) {
        gz u = u(view);
        if (u == null) {
            u = gz.a;
        }
        this.b = u;
    }

    @Override // defpackage.ma
    public final void d(mb mbVar) {
        this.k = mbVar;
    }

    @Override // defpackage.ma
    public final boolean e() {
        return this.a.isRound();
    }

    @Override // defpackage.ma
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.b, ((lv) obj).b);
    }

    @Override // defpackage.ma
    public boolean g() {
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 8) != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 4) {
                        return false;
                    }
                    if (i2 != 8 && i2 != 128) {
                    }
                }
                if (f(i2).equals(gz.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ma
    public final void h() {
    }

    @Override // defpackage.ma
    public gz i() {
        gz gzVar = gz.a;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 7) != 0) {
                gzVar = gz.b(gzVar, f(i2));
            }
        }
        return gzVar;
    }

    protected final gz f(int i2) {
        gz gzVar;
        int i3;
        jx o;
        int i4 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                gz a = a();
                mb mbVar = this.k;
                gz i5 = mbVar != null ? mbVar.i() : null;
                int i6 = a.e;
                if (i5 != null) {
                    i6 = Math.min(i6, i5.e);
                }
                return gz.d(a.b, 0, a.d, i6);
            } else if (i2 == 8) {
                gz a2 = a();
                mb mbVar2 = this.k;
                if (mbVar2 != null) {
                    gzVar = mbVar2.i();
                } else {
                    gzVar = gz.a;
                }
                int i7 = a2.e;
                if (i7 > gzVar.e) {
                    return gz.d(0, 0, 0, i7);
                }
                gz gzVar2 = this.b;
                return (gzVar2 == null || gzVar2.equals(gz.a) || (i3 = this.b.e) <= gzVar.e) ? gz.a : gz.d(0, 0, 0, i3);
            } else if (i2 == 16) {
                return r();
            } else {
                if (i2 == 32) {
                    return q();
                }
                if (i2 == 64) {
                    return s();
                }
                if (i2 != 128) {
                    return gz.a;
                }
                mb mbVar3 = this.k;
                if (mbVar3 != null) {
                    o = mbVar3.k();
                } else {
                    o = o();
                }
                if (o == null) {
                    return gz.a;
                }
                int safeInsetLeft = Build.VERSION.SDK_INT >= 28 ? ((DisplayCutout) o.a).getSafeInsetLeft() : 0;
                if (Build.VERSION.SDK_INT >= 28) {
                    i4 = ((DisplayCutout) o.a).getSafeInsetTop();
                }
                return gz.d(safeInsetLeft, i4, o.b(), o.a());
            }
        }
        return gz.d(0, a().c, 0, 0);
    }
}
