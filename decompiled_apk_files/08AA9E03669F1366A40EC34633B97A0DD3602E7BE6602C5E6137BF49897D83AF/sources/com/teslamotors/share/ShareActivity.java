package com.teslamotors.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.teslamotors.share.b;
import com.teslamotors.share.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShareActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f5431a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private e f5432b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f5433c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5434d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.teslamotors.plugins.crashlytics.b.a(this);
        this.f5432b = new e(getApplicationContext());
        d();
        if (a()) {
            a b2 = b();
            if (!a.a(b2)) {
                a(b.a.Error, getString(c.d.share_extension_error_invalid_content));
                return;
            }
            a(b.a.Processing, "", 10);
            a(b2);
        }
    }

    private boolean a() {
        if (this.f5432b.b()) {
            a(b.a.Error, getString(c.d.share_extension_error_launch_app_first));
            return false;
        } else if (!this.f5432b.a()) {
            a(b.a.Error, getString(c.d.share_extension_error_require_log_in));
            return false;
        } else if (!this.f5432b.c()) {
            a(b.a.Error, getString(c.d.share_extension_error_no_vehicle_data));
            return false;
        } else if (this.f5432b.f()) {
            a(b.a.Error, getString(c.d.share_extension_error_vehicle_in_service));
            return false;
        } else if (this.f5432b.d()) {
            return true;
        } else {
            a(b.a.Error, getString(c.d.share_extension_error_vehicle_unsupported));
            return false;
        }
    }

    private a b() {
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        a aVar = new a("share_ext_content_raw", com.teslamotors.plugins.client.e.a(getApplicationContext()).C());
        aVar.b(intent);
        if ("android.intent.action.SEND".equals(action) && type != null) {
            aVar.a(intent);
            if (type.equals("text/x-vcard")) {
                aVar.a(getApplicationContext(), intent);
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b.a aVar, String str) {
        a(aVar, str, 5);
    }

    private void a(b.a aVar, String str, int i) {
        b.a(getFragmentManager(), aVar, str, i);
    }

    private void a(final a aVar) {
        a(false);
        f5431a.execute(new Runnable() { // from class: com.teslamotors.share.ShareActivity.1
            @Override // java.lang.Runnable
            public void run() {
                ShareActivity.this.f5432b.a(aVar.a(), new com.teslamotors.plugins.client.a.b() { // from class: com.teslamotors.share.ShareActivity.1.1
                    @Override // com.teslamotors.plugins.client.a.b
                    public void a(JSONObject jSONObject) {
                        if (ShareActivity.this.c()) {
                            ShareActivity.this.f5433c.obtainMessage(1, ShareActivity.this.f5432b == null ? "" : ShareActivity.this.getString(c.d.start_vehicle_navigation_success).replace("%vehicleName%", ShareActivity.this.f5432b.g())).sendToTarget();
                            ShareActivity.this.a(true);
                        }
                    }

                    @Override // com.teslamotors.plugins.client.a.b
                    public void a(com.teslamotors.plugins.client.c cVar) {
                        int i = c.d.start_vehicle_navigation_error;
                        if (com.teslamotors.plugins.client.c.OWNERAPI_ERROR_VEHICLE_IN_SERVICE == cVar) {
                            i = c.d.share_extension_error_vehicle_in_service;
                            ShareActivity.this.f5432b.b(true);
                            ShareActivity.this.f5432b.h();
                        } else if (com.teslamotors.plugins.client.c.OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED == cVar) {
                            i = c.d.share_extension_error_mobile_access_disabled;
                            ShareActivity.this.f5432b.a(false);
                            ShareActivity.this.f5432b.h();
                        }
                        if (ShareActivity.this.c()) {
                            ShareActivity.this.f5433c.obtainMessage(2, ShareActivity.this.getString(i)).sendToTarget();
                            ShareActivity.this.a(true);
                        }
                    }
                });
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.teslamotors.share.ShareActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (ShareActivity.this.c()) {
                    ShareActivity.this.a(b.a.Error, ShareActivity.this.getString(c.d.start_vehicle_navigation_timeout));
                    ShareActivity.this.a(true);
                }
            }
        }, 9500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z) {
        this.f5434d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean c() {
        return !this.f5434d;
    }

    private void d() {
        this.f5433c = new Handler(Looper.getMainLooper()) { // from class: com.teslamotors.share.ShareActivity.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String str = (String) message.obj;
                switch (message.what) {
                    case 1:
                        ShareActivity.this.a(b.a.Success, str);
                        return;
                    case 2:
                        ShareActivity.this.a(b.a.Error, str);
                        return;
                    case 3:
                        ShareActivity.this.a(b.a.Timeout, str);
                        return;
                    case 4:
                        ShareActivity.this.a(b.a.Alert, str);
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }
}
