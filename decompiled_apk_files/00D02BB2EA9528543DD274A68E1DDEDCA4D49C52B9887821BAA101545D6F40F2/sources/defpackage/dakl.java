package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dakl  reason: default package */
/* loaded from: classes5.dex */
public final class dakl {
    public static <R, P0> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(f(obj, str, cls2).invoke(obj, p0));
        } catch (Exception e) {
            throw new dakm(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static <R, P0, P1, P2> R b(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(f(obj, str, cls2, cls3, cls4).invoke(obj, p0, p1, p2));
        } catch (Exception e) {
            throw new dakm(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static <T> dakk<T> c(Object obj, String str, Class<T> cls) {
        return new dakk<>(obj, g(obj, str), cls);
    }

    public static <T> dakj<T> d(Object obj, String str, Class<T> cls) {
        return new dakj<>(obj, g(obj, str), cls);
    }

    public static Method e(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new dakm(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    private static Method f(Object obj, String str, Class<?>... clsArr) {
        return e(obj.getClass(), str, clsArr);
    }

    private static Field g(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new dakm(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }
}
