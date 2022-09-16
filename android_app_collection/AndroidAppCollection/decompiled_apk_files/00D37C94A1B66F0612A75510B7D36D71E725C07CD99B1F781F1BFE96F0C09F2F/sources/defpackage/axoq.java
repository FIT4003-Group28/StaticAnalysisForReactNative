package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axoq  reason: default package */
/* loaded from: classes2.dex */
public final class axoq {
    public final LinkedHashMap a;

    public axoq() {
        this(new double[]{tkh.FULL.f, tkh.THREE_QUARTER.f, tkh.HALF.f, tkh.QUARTER.f, tkh.NONE.f});
    }

    private final tkv h(double d) {
        for (Map.Entry entry : this.a.entrySet()) {
            if (d >= ((Double) entry.getKey()).doubleValue()) {
                return (tkv) entry.getValue();
            }
        }
        throw new IllegalArgumentException(String.format("No matching bucket for value %s", Double.valueOf(d)));
    }

    public final void a(Object obj, azqb azqbVar) {
        LinkedHashMap linkedHashMap = this.a;
        obj.getClass();
        azqbVar.getClass();
        linkedHashMap.put(obj, azqbVar);
    }

    public final long b(double d) {
        return h(d).c();
    }

    public final long c(int i, double d) {
        return h(d).b(i);
    }

    public final void d(double d, long j) {
        for (Map.Entry entry : this.a.entrySet()) {
            double doubleValue = ((Double) entry.getKey()).doubleValue();
            tkv tkvVar = (tkv) entry.getValue();
            if (d <= 0.0d || d < doubleValue) {
                tkvVar.e();
            } else {
                tkvVar.d(j);
            }
        }
    }

    public final void e() {
        for (Map.Entry entry : this.a.entrySet()) {
            ((tkv) entry.getValue()).e();
        }
    }

    public final void f() {
        for (Map.Entry entry : this.a.entrySet()) {
            ((tkv) entry.getValue()).f();
        }
    }

    public final Long[] g(int i, boolean z) {
        int size = this.a.size();
        Long[] lArr = new Long[size];
        int i2 = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            lArr[i2] = Long.valueOf(((tkv) entry.getValue()).b(i));
            i2++;
        }
        if (!z) {
            int i3 = size - 1;
            while (i3 > 0) {
                int i4 = i3 - 1;
                lArr[i3] = Long.valueOf(lArr[i3].longValue() - lArr[i4].longValue());
                i3 = i4;
            }
        }
        return lArr;
    }

    public axoq(double[] dArr) {
        this.a = new LinkedHashMap(dArr.length);
        double d = -1.0d;
        int i = 0;
        while (i < dArr.length) {
            double d2 = dArr[i];
            boolean z = true;
            aqxo.p(d2 >= 0.0d);
            if (i > 0) {
                aqxo.p(d2 >= d ? false : z);
            }
            this.a.put(Double.valueOf(d2), new tkv());
            i++;
            d = d2;
        }
    }

    public axoq(int i) {
        this.a = awwc.l(i);
    }
}
