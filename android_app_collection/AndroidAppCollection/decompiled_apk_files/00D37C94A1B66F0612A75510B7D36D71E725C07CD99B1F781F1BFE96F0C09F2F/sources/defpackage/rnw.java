package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
/* compiled from: PG */
/* renamed from: rnw  reason: default package */
/* loaded from: classes4.dex */
final class rnw implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rhj b;
    final /* synthetic */ rom c;

    public rnw(rom romVar, AppMetadata appMetadata, rhj rhjVar) {
        this.c = romVar;
        this.a = appMetadata;
        this.b = rhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar;
        String str = null;
        try {
            try {
                if (!this.c.M().b().h()) {
                    this.c.aG().h.a("Analytics storage consent denied; will not get app instance id");
                    this.c.j().A(null);
                    this.c.M().f.b(null);
                    romVar = this.c;
                } else {
                    rom romVar2 = this.c;
                    rkj rkjVar = romVar2.c;
                    if (rkjVar == null) {
                        romVar2.aG().c.a("Failed to get app instance id");
                        romVar = this.c;
                    } else {
                        str = rkjVar.a(this.a);
                        if (str != null) {
                            this.c.j().A(str);
                            this.c.M().f.b(str);
                        }
                        this.c.s();
                        romVar = this.c;
                    }
                }
            } catch (RemoteException e) {
                this.c.aG().c.b("Failed to get app instance id", e);
                romVar = this.c;
            }
            romVar.N().Z(this.b, str);
        } catch (Throwable th) {
            this.c.N().Z(this.b, null);
            throw th;
        }
    }
}
