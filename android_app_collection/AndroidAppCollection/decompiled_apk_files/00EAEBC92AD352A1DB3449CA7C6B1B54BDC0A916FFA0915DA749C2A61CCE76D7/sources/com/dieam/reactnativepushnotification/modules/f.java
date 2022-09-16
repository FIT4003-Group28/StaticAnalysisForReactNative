package com.dieam.reactnativepushnotification.modules;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.p;
import com.facebook.react.r;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.s;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private FirebaseMessagingService f5139a;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f5140b;

        /* renamed from: com.dieam.reactnativepushnotification.modules.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0114a implements r.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f5142a;

            C0114a(r rVar) {
                this.f5142a = rVar;
            }

            @Override // com.facebook.react.r.k
            public void a(ReactContext reactContext) {
                a aVar = a.this;
                f.this.a((ReactApplicationContext) reactContext, aVar.f5140b);
                this.f5142a.b(this);
            }
        }

        a(Bundle bundle) {
            this.f5140b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            r h2 = ((p) f.this.f5139a.getApplication()).a().h();
            ReactContext b2 = h2.b();
            if (b2 != null) {
                f.this.a((ReactApplicationContext) b2, this.f5140b);
                return;
            }
            h2.a(new C0114a(h2));
            if (h2.e()) {
                return;
            }
            h2.a();
        }
    }

    public f(FirebaseMessagingService firebaseMessagingService) {
        this.f5139a = firebaseMessagingService;
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReactApplicationContext reactApplicationContext, Bundle bundle) {
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(new SecureRandom().nextInt()));
        }
        b bVar = new b(this.f5139a.getApplication());
        boolean a2 = a();
        d dVar = new d(reactApplicationContext);
        bundle.putBoolean("foreground", a2);
        bundle.putBoolean("userInteraction", false);
        dVar.b(bundle);
        if (bundle.getString("contentAvailable", "false").equalsIgnoreCase("true")) {
            dVar.d(bundle);
        }
        if (bVar.c() || !a2) {
            Log.v(RNPushNotification.LOG_TAG, "sendNotification: " + bundle);
            new c((Application) reactApplicationContext.getApplicationContext()).d(bundle);
        }
    }

    private boolean a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f5139a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(this.f5139a.getPackageName()) && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList.length > 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void a(s sVar) {
        sVar.s();
        s.c v = sVar.v();
        Bundle bundle = new Bundle();
        if (v != null) {
            bundle.putString("title", v.n());
            bundle.putString("message", v.a());
            bundle.putString("sound", v.l());
            bundle.putString("color", v.f());
        }
        Map<String, String> r = sVar.r();
        if (r.containsKey("twi_body")) {
            bundle.putString("message", r.get("twi_body"));
        }
        JSONObject a2 = a(r.get("data"));
        if (a2 != null) {
            if (!bundle.containsKey("message")) {
                bundle.putString("message", a2.optString("alert", null));
            }
            if (!bundle.containsKey("title")) {
                bundle.putString("title", a2.optString("title", null));
            }
            if (!bundle.containsKey("sound")) {
                bundle.putString("soundName", a2.optString("sound", null));
            }
            if (!bundle.containsKey("color")) {
                bundle.putString("color", a2.optString("color", null));
            }
            int optInt = a2.optInt("badge", -1);
            if (optInt >= 0) {
                c.c.a.b.a.f2716c.a(this.f5139a, optInt);
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, String> entry : r.entrySet()) {
            bundle2.putString(entry.getKey(), entry.getValue());
        }
        bundle.putParcelable("data", bundle2);
        Log.v(RNPushNotification.LOG_TAG, "onMessageReceived: " + bundle);
        new Handler(Looper.getMainLooper()).post(new a(bundle));
    }
}
