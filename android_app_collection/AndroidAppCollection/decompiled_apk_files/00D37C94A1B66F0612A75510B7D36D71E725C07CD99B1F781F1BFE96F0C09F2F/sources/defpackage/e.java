package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: e  reason: default package */
/* loaded from: classes3.dex */
public final class e {
    public static final e a = new e();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, d dVar, aps apsVar, Class cls) {
        aps apsVar2 = (aps) map.get(dVar);
        if (apsVar2 == null || apsVar == apsVar2) {
            if (apsVar2 != null) {
                return;
            }
            map.put(dVar, apsVar);
            return;
        }
        Method method = dVar.b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + apsVar2 + ", new value " + apsVar);
    }

    public final c a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(hashMap, (d) entry.getKey(), (aps) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(apy.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                aps a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (parameterTypes[1].isAssignableFrom(aps.class)) {
                        if (a2 != aps.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new d(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        c cVar = new c(hashMap);
        this.c.put(cls, cVar);
        this.b.put(cls, Boolean.valueOf(z));
        return cVar;
    }

    public final c b(Class cls) {
        c cVar = (c) this.c.get(cls);
        return cVar != null ? cVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
