package com.google.android.apps.gmm.transit.commute;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.transit.commute.TransitCommuteNotificationBroadcastReceiver;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransitCommuteNotificationBroadcastReceiver extends BroadcastReceiver {
    public byxx a;
    public bvrb b;
    public bywd c;
    public bysv d;
    public ckcw e;
    public gdo f;
    public bvrv g;

    public final /* synthetic */ void a(Intent intent, final BroadcastReceiver.PendingResult pendingResult) {
        bvrb bvrbVar;
        Runnable runnable;
        try {
            try {
                try {
                    if (!this.a.b(intent)) {
                        this.d.c(cken.ERROR_UNEXPECTED_INTENT);
                    } else {
                        this.a.a(intent);
                    }
                    bvrbVar = this.b;
                    runnable = new Runnable(this, pendingResult) { // from class: byya
                        private final TransitCommuteNotificationBroadcastReceiver a;
                        private final BroadcastReceiver.PendingResult b;

                        {
                            this.a = this;
                            this.b = pendingResult;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b(this.b);
                        }
                    };
                } catch (RuntimeException e) {
                    this.d.c(cken.ERROR_UNEXPECTED_RUNTIME_EXCEPTION);
                    bvoo.f(e);
                    bvrbVar = this.b;
                    runnable = new Runnable(this, pendingResult) { // from class: byyb
                        private final TransitCommuteNotificationBroadcastReceiver a;
                        private final BroadcastReceiver.PendingResult b;

                        {
                            this.a = this;
                            this.b = pendingResult;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b(this.b);
                        }
                    };
                }
            } catch (Error e2) {
                this.d.c(cken.ERROR_UNEXPECTED_ERROR);
                bvoo.f(e2);
                bvrbVar = this.b;
                runnable = new Runnable(this, pendingResult) { // from class: byyc
                    private final TransitCommuteNotificationBroadcastReceiver a;
                    private final BroadcastReceiver.PendingResult b;

                    {
                        this.a = this;
                        this.b = pendingResult;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b);
                    }
                };
            }
            bvrbVar.b(runnable, bvrj.UI_THREAD);
        } catch (Throwable th) {
            this.b.b(new Runnable(this, pendingResult) { // from class: byyd
                private final TransitCommuteNotificationBroadcastReceiver a;
                private final BroadcastReceiver.PendingResult b;

                {
                    this.a = this;
                    this.b = pendingResult;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            }, bvrj.UI_THREAD);
            throw th;
        }
    }

    public final /* synthetic */ void b(BroadcastReceiver.PendingResult pendingResult) {
        this.e.g(ckhc.TRANSIT_COMMUTE_NOTIFICATION_BROADCAST_RECEIVER);
        this.f.e();
        this.g.a();
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        dxiq.c(this, context);
        this.f.b();
        this.e.f(ckhc.TRANSIT_COMMUTE_NOTIFICATION_BROADCAST_RECEIVER);
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        bywd bywdVar = this.c;
        bywdVar.a.execute(new Runnable(this, intent, goAsync) { // from class: byxz
            private final TransitCommuteNotificationBroadcastReceiver a;
            private final Intent b;
            private final BroadcastReceiver.PendingResult c;

            {
                this.a = this;
                this.b = intent;
                this.c = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c);
            }
        });
    }
}
