package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.at;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ViewManagerPropertyUpdater.java */
/* loaded from: classes.dex */
public class ar {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, e<?, ?>> f3819a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, d<?>> f3820b = new HashMap();

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(Map<String, String> map);
    }

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface d<T extends w> extends c {
        void a(T t, String str, y yVar);
    }

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface e<T extends ViewManager, V extends View> extends c {
        void a(T t, V v, String str, y yVar);
    }

    public static void a() {
        at.a();
        f3819a.clear();
        f3820b.clear();
    }

    public static <T extends ViewManager, V extends View> void a(T t, V v, y yVar) {
        e a2 = a(t.getClass());
        ReadableMapKeySetIterator a3 = yVar.f3938a.a();
        while (a3.hasNextKey()) {
            a2.a(t, v, a3.nextKey(), yVar);
        }
    }

    public static <T extends w> void a(T t, y yVar) {
        d b2 = b(t.getClass());
        ReadableMapKeySetIterator a2 = yVar.f3938a.a();
        while (a2.hasNextKey()) {
            b2.a(t, a2.nextKey(), yVar);
        }
    }

    public static Map<String, String> a(Class<? extends ViewManager> cls, Class<? extends w> cls2) {
        HashMap hashMap = new HashMap();
        a(cls).a(hashMap);
        b(cls2).a(hashMap);
        return hashMap;
    }

    private static <T extends ViewManager, V extends View> e<T, V> a(Class<? extends ViewManager> cls) {
        b bVar = (e<T, V>) f3819a.get(cls);
        if (bVar == null) {
            bVar = (e) c(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            f3819a.put(cls, bVar);
        }
        return bVar;
    }

    private static <T extends w> d<T> b(Class<? extends w> cls) {
        a aVar = (d<T>) f3820b.get(cls);
        if (aVar == null) {
            aVar = (d) c(cls);
            if (aVar == null) {
                aVar = new a(cls);
            }
            f3820b.put(cls, aVar);
        }
        return aVar;
    }

    private static <T> T c(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            com.facebook.common.e.a.c("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public static class b<T extends ViewManager, V extends View> implements e<T, V> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, at.j> f3822a;

        private b(Class<? extends ViewManager> cls) {
            this.f3822a = at.a(cls);
        }

        @Override // com.facebook.react.uimanager.ar.e
        public void a(T t, V v, String str, y yVar) {
            at.j jVar = this.f3822a.get(str);
            if (jVar != null) {
                jVar.a(t, v, yVar);
            }
        }

        @Override // com.facebook.react.uimanager.ar.c
        public void a(Map<String, String> map) {
            for (at.j jVar : this.f3822a.values()) {
                map.put(jVar.a(), jVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public static class a<T extends w> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, at.j> f3821a;

        private a(Class<? extends w> cls) {
            this.f3821a = at.b(cls);
        }

        @Override // com.facebook.react.uimanager.ar.d
        public void a(w wVar, String str, y yVar) {
            at.j jVar = this.f3821a.get(str);
            if (jVar != null) {
                jVar.a(wVar, yVar);
            }
        }

        @Override // com.facebook.react.uimanager.ar.c
        public void a(Map<String, String> map) {
            for (at.j jVar : this.f3821a.values()) {
                map.put(jVar.a(), jVar.b());
            }
        }
    }
}
