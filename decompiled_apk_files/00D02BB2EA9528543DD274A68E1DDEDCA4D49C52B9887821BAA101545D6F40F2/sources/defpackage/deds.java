package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deds  reason: default package */
/* loaded from: classes6.dex */
public enum deds {
    JAVA6,
    JAVA7,
    JAVA8,
    JAVA9;
    
    static final deds e;

    static {
        deds dedsVar = JAVA6;
        deds dedsVar2 = JAVA7;
        deds dedsVar3 = JAVA8;
        deds dedsVar4 = JAVA9;
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new decv<Map.Entry<String, int[][]>>() { // from class: dedq
            }.a().toString().contains("java.util.Map.java.util.Map")) {
                e = dedsVar3;
            } else {
                e = dedsVar4;
            }
        } else if (new decv<int[]>() { // from class: dedr
        }.a() instanceof Class) {
            e = dedsVar2;
        } else {
            e = dedsVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<Type> c(Type[] typeArr) {
        dccx F = dcdc.F();
        for (Type type : typeArr) {
            F.g(b(type));
        }
        return F.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Type a(Type type) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (type instanceof Class) {
                    return dedy.g((Class) type);
                }
                return new dedp(type);
            } else if (ordinal == 2) {
                return JAVA7.a(type);
            } else {
                if (ordinal == 3) {
                    return JAVA8.a(type);
                }
                throw null;
            }
        }
        return new dedp(type);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(Type type) {
        int ordinal = ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return JAVA8.d(type);
            }
            return dedy.d(type);
        }
        try {
            return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("Type.getTypeName should be available in Java 8");
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Type b(Type type) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            dbsk.s(type);
            if (!(type instanceof Class)) {
                return type;
            }
            Class cls = (Class) type;
            return cls.isArray() ? new dedp(cls.getComponentType()) : type;
        } else if (ordinal == 1) {
            dbsk.s(type);
            return type;
        } else if (ordinal == 2) {
            return JAVA7.b(type);
        } else {
            if (ordinal == 3) {
                return JAVA8.b(type);
            }
            throw null;
        }
    }
}
