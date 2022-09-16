package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: aobm  reason: default package */
/* loaded from: classes.dex */
public abstract class aobm extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;

    public aobm() {
        rqt rqtVar = rfl.a;
        this.e = rqt.d(new qyo("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final rve f(final Intent intent) {
        final rvh rvhVar = new rvh();
        this.e.execute(new Runnable() { // from class: aobk
            @Override // java.lang.Runnable
            public final void run() {
                aobm aobmVar = aobm.this;
                Intent intent2 = intent;
                rvh rvhVar2 = rvhVar;
                try {
                    aobmVar.h(intent2);
                } finally {
                    rvhVar2.b(null);
                }
            }
        });
        return rvhVar.a;
    }

    public final void g(Intent intent) {
        if (intent != null) {
            synchronized (aocv.b) {
                if (aocv.c != null && aocv.b(intent)) {
                    aocv.a(intent, false);
                    ruh ruhVar = aocv.c;
                    if (ruhVar.m.decrementAndGet() < 0) {
                        Log.e("WakeLock", ruhVar.j.concat(" release without a matched acquire!"));
                    }
                    synchronized (ruhVar.b) {
                        ruhVar.c();
                        if (ruhVar.l.containsKey(null)) {
                            ruf rufVar = (ruf) ruhVar.l.get(null);
                            if (rufVar != null) {
                                int i = rufVar.a - 1;
                                rufVar.a = i;
                                if (i == 0) {
                                    ruhVar.l.remove(null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", ruhVar.j.concat(" counter does not exist"));
                        }
                        ruhVar.d();
                    }
                }
            }
        }
        synchronized (this.b) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void h(Intent intent);

    protected Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new aocx(new aobl(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.e.shutdown();
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
            g(intent);
            return 2;
        }
        rve f = f(i3);
        if (f.j()) {
            g(intent);
            return 2;
        }
        f.m(qrj.i, new rut() { // from class: aobj
            @Override // defpackage.rut
            public final void a(rve rveVar) {
                aobm.this.g(intent);
            }
        });
        return 3;
    }
}
