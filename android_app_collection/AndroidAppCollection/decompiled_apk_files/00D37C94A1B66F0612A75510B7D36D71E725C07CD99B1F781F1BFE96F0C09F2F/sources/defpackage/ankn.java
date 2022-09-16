package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ankn  reason: default package */
/* loaded from: classes.dex */
public final class ankn {
    private static final amxr a = new amsb(new hhf(6), amxo.a).a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ankk a() {
        return ankl.a;
    }

    public static Object b(Future future, Class cls) {
        ankm.b.a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw d(cls, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new anjl((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new anlr(cause);
            }
            throw d(cls, cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Class cls) {
        boolean z = true;
        aqxo.u(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        try {
            d(cls, new Exception());
        } catch (Exception unused) {
            z = false;
        }
        aqxo.u(z, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private static Exception d(Class cls, Throwable th) {
        List asList = Arrays.asList(cls.getConstructors());
        amxr amxrVar = a;
        Object[] w = arey.w(asList);
        Arrays.sort(w, amxrVar);
        for (Constructor constructor : amxp.p(Arrays.asList(w))) {
            Exception exc = (Exception) e(constructor, th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    private static Object e(Constructor constructor, Throwable th) {
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
