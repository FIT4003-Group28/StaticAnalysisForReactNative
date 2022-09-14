package com.facebook.react.c0;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap<ReactContext, b> f5430h = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ReactContext> f5431a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<c> f5432b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f5433c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private final Handler f5434d = new Handler();

    /* renamed from: e  reason: collision with root package name */
    private final Set<Integer> f5435e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, com.facebook.react.c0.a> f5436f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<Runnable> f5437g = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5438b;

        a(int i) {
            this.f5438b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (c cVar : b.this.f5432b) {
                cVar.onHeadlessJsTaskFinish(this.f5438b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.c0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0122b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5440b;

        RunnableC0122b(int i) {
            this.f5440b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f5440b);
        }
    }

    private b(ReactContext reactContext) {
        this.f5431a = new WeakReference<>(reactContext);
    }

    public static b a(ReactContext reactContext) {
        b bVar = f5430h.get(reactContext);
        if (bVar == null) {
            b bVar2 = new b(reactContext);
            f5430h.put(reactContext, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private void a(int i, long j) {
        RunnableC0122b runnableC0122b = new RunnableC0122b(i);
        this.f5437g.append(i, runnableC0122b);
        this.f5434d.postDelayed(runnableC0122b, j);
    }

    private synchronized void a(com.facebook.react.c0.a aVar, int i) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f5431a.get();
        c.d.k.a.a.a(reactContext, "Tried to start a task on a react context that has already been destroyed");
        ReactContext reactContext2 = reactContext;
        if (reactContext2.getLifecycleState() == LifecycleState.RESUMED && !aVar.e()) {
            throw new IllegalStateException("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.");
        }
        this.f5435e.add(Integer.valueOf(i));
        this.f5436f.put(Integer.valueOf(i), new com.facebook.react.c0.a(aVar));
        if (reactContext2.hasActiveCatalystInstance()) {
            ((AppRegistry) reactContext2.getJSModule(AppRegistry.class)).startHeadlessTask(i, aVar.c(), aVar.a());
        } else {
            ReactSoftException.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (aVar.d() > 0) {
            a(i, aVar.d());
        }
        for (c cVar : this.f5432b) {
            cVar.onHeadlessJsTaskStart(i);
        }
    }

    private void d(int i) {
        Runnable runnable = this.f5437g.get(i);
        if (runnable != null) {
            this.f5434d.removeCallbacks(runnable);
            this.f5437g.remove(i);
        }
    }

    public synchronized int a(com.facebook.react.c0.a aVar) {
        int incrementAndGet;
        incrementAndGet = this.f5433c.incrementAndGet();
        a(aVar, incrementAndGet);
        return incrementAndGet;
    }

    public synchronized void a(int i) {
        boolean remove = this.f5435e.remove(Integer.valueOf(i));
        c.d.k.a.a.a(remove, "Tried to finish non-existent task with id " + i + ".");
        boolean z = this.f5436f.remove(Integer.valueOf(i)) != null;
        c.d.k.a.a.a(z, "Tried to remove non-existent task config with id " + i + ".");
        d(i);
        UiThreadUtil.runOnUiThread(new a(i));
    }

    public void a(c cVar) {
        this.f5432b.add(cVar);
    }

    public boolean a() {
        return this.f5435e.size() > 0;
    }

    public void b(c cVar) {
        this.f5432b.remove(cVar);
    }

    public synchronized boolean b(int i) {
        return this.f5435e.contains(Integer.valueOf(i));
    }

    public synchronized boolean c(int i) {
        com.facebook.react.c0.a aVar = this.f5436f.get(Integer.valueOf(i));
        boolean z = aVar != null;
        c.d.k.a.a.a(z, "Tried to retrieve non-existent task config with id " + i + ".");
        d b2 = aVar.b();
        if (b2.b()) {
            d(i);
            aVar.c();
            aVar.a();
            aVar.d();
            aVar.e();
            b2.a();
            throw null;
        }
        return false;
    }
}
