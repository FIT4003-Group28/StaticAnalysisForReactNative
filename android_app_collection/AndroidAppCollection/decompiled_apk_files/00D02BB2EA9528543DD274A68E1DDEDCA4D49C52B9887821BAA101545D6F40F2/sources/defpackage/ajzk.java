package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajzk  reason: default package */
/* loaded from: classes2.dex */
public final class ajzk extends BroadcastReceiver {
    public ajsj a;
    public akfa b;
    public akas c;
    public Executor d;
    public Executor e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        if (intent == null || dbsj.d(intent.getStringExtra("accountId"))) {
            return;
        }
        dxiq.c(this, context);
        if (this.a.f()) {
            return;
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.d.execute(new Runnable(this, intent, goAsync) { // from class: ajzh
            private final ajzk a;
            private final Intent b;
            private final BroadcastReceiver.PendingResult c;

            {
                this.a = this;
                this.b = intent;
                this.c = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajzk ajzkVar = this.a;
                Intent intent2 = this.b;
                final BroadcastReceiver.PendingResult pendingResult = this.c;
                akfa akfaVar = ajzkVar.b;
                String stringExtra = intent2.getStringExtra("accountId");
                dbsk.s(stringExtra);
                final btlu n = akfaVar.n(stringExtra);
                if (n != null) {
                    ajzkVar.e.execute(new Runnable(ajzkVar, n, pendingResult) { // from class: ajzi
                        private final ajzk a;
                        private final btlu b;
                        private final BroadcastReceiver.PendingResult c;

                        {
                            this.a = ajzkVar;
                            this.b = n;
                            this.c = pendingResult;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dehn<?> dehnVar;
                            ajzk ajzkVar2 = this.a;
                            btlu btluVar = this.b;
                            final BroadcastReceiver.PendingResult pendingResult2 = this.c;
                            akas akasVar = ajzkVar2.c;
                            bvrj.UI_THREAD.c();
                            String A = akasVar.e.A(bvjk.ky, btluVar, null);
                            if (A == null) {
                                dehnVar = dehk.a;
                            } else {
                                final deig d = deig.d();
                                auhj auhjVar = akasVar.f;
                                int i = dpyv.LOCATION_SHARING_USER_SALVAGE_AND_RESCUE.dm;
                                aujb h = akasVar.d.h(dpyv.LOCATION_SHARING_USER_SALVAGE_AND_RESCUE.dm);
                                dbsk.s(h);
                                augc b = auhjVar.b(i, h);
                                b.f = "Can't share your location";
                                b.g = "Fix in progress";
                                b.S = btluVar;
                                b.e = A;
                                b.E(ahyr.l(akasVar.g, dbsg.i(btluVar), ahwe.SHORTCUT), auhw.ACTIVITY);
                                b.t(0, true);
                                akasVar.d.j(b.a());
                                akasVar.h.b(btluVar, dcep.B(dqym.FIX_NOT_SHARING_FROM_THIS_DEVICE)).Pk(new Runnable(d) { // from class: akan
                                    private final deig a;

                                    {
                                        this.a = d;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        deig deigVar = this.a;
                                        akas.a();
                                        deigVar.j(null);
                                    }
                                }, akasVar.i);
                                dehnVar = d;
                            }
                            dehnVar.Pk(new Runnable(pendingResult2) { // from class: ajzj
                                private final BroadcastReceiver.PendingResult a;

                                {
                                    this.a = pendingResult2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.finish();
                                }
                            }, ajzkVar2.d);
                        }
                    });
                } else {
                    pendingResult.finish();
                }
            }
        });
    }
}
