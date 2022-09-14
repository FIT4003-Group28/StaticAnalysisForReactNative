package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.support.v4.j.s;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ab;
import com.facebook.react.bridge.ac;
import com.facebook.react.bridge.ad;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.v;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ReactInstanceManager.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f3449a = "j";

    /* renamed from: c  reason: collision with root package name */
    private volatile com.facebook.react.b.d f3451c;

    /* renamed from: d  reason: collision with root package name */
    private a f3452d;
    private volatile Thread e;
    private final v f;
    private final com.facebook.react.bridge.o g;
    private final String h;
    private final List<n> i;
    private final com.facebook.react.devsupport.a.b j;
    private final boolean k;
    private final ad l;
    private volatile aj n;
    private final Context o;
    private com.facebook.react.modules.core.b p;
    private Activity q;
    private final d u;
    private final ab v;
    private final boolean w;
    private final boolean x;

    /* renamed from: b  reason: collision with root package name */
    private final List<p> f3450b = Collections.synchronizedList(new ArrayList());
    private final Object m = new Object();
    private final Collection<b> r = Collections.synchronizedSet(new HashSet());
    private volatile boolean s = false;
    private volatile Boolean t = false;

    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(aj ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private final v f3473b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.react.bridge.o f3474c;

        public a(v vVar, com.facebook.react.bridge.o oVar) {
            this.f3473b = (v) com.facebook.j.a.a.b(vVar);
            this.f3474c = (com.facebook.react.bridge.o) com.facebook.j.a.a.b(oVar);
        }

        public v a() {
            return this.f3473b;
        }

        public com.facebook.react.bridge.o b() {
            return this.f3474c;
        }
    }

    public static k a() {
        return new k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, Activity activity, com.facebook.react.modules.core.b bVar, v vVar, com.facebook.react.bridge.o oVar, String str, List<n> list, boolean z, ad adVar, com.facebook.react.b.d dVar, ak akVar, ab abVar, com.facebook.react.devsupport.e eVar, boolean z2, boolean z3, boolean z4, com.facebook.react.devsupport.a.a aVar, int i, int i2) {
        Log.d("ReactNative", "ReactInstanceManager.ctor()");
        a(context);
        com.facebook.react.uimanager.b.a(context);
        this.o = context;
        this.q = activity;
        this.p = bVar;
        this.f = vVar;
        this.g = oVar;
        this.h = str;
        this.i = new ArrayList();
        this.k = z;
        this.j = com.facebook.react.devsupport.a.a(context, k(), this.h, z, eVar, aVar, i);
        this.l = adVar;
        this.f3451c = dVar;
        this.u = new d(context);
        this.v = abVar;
        this.w = z2;
        this.x = z4;
        synchronized (this.i) {
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f2342c, "RNCore: Use Split Packages");
            this.i.add(new com.facebook.react.a(this, new com.facebook.react.modules.core.b() { // from class: com.facebook.react.j.1
                @Override // com.facebook.react.modules.core.b
                public void c() {
                    j.this.n();
                }
            }, akVar, z3, i2));
            if (this.k) {
                this.i.add(new com.facebook.react.b());
            }
            this.i.addAll(list);
        }
        com.facebook.react.modules.core.e.a();
        if (this.k) {
            this.j.c();
        }
    }

    private com.facebook.react.devsupport.d k() {
        return new com.facebook.react.devsupport.d() { // from class: com.facebook.react.j.2
        };
    }

    public com.facebook.react.devsupport.a.b b() {
        return this.j;
    }

    private static void a(Context context) {
        com.facebook.l.g.a(context, false);
    }

    public void c() {
        Log.d("ReactNative", "ReactInstanceManager.createReactContextInBackground()");
        com.facebook.j.a.a.a(!this.s, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.s = true;
        l();
    }

    private void l() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        com.facebook.d.b.c.a().a(com.facebook.d.c.a.f2342c, "RNCore: recreateReactContextInBackground");
        ap.b();
        if (this.k && this.h != null && !com.facebook.m.a.a(0L)) {
            final com.facebook.react.modules.debug.a.a e = this.j.e();
            if (this.j.h() && !e.b()) {
                r();
                return;
            } else if (this.g == null) {
                this.j.i();
                return;
            } else {
                this.j.a(new com.facebook.react.devsupport.a.c() { // from class: com.facebook.react.j.3
                });
                return;
            }
        }
        m();
    }

    private void m() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        com.facebook.d.b.c.a().a(com.facebook.d.c.a.f2342c, "RNCore: load from BundleLoader");
        a(this.f, this.g);
    }

    public boolean d() {
        return this.s;
    }

    public void e() {
        ap.b();
        aj ajVar = this.n;
        if (ajVar == null) {
            com.facebook.common.e.a.c("ReactNative", "Instance detached from instance manager");
            n();
            return;
        }
        ((DeviceEventManagerModule) ajVar.b(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ap.b();
        if (this.p != null) {
            this.p.c();
        }
    }

    public void a(Intent intent) {
        ap.b();
        aj j = j();
        if (j == null) {
            com.facebook.common.e.a.c("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) j.b(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        j.a(this.q, intent);
    }

    public void f() {
        ap.b();
        this.p = null;
        if (this.k) {
            this.j.a(false);
        }
        o();
    }

    public void a(Activity activity) {
        com.facebook.j.a.a.b(this.q);
        boolean z = activity == this.q;
        com.facebook.j.a.a.a(z, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.q.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        f();
    }

    public void a(Activity activity, com.facebook.react.modules.core.b bVar) {
        ap.b();
        this.p = bVar;
        this.q = activity;
        if (this.k) {
            final View decorView = this.q.getWindow().getDecorView();
            if (!s.q(decorView)) {
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.facebook.react.j.4
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        j.this.j.a(true);
                    }
                });
            } else {
                this.j.a(true);
            }
        }
        a(false);
    }

    public void g() {
        ap.b();
        if (this.k) {
            this.j.a(false);
        }
        p();
        this.q = null;
    }

    public void b(Activity activity) {
        if (activity == this.q) {
            g();
        }
    }

    private synchronized void a(boolean z) {
        aj j = j();
        if (j != null && (z || this.f3451c == com.facebook.react.b.d.BEFORE_RESUME || this.f3451c == com.facebook.react.b.d.BEFORE_CREATE)) {
            j.a(this.q);
        }
        this.f3451c = com.facebook.react.b.d.RESUMED;
    }

    private synchronized void o() {
        aj j = j();
        if (j != null) {
            if (this.f3451c == com.facebook.react.b.d.BEFORE_CREATE) {
                j.a(this.q);
                j.c();
            } else if (this.f3451c == com.facebook.react.b.d.RESUMED) {
                j.c();
            }
        }
        this.f3451c = com.facebook.react.b.d.BEFORE_RESUME;
    }

    private synchronized void p() {
        aj j = j();
        if (j != null) {
            if (this.f3451c == com.facebook.react.b.d.RESUMED) {
                j.c();
                this.f3451c = com.facebook.react.b.d.BEFORE_RESUME;
            }
            if (this.f3451c == com.facebook.react.b.d.BEFORE_RESUME) {
                j.d();
            }
        }
        this.f3451c = com.facebook.react.b.d.BEFORE_CREATE;
    }

    private synchronized void q() {
        if (this.f3451c == com.facebook.react.b.d.RESUMED) {
            a(true);
        }
    }

    public void a(Activity activity, int i, int i2, Intent intent) {
        aj j = j();
        if (j != null) {
            j.a(activity, i, i2, intent);
        }
    }

    public void h() {
        ap.b();
        this.j.b();
    }

    public void a(p pVar) {
        ap.b();
        this.f3450b.add(pVar);
        pVar.removeAllViews();
        pVar.setId(-1);
        aj j = j();
        if (this.e != null || j == null) {
            return;
        }
        a(pVar, j.a());
    }

    public void b(p pVar) {
        aj j;
        ap.b();
        if (!this.f3450b.remove(pVar) || (j = j()) == null || !j.b()) {
            return;
        }
        b(pVar, j.a());
    }

    public List<ViewManager> a(ah ahVar) {
        ArrayList arrayList;
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_VIEW_MANAGERS_START);
        com.facebook.m.a.a(0L, "createAllViewManagers");
        try {
            synchronized (this.i) {
                arrayList = new ArrayList();
                for (n nVar : this.i) {
                    arrayList.addAll(nVar.createViewManagers(ahVar));
                }
            }
            return arrayList;
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_VIEW_MANAGERS_END);
        }
    }

    public ViewManager a(String str) {
        ViewManager a2;
        synchronized (this.m) {
            ah ahVar = (ah) j();
            if (ahVar != null && ahVar.b()) {
                synchronized (this.i) {
                    for (n nVar : this.i) {
                        if ((nVar instanceof q) && (a2 = ((q) nVar).a(ahVar, str, !this.x)) != null) {
                            return a2;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    public List<String> i() {
        ArrayList arrayList;
        List<String> a2;
        synchronized (this.m) {
            ah ahVar = (ah) j();
            if (ahVar != null && ahVar.b()) {
                synchronized (this.i) {
                    HashSet hashSet = new HashSet();
                    for (n nVar : this.i) {
                        if ((nVar instanceof q) && (a2 = ((q) nVar).a(ahVar, !this.x)) != null) {
                            hashSet.addAll(a2);
                        }
                    }
                    arrayList = new ArrayList(hashSet);
                }
                return arrayList;
            }
            return null;
        }
    }

    public aj j() {
        aj ajVar;
        synchronized (this.m) {
            ajVar = this.n;
        }
        return ajVar;
    }

    private void r() {
        Log.d("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        a(this.f, com.facebook.react.bridge.o.a(this.j.f(), this.j.g()));
    }

    private void a(v vVar, com.facebook.react.bridge.o oVar) {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        ap.b();
        a aVar = new a(vVar, oVar);
        if (this.e == null) {
            a(aVar);
        } else {
            this.f3452d = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final a aVar) {
        Log.d("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        ap.b();
        synchronized (this.m) {
            if (this.n != null) {
                a(this.n);
                this.n = null;
            }
        }
        this.e = new Thread(new Runnable() { // from class: com.facebook.react.j.5
            @Override // java.lang.Runnable
            public void run() {
                ReactMarker.logMarker(com.facebook.react.bridge.ak.REACT_CONTEXT_THREAD_END);
                synchronized (j.this.t) {
                    while (j.this.t.booleanValue()) {
                        try {
                            j.this.t.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                j.this.s = true;
                try {
                    Process.setThreadPriority(-4);
                    final ah a2 = j.this.a(aVar.a().a(), aVar.b());
                    j.this.e = null;
                    ReactMarker.logMarker(com.facebook.react.bridge.ak.PRE_SETUP_REACT_CONTEXT_START);
                    Runnable runnable = new Runnable() { // from class: com.facebook.react.j.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (j.this.f3452d != null) {
                                j.this.a(j.this.f3452d);
                                j.this.f3452d = null;
                            }
                        }
                    };
                    a2.b(new Runnable() { // from class: com.facebook.react.j.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                j.this.b(a2);
                            } catch (Exception e) {
                                j.this.j.a(e);
                            }
                        }
                    });
                    ap.a(runnable);
                } catch (Exception e) {
                    j.this.j.a(e);
                }
            }
        });
        ReactMarker.logMarker(com.facebook.react.bridge.ak.REACT_CONTEXT_THREAD_START);
        this.e.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ah ahVar) {
        Log.d("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(com.facebook.react.bridge.ak.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(com.facebook.react.bridge.ak.SETUP_REACT_CONTEXT_START);
        com.facebook.m.a.a(0L, "setupReactContext");
        synchronized (this.m) {
            this.n = (aj) com.facebook.j.a.a.b(ahVar);
        }
        CatalystInstance catalystInstance = (CatalystInstance) com.facebook.j.a.a.b(ahVar.a());
        catalystInstance.initialize();
        this.j.a(ahVar);
        this.u.a(catalystInstance);
        q();
        ReactMarker.logMarker(com.facebook.react.bridge.ak.ATTACH_MEASURED_ROOT_VIEWS_START);
        synchronized (this.f3450b) {
            for (p pVar : this.f3450b) {
                a(pVar, catalystInstance);
            }
        }
        ReactMarker.logMarker(com.facebook.react.bridge.ak.ATTACH_MEASURED_ROOT_VIEWS_END);
        final b[] bVarArr = (b[]) this.r.toArray(new b[this.r.size()]);
        ap.a(new Runnable() { // from class: com.facebook.react.j.6
            @Override // java.lang.Runnable
            public void run() {
                for (b bVar : bVarArr) {
                    bVar.a(ahVar);
                }
            }
        });
        com.facebook.m.a.b(0L);
        ReactMarker.logMarker(com.facebook.react.bridge.ak.SETUP_REACT_CONTEXT_END);
        ahVar.c(new Runnable() { // from class: com.facebook.react.j.7
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(0);
            }
        });
        ahVar.b(new Runnable() { // from class: com.facebook.react.j.8
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(0);
            }
        });
    }

    private void a(final p pVar, CatalystInstance catalystInstance) {
        Log.d("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        com.facebook.m.a.a(0L, "attachRootViewToInstance");
        final int addRootView = ((UIManagerModule) catalystInstance.getNativeModule(UIManagerModule.class)).addRootView(pVar);
        pVar.setRootViewTag(addRootView);
        pVar.c();
        com.facebook.m.a.a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
        ap.a(new Runnable() { // from class: com.facebook.react.j.9
            @Override // java.lang.Runnable
            public void run() {
                com.facebook.m.a.b(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
                pVar.b();
            }
        });
        com.facebook.m.a.b(0L);
    }

    private void b(p pVar, CatalystInstance catalystInstance) {
        Log.d("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        ap.b();
        ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(pVar.getId());
    }

    private void a(aj ajVar) {
        Log.d("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        ap.b();
        if (this.f3451c == com.facebook.react.b.d.RESUMED) {
            ajVar.c();
        }
        synchronized (this.f3450b) {
            for (p pVar : this.f3450b) {
                pVar.removeAllViews();
                pVar.setId(-1);
            }
        }
        ajVar.e();
        this.j.b(ajVar);
        this.u.b(ajVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ah a(JavaScriptExecutor javaScriptExecutor, com.facebook.react.bridge.o oVar) {
        Log.d("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_REACT_CONTEXT_START);
        ah ahVar = new ah(this.o);
        if (this.k) {
            ahVar.a(this.j);
        }
        CatalystInstanceImpl.b a2 = new CatalystInstanceImpl.b().a(com.facebook.react.bridge.queue.f.d()).a(javaScriptExecutor).a(a(ahVar, this.i, false)).a(oVar).a(this.v != null ? this.v : this.j);
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_CATALYST_INSTANCE_START);
        com.facebook.m.a.a(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl a3 = a2.a();
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_CATALYST_INSTANCE_END);
            if (this.l != null) {
                a3.addBridgeIdleDebugListener(this.l);
            }
            if (com.facebook.m.a.a(0L)) {
                a3.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(com.facebook.react.bridge.ak.PRE_RUN_JS_BUNDLE_START);
            a3.runJSBundle();
            ahVar.a(a3);
            return ahVar;
        } catch (Throwable th) {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private ac a(ah ahVar, List<n> list, boolean z) {
        e eVar = new e(ahVar, this, this.w);
        ReactMarker.logMarker(com.facebook.react.bridge.ak.PROCESS_PACKAGES_START);
        synchronized (this.i) {
            Iterator<n> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    n next = it.next();
                    if (!z || !this.i.contains(next)) {
                        com.facebook.m.a.a(0L, "createAndProcessCustomReactPackage");
                        if (z) {
                            this.i.add(next);
                        }
                        a(next, eVar);
                        com.facebook.m.a.b(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(com.facebook.react.bridge.ak.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(com.facebook.react.bridge.ak.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.m.a.a(0L, "buildNativeModuleRegistry");
        try {
            return eVar.a();
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void a(n nVar, e eVar) {
        com.facebook.m.b.a(0L, "processPackage").a("className", nVar.getClass().getSimpleName()).a();
        boolean z = nVar instanceof o;
        if (z) {
            ((o) nVar).b();
        }
        eVar.a(nVar);
        if (z) {
            ((o) nVar).c();
        }
        com.facebook.m.b.a(0L).a();
    }
}
