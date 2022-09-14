package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.t0;
import com.google.firebase.iid.v0;
import java.util.concurrent.ExecutorService;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class g extends Service {

    /* renamed from: c  reason: collision with root package name */
    private Binder f9459c;

    /* renamed from: e  reason: collision with root package name */
    private int f9461e;

    /* renamed from: b  reason: collision with root package name */
    final ExecutorService f9458b = h.a();

    /* renamed from: d  reason: collision with root package name */
    private final Object f9460d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private int f9462f = 0;

    /* loaded from: classes.dex */
    class a implements v0.a {
        a() {
        }

        @Override // com.google.firebase.iid.v0.a
        public c.e.a.b.g.h<Void> a(Intent intent) {
            return g.this.e(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            t0.a(intent);
        }
        synchronized (this.f9460d) {
            this.f9462f--;
            if (this.f9462f == 0) {
                a(this.f9461e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.e.a.b.g.h<Void> e(final Intent intent) {
        if (c(intent)) {
            return c.e.a.b.g.k.a((Object) null);
        }
        final c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        this.f9458b.execute(new Runnable(this, intent, iVar) { // from class: com.google.firebase.messaging.d

            /* renamed from: b  reason: collision with root package name */
            private final g f9452b;

            /* renamed from: c  reason: collision with root package name */
            private final Intent f9453c;

            /* renamed from: d  reason: collision with root package name */
            private final c.e.a.b.g.i f9454d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9452b = this;
                this.f9453c = intent;
                this.f9454d = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9452b.a(this.f9453c, this.f9454d);
            }
        });
        return iVar.a();
    }

    protected abstract Intent a(Intent intent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Intent intent, c.e.a.b.g.h hVar) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Intent intent, c.e.a.b.g.i iVar) {
        try {
            b(intent);
        } finally {
            iVar.a((c.e.a.b.g.i) null);
        }
    }

    boolean a(int i) {
        return stopSelfResult(i);
    }

    public abstract void b(Intent intent);

    public abstract boolean c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f9459c == null) {
            this.f9459c = new v0(new a());
        }
        return this.f9459c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f9458b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f9460d) {
            this.f9461e = i2;
            this.f9462f++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            d(intent);
            return 2;
        }
        c.e.a.b.g.h<Void> e2 = e(a2);
        if (e2.d()) {
            d(intent);
            return 2;
        }
        e2.a(e.f9455a, new c.e.a.b.g.c(this, intent) { // from class: com.google.firebase.messaging.f

            /* renamed from: a  reason: collision with root package name */
            private final g f9456a;

            /* renamed from: b  reason: collision with root package name */
            private final Intent f9457b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9456a = this;
                this.f9457b = intent;
            }

            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                this.f9456a.a(this.f9457b, hVar);
            }
        });
        return 3;
    }
}
