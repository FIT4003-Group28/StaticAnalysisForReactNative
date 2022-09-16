package defpackage;

import java.lang.reflect.Constructor;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqns  reason: default package */
/* loaded from: classes.dex */
public final class cqns {
    private static final Object[] a = new Object[0];
    private static final Class<?>[] b = new Class[0];
    private static final Map<Class<?>, Constructor<?>> c = new IdentityHashMap();

    public static <T> T a(Class<T> cls) {
        Constructor<?> constructor;
        if (!cls.isPrimitive()) {
            if (cls == Object.class) {
                return (T) new Object();
            }
            if (cls == Byte.class) {
                return (T) new Byte((byte) 0);
            }
            if (cls == Character.class) {
                return (T) new Character((char) 0);
            }
            if (cls == Short.class) {
                return (T) new Short((short) 0);
            }
            if (cls == Integer.class) {
                return (T) new Integer(0);
            }
            if (cls == Long.class) {
                return (T) new Long(0L);
            }
            if (cls == Float.class) {
                return (T) new Float(0.0f);
            }
            if (cls == Double.class) {
                return (T) new Double((double) dcyn.a);
            }
            if (cls == Boolean.class) {
                return (T) new Boolean(false);
            }
            if (cls.isAssignableFrom(cqru.class)) {
                return (T) new cqru(1);
            }
            if (cls.isAssignableFrom(cqss.class)) {
                return (T) cqta.f();
            }
            if (cls.isAssignableFrom(cqtb.class)) {
                return (T) new cqtb(1);
            }
            if (cls.isAssignableFrom(cqvf.class)) {
                return (T) new cqvf(1);
            }
            if (cls.isAssignableFrom(cqvg.class)) {
                return (T) new cqvg(1, null);
            }
            if (cls == cqkl.class) {
                return (T) new cqkl();
            }
            if (cls == cqjg.class) {
                return (T) cqjg.a();
            }
            Map<Class<?>, Constructor<?>> map = c;
            synchronized (map) {
                constructor = map.get(cls);
            }
            if (constructor == null) {
                try {
                    constructor = cls.getConstructor(b);
                    synchronized (map) {
                        map.put(cls, constructor);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(cls);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Unable to get default constructor for ");
                    sb.append(valueOf);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            try {
                return constructor.newInstance(a);
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(constructor);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
                sb2.append("Unable to call ");
                sb2.append(valueOf2);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
        throw new RuntimeException("Unable to proxy primitive values");
    }
}
