package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: oyi  reason: default package */
/* loaded from: classes4.dex */
final class oyi extends oyk {
    public oyi() {
        super(null);
    }

    private static Double d(pct pctVar) {
        return Double.valueOf(Double.longBitsToDouble(pctVar.m()));
    }

    private static String f(pct pctVar) {
        int k = pctVar.k();
        int i = pctVar.b;
        pctVar.A(k);
        return new String(pctVar.a, i, k);
    }

    private static HashMap g(pct pctVar) {
        int j = pctVar.j();
        HashMap hashMap = new HashMap(j);
        for (int i = 0; i < j; i++) {
            hashMap.put(f(pctVar), e(pctVar, pctVar.h()));
        }
        return hashMap;
    }

    @Override // defpackage.oyk
    protected final void a(pct pctVar, long j) {
        if (pctVar.h() != 2) {
            throw new ouf();
        }
        if (!"onMetaData".equals(f(pctVar))) {
            return;
        }
        if (pctVar.h() != 8) {
            throw new ouf();
        }
        HashMap g = g(pctVar);
        if (!g.containsKey("duration")) {
            return;
        }
        double doubleValue = ((Double) g.get("duration")).doubleValue();
        if (doubleValue <= 0.0d) {
            return;
        }
        this.b = (long) (doubleValue * 1000000.0d);
    }

    @Override // defpackage.oyk
    protected final boolean b(pct pctVar) {
        return true;
    }

    private static Object e(pct pctVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i == 1) {
                if (pctVar.h() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 8) {
                        return g(pctVar);
                    }
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) d(pctVar).doubleValue());
                        pctVar.A(2);
                        return date;
                    }
                    int j = pctVar.j();
                    ArrayList arrayList = new ArrayList(j);
                    for (int i2 = 0; i2 < j; i2++) {
                        arrayList.add(e(pctVar, pctVar.h()));
                    }
                    return arrayList;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String f = f(pctVar);
                    int h = pctVar.h();
                    if (h == 9) {
                        return hashMap;
                    }
                    hashMap.put(f, e(pctVar, h));
                }
            } else {
                return f(pctVar);
            }
        } else {
            return d(pctVar);
        }
    }
}
