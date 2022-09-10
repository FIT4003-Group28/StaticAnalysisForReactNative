package com.google.android.apps.gmm.cloudmessage.chime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.cloudmessage.chime.ChimeCloudMessageReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChimeCloudMessageReceiver extends BroadcastReceiver {
    public dcdc<pbo> a;
    public Executor b;
    public Executor c;
    public gdo d;
    public ckcw e;
    public bvrv f;
    public akfa g;

    public final /* synthetic */ void a(BroadcastReceiver.PendingResult pendingResult) {
        this.d.e();
        this.e.g(ckhc.CHIME_CLOUD_MESSAGE_RECEIVER);
        this.f.a();
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        dxiq.c(this, context);
        if (this.g.d()) {
            return;
        }
        final dbsg m = dcft.m(this.a, new dbsl(intent) { // from class: pba
            private final Intent a;

            {
                this.a = intent;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((pbo) obj).a.a(this.a);
            }
        });
        if (!m.a()) {
            intent.getAction();
            return;
        }
        this.e.f(ckhc.CHIME_CLOUD_MESSAGE_RECEIVER);
        this.d.b();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.b.execute(new Runnable(this, intent, m, goAsync) { // from class: pbb
            private final ChimeCloudMessageReceiver a;
            private final Intent b;
            private final dbsg c;
            private final BroadcastReceiver.PendingResult d;

            {
                this.a = this;
                this.b = intent;
                this.c = m;
                this.d = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ChimeCloudMessageReceiver chimeCloudMessageReceiver = this.a;
                Intent intent2 = this.b;
                dbsg dbsgVar = this.c;
                final BroadcastReceiver.PendingResult pendingResult = this.d;
                try {
                    intent2.getAction();
                    pbo pboVar = (pbo) dbsgVar.b();
                    cvkt cvktVar = pboVar.a;
                    cvix e = cvix.e(intent2);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    cqat cqatVar = pboVar.b;
                    cvktVar.b(intent2, e, timeUnit.toMicros(System.currentTimeMillis()));
                    chimeCloudMessageReceiver.c.execute(new Runnable(chimeCloudMessageReceiver, pendingResult) { // from class: pbc
                        private final ChimeCloudMessageReceiver a;
                        private final BroadcastReceiver.PendingResult b;

                        {
                            this.a = chimeCloudMessageReceiver;
                            this.b = pendingResult;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(this.b);
                        }
                    });
                } catch (Throwable th) {
                    chimeCloudMessageReceiver.c.execute(new Runnable(chimeCloudMessageReceiver, pendingResult) { // from class: pbd
                        private final ChimeCloudMessageReceiver a;
                        private final BroadcastReceiver.PendingResult b;

                        {
                            this.a = chimeCloudMessageReceiver;
                            this.b = pendingResult;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(this.b);
                        }
                    });
                    throw th;
                }
            }
        });
    }
}
