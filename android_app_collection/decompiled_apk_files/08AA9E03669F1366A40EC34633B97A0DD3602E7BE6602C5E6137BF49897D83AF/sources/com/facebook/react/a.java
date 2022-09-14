package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.z;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ak;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreModulesPackage.java */
/* loaded from: classes.dex */
public class a extends c implements o {

    /* renamed from: a  reason: collision with root package name */
    private final j f3061a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.b f3062b;

    /* renamed from: c  reason: collision with root package name */
    private final ak f3063c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3064d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(j jVar, com.facebook.react.modules.core.b bVar, ak akVar, boolean z, int i) {
        this.f3061a = jVar;
        this.f3062b = bVar;
        this.f3063c = akVar;
        this.f3064d = z;
        this.e = i;
    }

    @Override // com.facebook.react.c
    public List<z> a(final ah ahVar) {
        return Arrays.asList(z.a(AndroidInfoModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.1
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new AndroidInfoModule();
            }
        }), z.a(DeviceEventManagerModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.2
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new DeviceEventManagerModule(ahVar, a.this.f3062b);
            }
        }), z.a(ExceptionsManagerModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.3
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ExceptionsManagerModule(a.this.f3061a.b());
            }
        }), z.a(HeadlessJsTaskSupportModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.4
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new HeadlessJsTaskSupportModule(ahVar);
            }
        }), z.a(SourceCodeModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.5
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new SourceCodeModule(ahVar);
            }
        }), z.a(Timing.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.6
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new Timing(ahVar, a.this.f3061a.b());
            }
        }), z.a(UIManagerModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.7
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return a.this.c(ahVar);
            }
        }), z.a(DeviceInfoModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.a.8
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new DeviceInfoModule(ahVar);
            }
        }));
    }

    @Override // com.facebook.react.c
    public com.facebook.react.d.a.b a() {
        return c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UIManagerModule c(ah ahVar) {
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.m.a.a(0L, "createUIManagerModule");
        try {
            if (this.f3064d) {
                return new UIManagerModule(ahVar, new UIManagerModule.c() { // from class: com.facebook.react.a.9
                    @Override // com.facebook.react.uimanager.UIManagerModule.c
                    public ViewManager a(String str) {
                        return a.this.f3061a.a(str);
                    }

                    @Override // com.facebook.react.uimanager.UIManagerModule.c
                    public List<String> a() {
                        return a.this.f3061a.i();
                    }
                }, this.f3063c, this.e);
            }
            return new UIManagerModule(ahVar, this.f3061a.a(ahVar), this.f3063c, this.e);
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.o
    public void b() {
        ReactMarker.logMarker(com.facebook.react.bridge.ak.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.o
    public void c() {
        ReactMarker.logMarker(com.facebook.react.bridge.ak.PROCESS_CORE_REACT_PACKAGE_END);
    }
}
