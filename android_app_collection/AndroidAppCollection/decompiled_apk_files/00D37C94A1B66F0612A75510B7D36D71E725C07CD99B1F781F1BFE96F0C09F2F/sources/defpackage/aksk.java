package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aksk  reason: default package */
/* loaded from: classes.dex */
public final class aksk {
    private final azqb a;
    private final azqb b;

    public aksk(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public final aksj a(akst akstVar) {
        akstVar.getClass();
        Executor executor = (Executor) this.a.get();
        executor.getClass();
        Executor executor2 = (Executor) this.b.get();
        executor2.getClass();
        return new aksj(akstVar, executor, executor2);
    }
}
