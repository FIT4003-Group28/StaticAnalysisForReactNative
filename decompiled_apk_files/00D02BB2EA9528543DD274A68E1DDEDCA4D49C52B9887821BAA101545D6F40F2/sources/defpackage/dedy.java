package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedy  reason: default package */
/* loaded from: classes6.dex */
public final class dedy {
    public static final dbrn<Type, String> a = new dedl();
    public static final dbrz b = dbrz.e(", ").b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type a(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            int length = lowerBounds.length;
            dbsk.b(length <= 1, "Wildcard cannot have more than one lower bounds.");
            if (length == 1) {
                return new dedx(new Type[]{a(lowerBounds[0])}, new Type[]{Object.class});
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            dbsk.b(upperBounds.length == 1, "Wildcard should have only one upper bound.");
            return new dedx(new Type[0], new Type[]{a(upperBounds[0])});
        }
        return deds.e.a(type);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ParameterizedType b(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return new dedu(dedo.c.a(cls), cls, typeArr);
        }
        dbsk.g(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new dedu(type, cls, typeArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends GenericDeclaration> TypeVariable<D> c(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        dedw dedwVar = new dedw(new dedv(d, str, typeArr));
        dbsk.g(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, dedwVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type[] e(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static void f(Type[] typeArr, String str) {
        Class cls;
        for (Type type : typeArr) {
            if (type instanceof Class) {
                dbsk.j(!cls.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> g(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }
}
