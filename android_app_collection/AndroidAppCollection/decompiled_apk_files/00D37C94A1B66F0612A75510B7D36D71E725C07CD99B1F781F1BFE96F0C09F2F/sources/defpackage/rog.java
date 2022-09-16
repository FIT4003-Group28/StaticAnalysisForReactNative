package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rog  reason: default package */
/* loaded from: classes4.dex */
final class rog implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ rhj d;
    final /* synthetic */ rom e;

    public rog(rom romVar, String str, String str2, AppMetadata appMetadata, rhj rhjVar) {
        this.e = romVar;
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = rhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                rom romVar2 = this.e;
                rkj rkjVar = romVar2.c;
                if (rkjVar != null) {
                    arrayList = rps.C(rkjVar.f(this.a, this.b, this.c));
                    this.e.s();
                    romVar = this.e;
                } else {
                    romVar2.aG().c.c("Failed to get conditional properties; not connected to service", this.a, this.b);
                    romVar = this.e;
                }
            } catch (RemoteException e) {
                this.e.aG().c.d("Failed to get conditional properties; remote exception", this.a, this.b, e);
                romVar = this.e;
            }
            romVar.N().U(this.d, arrayList);
        } catch (Throwable th) {
            this.e.N().U(this.d, arrayList);
            throw th;
        }
    }
}
