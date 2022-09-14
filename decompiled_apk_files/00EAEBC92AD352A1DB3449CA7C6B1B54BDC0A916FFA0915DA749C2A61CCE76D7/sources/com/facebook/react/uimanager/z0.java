package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.b1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, f<?, ?>> f6140a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, e<?>> f6141b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<T extends a0> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, b1.k> f6142a;

        private b(Class<? extends a0> cls) {
            this.f6142a = b1.a(cls);
        }

        @Override // com.facebook.react.uimanager.z0.e
        public void a(a0 a0Var, String str, Object obj) {
            b1.k kVar = this.f6142a.get(str);
            if (kVar != null) {
                kVar.a(a0Var, obj);
            }
        }

        @Override // com.facebook.react.uimanager.z0.d
        public void a(Map<String, String> map) {
            for (b1.k kVar : this.f6142a.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<T extends ViewManager, V extends View> implements f<T, V> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, b1.k> f6143a;

        private c(Class<? extends ViewManager> cls) {
            this.f6143a = b1.b(cls);
        }

        @Override // com.facebook.react.uimanager.z0.f
        public void a(T t, V v, String str, Object obj) {
            b1.k kVar = this.f6143a.get(str);
            if (kVar != null) {
                kVar.a(t, v, obj);
            }
        }

        @Override // com.facebook.react.uimanager.z0.d
        public void a(Map<String, String> map) {
            for (b1.k kVar : this.f6143a.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Map<String, String> map);
    }

    /* loaded from: classes.dex */
    public interface e<T extends a0> extends d {
        void a(T t, String str, Object obj);
    }

    /* loaded from: classes.dex */
    public interface f<T extends ViewManager, V extends View> extends d {
        void a(T t, V v, String str, Object obj);
    }

    private static <T> T a(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            c.d.d.e.a.d("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    public static Map<String, String> a(Class<? extends ViewManager> cls, Class<? extends a0> cls2) {
        HashMap hashMap = new HashMap();
        b(cls).a(hashMap);
        c(cls2).a(hashMap);
        return hashMap;
    }

    public static void a() {
        b1.a();
        f6140a.clear();
        f6141b.clear();
    }

    public static <T extends ViewManager, V extends View> void a(T t, V v, c0 c0Var) {
        f b2 = b(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.f5885a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            b2.a(t, v, next.getKey(), next.getValue());
        }
    }

    public static <T extends a0> void a(T t, c0 c0Var) {
        e c2 = c(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.f5885a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c2.a(t, next.getKey(), next.getValue());
        }
    }

    public static <T extends y0<V>, V extends View> void a(T t, V v, c0 c0Var) {
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.f5885a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t.a(v, next.getKey(), next.getValue());
        }
    }

    private static <T extends ViewManager, V extends View> f<T, V> b(Class<? extends ViewManager> cls) {
        c cVar = (f<T, V>) f6140a.get(cls);
        if (cVar == null) {
            cVar = (f) a(cls);
            if (cVar == null) {
                cVar = new c(cls);
            }
            f6140a.put(cls, cVar);
        }
        return cVar;
    }

    private static <T extends a0> e<T> c(Class<? extends a0> cls) {
        b bVar = (e<T>) f6141b.get(cls);
        if (bVar == null) {
            bVar = (e) a(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            f6141b.put(cls, bVar);
        }
        return bVar;
    }
}
