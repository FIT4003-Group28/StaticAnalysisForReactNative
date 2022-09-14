package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: deul  reason: default package */
/* loaded from: classes6.dex */
public abstract class deul extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService g;

    public deul() {
        coiz coizVar = coja.a;
        this.g = coiz.b(new cnxx("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final cpcq<Void> e(final Intent intent) {
        if (g(intent)) {
            return cpda.a(null);
        }
        final cpct cpctVar = new cpct();
        this.g.execute(new Runnable(this, intent, cpctVar) { // from class: deuh
            private final deul a;
            private final Intent b;
            private final cpct c;

            {
                this.a = this;
                this.b = intent;
                this.c = cpctVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deul deulVar = this.a;
                Intent intent2 = this.b;
                cpct cpctVar2 = this.c;
                try {
                    deulVar.h(intent2);
                } finally {
                    cpctVar2.a(null);
                }
            }
        });
        return cpctVar.a;
    }

    public final void f(Intent intent) {
        if (intent != null) {
            desi.completeWakefulIntent(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public boolean g(Intent intent) {
        throw null;
    }

    public abstract void h(Intent intent);

    protected Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new desk(new deuk(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.g.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent i3 = i();
        if (i3 == null) {
            f(intent);
            return 2;
        }
        cpcq<Void> e = e(i3);
        if (e.a()) {
            f(intent);
            return 2;
        }
        e.n(deui.a, new cpcf(this, intent) { // from class: deuj
            private final deul a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar) {
                this.a.f(this.b);
            }
        });
        return 3;
    }
}
