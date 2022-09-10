package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: daub  reason: default package */
/* loaded from: classes5.dex */
public final class daub {
    public static final Boolean a;
    public static final String b;
    public static final Character c;
    public static final Byte d;
    public static final Short e;
    public static final Integer f;
    public static final Float g;
    public static final Long h;
    public static final Double i;
    public static final BigInteger j;
    public static final BigDecimal k;
    public static final daug l;
    private static final ConcurrentHashMap<Class<?>, Object> m;

    static {
        Boolean bool = new Boolean(true);
        a = bool;
        String str = new String();
        b = str;
        Character ch = new Character((char) 0);
        c = ch;
        Byte b2 = new Byte((byte) 0);
        d = b2;
        Short sh = new Short((short) 0);
        e = sh;
        Integer num = new Integer(0);
        f = num;
        Float f2 = new Float(0.0f);
        g = f2;
        Long l2 = new Long(0L);
        h = l2;
        Double d2 = new Double((double) dcyn.a);
        i = d2;
        BigInteger bigInteger = new BigInteger("0");
        j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        k = bigDecimal;
        daug daugVar = new daug(false, 0L, null);
        l = daugVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b2);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f2);
        concurrentHashMap.put(Long.class, l2);
        concurrentHashMap.put(Double.class, d2);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(daug.class, daugVar);
    }

    public static <T> T a(Class cls) {
        T t;
        T t2 = (T) m.get(cls);
        if (t2 == null) {
            int i2 = 0;
            if (cls.isArray()) {
                Class<?> cls2 = cls;
                do {
                    cls2 = cls2.getComponentType();
                    i2++;
                } while (cls2.isArray());
                t = (T) Array.newInstance(cls2, new int[i2]);
            } else if (cls.isEnum()) {
                dauh c2 = daty.a(cls).c(null);
                Object[] objArr = {cls};
                if (c2 != null) {
                    t = (T) c2.g();
                } else {
                    throw new NullPointerException(dbtx.b("enum missing constant with @NullValue annotation: %s", objArr));
                }
            } else {
                t = (T) dava.c(cls);
            }
            T t3 = (T) m.putIfAbsent(cls, t);
            return t3 == null ? t : t3;
        }
        return t2;
    }

    public static boolean b(Object obj) {
        return obj == m.get(obj.getClass());
    }

    public static Map<String, Object> c(Object obj) {
        if (b(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new dauf(obj, false);
    }

    public static <T> T d(T t) {
        T t2;
        if (t == null || f(t.getClass())) {
            return t;
        }
        if (t instanceof daul) {
            return (T) ((daul) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof dats) {
            t2 = (T) ((dats) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            e(array, array);
            return (T) Arrays.asList(array);
        } else {
            t2 = (T) dava.c(cls);
        }
        e(t, t2);
        return t2;
    }

    public static void e(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i2 = 0;
        dbsk.a(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            dbsk.a(z);
            for (Object obj3 : dava.l(obj)) {
                Array.set(obj2, i2, d(obj3));
                i2++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(d(obj4));
            }
        } else {
            boolean isAssignableFrom = daul.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                daty a2 = isAssignableFrom ? ((daul) obj).d : daty.a(cls);
                for (String str : a2.d) {
                    dauh c2 = a2.c(str);
                    if (!c2.d() && (!isAssignableFrom || !c2.a)) {
                        Object e2 = c2.e(obj);
                        if (e2 != null) {
                            c2.f(obj2, d(e2));
                        }
                    }
                }
            } else if (dats.class.isAssignableFrom(cls)) {
                dats datsVar = (dats) obj2;
                dats datsVar2 = (dats) obj;
                int i3 = datsVar2.a;
                while (i2 < i3) {
                    datsVar.c(i2, d(datsVar2.b(i2)));
                    i2++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), d(entry.getValue()));
                }
            }
        }
    }

    public static boolean f(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        return ((Class) type).isPrimitive() || type == Character.class || type == String.class || type == Integer.class || type == Long.class || type == Short.class || type == Byte.class || type == Float.class || type == Double.class || type == BigInteger.class || type == BigDecimal.class || type == daug.class || type == Boolean.class;
    }

    public static boolean g(Object obj) {
        return f(obj.getClass());
    }

    public static Object h(Type type, String str) {
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() != 1) {
                    String valueOf = String.valueOf(cls);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("expected type Character/char but got ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                return Character.valueOf(str.charAt(0));
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == daug.class) {
                    Matcher matcher = daug.b.matcher(str);
                    if (!matcher.matches()) {
                        throw new NumberFormatException(str.length() != 0 ? "Invalid date/time format: ".concat(str) : new String("Invalid date/time format: "));
                    }
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
                    int parseInt3 = Integer.parseInt(matcher.group(3));
                    boolean z = matcher.group(4) != null;
                    String group = matcher.group(9);
                    if (group != null && !z) {
                        throw new NumberFormatException(str.length() != 0 ? "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(str) : new String("Invalid date/time format, cannot specify time zone shift without specifying time: "));
                    }
                    if (z) {
                        int parseInt4 = Integer.parseInt(matcher.group(5));
                        int parseInt5 = Integer.parseInt(matcher.group(6));
                        int parseInt6 = Integer.parseInt(matcher.group(7));
                        if (matcher.group(8) != null) {
                            str2 = group;
                            double pow = Math.pow(10.0d, matcher.group(8).substring(1).length() - 3);
                            Double.isNaN(r13);
                            i2 = (int) (r13 / pow);
                            i4 = parseInt5;
                            i5 = parseInt6;
                        } else {
                            str2 = group;
                            i4 = parseInt5;
                            i5 = parseInt6;
                            i2 = 0;
                        }
                        i3 = parseInt4;
                    } else {
                        str2 = group;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(daug.a);
                    gregorianCalendar.set(parseInt, parseInt2, parseInt3, i3, i4, i5);
                    gregorianCalendar.set(14, i2);
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    if (!z || str2 == null) {
                        num = null;
                    } else {
                        if (Character.toUpperCase(str2.charAt(0)) == 'Z') {
                            i6 = 0;
                        } else {
                            int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                            i6 = matcher.group(10).charAt(0) == '-' ? -parseInt7 : parseInt7;
                            timeInMillis -= i6 * 60000;
                        }
                        num = Integer.valueOf(i6);
                    }
                    return new daug(!z, timeInMillis, num);
                } else if (cls == BigInteger.class) {
                    return new BigInteger(str);
                } else {
                    if (cls == BigDecimal.class) {
                        return new BigDecimal(str);
                    }
                    if (cls.isEnum()) {
                        if (!daty.a(cls).d.contains(str)) {
                            throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", str));
                        }
                        return daty.a(cls).c(str).g();
                    }
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Collection<Object> i(Type type) {
        if (type instanceof WildcardType) {
            type = dava.g((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) dava.c(cls);
        }
    }

    public static Map<String, Object> j(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(dats.class)) {
            return dats.a();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) dava.c(cls);
    }

    public static Type k(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = dava.g((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type h2 = dava.h(list, (TypeVariable) type);
            if (h2 != null) {
                type = h2;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
