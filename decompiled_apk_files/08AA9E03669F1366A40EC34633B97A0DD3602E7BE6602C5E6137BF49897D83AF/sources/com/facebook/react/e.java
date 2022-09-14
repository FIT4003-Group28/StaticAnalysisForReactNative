package com.facebook.react;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ac;
import com.facebook.react.bridge.ae;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.ak;
import com.facebook.react.bridge.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: NativeModuleRegistryBuilder.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final ah f3314a;

    /* renamed from: b  reason: collision with root package name */
    private final j f3315b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3316c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends NativeModule>, ModuleHolder> f3317d = new HashMap();
    private final Map<String, Class<? extends NativeModule>> e = new HashMap();

    public e(ah ahVar, j jVar, boolean z) {
        this.f3314a = ahVar;
        this.f3315b = jVar;
        this.f3316c = z;
    }

    public void a(n nVar) {
        List<NativeModule> createNativeModules;
        ModuleHolder moduleHolder;
        if (this.f3316c) {
            if (!(nVar instanceof c)) {
                throw new IllegalStateException("Lazy native modules requires all ReactPackage to inherit from LazyReactPackage");
            }
            c cVar = (c) nVar;
            List<z> a2 = cVar.a(this.f3314a);
            Map<Class, com.facebook.react.d.a.a> a3 = cVar.a().a();
            for (z zVar : a2) {
                Class<? extends NativeModule> a4 = zVar.a();
                com.facebook.react.d.a.a aVar = a3.get(a4);
                if (aVar == null) {
                    if (BaseJavaModule.class.isAssignableFrom(a4)) {
                        throw new IllegalStateException("Native Java module " + a4.getSimpleName() + " should be annotated with @ReactModule and added to a @ReactModuleList.");
                    }
                    ReactMarker.logMarker(ak.CREATE_MODULE_START, zVar.a().getName());
                    try {
                        NativeModule b2 = zVar.b().b();
                        ReactMarker.logMarker(ak.CREATE_MODULE_END);
                        moduleHolder = new ModuleHolder(b2);
                    } catch (Throwable th) {
                        ReactMarker.logMarker(ak.CREATE_MODULE_END);
                        throw th;
                    }
                } else {
                    moduleHolder = new ModuleHolder(aVar, zVar.b());
                }
                String name = moduleHolder.getName();
                if (this.e.containsKey(name)) {
                    Class<? extends NativeModule> cls = this.e.get(name);
                    if (!moduleHolder.d()) {
                        throw new IllegalStateException("Native module " + a4.getSimpleName() + " tried to override " + cls.getSimpleName() + " for module name " + name + ". If this was your intention, set canOverrideExistingModule=true");
                    }
                    this.f3317d.remove(cls);
                }
                this.e.put(name, a4);
                this.f3317d.put(a4, moduleHolder);
            }
            return;
        }
        com.facebook.common.e.a.a("ReactNative", nVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (nVar instanceof l) {
            createNativeModules = ((l) nVar).a(this.f3314a, this.f3315b);
        } else {
            createNativeModules = nVar.createNativeModules(this.f3314a);
        }
        for (NativeModule nativeModule : createNativeModules) {
            a(nativeModule);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(NativeModule nativeModule) {
        String name = nativeModule.getName();
        Class<?> cls = nativeModule.getClass();
        if (this.e.containsKey(name)) {
            Class<? extends NativeModule> cls2 = this.e.get(name);
            if (!nativeModule.canOverrideExistingModule()) {
                throw new IllegalStateException("Native module " + cls.getSimpleName() + " tried to override " + cls2.getSimpleName() + " for module name " + name + ". If this was your intention, set canOverrideExistingModule=true");
            }
            this.f3317d.remove(cls2);
        }
        this.e.put(name, cls);
        this.f3317d.put(cls, new ModuleHolder(nativeModule));
    }

    public ac a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Class<? extends NativeModule>, ModuleHolder> entry : this.f3317d.entrySet()) {
            if (ae.class.isAssignableFrom(entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        return new ac(this.f3314a, this.f3317d, arrayList);
    }
}
