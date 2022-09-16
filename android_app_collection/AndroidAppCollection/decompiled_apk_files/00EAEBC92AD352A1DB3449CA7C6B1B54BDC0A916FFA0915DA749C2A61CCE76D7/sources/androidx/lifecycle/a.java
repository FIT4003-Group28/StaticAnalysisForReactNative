package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class a {

    /* renamed from: c  reason: collision with root package name */
    static a f1849c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C0051a> f1850a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f1851b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0051a {

        /* renamed from: a  reason: collision with root package name */
        final Map<f.a, List<b>> f1852a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, f.a> f1853b;

        C0051a(Map<b, f.a> map) {
            this.f1853b = map;
            for (Map.Entry<b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<b> list = this.f1852a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1852a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void a(List<b> list, i iVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(i iVar, f.a aVar, Object obj) {
            a(this.f1852a.get(aVar), iVar, aVar, obj);
            a(this.f1852a.get(f.a.ON_ANY), iVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f1854a;

        /* renamed from: b  reason: collision with root package name */
        final Method f1855b;

        b(int i, Method method) {
            this.f1854a = i;
            this.f1855b = method;
            this.f1855b.setAccessible(true);
        }

        void a(i iVar, f.a aVar, Object obj) {
            try {
                int i = this.f1854a;
                if (i == 0) {
                    this.f1855b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1855b.invoke(obj, iVar);
                } else if (i != 2) {
                } else {
                    this.f1855b.invoke(obj, iVar, aVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1854a == bVar.f1854a && this.f1855b.getName().equals(bVar.f1855b.getName());
        }

        public int hashCode() {
            return (this.f1854a * 31) + this.f1855b.getName().hashCode();
        }
    }

    a() {
    }

    private C0051a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0051a a2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (a2 = a(superclass)) != null) {
            hashMap.putAll(a2.f1853b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.a> entry : a(cls2).f1853b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            p pVar = (p) method.getAnnotation(p.class);
            if (pVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(i.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                f.a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0051a c0051a = new C0051a(hashMap);
        this.f1850a.put(cls, c0051a);
        this.f1851b.put(cls, Boolean.valueOf(z));
        return c0051a;
    }

    private void a(Map<b, f.a> map, b bVar, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 != null) {
                return;
            }
            map.put(bVar, aVar);
            return;
        }
        Method method = bVar.f1855b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private Method[] c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0051a a(Class<?> cls) {
        C0051a c0051a = this.f1850a.get(cls);
        return c0051a != null ? c0051a : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Class<?> cls) {
        Boolean bool = this.f1851b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((p) method.getAnnotation(p.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f1851b.put(cls, false);
        return false;
    }
}
