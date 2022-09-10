package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bugm  reason: default package */
/* loaded from: classes4.dex */
public final class bugm implements irw {
    public final bugn a;
    public final isa b;
    private final Executor c;

    public bugm(bugn bugnVar, isa isaVar, Executor executor) {
        this.a = bugnVar;
        this.b = isaVar;
        this.c = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: bugl
            private final bugm a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                bugm bugmVar = this.a;
                WorkerParameters workerParameters2 = this.b;
                try {
                    if (!workerParameters2.c.contains("SEND_LOW_PRIORITY_REQUESTS")) {
                        return deha.a(bbx.c());
                    }
                    String c = workerParameters2.b.c("taskId");
                    if (c != null) {
                        bugmVar.a.a(c);
                    }
                    return deha.a(bbx.a());
                } catch (RuntimeException e) {
                    bugmVar.b.b(11, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.c);
    }
}
