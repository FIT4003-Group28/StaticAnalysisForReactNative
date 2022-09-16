package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: boml  reason: default package */
/* loaded from: classes3.dex */
public final class boml implements irw {
    public final bokp a;
    public final isa b;
    private final Executor c;

    public boml(bokp bokpVar, isa isaVar, Executor executor) {
        this.a = bokpVar;
        this.b = isaVar;
        this.c = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: bomj
            private final boml a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                boml bomlVar = this.a;
                WorkerParameters workerParameters2 = this.b;
                try {
                    dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: bomk
                        private final String a = "DismissNotificationScheduler";

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.equals((String) obj);
                        }
                    });
                    if (!r.a()) {
                        return deha.a(bbx.c());
                    }
                    r.b();
                    String c = workerParameters2.b.c("gaia_id");
                    bokp bokpVar = bomlVar.a;
                    bvrj.UI_THREAD.d();
                    try {
                        bokpVar.d().b().delete("edits", "account_id = ? ", new String[]{dbsj.e(c)});
                    } catch (bvjv unused) {
                    }
                    bomlVar.a.a();
                    return deha.a(bbx.a());
                } catch (RuntimeException e) {
                    bomlVar.b.b(5, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.c);
    }
}
