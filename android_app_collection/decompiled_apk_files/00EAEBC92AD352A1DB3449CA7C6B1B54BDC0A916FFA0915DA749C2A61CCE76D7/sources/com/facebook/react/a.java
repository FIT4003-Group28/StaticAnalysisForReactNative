package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends z implements x {

    /* renamed from: a  reason: collision with root package name */
    private final r f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.b f5313b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5314c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5315d;

    /* renamed from: com.facebook.react.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0118a implements com.facebook.react.module.model.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f5316a;

        C0118a(a aVar, Map map) {
            this.f5316a = map;
        }

        @Override // com.facebook.react.module.model.a
        public Map<String, ReactModuleInfo> a() {
            return this.f5316a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements UIManagerModule.g {
        b() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.g
        public ViewManager a(String str) {
            return a.this.f5312a.a(str);
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.g
        public List<String> a() {
            return a.this.f5312a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(r rVar, com.facebook.react.modules.core.b bVar, p0 p0Var, boolean z, int i) {
        this.f5312a = rVar;
        this.f5313b = bVar;
        this.f5314c = z;
        this.f5315d = i;
    }

    private UIManagerModule c(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.a(0L, "createUIManagerModule");
        try {
            return this.f5314c ? new UIManagerModule(reactApplicationContext, new b(), this.f5315d) : new UIManagerModule(reactApplicationContext, this.f5312a.a(reactApplicationContext), this.f5315d);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.z
    public NativeModule a(String str, ReactApplicationContext reactApplicationContext) {
        char c2;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals(LogBoxModule.NAME)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1789797270:
                if (str.equals(TimingModule.NAME)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1633589448:
                if (str.equals(DevSettingsModule.NAME)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 512434409:
                if (str.equals(ExceptionsManagerModule.NAME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new AndroidInfoModule(reactApplicationContext);
            case 1:
                return new DeviceEventManagerModule(reactApplicationContext, this.f5313b);
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.f5312a.c());
            case 3:
                return new ExceptionsManagerModule(this.f5312a.c());
            case 4:
                return new LogBoxModule(reactApplicationContext, this.f5312a.c());
            case 5:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 6:
                return new SourceCodeModule(reactApplicationContext);
            case 7:
                return new TimingModule(reactApplicationContext, this.f5312a.c());
            case '\b':
                return c(reactApplicationContext);
            case '\t':
                return new DeviceInfoModule(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.x
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.x
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.z
    public com.facebook.react.module.model.a c() {
        Class[] clsArr;
        try {
            return (com.facebook.react.module.model.a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            HashMap hashMap = new HashMap();
            for (Class cls : new Class[]{AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class}) {
                com.facebook.react.d0.a.a aVar = (com.facebook.react.d0.a.a) cls.getAnnotation(com.facebook.react.d0.a.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), false));
            }
            return new C0118a(this, hashMap);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e3);
        }
    }
}
