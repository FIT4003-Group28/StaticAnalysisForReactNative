package defpackage;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rny  reason: default package */
/* loaded from: classes4.dex */
public final class rny implements Runnable {
    final /* synthetic */ rnm a;
    final /* synthetic */ rom b;

    public rny(rom romVar, rnm rnmVar) {
        this.b = romVar;
        this.a = rnmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar = this.b;
        rkj rkjVar = romVar.c;
        if (rkjVar == null) {
            romVar.aG().c.a("Failed to send current screen to service");
            return;
        }
        try {
            rnm rnmVar = this.a;
            if (rnmVar != null) {
                rkjVar.o(rnmVar.c, rnmVar.a, rnmVar.b, romVar.I().getPackageName());
            } else {
                rkjVar.o(0L, null, null, romVar.I().getPackageName());
            }
            this.b.s();
        } catch (RemoteException e) {
            this.b.aG().c.b("Failed to send current screen to the service", e);
        }
    }
}
