package defpackage;
/* compiled from: PG */
/* renamed from: afha  reason: default package */
/* loaded from: classes.dex */
public final class afha implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public afha(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static afha b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new afha(azqbVar, azqbVar2, azqbVar3);
    }

    public static afgz c(afjz afjzVar, yrj yrjVar, snc sncVar) {
        return new afgz(afjzVar, yrjVar, sncVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final afgz get() {
        return c((afjz) this.a.get(), (yrj) this.b.get(), (snc) this.c.get());
    }
}
