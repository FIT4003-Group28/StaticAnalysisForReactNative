package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
/* compiled from: PG */
/* renamed from: rnt  reason: default package */
/* loaded from: classes4.dex */
final class rnt implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rhj e;
    final /* synthetic */ rom f;

    public rnt(rom romVar, String str, String str2, AppMetadata appMetadata, boolean z, rhj rhjVar) {
        this.f = romVar;
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = z;
        this.e = rhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar;
        Bundle bundle = new Bundle();
        try {
            try {
                rom romVar2 = this.f;
                rkj rkjVar = romVar2.c;
                if (rkjVar != null) {
                    bundle = rps.t(rkjVar.h(this.a, this.b, this.d, this.c));
                    this.f.s();
                    romVar = this.f;
                } else {
                    romVar2.aG().c.c("Failed to get user properties; not connected to service", this.a, this.b);
                    romVar = this.f;
                }
            } catch (RemoteException e) {
                this.f.aG().c.c("Failed to get user properties; remote exception", this.a, e);
                romVar = this.f;
            }
            romVar.N().V(this.e, bundle);
        } catch (Throwable th) {
            this.f.N().V(this.e, bundle);
            throw th;
        }
    }
}
