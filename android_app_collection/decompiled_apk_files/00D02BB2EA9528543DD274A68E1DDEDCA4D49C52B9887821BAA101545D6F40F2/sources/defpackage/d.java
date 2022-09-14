package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: d  reason: default package */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();
    private final Map<Class<?>, b> c = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    private static final void d(Map<c, i> map, c cVar, i iVar, Class<?> cls) {
        i iVar2 = map.get(cVar);
        if (iVar2 == null || iVar == iVar2) {
            if (iVar2 != null) {
                return;
            }
            map.put(cVar, iVar);
            return;
        }
        Method method = cVar.b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + iVar2 + ", new value " + iVar);
    }

    public final Method[] a(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public final b b(Class<?> cls) {
        b bVar = this.c.get(cls);
        return bVar != null ? bVar : c(cls, null);
    }

    public final b c(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<c, i> entry : b(cls2).b.entrySet()) {
                d(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(m.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                i a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (parameterTypes[1].isAssignableFrom(i.class)) {
                        if (a2 != i.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new c(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        b bVar = new b(hashMap);
        this.c.put(cls, bVar);
        this.b.put(cls, Boolean.valueOf(z));
        return bVar;
    }
}
