package defpackage;

import com.google.android.apps.gmm.map.prefetch.background.TilePrefetchBroadcastReceiver;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fyf  reason: default package */
/* loaded from: classes6.dex */
public final class fyf implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<amwr> b;

    public fyf(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TilePrefetchBroadcastReceiver tilePrefetchBroadcastReceiver = (TilePrefetchBroadcastReceiver) obj;
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        amwi hU = this.a.hU();
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fye(this);
            this.b = dzsjVar;
        }
        dxio c = dxjc.c(dzsjVar);
        dxio c2 = dxjc.c(this.a.ed());
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        tilePrefetchBroadcastReceiver.a = new amxc(rR, hU, rp, c, c2, sV);
    }
}
