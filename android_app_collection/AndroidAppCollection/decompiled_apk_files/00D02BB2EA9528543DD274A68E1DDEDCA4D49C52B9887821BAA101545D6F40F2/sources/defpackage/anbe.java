package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anbe  reason: default package */
/* loaded from: classes2.dex */
public final class anbe {
    private final Map<Integer, Long> a = new HashMap();
    private final btvt b;
    private final cqat c;

    public anbe(btvt btvtVar, cqat cqatVar) {
        this.b = btvtVar;
        this.c = cqatVar;
    }

    public final void a(int i) {
        Long l;
        long b = this.c.b();
        Map<Integer, Long> map = this.a;
        Integer valueOf = Integer.valueOf(i);
        long j = Long.MAX_VALUE;
        if (map.containsKey(valueOf) && (l = this.a.get(valueOf)) != null) {
            j = b - l.longValue();
        }
        if (j > TimeUnit.HOURS.toMillis(12L)) {
            this.b.a(decj.a(i));
            this.a.put(valueOf, Long.valueOf(b));
        }
    }
}
