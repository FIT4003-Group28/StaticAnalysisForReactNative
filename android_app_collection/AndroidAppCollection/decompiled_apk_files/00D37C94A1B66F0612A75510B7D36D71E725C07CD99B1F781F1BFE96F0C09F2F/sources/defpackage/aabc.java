package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aabc  reason: default package */
/* loaded from: classes.dex */
public final class aabc implements axou {
    private final azqb a;
    private final azqb b;

    public aabc(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static aabc a(azqb azqbVar, azqb azqbVar2) {
        return new aabc(azqbVar, azqbVar2);
    }

    public static aaoq c(Executor executor, azqb azqbVar) {
        return new aaoq(new aadk(), azqbVar, executor);
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final aaoq get() {
        return c((Executor) this.a.get(), this.b);
    }
}
