package com.google.frameworks.client.data.android.binder;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.frameworks.client.data.android.binder.LifecycleAwareServiceBinding;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LifecycleAwareServiceBinding implements ServiceConnection, dexq, e {
    private final ComponentName a;
    private final String b;
    private final dexp c;
    private final Handler d;
    @dzsi
    private Context e;
    @dzsi
    private k f;
    private int g;
    private int h;

    public LifecycleAwareServiceBinding(Context context, dbsg<k> dbsgVar, ComponentName componentName, dexp dexpVar) {
        synchronized (this) {
            this.a = componentName;
            this.b = "grpc.io.action.BIND";
            this.c = dexpVar;
            this.e = context;
            this.f = dbsgVar.e(deyi.a);
            this.d = new Handler(Looper.getMainLooper());
            this.g = 1;
            this.h = 1;
        }
    }

    @Override // defpackage.f
    public final void a(m mVar) {
    }

    @Override // defpackage.f
    public final void b(m mVar) {
    }

    @Override // defpackage.f
    public final void c(m mVar) {
    }

    @Override // defpackage.f
    public final void d(m mVar) {
    }

    @Override // defpackage.f
    public final void e(m mVar) {
    }

    @Override // defpackage.f
    public final void f(m mVar) {
        i(true);
    }

    @Override // defpackage.dexq
    public final synchronized void g() {
        if (this.g == 1) {
            this.g = 2;
            if (this.f.c() == j.DESTROYED) {
                this.g = 4;
                this.d.post(new Runnable(this) { // from class: deyj
                    private final LifecycleAwareServiceBinding a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(true);
                    }
                });
                return;
            }
            Intent intent = new Intent(this.b);
            intent.setComponent(this.a);
            if (!this.e.bindService(intent, this, 1)) {
                this.g = 4;
                this.d.post(new Runnable(this) { // from class: deyk
                    private final LifecycleAwareServiceBinding a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(false);
                    }
                });
            }
        }
    }

    public final void h(boolean z) {
        dcqe.b.v(dcqz.MEDIUM);
        k kVar = this.f;
        if (kVar != null) {
            kVar.b(this);
        }
        this.f = null;
        this.e = null;
        if (this.h != 4) {
            this.h = 4;
            this.c.b(z);
        }
    }

    public final void i(final boolean z) {
        Context context;
        synchronized (this) {
            int i = this.g;
            if (i != 2 && i != 3) {
                context = null;
                this.g = 4;
            }
            context = this.e;
            this.g = 4;
        }
        this.d.post(new Runnable(this, z) { // from class: deyl
            private final LifecycleAwareServiceBinding a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(this.b);
            }
        });
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        i(false);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        i(false);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (!z || this.h != 1) {
            return;
        }
        if (this.f.c() == j.DESTROYED) {
            i(true);
            return;
        }
        this.f.a(this);
        this.h = 3;
        this.c.a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i(false);
    }
}
