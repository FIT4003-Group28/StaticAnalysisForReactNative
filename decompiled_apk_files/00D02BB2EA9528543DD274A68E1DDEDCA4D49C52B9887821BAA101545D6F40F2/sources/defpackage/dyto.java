package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyto  reason: default package */
/* loaded from: classes6.dex */
public final class dyto implements dyqi {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(dyto.class.getName());
    private static final Constructor<?> c;
    private static final Method d;
    private final Object e;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        int i;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            i = 0;
            method2 = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th) {
            th = th;
            method = null;
        }
        try {
            cls.getMethod("sum", new Class[0]);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            method = method2;
            b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            method2 = method;
            if (th != null) {
            }
            c = null;
            d = null;
            a = new RuntimeException(th);
        }
        if (th != null && constructor != null) {
            c = constructor;
            d = method2;
            a = null;
            return;
        }
        c = null;
        d = null;
        a = new RuntimeException(th);
    }

    @Override // defpackage.dyqi
    public final void a() {
        try {
            d.invoke(this.e, 1L);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public dyto() {
        RuntimeException runtimeException = a;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.e = c.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
