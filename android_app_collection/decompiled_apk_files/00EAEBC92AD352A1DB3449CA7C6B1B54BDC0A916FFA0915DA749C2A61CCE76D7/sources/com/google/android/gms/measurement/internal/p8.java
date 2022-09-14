package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.c;
/* loaded from: classes.dex */
public final class p8 implements ServiceConnection, c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f7592a;

    /* renamed from: b  reason: collision with root package name */
    private volatile a4 f7593b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y7 f7594c;

    /* JADX INFO: Access modifiers changed from: protected */
    public p8(y7 y7Var) {
        this.f7594c = y7Var;
    }

    public final void a() {
        if (this.f7593b != null && (this.f7593b.a() || this.f7593b.e())) {
            this.f7593b.i();
        }
        this.f7593b = null;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void a(int i) {
        com.google.android.gms.common.internal.s.a("MeasurementServiceConnection.onConnectionSuspended");
        this.f7594c.c().A().a("Service connection suspended");
        this.f7594c.a().a(new t8(this));
    }

    public final void a(Intent intent) {
        p8 p8Var;
        this.f7594c.g();
        Context d2 = this.f7594c.d();
        com.google.android.gms.common.stats.a a2 = com.google.android.gms.common.stats.a.a();
        synchronized (this) {
            if (this.f7592a) {
                this.f7594c.c().B().a("Connection attempt already in progress");
                return;
            }
            this.f7594c.c().B().a("Using local app measurement service");
            this.f7592a = true;
            p8Var = this.f7594c.f7805c;
            a2.a(d2, intent, p8Var, 129);
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(com.google.android.gms.common.b bVar) {
        com.google.android.gms.common.internal.s.a("MeasurementServiceConnection.onConnectionFailed");
        z3 p = this.f7594c.f7802a.p();
        if (p != null) {
            p.v().a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f7592a = false;
            this.f7593b = null;
        }
        this.f7594c.a().a(new w8(this));
    }

    public final void b() {
        this.f7594c.g();
        Context d2 = this.f7594c.d();
        synchronized (this) {
            if (this.f7592a) {
                this.f7594c.c().B().a("Connection attempt already in progress");
            } else if (this.f7593b != null && (this.f7593b.e() || this.f7593b.a())) {
                this.f7594c.c().B().a("Already awaiting connection attempt");
            } else {
                this.f7593b = new a4(d2, Looper.getMainLooper(), this, this);
                this.f7594c.c().B().a("Connecting to remote service");
                this.f7592a = true;
                this.f7593b.l();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(Bundle bundle) {
        com.google.android.gms.common.internal.s.a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f7594c.a().a(new u8(this, this.f7593b.v()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7593b = null;
                this.f7592a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p8 p8Var;
        com.google.android.gms.common.internal.s.a("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f7592a = false;
                this.f7594c.c().s().a("Service connected with null binder");
                return;
            }
            r3 r3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        r3Var = queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new t3(iBinder);
                    }
                    this.f7594c.c().B().a("Bound to IMeasurementService interface");
                } else {
                    this.f7594c.c().s().a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f7594c.c().s().a("Service connect failed to get IMeasurementService");
            }
            if (r3Var == null) {
                this.f7592a = false;
                try {
                    com.google.android.gms.common.stats.a a2 = com.google.android.gms.common.stats.a.a();
                    Context d2 = this.f7594c.d();
                    p8Var = this.f7594c.f7805c;
                    a2.a(d2, p8Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f7594c.a().a(new s8(this, r3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.s.a("MeasurementServiceConnection.onServiceDisconnected");
        this.f7594c.c().A().a("Service disconnected");
        this.f7594c.a().a(new r8(this, componentName));
    }
}
