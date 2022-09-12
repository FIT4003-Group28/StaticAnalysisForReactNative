package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: ks  reason: default package */
/* loaded from: classes.dex */
public final class ks {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            a(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof ku) {
            a(((ku) drawable).c);
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    a(child);
                }
            }
        }
    }

    public static Drawable b(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof kt)) ? new kv(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T c(Drawable drawable) {
        return drawable instanceof ku ? (T) ((ku) drawable).c : drawable;
    }

    public static boolean d(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                a = null;
            }
        }
        return false;
    }

    public static int e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                c = null;
            }
        }
        return 0;
    }
}
