package com.facebook.react.bridge;

import c.d.f.b.c;
import c.d.l.a.a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.systrace.b;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
@a
/* loaded from: classes.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        c.a().a(c.d.f.c.a.f2909c, "NativeModule init: %s", this.mName);
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.g()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z = true;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        b.AbstractC0140b a2 = b.a(0L, "ModuleHolder.createModule");
        a2.a("name", this.mName);
        a2.a();
        c.a().a(c.d.f.c.a.f2909c, "NativeModule init: %s", this.mName);
        try {
            Provider<? extends NativeModule> provider = this.mProvider;
            c.d.k.a.a.a(provider);
            NativeModule mo254get = provider.mo254get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = mo254get;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                }
            }
            if (z) {
                doInitialize(mo254get);
            }
            return mo254get;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        b.AbstractC0140b a2 = b.a(0L, "ModuleHolder.initialize");
        a2.a("name", this.mName);
        a2.a();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                z = true;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                } else {
                    this.mIsInitializing = true;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            b.a(0L).a();
        }
    }

    public synchronized void destroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.b();
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.c();
    }

    @a
    public NativeModule getModule() {
        NativeModule nativeModule;
        synchronized (this) {
            if (this.mModule != null) {
                return this.mModule;
            }
            boolean z = true;
            if (!this.mIsCreating) {
                this.mIsCreating = true;
            } else {
                z = false;
            }
            if (z) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (this.mModule == null && this.mIsCreating) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                NativeModule nativeModule2 = this.mModule;
                c.d.k.a.a.a(nativeModule2);
                nativeModule = nativeModule2;
            }
            return nativeModule;
        }
    }

    @a
    public String getName() {
        return this.mName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                c.d.k.a.a.a(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }
}
