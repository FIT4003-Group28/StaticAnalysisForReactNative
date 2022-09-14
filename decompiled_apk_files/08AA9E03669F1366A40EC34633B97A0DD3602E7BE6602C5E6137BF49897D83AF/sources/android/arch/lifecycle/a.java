package android.arch.lifecycle;

import android.arch.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassesInfoCache.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    static a f79a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, C0002a> f80b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class, Boolean> f81c = new HashMap();

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Class cls) {
        if (this.f81c.containsKey(cls)) {
            return this.f81c.get(cls).booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((l) method.getAnnotation(l.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f81c.put(cls, false);
        return false;
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0002a b(Class cls) {
        C0002a c0002a = this.f80b.get(cls);
        return c0002a != null ? c0002a : a(cls, null);
    }

    private void a(Map<b, c.a> map, b bVar, c.a aVar, Class cls) {
        c.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 != null) {
                return;
            }
            map.put(bVar, aVar);
            return;
        }
        Method method = bVar.f85b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private C0002a a(Class cls, Method[] methodArr) {
        int i;
        C0002a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f83b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c.a> entry : b(cls2).f83b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(e.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                c.a a2 = lVar.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a2 != c.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(i, method), a2, cls);
                z = true;
            }
        }
        C0002a c0002a = new C0002a(hashMap);
        this.f80b.put(cls, c0002a);
        this.f81c.put(cls, Boolean.valueOf(z));
        return c0002a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* renamed from: android.arch.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002a {

        /* renamed from: a  reason: collision with root package name */
        final Map<c.a, List<b>> f82a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, c.a> f83b;

        C0002a(Map<b, c.a> map) {
            this.f83b = map;
            for (Map.Entry<b, c.a> entry : map.entrySet()) {
                c.a value = entry.getValue();
                List<b> list = this.f82a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f82a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(e eVar, c.a aVar, Object obj) {
            a(this.f82a.get(aVar), eVar, aVar, obj);
            a(this.f82a.get(c.a.ON_ANY), eVar, aVar, obj);
        }

        private static void a(List<b> list, e eVar, c.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(eVar, aVar, obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f84a;

        /* renamed from: b  reason: collision with root package name */
        final Method f85b;

        b(int i, Method method) {
            this.f84a = i;
            this.f85b = method;
            this.f85b.setAccessible(true);
        }

        void a(e eVar, c.a aVar, Object obj) {
            try {
                switch (this.f84a) {
                    case 0:
                        this.f85b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f85b.invoke(obj, eVar);
                        return;
                    case 2:
                        this.f85b.invoke(obj, eVar, aVar);
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f84a == bVar.f84a && this.f85b.getName().equals(bVar.f85b.getName());
        }

        public int hashCode() {
            return (this.f84a * 31) + this.f85b.getName().hashCode();
        }
    }
}
