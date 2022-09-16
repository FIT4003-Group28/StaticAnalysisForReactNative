package com.facebook.react;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.r;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public abstract class c extends Service implements com.facebook.react.c0.c {

    /* renamed from: c  reason: collision with root package name */
    private static PowerManager.WakeLock f5417c;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f5418b = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements r.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.c0.a f5419a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f5420b;

        a(com.facebook.react.c0.a aVar, r rVar) {
            this.f5419a = aVar;
            this.f5420b = rVar;
        }

        @Override // com.facebook.react.r.k
        public void a(ReactContext reactContext) {
            c.this.a(reactContext, this.f5419a);
            this.f5420b.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.c0.b f5422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.c0.a f5423c;

        b(com.facebook.react.c0.b bVar, com.facebook.react.c0.a aVar) {
            this.f5422b = bVar;
            this.f5423c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f5418b.add(Integer.valueOf(this.f5422b.a(this.f5423c)));
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public static void a(Context context) {
        PowerManager.WakeLock wakeLock = f5417c;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            c.d.k.a.a.a(powerManager);
            f5417c = powerManager.newWakeLock(1, c.class.getCanonicalName());
            f5417c.setReferenceCounted(false);
            f5417c.acquire();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReactContext reactContext, com.facebook.react.c0.a aVar) {
        com.facebook.react.c0.b a2 = com.facebook.react.c0.b.a(reactContext);
        a2.a(this);
        UiThreadUtil.runOnUiThread(new b(a2, aVar));
    }

    protected com.facebook.react.c0.a a(Intent intent) {
        return null;
    }

    protected u a() {
        return ((p) getApplication()).a();
    }

    protected void a(com.facebook.react.c0.a aVar) {
        UiThreadUtil.assertOnUiThread();
        a((Context) this);
        r h2 = a().h();
        ReactContext b2 = h2.b();
        if (b2 != null) {
            a(b2, aVar);
            return;
        }
        h2.a(new a(aVar, h2));
        h2.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReactContext b2;
        super.onDestroy();
        if (a().l() && (b2 = a().h().b()) != null) {
            com.facebook.react.c0.b.a(b2).b(this);
        }
        PowerManager.WakeLock wakeLock = f5417c;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // com.facebook.react.c0.c
    public void onHeadlessJsTaskFinish(int i) {
        this.f5418b.remove(Integer.valueOf(i));
        if (this.f5418b.size() == 0) {
            stopSelf();
        }
    }

    @Override // com.facebook.react.c0.c
    public void onHeadlessJsTaskStart(int i) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        com.facebook.react.c0.a a2 = a(intent);
        if (a2 != null) {
            a(a2);
            return 3;
        }
        return 2;
    }
}
