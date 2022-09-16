package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dflc  reason: default package */
/* loaded from: classes6.dex */
public abstract class dflc {
    public static final cwsv a = cwsv.a("Earth.timeToARFrame");
    public static final cwsv b = cwsv.a("Earth.timeToTracking");
    public static final cwsv c = cwsv.a("Earth.timeToLocation");
    public static final cwsv d = cwsv.a("Earth.timeToLocalizeRequest");
    public final Map<cwsv, Boolean> e = new HashMap();

    public void a() {
        throw null;
    }

    public abstract void b(cwsv cwsvVar);

    public abstract void c(cwsv cwsvVar);

    public final void d(cwsv cwsvVar) {
        Boolean bool = this.e.get(cwsvVar);
        if (bool != null && !bool.booleanValue()) {
            this.e.put(cwsvVar, true);
            b(cwsvVar);
        }
    }

    public final void e(cwsv cwsvVar) {
        if (this.e.containsKey(cwsvVar)) {
            return;
        }
        this.e.put(cwsvVar, false);
        c(cwsvVar);
    }
}
