package com.teslamotors.TeslaApp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.baidu.mapapi.SDKInitializer;
import com.facebook.react.bridge.ar;
import com.facebook.react.g;
import com.facebook.react.h;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.teslamotors.TeslaApp.b;
import com.teslamotors.plugins.client.e;
import org.spongycastle.crypto.tls.CipherSuite;
/* loaded from: classes.dex */
public class MainActivity extends g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4941a = "MainActivity";

    @Override // com.facebook.react.g
    protected String a() {
        return "TeslaApp";
    }

    /* loaded from: classes.dex */
    private static class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f4942a;

        /* renamed from: b  reason: collision with root package name */
        private OrientationEventListener f4943b;

        public a(Activity activity, String str) {
            super(activity, str);
            this.f4942a = activity;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.h
        public void a(Bundle bundle) {
            super.a(bundle);
            this.f4943b = new OrientationEventListener(this.f4942a.getApplicationContext()) { // from class: com.teslamotors.TeslaApp.MainActivity.a.1
                @Override // android.view.OrientationEventListener
                public void onOrientationChanged(int i) {
                    a.this.a(i);
                }
            };
            a(this.f4942a.getResources().getConfiguration());
            com.teslamotors.plugins.crashlytics.b.a(this.f4942a);
            this.f4942a.getWindow().getDecorView().setSystemUiVisibility(1280);
            e.a("8b45450cf", this.f4942a);
            e a2 = e.a((Context) this.f4942a);
            if (this.f4942a.getIntent() != null && "android.intent.action.MAIN".equalsIgnoreCase(this.f4942a.getIntent().getAction())) {
                a2.a(6, "standard");
            }
            SDKInitializer.initialize(this.f4942a.getApplicationContext());
            String i = a2.i();
            String s = a2.s();
            if (s == null || (i != null && !i.equals(s))) {
                a2.u();
            }
            a2.b(i);
            com.teslamotors.plugins.notifications.a.a(this.f4942a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.h
        public void e() {
            super.e();
            if (this.f4943b != null) {
                this.f4943b.disable();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.h
        public void f() {
            super.f();
            if (this.f4943b != null) {
                this.f4943b.enable();
            }
        }

        @Override // com.facebook.react.h
        protected Bundle a() {
            e.a("8b45450cf", this.f4942a);
            e a2 = e.a((Context) this.f4942a);
            Bundle bundle = new Bundle();
            bundle.putString("mode", "PRODUCTION");
            bundle.putString("ownerAPIBaseURL", a2.d());
            bundle.putString("ownerAPIClientID", a2.e());
            bundle.putString("ownerAPIClientSecret", a2.f());
            bundle.putString("streamingServerBaseURL", a2.g());
            bundle.putString("remoteNotificationDeviceType", a2.q());
            bundle.putString("gitHash", "8b45450cf");
            if (a2.c() != null) {
                bundle.putString("googleAnalyticsTrackerID", a2.c());
            }
            bundle.putLong("appStartTimestamp", System.currentTimeMillis());
            return bundle;
        }

        @Override // com.facebook.react.h
        public boolean a(Intent intent) {
            super.a(intent);
            return com.teslamotors.plugins.notifications.c.a().a(intent);
        }

        private void a(Configuration configuration) {
            if (configuration.fontScale != 1.0f) {
                configuration.fontScale = 1.0f;
                DisplayMetrics displayMetrics = this.f4942a.getResources().getDisplayMetrics();
                ((WindowManager) this.f4942a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
                this.f4942a.getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            String str;
            boolean z = true;
            int i2 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            if (i == 90) {
                str = "landscape-secondary";
                i2 = 90;
            } else if (i == 180) {
                str = "portrait-secondary";
                z = false;
            } else if (i != 270) {
                str = "portrait-primary";
                z = false;
                i2 = 0;
            } else {
                str = "landscape-primary";
                i2 = -90;
            }
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putString("name", str);
            b2.putInt("rotationDegrees", i2);
            b2.putBoolean("isLandscape", z);
            if (d().j() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) d().j().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("namedOrientationDidChange", b2);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            b.a().a(b.a.ACTIVE);
        } else {
            b.a().a(b.a.INACTIVE);
        }
    }

    @Override // com.facebook.react.g, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        e.a(getApplicationContext()).a(i, strArr, iArr);
    }

    @Override // com.facebook.react.g
    protected h b() {
        return new a(this, a());
    }
}
