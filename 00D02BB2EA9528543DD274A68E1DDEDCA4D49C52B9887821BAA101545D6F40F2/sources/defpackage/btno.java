package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btno  reason: default package */
/* loaded from: classes4.dex */
public final class btno implements irw {
    public final isa a;
    private final Executor b;

    public btno(Executor executor, isa isaVar) {
        this.b = executor;
        this.a = isaVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: btnn
            private final btno a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [btno] */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v7, types: [dehn] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.deff
            public final dehn a() {
                btno btnoVar = this.a;
                try {
                    if (!this.b.c.contains("glide.cache.periodic")) {
                        btnoVar = deha.a(bbx.c());
                    } else {
                        btnk rA = ((btnj) btsr.a(btnj.class)).rA();
                        if (rA == null) {
                            btnoVar = deha.a(bbx.c());
                        } else {
                            rA.c();
                            btnoVar = deha.a(bbx.a());
                        }
                    }
                    return btnoVar;
                } catch (RuntimeException e) {
                    btnoVar.a.b(8, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.b);
    }
}
