package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: rol  reason: default package */
/* loaded from: classes4.dex */
public final class rol implements ServiceConnection, qwi, qwj {
    public volatile boolean a;
    public volatile rko b;
    final /* synthetic */ rom c;

    /* JADX INFO: Access modifiers changed from: protected */
    public rol(rom romVar) {
        this.c = romVar;
    }

    @Override // defpackage.qwi
    public final void a(int i) {
        qnm.g("MeasurementServiceConnection.onConnectionSuspended");
        this.c.aG().j.a("Service connection suspended");
        this.c.aH().g(new rok(this, 1));
    }

    @Override // defpackage.qwi
    public final void b() {
        qnm.g("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                qnm.b(this.b);
                this.c.aH().g(new roj(this, (rkj) this.b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.qwj
    public final void c(ConnectionResult connectionResult) {
        qnm.g("MeasurementServiceConnection.onConnectionFailed");
        rlx rlxVar = this.c.w;
        rks rksVar = rlxVar.i;
        rks rksVar2 = (rksVar == null || !rksVar.m()) ? null : rlxVar.i;
        if (rksVar2 != null) {
            rksVar2.f.b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.aH().g(new rok(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rkj rkhVar;
        qnm.g("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder != null) {
                rkj rkjVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof rkj) {
                            rkhVar = (rkj) queryLocalInterface;
                        } else {
                            rkhVar = new rkh(iBinder);
                        }
                        rkjVar = rkhVar;
                        this.c.aG().k.a("Bound to IMeasurementService interface");
                    } else {
                        this.c.aG().c.b("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.c.aG().c.a("Service connect failed to get IMeasurementService");
                }
                if (rkjVar == null) {
                    this.a = false;
                    try {
                        qyf.a().b(this.c.I(), this.c.b);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    this.c.aH().g(new roj(this, rkjVar, 1));
                }
                return;
            }
            this.a = false;
            this.c.aG().c.a("Service connected with null binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qnm.g("MeasurementServiceConnection.onServiceDisconnected");
        this.c.aG().j.a("Service disconnected");
        this.c.aH().g(new roi(this, componentName));
    }
}
