package defpackage;
/* compiled from: PG */
/* renamed from: afby  reason: default package */
/* loaded from: classes.dex */
public final class afby implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public afby(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static afby b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new afby(azqbVar, azqbVar2, azqbVar3);
    }

    public static afbq c(yrj yrjVar, afgz afgzVar, afjz afjzVar) {
        return new afbq(yrjVar, afgzVar, afjzVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final afbq get() {
        return c((yrj) this.a.get(), ((afha) this.b).get(), (afjz) this.c.get());
    }
}
