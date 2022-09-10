package defpackage;

import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awir  reason: default package */
/* loaded from: classes3.dex */
public final class awir implements awil {
    private final awkc a;

    public awir(awkc awkcVar) {
        this.a = awkcVar;
    }

    @Override // defpackage.awil
    public final void a(int i, long j, awif awifVar, avjy avjyVar) {
        awkc awkcVar;
        dehn a;
        try {
            final awkc awkcVar2 = this.a;
            try {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                bbo bboVar = new bbo();
                bboVar.e("worker_name_key", "OfflineAutoUpdateWorker");
                bboVar.e("options", awkc.a(avjyVar));
                bca e = new bca(GmmWorkerWrapper.class).d("OfflineAutoUpdateService").c(bboVar.a()).e(seconds, TimeUnit.SECONDS);
                bbk bbkVar = new bbk();
                bbkVar.c = awifVar.c() ? 3 : 2;
                bbkVar.a = awifVar.a();
                final bcb f = e.b(bbkVar.a()).f();
                a = deew.h(awkcVar2.a.a(f).a(), new dbrn(awkcVar2, f) { // from class: awka
                    private final awkc a;
                    private final bcb b;

                    {
                        this.a = awkcVar2;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        awkc awkcVar3 = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e2) {
                            awkcVar3.b.c(15, e2);
                            return bbx.c();
                        }
                    }
                }, dege.a);
            } catch (RuntimeException e2) {
                awkcVar.b.c(15, e2);
                a = deha.a(bbx.c());
            }
            a.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.awil
    public final void b() {
        awkc awkcVar = this.a;
        try {
            awkcVar.a.c("OfflineAutoUpdateService");
        } catch (RuntimeException e) {
            awkcVar.b.a(15, e);
        }
    }

    @Override // defpackage.awil
    public final void c(avjy avjyVar) {
        dehn a;
        try {
            final awkc awkcVar = this.a;
            try {
                bbo bboVar = new bbo();
                bboVar.e("worker_name_key", "OfflineAutoUpdateWorker");
                bboVar.e("options", awkc.a(avjyVar));
                bbp a2 = bboVar.a();
                bbk bbkVar = new bbk();
                bbkVar.c = 1;
                bbkVar.a = false;
                final bcb f = new bca(GmmWorkerWrapper.class).d("OfflineAutoUpdateService").c(a2).e(2L, TimeUnit.SECONDS).b(bbkVar.a()).f();
                a = deew.h(awkcVar.a.a(f).a(), new dbrn(awkcVar, f) { // from class: awkb
                    private final awkc a;
                    private final bcb b;

                    {
                        this.a = awkcVar;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        awkc awkcVar2 = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e) {
                            awkcVar2.b.c(15, e);
                            return bbx.c();
                        }
                    }
                }, dege.a);
            } catch (RuntimeException e) {
                awkcVar.b.c(15, e);
                a = deha.a(bbx.c());
            }
            a.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
