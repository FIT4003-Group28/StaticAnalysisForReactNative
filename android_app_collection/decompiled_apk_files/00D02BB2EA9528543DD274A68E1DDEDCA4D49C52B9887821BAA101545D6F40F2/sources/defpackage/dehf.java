package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: dehf  reason: default package */
/* loaded from: classes6.dex */
public final class dehf {
    private static final dclu<Constructor<?>> a = dcln.a.g(new dehb()).c();

    public static <V, X extends Exception> V a(Future<V> future, Class<X> cls) {
        dehe.b.a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw d(cls, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new degf((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new deiw(cause);
            }
            throw d(cls, cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dehc b() {
        return dehd.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Class<? extends Exception> cls) {
        boolean z = true;
        dbsk.g(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        try {
            d(cls, new Exception());
        } catch (Exception unused) {
            z = false;
        }
        dbsk.g(z, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private static <X extends Exception> X d(Class<X> cls, Throwable th) {
        for (E e : a.o(Arrays.asList(cls.getConstructors()))) {
            X x = (X) e(e, th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    private static <X> X e(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
