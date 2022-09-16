package defpackage;
/* compiled from: PG */
/* renamed from: aehb  reason: default package */
/* loaded from: classes.dex */
public final class aehb implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public aehb(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static aehb b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aehb(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aeha get() {
        return new aeha((aegt) this.a.get(), ((ahdy) this.b).get(), (yrj) this.c.get(), (afjz) this.d.get());
    }
}
