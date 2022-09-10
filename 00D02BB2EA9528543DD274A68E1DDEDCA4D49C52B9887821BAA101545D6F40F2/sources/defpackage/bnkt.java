package defpackage;

import android.content.BroadcastReceiver;
/* compiled from: PG */
/* renamed from: bnkt  reason: default package */
/* loaded from: classes3.dex */
public final class bnkt {
    private final bvjj a;

    public bnkt(ckcw ckcwVar, bvjj bvjjVar) {
        this.a = bvjjVar;
        ckco ckcoVar = (ckco) ckcwVar.a(ckja.Y);
        ckco ckcoVar2 = (ckco) ckcwVar.a(ckja.Z);
        ckco ckcoVar3 = (ckco) ckcwVar.a(ckja.ag);
    }

    @dzsi
    public final synchronized void a(btvo btvoVar, BroadcastReceiver.PendingResult pendingResult) {
        boolean z = btvoVar.getEnableFeatureParameters().aU;
        this.a.ac(bvjk.kc, "");
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
