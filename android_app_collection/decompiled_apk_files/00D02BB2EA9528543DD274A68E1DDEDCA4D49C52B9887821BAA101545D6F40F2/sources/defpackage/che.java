package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
@Deprecated
/* renamed from: che  reason: default package */
/* loaded from: classes.dex */
public final class che {
    public static chc a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                b(cls, e);
            } catch (InstantiationException e2) {
                b(cls, e2);
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
            } catch (InvocationTargetException e4) {
                b(cls, e4);
            }
            if (!(obj instanceof chc)) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
            return (chc) obj;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void b(Class<?> cls, Exception exc) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString(), exc);
    }
}
