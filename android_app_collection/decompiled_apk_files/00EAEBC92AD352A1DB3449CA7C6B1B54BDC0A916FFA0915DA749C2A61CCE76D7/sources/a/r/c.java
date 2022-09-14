package a.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f555a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f556b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f557c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return;
        }
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        } else {
            if (!f557c) {
                try {
                    f555a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f555a.setAccessible(true);
                    f556b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f556b.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f557c = true;
            }
            if (z) {
                try {
                    if (f555a != null) {
                        f555a.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
            if (z || f556b == null) {
                return;
            }
            f556b.invoke(canvas, new Object[0]);
        }
    }
}
