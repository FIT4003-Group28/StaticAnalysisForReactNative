package com.facebook.react.bridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
/* compiled from: JavaScriptModuleRegistry.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<Class<? extends JavaScriptModule>, JavaScriptModule> f3291a = new HashMap<>();

    public synchronized <T extends JavaScriptModule> T a(CatalystInstance catalystInstance, Class<T> cls) {
        T t = (T) this.f3291a.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(catalystInstance, cls));
        this.f3291a.put(cls, t2);
        return t2;
    }

    /* compiled from: JavaScriptModuleRegistry.java */
    /* loaded from: classes.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final CatalystInstance f3292a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<? extends JavaScriptModule> f3293b;

        /* renamed from: c  reason: collision with root package name */
        private String f3294c;

        public a(CatalystInstance catalystInstance, Class<? extends JavaScriptModule> cls) {
            this.f3292a = catalystInstance;
            this.f3293b = cls;
        }

        private String a() {
            if (this.f3294c == null) {
                String simpleName = this.f3293b.getSimpleName();
                int lastIndexOf = simpleName.lastIndexOf(36);
                if (lastIndexOf != -1) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
                this.f3294c = simpleName;
            }
            return this.f3294c;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            this.f3292a.callFunction(a(), method.getName(), objArr != null ? b.a(objArr) : new WritableNativeArray());
            return null;
        }
    }
}
