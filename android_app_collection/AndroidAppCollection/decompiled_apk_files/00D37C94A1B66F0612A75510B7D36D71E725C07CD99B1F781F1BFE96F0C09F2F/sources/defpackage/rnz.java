package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnz  reason: default package */
/* loaded from: classes4.dex */
public final class rnz implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ rom c;

    public rnz(rom romVar, AppMetadata appMetadata, Bundle bundle) {
        this.c = romVar;
        this.a = appMetadata;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar = this.c;
        rkj rkjVar = romVar.c;
        if (rkjVar != null) {
            try {
                rkjVar.p(this.b, this.a);
                return;
            } catch (RemoteException e) {
                this.c.aG().c.b("Failed to send default event parameters to service", e);
                return;
            }
        }
        romVar.aG().c.a("Failed to send default event parameters to service");
    }
}
