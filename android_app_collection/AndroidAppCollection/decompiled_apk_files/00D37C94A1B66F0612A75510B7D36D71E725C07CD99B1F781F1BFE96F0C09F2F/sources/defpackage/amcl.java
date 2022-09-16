package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amcl  reason: default package */
/* loaded from: classes.dex */
public final class amcl {
    final boolean a = false;
    public final Executor b;
    private final azqb c;

    public amcl(azqb azqbVar, Executor executor) {
        this.b = executor;
        this.c = azqbVar;
    }

    public final amup a() {
        aqxo.y(true);
        amum h = amup.h();
        for (amcc amccVar : (Set) this.c.get()) {
            aqxo.q(!amccVar.a.isEmpty(), "AccountProvider's account type cannot be an empty string.");
            h.f(amccVar.a, amccVar.b);
        }
        return h.b();
    }
}
