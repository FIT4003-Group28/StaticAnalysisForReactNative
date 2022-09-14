package com.dieam.reactnativepushnotification.modules;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p;
import com.facebook.react.r;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.s;
/* loaded from: classes.dex */
public class RNPushNotificationListenerService extends FirebaseMessagingService {

    /* renamed from: h  reason: collision with root package name */
    private f f5111h = new f(this);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5112b;

        /* renamed from: com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0112a implements r.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f5114a;

            C0112a(r rVar) {
                this.f5114a = rVar;
            }

            @Override // com.facebook.react.r.k
            public void a(ReactContext reactContext) {
                a aVar = a.this;
                RNPushNotificationListenerService.this.a((ReactApplicationContext) reactContext, aVar.f5112b);
                this.f5114a.b(this);
            }
        }

        a(String str) {
            this.f5112b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            r h2 = ((p) RNPushNotificationListenerService.this.getApplication()).a().h();
            ReactContext b2 = h2.b();
            if (b2 != null) {
                RNPushNotificationListenerService.this.a((ReactApplicationContext) b2, this.f5112b);
                return;
            }
            h2.a(new C0112a(h2));
            if (h2.e()) {
                return;
            }
            h2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReactApplicationContext reactApplicationContext, String str) {
        d dVar = new d(reactApplicationContext);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("deviceToken", str);
        dVar.a("remoteNotificationsRegistered", createMap);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(s sVar) {
        this.f5111h.a(sVar);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void b(String str) {
        Log.d(RNPushNotification.LOG_TAG, "Refreshed token: " + str);
        new Handler(Looper.getMainLooper()).post(new a(str));
    }
}
