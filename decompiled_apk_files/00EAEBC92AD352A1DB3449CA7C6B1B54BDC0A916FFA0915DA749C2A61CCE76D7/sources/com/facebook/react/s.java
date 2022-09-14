package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.p0;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    private String f5843b;

    /* renamed from: c  reason: collision with root package name */
    private JSBundleLoader f5844c;

    /* renamed from: d  reason: collision with root package name */
    private String f5845d;

    /* renamed from: e  reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f5846e;

    /* renamed from: f  reason: collision with root package name */
    private Application f5847f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5848g;

    /* renamed from: h  reason: collision with root package name */
    private LifecycleState f5849h;
    private p0 i;
    private NativeModuleCallExceptionHandler j;
    private Activity k;
    private com.facebook.react.modules.core.b l;
    private com.facebook.react.devsupport.f m;
    private boolean n;
    private com.facebook.react.devsupport.h.a o;
    private JavaScriptExecutorFactory p;
    private JSIModulePackage s;
    private Map<String, Object> t;

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f5842a = new ArrayList();
    private int q = 1;
    private int r = -1;

    private JavaScriptExecutorFactory a(String str, String str2, Context context) {
        try {
            r.a(context);
            SoLoader.a("jscexecutor");
            return new com.facebook.react.jscexecutor.a(str, str2);
        } catch (UnsatisfiedLinkError e2) {
            if (e2.getMessage().contains("__cxa_bad_typeid")) {
                throw e2;
            }
            try {
                return new com.facebook.hermes.reactexecutor.a();
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                throw e2;
            }
        }
    }

    public r a() {
        String str;
        c.d.k.a.a.a(this.f5847f, "Application property has not been set with this builder");
        if (this.f5849h == LifecycleState.RESUMED) {
            c.d.k.a.a.a(this.k, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = true;
        c.d.k.a.a.a((!this.f5848g && this.f5843b == null && this.f5844c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f5845d == null && this.f5843b == null && this.f5844c == null) {
            z = false;
        }
        c.d.k.a.a.a(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.i == null) {
            this.i = new p0();
        }
        String packageName = this.f5847f.getPackageName();
        String a2 = com.facebook.react.modules.systeminfo.a.a();
        Application application = this.f5847f;
        Activity activity = this.k;
        com.facebook.react.modules.core.b bVar = this.l;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.p;
        JavaScriptExecutorFactory a3 = javaScriptExecutorFactory == null ? a(packageName, a2, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader createAssetLoader = (this.f5844c != null || (str = this.f5843b) == null) ? this.f5844c : JSBundleLoader.createAssetLoader(this.f5847f, str, false);
        String str2 = this.f5845d;
        List<v> list = this.f5842a;
        boolean z2 = this.f5848g;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f5846e;
        LifecycleState lifecycleState = this.f5849h;
        c.d.k.a.a.a(lifecycleState, "Initial lifecycle state was not set");
        return new r(application, activity, bVar, a3, createAssetLoader, str2, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.i, this.j, this.m, this.n, this.o, this.q, this.r, this.s, this.t);
    }

    public s a(Application application) {
        this.f5847f = application;
        return this;
    }

    public s a(JSBundleLoader jSBundleLoader) {
        this.f5844c = jSBundleLoader;
        this.f5843b = null;
        return this;
    }

    public s a(JSIModulePackage jSIModulePackage) {
        this.s = jSIModulePackage;
        return this;
    }

    public s a(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.p = javaScriptExecutorFactory;
        return this;
    }

    public s a(LifecycleState lifecycleState) {
        this.f5849h = lifecycleState;
        return this;
    }

    public s a(com.facebook.react.devsupport.f fVar) {
        this.m = fVar;
        return this;
    }

    public s a(p0 p0Var) {
        this.i = p0Var;
        return this;
    }

    public s a(v vVar) {
        this.f5842a.add(vVar);
        return this;
    }

    public s a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f5843b = str2;
        this.f5844c = null;
        return this;
    }

    public s a(boolean z) {
        this.f5848g = z;
        return this;
    }

    public s b(String str) {
        if (!str.startsWith("assets://")) {
            a(JSBundleLoader.createFileLoader(str));
            return this;
        }
        this.f5843b = str;
        this.f5844c = null;
        return this;
    }

    public s c(String str) {
        this.f5845d = str;
        return this;
    }
}
