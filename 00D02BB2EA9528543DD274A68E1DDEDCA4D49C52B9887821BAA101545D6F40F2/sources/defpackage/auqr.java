package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: auqr  reason: default package */
/* loaded from: classes2.dex */
public final class auqr implements irw {
    public final dxio<auqy> a;
    public final isa b;
    private final Executor c;

    public auqr(dxio<auqy> dxioVar, isa isaVar, Executor executor) {
        this.a = dxioVar;
        this.b = isaVar;
        this.c = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: auqp
            private final auqr a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [auqr] */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v7, types: [dehn] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.deff
            public final dehn a() {
                auqr auqrVar = this.a;
                try {
                    dbsg r = dcbg.b(this.b.c).r(new dbsl() { // from class: auqq
                        private final String a = "INBOX.DELETE_EXPIRED_NOTIFICATIONS";

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.equals((String) obj);
                        }
                    });
                    if (!r.a()) {
                        auqrVar = deha.a(bbx.c());
                    } else {
                        r.b();
                        if (!auqrVar.a.a().j()) {
                            auqrVar = deha.a(bbx.c());
                        } else {
                            auqrVar = deha.a(bbx.a());
                        }
                    }
                    return auqrVar;
                } catch (RuntimeException e) {
                    auqrVar.b.b(10, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.c);
    }
}
