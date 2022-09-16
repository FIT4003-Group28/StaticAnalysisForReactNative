package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnx  reason: default package */
/* loaded from: classes4.dex */
public final class rnx implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rom b;
    private final /* synthetic */ int c;

    public rnx(rom romVar, AppMetadata appMetadata) {
        this.b = romVar;
        this.a = appMetadata;
    }

    public rnx(rom romVar, AppMetadata appMetadata, int i) {
        this.c = i;
        this.b = romVar;
        this.a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            rom romVar = this.b;
            rkj rkjVar = romVar.c;
            if (rkjVar != null) {
                try {
                    rkjVar.j(this.a);
                    this.b.i().s();
                    this.b.u(rkjVar, null, this.a);
                    this.b.s();
                    return;
                } catch (RemoteException e) {
                    this.b.aG().c.b("Failed to send app launch to the service", e);
                    return;
                }
            }
            romVar.aG().c.a("Discarding data. Failed to send app launch");
        } else if (i == 1) {
            rom romVar2 = this.b;
            rkj rkjVar2 = romVar2.c;
            if (rkjVar2 != null) {
                try {
                    rkjVar2.l(this.a);
                } catch (RemoteException e2) {
                    this.b.aG().c.b("Failed to reset data on the service: remote exception", e2);
                }
                this.b.s();
                return;
            }
            romVar2.aG().c.a("Failed to reset data on the service: not connected to service");
        } else if (i != 2) {
            rom romVar3 = this.b;
            rkj rkjVar3 = romVar3.c;
            if (rkjVar3 != null) {
                try {
                    rkjVar3.n(this.a);
                    this.b.s();
                    return;
                } catch (RemoteException e3) {
                    this.b.aG().c.b("Failed to send consent settings to the service", e3);
                    return;
                }
            }
            romVar3.aG().c.a("Failed to send consent settings to service");
        } else {
            rom romVar4 = this.b;
            rkj rkjVar4 = romVar4.c;
            if (rkjVar4 != null) {
                try {
                    rkjVar4.q(this.a);
                    this.b.s();
                    return;
                } catch (RemoteException e4) {
                    this.b.aG().c.b("Failed to send measurementEnabled to the service", e4);
                    return;
                }
            }
            romVar4.aG().c.a("Failed to send measurementEnabled to service");
        }
    }
}
