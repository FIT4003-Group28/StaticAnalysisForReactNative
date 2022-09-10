package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pft  reason: default package */
/* loaded from: classes.dex */
final class pft implements btni {
    private static final long a = TimeUnit.MINUTES.toMillis(5);
    private final TreeMap<Long, dnwi> b = new TreeMap<>(Collections.reverseOrder());
    private final cqat c;

    public pft(cqat cqatVar) {
        this.c = cqatVar;
    }

    private final synchronized void f() {
        if (this.b.isEmpty()) {
            return;
        }
        Long lastKey = this.b.lastKey();
        long b = this.c.b() - a;
        while (!this.b.isEmpty() && lastKey.longValue() < b) {
            this.b.pollLastEntry();
            if (!this.b.isEmpty()) {
                lastKey = this.b.lastKey();
            }
        }
    }

    private final synchronized void g(int i) {
        if (i >= this.b.size()) {
            return;
        }
        if (i <= 0) {
            this.b.clear();
            return;
        }
        for (int size = this.b.size() - i; size > 0; size--) {
            this.b.pollLastEntry();
        }
    }

    public final synchronized List<dnwi> a(long j, long j2) {
        if (!this.b.isEmpty() && this.b.firstKey().longValue() >= j) {
            dccx F = dcdc.F();
            Long l = Long.MAX_VALUE;
            for (Map.Entry<Long, dnwi> entry : this.b.entrySet()) {
                if (entry.getKey().longValue() >= j && l.longValue() - entry.getKey().longValue() >= j2) {
                    F.g(entry.getValue());
                    l = entry.getKey();
                }
            }
            return F.f();
        }
        return dcdc.e();
    }

    @Override // defpackage.btni
    public final synchronized int b(float f) {
        int ceil;
        ceil = (int) Math.ceil(f * this.b.size());
        g(ceil);
        return ceil;
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        return null;
    }

    public final synchronized void d(ContextData contextData) {
        if (contextData.e() == null || this.b.containsKey(Long.valueOf(contextData.e().b()))) {
            return;
        }
        if (this.b.isEmpty()) {
            new Date(contextData.e().b());
        }
        dnwh bZ = dnwi.c.bZ();
        dspd x = dspd.x(contextData.c());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnwi dnwiVar = (dnwi) bZ.b;
        x.getClass();
        dnwiVar.a |= 1;
        dnwiVar.b = x;
        this.b.put(Long.valueOf(contextData.e().b()), bZ.bK());
        f();
    }

    public final synchronized void e() {
        this.b.clear();
    }
}
