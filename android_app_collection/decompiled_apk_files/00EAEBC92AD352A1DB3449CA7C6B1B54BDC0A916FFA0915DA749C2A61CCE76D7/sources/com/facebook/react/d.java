package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d implements v {

    /* loaded from: classes.dex */
    static class a implements com.facebook.react.module.model.a {
        a() {
        }

        @Override // com.facebook.react.module.model.a
        public Map<String, ReactModuleInfo> a() {
            return Collections.emptyMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Iterable<ModuleHolder> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f5458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f5459c;

        /* loaded from: classes.dex */
        class a implements Iterator<ModuleHolder> {

            /* renamed from: b  reason: collision with root package name */
            int f5460b = 0;

            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5460b < b.this.f5458b.size();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            /* renamed from: next */
            public ModuleHolder mo211next() {
                List list = b.this.f5458b;
                int i = this.f5460b;
                this.f5460b = i + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) b.this.f5459c.get(name);
                if (reactModuleInfo == null) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                    try {
                        NativeModule mo254get = moduleSpec.getProvider().mo254get();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        return new ModuleHolder(mo254get);
                    } catch (Throwable th) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        throw th;
                    }
                }
                return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        b(d dVar, List list, Map map) {
            this.f5458b = list;
            this.f5459c = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new a();
        }
    }

    public static com.facebook.react.module.model.a a(d dVar) {
        try {
            Class<?> cls = Class.forName(dVar.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls == null) {
                throw new RuntimeException("ReactModuleInfoProvider class for " + dVar.getClass().getCanonicalName() + " not found.");
            }
            try {
                return (com.facebook.react.module.model.a) cls.newInstance();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + dVar.getClass(), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + dVar.getClass(), e3);
            }
        } catch (ClassNotFoundException unused) {
            return new a();
        }
    }

    public abstract com.facebook.react.module.model.a a();

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new b(this, b(reactApplicationContext), a().a());
    }

    protected abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public List<ModuleSpec> c(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.v
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b(reactApplicationContext)) {
            b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "createNativeModule");
            a2.a("module", moduleSpec.getType());
            a2.a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule mo254get = moduleSpec.getProvider().mo254get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.a(0L).a();
                arrayList.add(mo254get);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.a(0L).a();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> c2 = c(reactApplicationContext);
        if (c2 == null || c2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : c2) {
            arrayList.add((ViewManager) moduleSpec.getProvider().mo254get());
        }
        return arrayList;
    }
}
