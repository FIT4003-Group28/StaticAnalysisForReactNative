package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
/* loaded from: classes.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final t module;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new t(reactApplicationContext, SERVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            promise.resolve(hVar.b());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, hVar.a());
        }
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        this.module.b(str, Arguments.toBundle(readableMap)).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.a
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.a(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void resetAnalyticsData(final Promise promise) {
        this.module.c().a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.c
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.b(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.b(bool).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.f
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.c(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setCurrentScreen(String str, String str2, final Promise promise) {
        this.module.b(getCurrentActivity(), str, str2).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.d
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.d(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setMinimumSessionDuration(double d2, final Promise promise) {
        this.module.c((long) d2).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.e
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.e(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d2, final Promise promise) {
        this.module.d((long) d2).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.b
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.f(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setUserId(String str, final Promise promise) {
        this.module.b(str).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.i
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.g(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, final Promise promise) {
        this.module.b(Arguments.toBundle(readableMap)).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.g
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.h(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, final Promise promise) {
        this.module.b(str, str2).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.analytics.h
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAnalyticsModule.i(Promise.this, hVar);
            }
        });
    }
}
