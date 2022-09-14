package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: NativeModuleRegistry.java */
/* loaded from: classes.dex */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    private final ah f3216a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends NativeModule>, ModuleHolder> f3217b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<ModuleHolder> f3218c;

    public ac(ah ahVar, Map<Class<? extends NativeModule>, ModuleHolder> map, ArrayList<ModuleHolder> arrayList) {
        this.f3216a = ahVar;
        this.f3217b = map;
        this.f3218c = arrayList;
    }

    private Map<Class<? extends NativeModule>, ModuleHolder> f() {
        return this.f3217b;
    }

    private ah g() {
        return this.f3216a;
    }

    private ArrayList<ModuleHolder> h() {
        return this.f3218c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<JavaModuleWrapper> a(q qVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Class<? extends NativeModule>, ModuleHolder> entry : this.f3217b.entrySet()) {
            Class<? extends NativeModule> key = entry.getKey();
            if (!CxxModuleWrapperBase.class.isAssignableFrom(key)) {
                arrayList.add(new JavaModuleWrapper(qVar, key, entry.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<ModuleHolder> a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Class<? extends NativeModule>, ModuleHolder> entry : this.f3217b.entrySet()) {
            if (CxxModuleWrapperBase.class.isAssignableFrom(entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ac acVar) {
        com.facebook.j.a.a.a(this.f3216a.equals(acVar.g()), "Extending native modules with non-matching application contexts.");
        Map<Class<? extends NativeModule>, ModuleHolder> f = acVar.f();
        ArrayList<ModuleHolder> h = acVar.h();
        for (Map.Entry<Class<? extends NativeModule>, ModuleHolder> entry : f.entrySet()) {
            Class<? extends NativeModule> key = entry.getKey();
            if (!this.f3217b.containsKey(key)) {
                ModuleHolder value = entry.getValue();
                if (h.contains(value)) {
                    this.f3218c.add(value);
                }
                this.f3217b.put(key, value);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f3216a.h();
        com.facebook.m.a.a(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder moduleHolder : this.f3217b.values()) {
                moduleHolder.c();
            }
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f3216a.a("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ak.NATIVE_MODULE_INITIALIZE_START);
        com.facebook.m.a.a(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder moduleHolder : this.f3217b.values()) {
                moduleHolder.a();
            }
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(ak.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void d() {
        Iterator<ModuleHolder> it = this.f3218c.iterator();
        while (it.hasNext()) {
            ModuleHolder next = it.next();
            if (next.b()) {
                ((ae) next.getModule()).onBatchComplete();
            }
        }
    }

    public <T extends NativeModule> boolean a(Class<T> cls) {
        return this.f3217b.containsKey(cls);
    }

    public <T extends NativeModule> T b(Class<T> cls) {
        return (T) ((ModuleHolder) com.facebook.j.a.a.b(this.f3217b.get(cls))).getModule();
    }

    public List<NativeModule> e() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : this.f3217b.values()) {
            arrayList.add(moduleHolder.getModule());
        }
        return arrayList;
    }
}
