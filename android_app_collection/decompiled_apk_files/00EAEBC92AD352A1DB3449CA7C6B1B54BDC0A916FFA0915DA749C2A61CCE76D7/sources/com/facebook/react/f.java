package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f5470a;

    /* renamed from: b  reason: collision with root package name */
    private final r f5471b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ModuleHolder> f5472c = new HashMap();

    public f(ReactApplicationContext reactApplicationContext, r rVar) {
        this.f5470a = reactApplicationContext;
        this.f5471b = rVar;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f5470a, this.f5472c);
    }

    public void a(v vVar) {
        for (ModuleHolder moduleHolder : vVar instanceof d ? ((d) vVar).a(this.f5470a) : vVar instanceof z ? ((z) vVar).a(this.f5470a) : w.a(vVar, this.f5470a, this.f5471b)) {
            String name = moduleHolder.getName();
            if (this.f5472c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.f5472c.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                this.f5472c.remove(moduleHolder2);
            }
            this.f5472c.put(name, moduleHolder);
        }
    }
}
