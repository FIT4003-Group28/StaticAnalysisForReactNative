package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnks  reason: default package */
/* loaded from: classes3.dex */
public final class bnks extends BroadcastReceiver {
    public final dzsj<bnku> a;
    public final dzsj<btvo> b;
    public final dzsj<akfa> c;
    public final dzsj<bnkt> d;
    private final Executor e;

    public bnks(dzsj<bnku> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<bnkt> dzsjVar4, Executor executor) {
        this.e = executor;
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!dbsj.e(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")).startsWith("com.google.geo.apps")) {
            return;
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.e.execute(new Runnable(this, goAsync) { // from class: bnkr
            private final bnks a;
            private final BroadcastReceiver.PendingResult b;

            {
                this.a = this;
                this.b = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnks bnksVar = this.a;
                BroadcastReceiver.PendingResult pendingResult = this.b;
                bnksVar.c.a().j();
                bnksVar.a.a();
                bnksVar.d.a().a(bnksVar.b.a(), pendingResult);
            }
        });
    }
}
