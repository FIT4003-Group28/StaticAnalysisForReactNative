package io.invertase.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    s initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
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
            promise.resolve(Integer.valueOf(((Boolean) hVar.b()).booleanValue() ? 1 : 0));
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
            promise.resolve(Boolean.valueOf(FirebaseMessaging.b().a()));
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

    public /* synthetic */ Boolean a() {
        return Boolean.valueOf(androidx.core.app.j.a(getReactApplicationContext()).a());
    }

    @ReactMethod
    public void deleteToken(final String str, final String str2, final Promise promise) {
        c.e.a.b.g.k.a(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseInstanceId.n().a(str, str2);
            }
        }).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.d
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.a(Promise.this, hVar);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.b().a()));
        return hashMap;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        s sVar;
        s sVar2 = this.initialNotification;
        if (sVar2 != null) {
            promise.resolve(n.a(sVar2));
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null && (sVar = ReactNativeFirebaseMessagingReceiver.f10342a.get(string)) != null) {
                    promise.resolve(n.a(sVar));
                    this.initialNotificationMap.put(string, true);
                    return;
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(final String str, final String str2, final Promise promise) {
        c.e.a.b.g.k.a(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String b2;
                b2 = FirebaseInstanceId.n().b(str, str2);
                return b2;
            }
        }).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.b
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.b(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void hasPermission(final Promise promise) {
        c.e.a.b.g.k.a(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.this.a();
            }
        }).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.f
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.c(Promise.this, hVar);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s sVar;
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null || (sVar = ReactNativeFirebaseMessagingReceiver.f10342a.get(string)) == null) {
            return;
        }
        this.initialNotification = sVar;
        ReactNativeFirebaseMessagingReceiver.f10342a.remove(string);
        io.invertase.firebase.common.g.b().b(n.a(sVar, (Boolean) true));
    }

    @ReactMethod
    public void sendMessage(final ReadableMap readableMap, final Promise promise) {
        c.e.a.b.g.k.a(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseMessaging.b().a(n.a(ReadableMap.this));
            }
        }).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.h
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.d(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void setAutoInitEnabled(final Boolean bool, final Promise promise) {
        c.e.a.b.g.k.a(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseMessaging.b().a(bool.booleanValue());
            }
        }).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.k
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.e(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void subscribeToTopic(String str, final Promise promise) {
        FirebaseMessaging.b().a(str).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.j
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.f(Promise.this, hVar);
            }
        });
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, final Promise promise) {
        FirebaseMessaging.b().b(str).a(new c.e.a.b.g.c() { // from class: io.invertase.firebase.messaging.a
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseMessagingModule.g(Promise.this, hVar);
            }
        });
    }
}
