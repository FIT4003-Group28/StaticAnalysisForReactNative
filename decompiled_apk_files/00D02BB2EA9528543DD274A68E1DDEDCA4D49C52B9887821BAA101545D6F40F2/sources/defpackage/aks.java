package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: aks  reason: default package */
/* loaded from: classes2.dex */
public final class aks {
    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                return new Handler(looper);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        }
        return Handler.createAsync(looper);
    }
}
