package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cnde  reason: default package */
/* loaded from: classes5.dex */
public final class cnde implements cnce {
    private final cnfe a;
    private dehn<cmxn> b;
    private boolean c = false;

    public cnde(Context context) {
        this.a = new cnfm(context);
    }

    @Override // defpackage.cnce
    public final synchronized dehn<Void> a() {
        if (!this.c) {
            if (this.b == null) {
                cnfe cnfeVar = this.a;
                cnsd<L> a = cnse.a(cnfm.a, Looper.getMainLooper(), "Dummy Listener");
                cntc builder = cntd.builder();
                builder.a = cnfg.a;
                final cntd a2 = builder.a();
                cnsp a3 = cnsq.a();
                a3.c = a;
                a3.a = cnfh.a;
                a3.b = cnfi.a;
                final cnfm cnfmVar = (cnfm) cnfeVar;
                this.b = csac.a(((cnof) cnfeVar).f(a3.a()).i(new cpcp(cnfmVar, a2) { // from class: cnfj
                    private final cnfm a;
                    private final cntd b;

                    {
                        this.a = cnfmVar;
                        this.b = a2;
                    }

                    @Override // defpackage.cpcp
                    public final cpcq a(Object obj) {
                        Void r3 = (Void) obj;
                        return this.a.c(this.b);
                    }
                }));
            }
        } else {
            throw new IllegalStateException("Can't reconnect once disconnection has occurred.");
        }
        return deew.h(this.b, cndd.a, dege.a);
    }

    @Override // defpackage.cnce
    public final synchronized cmxn b() {
        if (!this.c) {
            dehn<cmxn> dehnVar = this.b;
            if (dehnVar == null || !dehnVar.isDone()) {
                throw new IllegalStateException("Client is not connected yet.");
            }
            try {
            } catch (CancellationException | ExecutionException e) {
                throw new IllegalStateException("Client not connected.", e);
            }
        } else {
            throw new IllegalStateException("Client has been disconnected.");
        }
        return (cmxn) deha.r(this.b);
    }

    @Override // defpackage.cnce
    public final synchronized void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b == null) {
            return;
        }
        ((cnof) this.a).g(cnse.b(cnfm.a, "Dummy Listener"));
    }
}
