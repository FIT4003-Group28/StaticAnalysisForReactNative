package com.facebook.react.bridge;

import java.util.concurrent.atomic.AtomicInteger;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ModuleHolder {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f3208a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final int f3209b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3210c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3211d;
    private final boolean e;
    private javax.a.a<? extends NativeModule> f;
    private NativeModule g;
    private boolean h;
    private boolean i;
    private boolean j;

    public ModuleHolder(com.facebook.react.d.a.a aVar, javax.a.a<? extends NativeModule> aVar2) {
        this.f3209b = f3208a.getAndIncrement();
        this.f3210c = aVar.a();
        this.f3211d = aVar.b();
        this.e = aVar.d();
        this.f = aVar2;
        if (aVar.c()) {
            this.g = f();
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.f3209b = f3208a.getAndIncrement();
        this.f3210c = nativeModule.getName();
        this.f3211d = nativeModule.canOverrideExistingModule();
        this.e = true;
        this.g = nativeModule;
        com.facebook.d.b.c.a().a(com.facebook.d.c.a.e, "NativeModule init: %s", this.f3210c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.h = true;
            if (this.g != null) {
                com.facebook.j.a.a.a(!this.j);
                nativeModule = this.g;
            } else {
                z = false;
                nativeModule = null;
            }
        }
        if (z) {
            a(nativeModule);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean b() {
        return this.g != null;
    }

    public synchronized void c() {
        if (this.g != null) {
            this.g.onCatalystInstanceDestroy();
        }
    }

    @com.facebook.k.a.a
    public String getName() {
        return this.f3210c;
    }

    public boolean d() {
        return this.f3211d;
    }

    public boolean e() {
        return this.e;
    }

    @com.facebook.k.a.a
    public NativeModule getModule() {
        NativeModule nativeModule;
        synchronized (this) {
            if (this.g != null) {
                return this.g;
            }
            boolean z = true;
            if (!this.i) {
                this.i = true;
            } else {
                z = false;
            }
            if (z) {
                NativeModule f = f();
                synchronized (this) {
                    this.i = false;
                    notifyAll();
                }
                return f;
            }
            synchronized (this) {
                while (this.g == null && this.i) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                nativeModule = (NativeModule) com.facebook.j.a.a.b(this.g);
            }
            return nativeModule;
        }
    }

    private NativeModule f() {
        boolean z = false;
        ao.a(this.g == null, "Creating an already created module.");
        ReactMarker.logMarker(ak.CREATE_MODULE_START, this.f3210c, this.f3209b);
        com.facebook.m.b.a(0L, "ModuleHolder.createModule").a("name", this.f3210c).a();
        com.facebook.d.b.c.a().a(com.facebook.d.c.a.e, "NativeModule init: %s", this.f3210c);
        try {
            NativeModule nativeModule = (NativeModule) ((javax.a.a) com.facebook.j.a.a.b(this.f)).b();
            this.f = null;
            synchronized (this) {
                this.g = nativeModule;
                if (this.h && !this.j) {
                    z = true;
                }
            }
            if (z) {
                a(nativeModule);
            }
            return nativeModule;
        } finally {
            ReactMarker.logMarker(ak.CREATE_MODULE_END, this.f3209b);
            com.facebook.m.b.a(0L).a();
        }
    }

    private void a(NativeModule nativeModule) {
        boolean z;
        com.facebook.m.b.a(0L, "ModuleHolder.initialize").a("name", this.f3210c).a();
        ReactMarker.logMarker(ak.INITIALIZE_MODULE_START, this.f3210c, this.f3209b);
        try {
            synchronized (this) {
                z = true;
                if (!this.h || this.j) {
                    z = false;
                } else {
                    this.j = true;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.j = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ak.INITIALIZE_MODULE_END, this.f3209b);
            com.facebook.m.b.a(0L).a();
        }
    }
}
