package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: uza  reason: default package */
/* loaded from: classes4.dex */
public final class uza extends vqw implements uvo, uue {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl");
    private final uui b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final AtomicBoolean f = new AtomicBoolean();

    public uza(uui uuiVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = uuiVar;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
    }

    private static long i(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static baac j(uyo uyoVar) {
        aopa createBuilder = baac.a.createBuilder();
        if (uyoVar.a != null) {
            String str = uyoVar.a;
            createBuilder.copyOnWrite();
            baac baacVar = (baac) createBuilder.instance;
            str.getClass();
            baacVar.b |= 1;
            baacVar.c = str;
        }
        if (uyoVar.b != null) {
            long longValue = uyoVar.b.longValue();
            createBuilder.copyOnWrite();
            baac baacVar2 = (baac) createBuilder.instance;
            baacVar2.b |= 2;
            baacVar2.d = longValue;
        }
        if (uyoVar.c != null) {
            long longValue2 = uyoVar.c.longValue();
            createBuilder.copyOnWrite();
            baac baacVar3 = (baac) createBuilder.instance;
            baacVar3.b |= 4;
            baacVar3.e = longValue2;
        }
        if (uyoVar.d != null) {
            long longValue3 = uyoVar.d.longValue();
            createBuilder.copyOnWrite();
            baac baacVar4 = (baac) createBuilder.instance;
            baacVar4.b |= 8;
            baacVar4.f = longValue3;
        }
        return (baac) createBuilder.mo39build();
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        this.b.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    @Override // defpackage.uue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uza.d(android.app.Activity):void");
    }
}
