package com.facebook.react.uimanager;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewManagersPropertyCache.java */
/* loaded from: classes.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Map<String, j>> f3825a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, j> f3826b = new HashMap();

    public static void a() {
        f3825a.clear();
        f3826b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static abstract class j {
        private static final Object[] e = new Object[2];
        private static final Object[] f = new Object[3];
        private static final Object[] g = new Object[1];
        private static final Object[] h = new Object[2];

        /* renamed from: a  reason: collision with root package name */
        protected final String f3827a;

        /* renamed from: b  reason: collision with root package name */
        protected final String f3828b;

        /* renamed from: c  reason: collision with root package name */
        protected final Method f3829c;

        /* renamed from: d  reason: collision with root package name */
        protected final Integer f3830d;

        protected abstract Object a(y yVar);

        private j(com.facebook.react.uimanager.a.a aVar, String str, Method method) {
            this.f3827a = aVar.a();
            this.f3828b = !"__default_type__".equals(aVar.b()) ? aVar.b() : str;
            this.f3829c = method;
            this.f3830d = null;
        }

        private j(com.facebook.react.uimanager.a.b bVar, String str, Method method, int i) {
            this.f3827a = bVar.a()[i];
            this.f3828b = !"__default_type__".equals(bVar.b()) ? bVar.b() : str;
            this.f3829c = method;
            this.f3830d = Integer.valueOf(i);
        }

        public String a() {
            return this.f3827a;
        }

        public String b() {
            return this.f3828b;
        }

        public void a(ViewManager viewManager, View view, y yVar) {
            try {
                if (this.f3830d == null) {
                    e[0] = view;
                    e[1] = a(yVar);
                    this.f3829c.invoke(viewManager, e);
                    Arrays.fill(e, (Object) null);
                    return;
                }
                f[0] = view;
                f[1] = this.f3830d;
                f[2] = a(yVar);
                this.f3829c.invoke(viewManager, f);
                Arrays.fill(f, (Object) null);
            } catch (Throwable th) {
                com.facebook.common.e.a.b((Class<?>) ViewManager.class, "Error while updating prop " + this.f3827a, th);
                throw new com.facebook.react.bridge.n("Error while updating property '" + this.f3827a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        public void a(w wVar, y yVar) {
            try {
                if (this.f3830d == null) {
                    g[0] = a(yVar);
                    this.f3829c.invoke(wVar, g);
                    Arrays.fill(g, (Object) null);
                    return;
                }
                h[0] = this.f3830d;
                h[1] = a(yVar);
                this.f3829c.invoke(wVar, h);
                Arrays.fill(h, (Object) null);
            } catch (Throwable th) {
                com.facebook.common.e.a.b((Class<?>) ViewManager.class, "Error while updating prop " + this.f3827a, th);
                throw new com.facebook.react.bridge.n("Error while updating property '" + this.f3827a + "' in shadow node of type: " + wVar.getViewClass(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class f extends j {
        public f(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        public f(com.facebook.react.uimanager.a.b bVar, Method method, int i) {
            super(bVar, "mixed", method, i);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return yVar.f(this.f3827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class h extends j {
        private final int e;

        public h(com.facebook.react.uimanager.a.a aVar, Method method, int i) {
            super(aVar, "number", method);
            this.e = i;
        }

        public h(com.facebook.react.uimanager.a.b bVar, Method method, int i, int i2) {
            super(bVar, "number", method, i);
            this.e = i2;
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return Integer.valueOf(yVar.a(this.f3827a, this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class e extends j {
        private final double e;

        public e(com.facebook.react.uimanager.a.a aVar, Method method, double d2) {
            super(aVar, "number", method);
            this.e = d2;
        }

        public e(com.facebook.react.uimanager.a.b bVar, Method method, int i, double d2) {
            super(bVar, "number", method, i);
            this.e = d2;
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return Double.valueOf(yVar.a(this.f3827a, this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class b extends j {
        private final boolean e;

        public b(com.facebook.react.uimanager.a.a aVar, Method method, boolean z) {
            super(aVar, "boolean", method);
            this.e = z;
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return yVar.a(this.f3827a, this.e) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class g extends j {
        private final float e;

        public g(com.facebook.react.uimanager.a.a aVar, Method method, float f) {
            super(aVar, "number", method);
            this.e = f;
        }

        public g(com.facebook.react.uimanager.a.b bVar, Method method, int i, float f) {
            super(bVar, "number", method, i);
            this.e = f;
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return Float.valueOf(yVar.a(this.f3827a, this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class a extends j {
        public a(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return yVar.d(this.f3827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class i extends j {
        public i(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return yVar.e(this.f3827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class k extends j {
        public k(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            return yVar.c(this.f3827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class c extends j {
        public c(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            if (!yVar.b(this.f3827a)) {
                return yVar.a(this.f3827a, false) ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class d extends j {
        public d(com.facebook.react.uimanager.a.a aVar, Method method) {
            super(aVar, "number", method);
        }

        public d(com.facebook.react.uimanager.a.b bVar, Method method, int i) {
            super(bVar, "number", method, i);
        }

        @Override // com.facebook.react.uimanager.at.j
        protected Object a(y yVar) {
            if (!yVar.b(this.f3827a)) {
                return Integer.valueOf(yVar.a(this.f3827a, 0));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, j> a(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f3826b;
        }
        Map<String, j> map = f3825a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(a(cls.getSuperclass()));
        a(cls, hashMap);
        f3825a.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, j> b(Class<? extends w> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == w.class) {
                return f3826b;
            }
        }
        Map<String, j> map = f3825a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(b(cls.getSuperclass()));
        b(cls, hashMap);
        f3825a.put(cls, hashMap);
        return hashMap;
    }

    private static j a(com.facebook.react.uimanager.a.a aVar, Method method, Class<?> cls) {
        if (cls == com.facebook.react.bridge.g.class) {
            return new f(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new b(aVar, method, aVar.f());
        }
        if (cls == Integer.TYPE) {
            return new h(aVar, method, aVar.e());
        }
        if (cls == Float.TYPE) {
            return new g(aVar, method, aVar.d());
        }
        if (cls == Double.TYPE) {
            return new e(aVar, method, aVar.c());
        }
        if (cls == String.class) {
            return new k(aVar, method);
        }
        if (cls == Boolean.class) {
            return new c(aVar, method);
        }
        if (cls == Integer.class) {
            return new d(aVar, method);
        }
        if (cls == com.facebook.react.bridge.am.class) {
            return new a(aVar, method);
        }
        if (cls == com.facebook.react.bridge.an.class) {
            return new i(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void a(com.facebook.react.uimanager.a.b bVar, Method method, Class<?> cls, Map<String, j> map) {
        String[] a2 = bVar.a();
        int i2 = 0;
        if (cls == com.facebook.react.bridge.g.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new f(bVar, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new h(bVar, method, i2, bVar.e()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new g(bVar, method, i2, bVar.c()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new e(bVar, method, i2, bVar.d()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new d(bVar, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    private static void a(Class<? extends ViewManager> cls, Map<String, j> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            com.facebook.react.uimanager.a.a aVar = (com.facebook.react.uimanager.a.a) method.getAnnotation(com.facebook.react.uimanager.a.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else {
                    map.put(aVar.a(), a(aVar, method, parameterTypes[1]));
                }
            }
            com.facebook.react.uimanager.a.b bVar = (com.facebook.react.uimanager.a.b) method.getAnnotation(com.facebook.react.uimanager.a.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(bVar, method, parameterTypes2[2], map);
                }
            }
        }
    }

    private static void b(Class<? extends w> cls, Map<String, j> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            com.facebook.react.uimanager.a.a aVar = (com.facebook.react.uimanager.a.a) method.getAnnotation(com.facebook.react.uimanager.a.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.a(), a(aVar, method, parameterTypes[0]));
            }
            com.facebook.react.uimanager.a.b bVar = (com.facebook.react.uimanager.a.b) method.getAnnotation(com.facebook.react.uimanager.a.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(bVar, method, parameterTypes2[1], map);
                }
            }
        }
    }
}
