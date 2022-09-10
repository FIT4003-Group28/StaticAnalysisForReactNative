package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: buig  reason: default package */
/* loaded from: classes4.dex */
public final class buig implements buae<String> {
    private static final buab<String> a = buab.c("ZwiebackCookieRequirementSatisfied", Boolean.TRUE.toString());
    private static final buab<String> b = buab.c("ZwiebackCookieRequirementSatisfied", Boolean.FALSE.toString());
    private final btto d;
    private final List<deig<buab<String>>> c = new ArrayList();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicInteger f = new AtomicInteger(0);

    public buig(btto bttoVar) {
        this.d = bttoVar;
    }

    @Override // defpackage.buae
    public final synchronized dehn<buab<String>> a() {
        deig<buab<String>> d;
        d = deig.d();
        buab<String> b2 = b();
        if (Boolean.parseBoolean((String) ((buaa) b2).a)) {
            this.f.incrementAndGet();
            d.j(b2);
        } else {
            this.c.add(d);
        }
        return d;
    }

    public final synchronized buab<String> b() {
        if (!this.e.getAndSet(true)) {
            this.d.a();
        }
        if (!this.d.b() && this.f.get() != 0) {
            return b;
        }
        return a;
    }

    public final synchronized void c() {
        this.f.decrementAndGet();
        if (this.d.b()) {
            for (deig<buab<String>> deigVar : this.c) {
                deigVar.j(a);
                this.f.incrementAndGet();
            }
            this.c.clear();
        } else if (!this.c.isEmpty()) {
            this.c.get(0).j(a);
            this.c.remove(0);
            this.f.incrementAndGet();
        }
    }
}
