package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.EventParcel;
/* compiled from: PG */
/* renamed from: rob  reason: default package */
/* loaded from: classes4.dex */
final class rob implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rhj c;
    final /* synthetic */ rom d;

    public rob(rom romVar, EventParcel eventParcel, String str, rhj rhjVar) {
        this.d = romVar;
        this.a = eventParcel;
        this.b = str;
        this.c = rhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar;
        byte[] bArr = null;
        try {
            try {
                rom romVar2 = this.d;
                rkj rkjVar = romVar2.c;
                if (rkjVar == null) {
                    romVar2.aG().c.a("Discarding data. Failed to send event to service to bundle");
                    romVar = this.d;
                } else {
                    bArr = rkjVar.s(this.a, this.b);
                    this.d.s();
                    romVar = this.d;
                }
            } catch (RemoteException e) {
                this.d.aG().c.b("Failed to send event to the service to bundle", e);
                romVar = this.d;
            }
            romVar.N().W(this.c, bArr);
        } catch (Throwable th) {
            this.d.N().W(this.c, bArr);
            throw th;
        }
    }
}
