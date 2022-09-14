package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: dauh  reason: default package */
/* loaded from: classes5.dex */
public final class dauh {
    private static final Map<Field, dauh> d = new WeakHashMap();
    public final boolean a;
    public final Field b;
    public final String c;

    public static dauh a(Enum<?> r5) {
        try {
            dauh b = b(r5.getClass().getField(r5.name()));
            dbsk.c(b != null, "enum constant missing @Value or @NullValue annotation: %s", r5);
            return b;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public static dauh b(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        Map<Field, dauh> map = d;
        synchronized (map) {
            dauh dauhVar = map.get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (dauhVar == null) {
                if (isEnumConstant) {
                    davb davbVar = (davb) field.getAnnotation(davb.class);
                    if (davbVar != null) {
                        str = davbVar.a();
                    } else if (((daut) field.getAnnotation(daut.class)) == null) {
                        return null;
                    }
                } else if (!Modifier.isStatic(field.getModifiers())) {
                    daun daunVar = (daun) field.getAnnotation(daun.class);
                    if (daunVar == null) {
                        return null;
                    }
                    str = daunVar.a();
                    field.setAccessible(true);
                }
                if ("##default".equals(str)) {
                    str = field.getName();
                }
                dauhVar = new dauh(field, str);
                map.put(field, dauhVar);
            }
            return dauhVar;
        }
    }

    public static Object h(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void i(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object h = h(field, obj);
            if (obj2 == null) {
                if (h == null) {
                    return;
                }
            } else if (obj2.equals(h)) {
                return;
            }
            String valueOf = String.valueOf(h);
            String valueOf2 = String.valueOf(obj2);
            String name = field.getName();
            String name2 = obj.getClass().getName();
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(valueOf2).length();
            StringBuilder sb = new StringBuilder(length + 48 + length2 + String.valueOf(name).length() + String.valueOf(name2).length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(name);
            sb.append(" field in ");
            sb.append(name2);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        } catch (SecurityException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final Type c() {
        return this.b.getGenericType();
    }

    public final boolean d() {
        return Modifier.isFinal(this.b.getModifiers());
    }

    public final Object e(Object obj) {
        return h(this.b, obj);
    }

    public final void f(Object obj, Object obj2) {
        i(this.b, obj, obj2);
    }

    public final <T extends Enum<T>> T g() {
        return (T) Enum.valueOf(this.b.getDeclaringClass(), this.b.getName());
    }

    public dauh(Field field, String str) {
        this.b = field;
        this.c = str == null ? null : str.intern();
        this.a = daub.f(field.getType());
    }
}
