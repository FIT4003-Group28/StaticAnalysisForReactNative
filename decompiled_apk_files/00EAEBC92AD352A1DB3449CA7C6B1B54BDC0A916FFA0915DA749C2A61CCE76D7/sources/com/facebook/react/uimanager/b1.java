package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Map<String, k>> f5873a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, k> f5874b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends k {
        public b(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends k {
        private final boolean i;

        public c(com.facebook.react.uimanager.e1.a aVar, Method method, boolean z) {
            super(aVar, "boolean", method);
            this.i = z;
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return obj == null ? this.i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends k {
        public d(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends k {
        public e(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "number", method);
        }

        public e(com.facebook.react.uimanager.e1.b bVar, Method method, int i) {
            super(bVar, "number", method, i);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends k {
        private final double i;

        public f(com.facebook.react.uimanager.e1.a aVar, Method method, double d2) {
            super(aVar, "number", method);
            this.i = d2;
        }

        public f(com.facebook.react.uimanager.e1.b bVar, Method method, int i, double d2) {
            super(bVar, "number", method, i);
            this.i = d2;
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return Double.valueOf(obj == null ? this.i : ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends k {
        public g(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        public g(com.facebook.react.uimanager.e1.b bVar, Method method, int i) {
            super(bVar, "mixed", method, i);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends k {
        private final float i;

        public h(com.facebook.react.uimanager.e1.a aVar, Method method, float f2) {
            super(aVar, "number", method);
            this.i = f2;
        }

        public h(com.facebook.react.uimanager.e1.b bVar, Method method, int i, float f2) {
            super(bVar, "number", method, i);
            this.i = f2;
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return Float.valueOf(obj == null ? this.i : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends k {
        private final int i;

        public i(com.facebook.react.uimanager.e1.a aVar, Method method, int i) {
            super(aVar, "number", method);
            this.i = i;
        }

        public i(com.facebook.react.uimanager.e1.b bVar, Method method, int i, int i2) {
            super(bVar, "number", method, i);
            this.i = i2;
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return Integer.valueOf(obj == null ? this.i : Integer.valueOf(((Double) obj).intValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends k {
        public j(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return (ReadableMap) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class k {

        /* renamed from: e  reason: collision with root package name */
        private static final Object[] f5875e = new Object[2];

        /* renamed from: f  reason: collision with root package name */
        private static final Object[] f5876f = new Object[3];

        /* renamed from: g  reason: collision with root package name */
        private static final Object[] f5877g = new Object[1];

        /* renamed from: h  reason: collision with root package name */
        private static final Object[] f5878h = new Object[2];

        /* renamed from: a  reason: collision with root package name */
        protected final String f5879a;

        /* renamed from: b  reason: collision with root package name */
        protected final String f5880b;

        /* renamed from: c  reason: collision with root package name */
        protected final Method f5881c;

        /* renamed from: d  reason: collision with root package name */
        protected final Integer f5882d;

        private k(com.facebook.react.uimanager.e1.a aVar, String str, Method method) {
            this.f5879a = aVar.name();
            this.f5880b = !"__default_type__".equals(aVar.customType()) ? aVar.customType() : str;
            this.f5881c = method;
            this.f5882d = null;
        }

        private k(com.facebook.react.uimanager.e1.b bVar, String str, Method method, int i) {
            this.f5879a = bVar.names()[i];
            this.f5880b = !"__default_type__".equals(bVar.customType()) ? bVar.customType() : str;
            this.f5881c = method;
            this.f5882d = Integer.valueOf(i);
        }

        protected abstract Object a(Object obj);

        public String a() {
            return this.f5879a;
        }

        public void a(ViewManager viewManager, View view, Object obj) {
            try {
                if (this.f5882d == null) {
                    f5875e[0] = view;
                    f5875e[1] = a(obj);
                    this.f5881c.invoke(viewManager, f5875e);
                    Arrays.fill(f5875e, (Object) null);
                    return;
                }
                f5876f[0] = view;
                f5876f[1] = this.f5882d;
                f5876f[2] = a(obj);
                this.f5881c.invoke(viewManager, f5876f);
                Arrays.fill(f5876f, (Object) null);
            } catch (Throwable th) {
                c.d.d.e.a.a((Class<?>) ViewManager.class, "Error while updating prop " + this.f5879a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f5879a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        public void a(a0 a0Var, Object obj) {
            try {
                if (this.f5882d == null) {
                    f5877g[0] = a(obj);
                    this.f5881c.invoke(a0Var, f5877g);
                    Arrays.fill(f5877g, (Object) null);
                    return;
                }
                f5878h[0] = this.f5882d;
                f5878h[1] = a(obj);
                this.f5881c.invoke(a0Var, f5878h);
                Arrays.fill(f5878h, (Object) null);
            } catch (Throwable th) {
                c.d.d.e.a.a((Class<?>) ViewManager.class, "Error while updating prop " + this.f5879a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f5879a + "' in shadow node of type: " + a0Var.m(), th);
            }
        }

        public String b() {
            return this.f5880b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l extends k {
        public l(com.facebook.react.uimanager.e1.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.b1.k
        protected Object a(Object obj) {
            return (String) obj;
        }
    }

    private static k a(com.facebook.react.uimanager.e1.a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new g(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new i(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new h(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new f(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new l(aVar, method);
        }
        if (cls == Boolean.class) {
            return new d(aVar, method);
        }
        if (cls == Integer.class) {
            return new e(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new j(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, k> a(Class<? extends a0> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == a0.class) {
                return f5874b;
            }
        }
        Map<String, k> map = f5873a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(a(cls.getSuperclass()));
        a(cls, hashMap);
        f5873a.put(cls, hashMap);
        return hashMap;
    }

    public static void a() {
        f5873a.clear();
        f5874b.clear();
    }

    private static void a(com.facebook.react.uimanager.e1.b bVar, Method method, Class<?> cls, Map<String, k> map) {
        String[] names = bVar.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < names.length) {
                map.put(names[i2], new g(bVar, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new i(bVar, method, i2, bVar.defaultInt()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new h(bVar, method, i2, bVar.defaultFloat()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new f(bVar, method, i2, bVar.defaultDouble()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < names.length) {
                map.put(names[i2], new e(bVar, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    private static void a(Class<? extends a0> cls, Map<String, k> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            com.facebook.react.uimanager.e1.a aVar = (com.facebook.react.uimanager.e1.a) method.getAnnotation(com.facebook.react.uimanager.e1.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), a(aVar, method, parameterTypes[0]));
            }
            com.facebook.react.uimanager.e1.b bVar = (com.facebook.react.uimanager.e1.b) method.getAnnotation(com.facebook.react.uimanager.e1.b.class);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, k> b(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f5874b;
        }
        Map<String, k> map = f5873a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(b(cls.getSuperclass()));
        b(cls, hashMap);
        f5873a.put(cls, hashMap);
        return hashMap;
    }

    private static void b(Class<? extends ViewManager> cls, Map<String, k> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            com.facebook.react.uimanager.e1.a aVar = (com.facebook.react.uimanager.e1.a) method.getAnnotation(com.facebook.react.uimanager.e1.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else {
                    map.put(aVar.name(), a(aVar, method, parameterTypes[1]));
                }
            }
            com.facebook.react.uimanager.e1.b bVar = (com.facebook.react.uimanager.e1.b) method.getAnnotation(com.facebook.react.uimanager.e1.b.class);
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
}
