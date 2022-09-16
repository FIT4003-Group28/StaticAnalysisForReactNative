package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ris  reason: default package */
/* loaded from: classes4.dex */
final class ris implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ riu c;
    private final /* synthetic */ int d;

    public ris(riu riuVar, String str, long j) {
        this.c = riuVar;
        this.a = str;
        this.b = j;
    }

    public ris(riu riuVar, String str, long j, int i) {
        this.d = i;
        this.c = riuVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            riu riuVar = this.c;
            String str = this.a;
            long j = this.b;
            riuVar.n();
            qnm.l(str);
            Integer num = (Integer) riuVar.b.get(str);
            if (num != null) {
                rnm f = riuVar.k().f();
                int intValue = num.intValue() - 1;
                if (intValue == 0) {
                    riuVar.b.remove(str);
                    Long l = (Long) riuVar.a.get(str);
                    if (l == null) {
                        riuVar.aG().c.a("First ad unit exposure time was never set");
                    } else {
                        long longValue = l.longValue();
                        riuVar.a.remove(str);
                        riuVar.d(str, j - longValue, f);
                    }
                    if (!riuVar.b.isEmpty()) {
                        return;
                    }
                    long j2 = riuVar.c;
                    if (j2 == 0) {
                        riuVar.aG().c.a("First ad exposure time was never set");
                        return;
                    }
                    riuVar.c(j - j2, f);
                    riuVar.c = 0L;
                    return;
                }
                riuVar.b.put(str, Integer.valueOf(intValue));
                return;
            }
            riuVar.aG().c.b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        riu riuVar2 = this.c;
        String str2 = this.a;
        long j3 = this.b;
        riuVar2.n();
        qnm.l(str2);
        if (riuVar2.b.isEmpty()) {
            riuVar2.c = j3;
        }
        Integer num2 = (Integer) riuVar2.b.get(str2);
        if (num2 != null) {
            riuVar2.b.put(str2, Integer.valueOf(num2.intValue() + 1));
            return;
        }
        Map map = riuVar2.b;
        if (((agd) map).j >= 100) {
            riuVar2.aG().f.a("Too many ads visible");
            return;
        }
        map.put(str2, 1);
        riuVar2.a.put(str2, Long.valueOf(j3));
    }
}
