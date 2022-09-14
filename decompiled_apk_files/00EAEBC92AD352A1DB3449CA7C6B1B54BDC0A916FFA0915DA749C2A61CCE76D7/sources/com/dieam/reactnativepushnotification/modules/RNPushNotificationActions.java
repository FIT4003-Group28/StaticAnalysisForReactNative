package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.p;
import com.facebook.react.r;
/* loaded from: classes.dex */
public class RNPushNotificationActions extends BroadcastReceiver {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f5107b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f5108c;

        /* renamed from: com.dieam.reactnativepushnotification.modules.RNPushNotificationActions$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0111a implements r.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f5109a;

            C0111a(r rVar) {
                this.f5109a = rVar;
            }

            @Override // com.facebook.react.r.k
            public void a(ReactContext reactContext) {
                new d(reactContext).c(a.this.f5108c);
                this.f5109a.b(this);
            }
        }

        a(RNPushNotificationActions rNPushNotificationActions, Context context, Bundle bundle) {
            this.f5107b = context;
            this.f5108c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            r h2 = ((p) this.f5107b.getApplicationContext()).a().h();
            ReactContext b2 = h2.b();
            if (b2 != null) {
                new d(b2).c(this.f5108c);
                return;
            }
            h2.a(new C0111a(h2));
            if (h2.e()) {
                return;
            }
            h2.a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = context.getPackageName() + ".ACTION_";
        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver loading scheduled notifications");
        if (intent.getAction() == null || !intent.getAction().startsWith(str)) {
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("notification");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int parseInt = Integer.parseInt(bundleExtra.getString("id"));
        if (bundleExtra.getBoolean("autoCancel", true)) {
            if (bundleExtra.containsKey("tag")) {
                notificationManager.cancel(bundleExtra.getString("tag"), parseInt);
            } else {
                notificationManager.cancel(parseInt);
            }
        }
        if (bundleExtra.getBoolean("invokeApp", true)) {
            new c((Application) context.getApplicationContext()).a(bundleExtra);
        } else {
            new Handler(Looper.getMainLooper()).post(new a(this, context, bundleExtra));
        }
    }
}
