package defpackage;
/* compiled from: PG */
/* renamed from: adys  reason: default package */
/* loaded from: classes.dex */
public final class adys implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public adys(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static aanz b(aant aantVar, aflx aflxVar, afjm afjmVar) {
        aany[] aanyVarArr = {new aegb(afjmVar, aantVar, aflxVar)};
        System.arraycopy(new aany[0], 0, aanyVarArr, 1, 0);
        return new aanz(aanyVarArr);
    }

    public static adys c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adys(azqbVar, azqbVar2, azqbVar3);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aanz get() {
        return b((aant) this.a.get(), (aflx) this.b.get(), (afjm) this.c.get());
    }
}
