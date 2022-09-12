package defpackage;

import android.os.Looper;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dmkg  reason: default package */
/* loaded from: classes6.dex */
public final class dmkg implements dmkd {
    private final dmkj a;

    public dmkg(dmkj dmkjVar) {
        dbsk.l(true);
        this.a = dmkjVar;
    }

    @Override // defpackage.dmkd
    public final dehn<dtcc> a(dmkc dmkcVar) {
        dehn<dtcg> a;
        dbsk.l(Looper.getMainLooper().isCurrentThread());
        dbsk.l(true);
        try {
            a = this.a.a(dmkcVar);
        } catch (SecurityException unused) {
            a = deha.a(null);
        }
        final dehn g = deee.g(a, SecurityException.class, dmke.a, dege.a);
        return deha.k(g).b(new Callable(g) { // from class: dmkf
            private final dehn a;

            {
                this.a = g;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar = this.a;
                dtcb bZ = dtcc.d.bZ();
                dtcg dtcgVar = (dtcg) dehnVar.get();
                if (dtcgVar != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dtcc dtccVar = (dtcc) bZ.b;
                    dtcgVar.getClass();
                    dtccVar.b = dtcgVar;
                    dtccVar.a |= 1;
                }
                return bZ.bK();
            }
        }, dege.a);
    }

    @Override // defpackage.dmkd
    public final dmka b() {
        dbsk.l(Looper.getMainLooper().isCurrentThread());
        return dmka.b(this.a.b().a());
    }
}
