package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aels  reason: default package */
/* loaded from: classes.dex */
public final class aels implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public aels(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public static aels b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new aels(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    public static aelq c(snc sncVar, afjz afjzVar, aynx aynxVar, aynx aynxVar2, Executor executor) {
        return new aelq(sncVar, afjzVar, aynxVar, aynxVar2, executor);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aelq get() {
        return c((snc) this.a.get(), (afjz) this.b.get(), (aynx) this.c.get(), (aynx) this.d.get(), (Executor) this.e.get());
    }
}
