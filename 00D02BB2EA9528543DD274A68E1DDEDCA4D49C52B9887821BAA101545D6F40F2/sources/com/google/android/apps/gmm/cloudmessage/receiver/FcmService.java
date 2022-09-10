package com.google.android.apps.gmm.cloudmessage.receiver;

import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gmm.cloudmessage.receiver.FcmService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FcmService extends FirebaseMessagingService {
    public dxio<dehq> a;
    public ckcw b;
    public gdo c;
    public pbv d;
    public bvrv e;
    public pbz f;

    private final void j(Runnable runnable) {
        bvrj.UI_THREAD.d();
        deha.s(this.a.a().a(runnable));
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(RemoteMessage remoteMessage) {
        Bundle bundle = new Bundle();
        if (remoteMessage.b == null) {
            remoteMessage.b = deue.extractDeveloperDefinedPayload(remoteMessage.a);
        }
        for (Map.Entry<String, String> entry : remoteMessage.b.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (k()) {
            j(new Runnable(this) { // from class: peg
                private final FcmService a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        }
        try {
            pbv pbvVar = this.d;
            btlu j = pbvVar.b.a().j();
            if (j == null || !j.m()) {
                dcdc<pai> dcdcVar = pbvVar.a;
                int size = dcdcVar.size();
                int i = 0;
                while (i < size) {
                    boolean a = dcdcVar.get(i).a(bundle);
                    i++;
                    if (a) {
                        break;
                    }
                }
            }
            if (!k()) {
                return;
            }
            j(new Runnable(this) { // from class: peh
                private final FcmService a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        } catch (Throwable th) {
            if (k()) {
                j(new Runnable(this) { // from class: pei
                    private final FcmService a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
            throw th;
        }
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        this.b.f(ckhc.FCM_SERVICE);
        this.c.b();
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        this.c.e();
        this.b.g(ckhc.FCM_SERVICE);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d() {
        this.f.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        if (!k()) {
            b();
        }
    }

    @Override // defpackage.deul, android.app.Service
    public final void onDestroy() {
        if (!k()) {
            c();
        }
        super.onDestroy();
        this.e.a();
    }
}
