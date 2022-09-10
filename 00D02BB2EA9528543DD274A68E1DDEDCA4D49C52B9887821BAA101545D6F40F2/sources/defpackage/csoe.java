package defpackage;

import android.util.LruCache;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: csoe  reason: default package */
/* loaded from: classes5.dex */
public final class csoe implements csof {
    public final dbty<Pair<Long, TimeUnit>> a;
    public final LruCache<dspd, csod> b;

    public csoe(int i, dbty<Pair<Long, TimeUnit>> dbtyVar) {
        dbsk.l(i > 0);
        this.a = dbtyVar;
        this.b = new LruCache<>(i);
    }

    @Override // defpackage.csnm
    public final dehn<csnx<dspd>> a(Iterable<dspd> iterable, csnv csnvVar) {
        dehn<csnx<dspd>> a;
        dbsk.s(iterable);
        dbsk.s(csnvVar);
        synchronized (this.b) {
            csnw b = csnx.b();
            b.b(dcdc.q(dcft.o(iterable, new dbrn(this) { // from class: csoc
                private final csoe a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    csoe csoeVar = this.a;
                    dspd dspdVar = (dspd) obj;
                    csod csodVar = csoeVar.b.get(dspdVar);
                    if (csodVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long b2 = csodVar.b();
                        Pair<Long, TimeUnit> a2 = csoeVar.a.a();
                        if (currentTimeMillis < b2 + ((TimeUnit) a2.second).toMillis(((Long) a2.first).longValue())) {
                            return csodVar.a();
                        }
                    }
                    csoeVar.b.remove(dspdVar);
                    csny d = csoa.d();
                    ((csnr) d).b = 3;
                    return d.c();
                }
            })));
            a = deha.a(b.a());
        }
        return a;
    }
}
