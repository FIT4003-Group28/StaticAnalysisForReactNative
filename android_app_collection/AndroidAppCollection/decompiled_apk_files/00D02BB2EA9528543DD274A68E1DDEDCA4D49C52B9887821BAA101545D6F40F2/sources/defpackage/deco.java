package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: deco  reason: default package */
/* loaded from: classes6.dex */
public final class deco {
    private static final Map<Class<?>, Class<?>> a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        b(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        b(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        b(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        b(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        b(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        b(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        b(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        b(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        b(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(linkedHashMap);
        Collections.unmodifiableMap(linkedHashMap2);
    }

    public static <T> Class<T> a(Class<T> cls) {
        dbsk.s(cls);
        Class<T> cls2 = (Class<T>) a.get(cls);
        return cls2 == null ? cls : cls2;
    }

    private static void b(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
