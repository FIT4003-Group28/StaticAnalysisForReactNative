package defpackage;

import com.google.android.apps.gmm.offline.update.StartAutoUpdatesCheckingReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fxt  reason: default package */
/* loaded from: classes6.dex */
final class fxt implements dxis {
    final /* synthetic */ fyu a;

    public fxt(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        StartAutoUpdatesCheckingReceiver startAutoUpdatesCheckingReceiver = (StartAutoUpdatesCheckingReceiver) obj;
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        startAutoUpdatesCheckingReceiver.a = sV;
        startAutoUpdatesCheckingReceiver.b = this.a.qP();
        startAutoUpdatesCheckingReceiver.c = this.a.hQ();
    }
}
