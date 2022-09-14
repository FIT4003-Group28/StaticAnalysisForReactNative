package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.e;
import com.facebook.react.fabric.mounting.mountitems.f;
import com.facebook.react.fabric.mounting.mountitems.g;
import com.facebook.react.fabric.mounting.mountitems.h;
import com.facebook.react.fabric.mounting.mountitems.i;
import com.facebook.react.fabric.mounting.mountitems.j;
import com.facebook.react.fabric.mounting.mountitems.k;
import com.facebook.react.fabric.mounting.mountitems.l;
import com.facebook.react.fabric.mounting.mountitems.m;
import com.facebook.react.fabric.mounting.mountitems.n;
import com.facebook.react.fabric.mounting.mountitems.o;
import com.facebook.react.fabric.mounting.mountitems.p;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class c implements UIManager, LifecycleEventListener {
    public static final boolean w;

    /* renamed from: b  reason: collision with root package name */
    private Binding f5477b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactApplicationContext f5478c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.fabric.e.b f5479d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.react.uimanager.events.d f5480e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<Integer, k0> f5481f;

    /* renamed from: g  reason: collision with root package name */
    private final EventBeatManager f5482g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f5483h;
    private final Object i;
    private List<f> j;
    private ArrayDeque<f> k;
    private final C0123c l;
    private boolean m;
    private volatile boolean n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;

    /* loaded from: classes.dex */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5486c;

        a(c cVar, int i, int i2, boolean z) {
            this.f5484a = i;
            this.f5485b = i2;
            this.f5486c = z;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.f
        public void a(com.facebook.react.fabric.e.b bVar) {
            bVar.a(this.f5484a, this.f5485b, this.f5486c);
        }
    }

    /* loaded from: classes.dex */
    class b implements f {
        b(c cVar) {
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.f
        public void a(com.facebook.react.fabric.e.b bVar) {
            bVar.a();
        }
    }

    /* renamed from: com.facebook.react.fabric.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0123c extends d {
        void b() {
            throw null;
        }
    }

    static {
        w = com.facebook.react.b0.a.f5412d || c.d.f.b.c.a().a(c.d.f.c.a.f2911e);
        com.facebook.react.fabric.b.a();
    }

    private void a() {
        String[] split;
        this.o = SystemClock.uptimeMillis();
        synchronized (this.f5483h) {
            if (this.j.isEmpty()) {
                return;
            }
            List<f> list = this.j;
            this.j = new ArrayList();
            ArrayDeque<f> arrayDeque = null;
            synchronized (this.i) {
                if (!this.k.isEmpty()) {
                    arrayDeque = this.k;
                    this.k = new ArrayDeque<>(250);
                }
            }
            if (arrayDeque != null) {
                com.facebook.systrace.a.a(0L, "FabricUIManager::mountViews preMountItems to execute: " + arrayDeque.size());
                while (!arrayDeque.isEmpty()) {
                    arrayDeque.pollFirst().a(this.f5479d);
                }
                com.facebook.systrace.a.a(0L);
            }
            com.facebook.systrace.a.a(0L, "FabricUIManager::mountViews mountItems to execute: " + list.size());
            long uptimeMillis = SystemClock.uptimeMillis();
            for (f fVar : list) {
                if (w) {
                    for (String str : fVar.toString().split("\n")) {
                        c.d.d.e.a.a("FabricUIManager", "dispatchMountItems: Executing mountItem: " + str);
                    }
                }
                fVar.a(this.f5479d);
            }
            this.p = SystemClock.uptimeMillis() - uptimeMillis;
            com.facebook.systrace.a.a(0L);
        }
    }

    @c.d.l.a.a
    private f createBatchMountItem(f[] fVarArr, int i, int i2) {
        return new BatchMountItem(fVarArr, i, i2);
    }

    @c.d.l.a.a
    private f createMountItem(String str, ReadableMap readableMap, Object obj, int i, int i2, boolean z) {
        String a2 = com.facebook.react.fabric.a.a(str);
        k0 k0Var = this.f5481f.get(Integer.valueOf(i));
        if (k0Var != null) {
            return new com.facebook.react.fabric.mounting.mountitems.a(k0Var, i, i2, a2, readableMap, (j0) obj, z);
        }
        throw new IllegalArgumentException("Unable to find ReactContext for root: " + i);
    }

    @c.d.l.a.a
    private f deleteMountItem(int i) {
        return new com.facebook.react.fabric.mounting.mountitems.b(i);
    }

    @c.d.l.a.a
    private f insertMountItem(int i, int i2, int i3) {
        return new e(i, i2, i3);
    }

    @c.d.l.a.a
    private long measure(int i, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5) {
        return this.f5479d.a(this.f5481f.get(Integer.valueOf(i)), str, readableMap, readableMap2, readableMap3, com.facebook.react.fabric.e.a.b(f2, f3), com.facebook.react.fabric.e.a.a(f2, f3), com.facebook.react.fabric.e.a.b(f4, f5), com.facebook.react.fabric.e.a.a(f4, f5));
    }

    @c.d.l.a.a
    private long measure(String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5) {
        return this.f5479d.a(this.f5478c, str, readableMap, readableMap2, readableMap3, com.facebook.react.fabric.e.a.b(f2, f3), com.facebook.react.fabric.e.a.a(f2, f3), com.facebook.react.fabric.e.a.b(f4, f5), com.facebook.react.fabric.e.a.a(f4, f5));
    }

    @c.d.l.a.a
    private void preallocateView(int i, int i2, String str, ReadableMap readableMap, Object obj, boolean z) {
        k0 k0Var = this.f5481f.get(Integer.valueOf(i));
        String a2 = com.facebook.react.fabric.a.a(str);
        synchronized (this.i) {
            this.k.add(new g(k0Var, i, i2, a2, readableMap, (j0) obj, z));
        }
    }

    @c.d.l.a.a
    private f removeDeleteMultiMountItem(int[] iArr) {
        return new h(iArr);
    }

    @c.d.l.a.a
    private f removeMountItem(int i, int i2, int i3) {
        return new i(i, i2, i3);
    }

    @c.d.l.a.a
    private void scheduleMountItem(f fVar, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        boolean z = fVar instanceof BatchMountItem;
        if (z) {
            this.r = j;
            this.s = j5 - j4;
            this.u = j7 - j6;
            this.t = SystemClock.uptimeMillis() - j6;
            this.q = SystemClock.uptimeMillis();
        }
        synchronized (this.f5483h) {
            this.j.add(fVar);
        }
        if (UiThreadUtil.isOnUiThread()) {
            if (!com.facebook.react.b0.a.f5416h || this.m) {
                a();
            }
        }
        if (z) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i, j);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i);
        }
    }

    @c.d.l.a.a
    private f updateEventEmitterMountItem(int i, Object obj) {
        return new k(i, (EventEmitterWrapper) obj);
    }

    @c.d.l.a.a
    private f updateLayoutMountItem(int i, int i2, int i3, int i4, int i5, int i6) {
        return new l(i, i2, i3, i4, i5, i6);
    }

    @c.d.l.a.a
    private f updateLocalDataMountItem(int i, ReadableMap readableMap) {
        return new m(i, readableMap);
    }

    @c.d.l.a.a
    private f updatePaddingMountItem(int i, int i2, int i3, int i4, int i5) {
        return new n(i, i2, i3, i4, i5);
    }

    @c.d.l.a.a
    private f updatePropsMountItem(int i, ReadableMap readableMap) {
        return new o(i, readableMap);
    }

    @c.d.l.a.a
    private f updateStateMountItem(int i, Object obj) {
        return new p(i, (j0) obj);
    }

    public void a(int i, String str, WritableMap writableMap) {
        EventEmitterWrapper b2 = this.f5479d.b(i);
        if (b2 != null) {
            b2.a(str, writableMap);
            return;
        }
        c.d.d.e.a.a("FabricUIManager", "Unable to invoke event: " + str + " for reactTag: " + i);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        int a2 = z.a();
        y yVar = (y) t;
        k0 k0Var = new k0(this.f5478c, t.getContext(), yVar.getSurfaceID());
        this.f5479d.a(a2, t);
        String jSModuleName = yVar.getJSModuleName();
        this.f5481f.put(Integer.valueOf(a2), k0Var);
        if (w) {
            c.d.d.e.a.a("FabricUIManager", "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(a2));
        }
        this.f5477b.startSurface(a2, jSModuleName, (NativeMap) writableMap);
        if (str != null) {
            this.f5477b.renderTemplateToSurface(a2, str);
        }
        return a2;
    }

    @c.d.l.a.a
    public void clearJSResponder() {
        synchronized (this.f5483h) {
            this.j.add(new b(this));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        synchronized (this.f5483h) {
            this.j.add(new com.facebook.react.fabric.mounting.mountitems.c(i, i2, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        synchronized (this.f5483h) {
            this.j.add(new com.facebook.react.fabric.mounting.mountitems.d(i, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.r));
        hashMap.put("LayoutTime", Long.valueOf(this.s));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.q));
        hashMap.put("RunStartTime", Long.valueOf(this.o));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.p));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.t));
        hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.u));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.f5480e.a(2, new FabricEventEmitter(this));
        this.f5480e.a(this.f5482g);
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        c.d.d.e.a.c("FabricUIManager", "FabricUIManager.onCatalystInstanceDestroy");
        if (this.n) {
            ReactSoftException.logSoftException("FabricUIManager", new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.n = true;
        this.l.b();
        throw null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        com.facebook.react.modules.core.g.a().b(g.c.DISPATCH_UI, this.l);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        com.facebook.react.modules.core.g.a().a(g.c.DISPATCH_UI, this.l);
    }

    @c.d.l.a.a
    public void onRequestEventBeat() {
        this.f5480e.a();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i, int i2) {
        synchronized (this.f5483h) {
            this.j.add(new j(i, i2));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void setAllowImmediateUIOperationExecution(boolean z) {
        this.m = z;
    }

    @c.d.l.a.a
    public void setJSResponder(int i, int i2, boolean z) {
        synchronized (this.f5483h) {
            this.j.add(new a(this, i, i2, z));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        String str;
        int i2;
        String str2;
        int i3;
        ReactMarkerConstants reactMarkerConstants;
        UiThreadUtil.assertOnUiThread();
        long uptimeMillis = SystemClock.uptimeMillis();
        int i4 = this.v;
        this.v = i4 + 1;
        try {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i4);
            if (w) {
                c.d.d.e.a.a("FabricUIManager", "SynchronouslyUpdateViewOnUIThread for tag %d", Integer.valueOf(i));
            }
            try {
                scheduleMountItem(updatePropsMountItem(i, readableMap), i4, uptimeMillis, 0L, 0L, 0L, 0L, 0L, 0L);
                reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
                i3 = i4;
                str2 = null;
            } catch (Exception unused) {
                i3 = i4;
                str2 = null;
                reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
                ReactMarker.logFabricMarker(reactMarkerConstants, str2, i3);
            } catch (Throwable th) {
                th = th;
                i2 = i4;
                str = null;
                ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, str, i2);
                throw th;
            }
        } catch (Exception unused2) {
            str2 = null;
            i3 = i4;
        } catch (Throwable th2) {
            th = th2;
            str = null;
            i2 = i4;
        }
        ReactMarker.logFabricMarker(reactMarkerConstants, str2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        if (w) {
            c.d.d.e.a.a("FabricUIManager", "Updating Root Layout Specs");
        }
        this.f5477b.setConstraints(i, com.facebook.react.fabric.e.a.b(i2), com.facebook.react.fabric.e.a.a(i2), com.facebook.react.fabric.e.a.b(i3), com.facebook.react.fabric.e.a.a(i3));
    }
}
