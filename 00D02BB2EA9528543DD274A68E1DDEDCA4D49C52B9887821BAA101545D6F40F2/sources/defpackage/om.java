package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: om  reason: default package */
/* loaded from: classes7.dex */
public final class om extends op {
    private static Field a = null;
    private static boolean b = false;
    private static Constructor<WindowInsets> c = null;
    private static boolean d = false;
    private WindowInsets e;

    public om() {
        this.e = d();
    }

    private static WindowInsets d() {
        if (!b) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!d) {
            try {
                c = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            d = true;
        }
        Constructor<WindowInsets> constructor = c;
        if (constructor != null) {
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.op
    public final void a(kd kdVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(kdVar.b, kdVar.c, kdVar.d, kdVar.e);
        }
    }

    @Override // defpackage.op
    public final ow b() {
        return ow.a(this.e);
    }

    public om(ow owVar) {
        this.e = owVar.p();
    }
}
