package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: fq  reason: default package */
/* loaded from: classes.dex */
public class fq {
    private static final aim<String, Class<?>> a = new aim<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(ClassLoader classLoader, String str) {
        try {
            return fd.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends fd> b(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    private static Class<?> d(ClassLoader classLoader, String str) {
        aim<String, Class<?>> aimVar = a;
        Class<?> cls = aimVar.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            aimVar.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public fd c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new fb("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new fb("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
