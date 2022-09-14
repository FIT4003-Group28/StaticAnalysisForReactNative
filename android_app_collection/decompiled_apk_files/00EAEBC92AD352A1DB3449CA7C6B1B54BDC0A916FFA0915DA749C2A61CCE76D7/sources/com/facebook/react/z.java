package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
/* loaded from: classes.dex */
public abstract class z implements v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Iterator f6430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f6431c;

        /* renamed from: com.facebook.react.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0137a implements Iterator<ModuleHolder> {

            /* renamed from: b  reason: collision with root package name */
            Map.Entry<String, ReactModuleInfo> f6433b = null;

            C0137a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void a() {
                /*
                    r3 = this;
                L0:
                    com.facebook.react.z$a r0 = com.facebook.react.z.a.this
                    java.util.Iterator r0 = r0.f6430b
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L28
                    com.facebook.react.z$a r0 = com.facebook.react.z.a.this
                    java.util.Iterator r0 = r0.f6430b
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                    boolean r2 = com.facebook.react.b0.a.f5410b
                    if (r2 == 0) goto L25
                    boolean r1 = r1.e()
                    if (r1 == 0) goto L25
                    goto L0
                L25:
                    r3.f6433b = r0
                    return
                L28:
                    r0 = 0
                    r3.f6433b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.z.a.C0137a.a():void");
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f6433b == null) {
                    a();
                }
                return this.f6433b != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            /* renamed from: next */
            public ModuleHolder mo248next() {
                if (this.f6433b == null) {
                    a();
                }
                Map.Entry<String, ReactModuleInfo> entry = this.f6433b;
                if (entry != null) {
                    a();
                    a aVar = a.this;
                    return new ModuleHolder(entry.getValue(), new b(entry.getKey(), aVar.f6431c));
                }
                throw new NoSuchElementException("ModuleHolder not found");
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f6430b = it;
            this.f6431c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0137a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Provider<NativeModule> {

        /* renamed from: a  reason: collision with root package name */
        private final String f6435a;

        /* renamed from: b  reason: collision with root package name */
        private final ReactApplicationContext f6436b;

        public b(String str, ReactApplicationContext reactApplicationContext) {
            this.f6435a = str;
            this.f6436b = reactApplicationContext;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // javax.inject.Provider
        /* renamed from: get */
        public NativeModule mo254get() {
            return z.this.a(this.f6435a, this.f6436b);
        }
    }

    public abstract NativeModule a(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new a(c().a().entrySet().iterator(), reactApplicationContext);
    }

    protected List<ModuleSpec> b(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public abstract com.facebook.react.module.model.a c();

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> b2 = b(reactApplicationContext);
        if (b2 == null || b2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b2) {
            arrayList.add((ViewManager) moduleSpec.getProvider().mo254get());
        }
        return arrayList;
    }
}
