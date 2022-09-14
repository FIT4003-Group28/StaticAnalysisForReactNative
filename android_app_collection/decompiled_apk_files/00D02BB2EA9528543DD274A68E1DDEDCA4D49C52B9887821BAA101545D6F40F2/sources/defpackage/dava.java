package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dava  reason: default package */
/* loaded from: classes5.dex */
public final class dava {
    public static ParameterizedType a(Type type, Class<?> cls) {
        Class<?> cls2;
        Type[] genericInterfaces;
        Class<?> f;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> f2 = f(parameterizedType);
                    if (f2 == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        for (Type type2 : f2.getGenericInterfaces()) {
                            if (type2 instanceof Class) {
                                f = (Class) type2;
                            } else {
                                f = f((ParameterizedType) type2);
                            }
                            if (cls.isAssignableFrom(f)) {
                                type = type2;
                                break;
                            }
                        }
                    }
                    cls2 = f2;
                }
                type = cls2.getGenericSuperclass();
            }
            return null;
        }
        return null;
    }

    public static boolean b(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw n(e, cls);
        } catch (InstantiationException e2) {
            throw n(e2, cls);
        }
    }

    public static boolean d(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    public static Type e(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Class<?> f(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static Type g(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.GenericDeclaration] */
    public static Type h(List<Type> list, TypeVariable<?> typeVariable) {
        Type h;
        ?? genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = a(list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                return (!(type instanceof TypeVariable) || (h = h(list, (TypeVariable) type)) == null) ? type : h;
            }
        }
        return null;
    }

    public static Class<?> i(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = h(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(i(list, e(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return f((ParameterizedType) type);
        }
        dbsk.c(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Type j(Type type) {
        return o(type, Iterable.class, 0);
    }

    public static Type k(Type type) {
        return o(type, Map.class, 1);
    }

    public static <T> Iterable<T> l(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        dbsk.c(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new dauz(obj);
    }

    public static Object m(Collection<?> collection, Class<?> cls) {
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, collection.size());
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Array.set(newInstance, i, it.next());
                i++;
            }
            return newInstance;
        }
        return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
    }

    private static IllegalArgumentException n(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        int size = arrayList.size();
        boolean z = false;
        while (i < size) {
            String str = (String) arrayList.get(i);
            if (z) {
                sb.append(" and");
            }
            sb.append(" ");
            sb.append(str);
            i++;
            z = true;
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    private static Type o(Type type, Class<?> cls, int i) {
        Type h;
        ParameterizedType a = a(type, cls);
        if (a == null) {
            return null;
        }
        Type type2 = a.getActualTypeArguments()[i];
        return (!(type2 instanceof TypeVariable) || (h = h(Arrays.asList(type), (TypeVariable) type2)) == null) ? type2 : h;
    }
}
