package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ReactContext.java */
/* loaded from: classes.dex */
public class aj extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArraySet<x> f3222a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArraySet<a> f3223b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.react.b.d f3224c;

    /* renamed from: d  reason: collision with root package name */
    private CatalystInstance f3225d;
    private LayoutInflater e;
    private MessageQueueThread f;
    private MessageQueueThread g;
    private MessageQueueThread h;
    private ab i;
    private WeakReference<Activity> j;

    public aj(Context context) {
        super(context);
        this.f3222a = new CopyOnWriteArraySet<>();
        this.f3223b = new CopyOnWriteArraySet<>();
        this.f3224c = com.facebook.react.b.d.BEFORE_CREATE;
    }

    public void a(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.f3225d != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        this.f3225d = catalystInstance;
        com.facebook.react.bridge.queue.d reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
        this.f = reactQueueConfiguration.a();
        this.g = reactQueueConfiguration.b();
        this.h = reactQueueConfiguration.c();
    }

    public void a(ab abVar) {
        this.i = abVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.e == null) {
                this.e = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.e;
        }
        return getBaseContext().getSystemService(str);
    }

    public <T extends JavaScriptModule> T a(Class<T> cls) {
        if (this.f3225d == null) {
            throw new RuntimeException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
        }
        return (T) this.f3225d.getJSModule(cls);
    }

    public <T extends NativeModule> T b(Class<T> cls) {
        if (this.f3225d == null) {
            throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
        }
        return (T) this.f3225d.getNativeModule(cls);
    }

    public CatalystInstance a() {
        return (CatalystInstance) com.facebook.j.a.a.b(this.f3225d);
    }

    public boolean b() {
        return this.f3225d != null && !this.f3225d.isDestroyed();
    }

    public void a(final x xVar) {
        this.f3222a.add(xVar);
        if (b()) {
            switch (this.f3224c) {
                case BEFORE_CREATE:
                case BEFORE_RESUME:
                    return;
                case RESUMED:
                    a(new Runnable() { // from class: com.facebook.react.bridge.aj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!aj.this.f3222a.contains(xVar)) {
                                return;
                            }
                            try {
                                xVar.onHostResume();
                            } catch (RuntimeException e) {
                                aj.this.a(e);
                            }
                        }
                    });
                    return;
                default:
                    throw new RuntimeException("Unhandled lifecycle state.");
            }
        }
    }

    public void b(x xVar) {
        this.f3222a.remove(xVar);
    }

    public void a(Activity activity) {
        this.f3224c = com.facebook.react.b.d.RESUMED;
        this.j = new WeakReference<>(activity);
        ReactMarker.logMarker(ak.ON_HOST_RESUME_START);
        Iterator<x> it = this.f3222a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e) {
                a(e);
            }
        }
        ReactMarker.logMarker(ak.ON_HOST_RESUME_END);
    }

    public void a(Activity activity, Intent intent) {
        ap.b();
        this.j = new WeakReference<>(activity);
        Iterator<a> it = this.f3223b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(intent);
            } catch (RuntimeException e) {
                a(e);
            }
        }
    }

    public void c() {
        this.f3224c = com.facebook.react.b.d.BEFORE_RESUME;
        ReactMarker.logMarker(ak.ON_HOST_PAUSE_START);
        Iterator<x> it = this.f3222a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e) {
                a(e);
            }
        }
        ReactMarker.logMarker(ak.ON_HOST_PAUSE_END);
    }

    public void d() {
        ap.b();
        this.f3224c = com.facebook.react.b.d.BEFORE_CREATE;
        Iterator<x> it = this.f3222a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e) {
                a(e);
            }
        }
        this.j = null;
    }

    public void e() {
        ap.b();
        if (this.f3225d != null) {
            this.f3225d.destroy();
        }
    }

    public void a(Activity activity, int i, int i2, Intent intent) {
        Iterator<a> it = this.f3223b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, i, i2, intent);
            } catch (RuntimeException e) {
                a(e);
            }
        }
    }

    public void f() {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.f)).assertIsOnThread();
    }

    public boolean g() {
        return ((MessageQueueThread) com.facebook.j.a.a.b(this.f)).isOnThread();
    }

    public void a(Runnable runnable) {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.f)).runOnQueue(runnable);
    }

    public void h() {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.g)).assertIsOnThread();
    }

    public void a(String str) {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.g)).assertIsOnThread(str);
    }

    public void b(Runnable runnable) {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.g)).runOnQueue(runnable);
    }

    public void c(Runnable runnable) {
        ((MessageQueueThread) com.facebook.j.a.a.b(this.h)).runOnQueue(runnable);
    }

    public void a(RuntimeException runtimeException) {
        if (this.f3225d != null && !this.f3225d.isDestroyed() && this.i != null) {
            this.i.a(runtimeException);
            return;
        }
        throw runtimeException;
    }

    public Activity i() {
        if (this.j == null) {
            return null;
        }
        return this.j.get();
    }
}
