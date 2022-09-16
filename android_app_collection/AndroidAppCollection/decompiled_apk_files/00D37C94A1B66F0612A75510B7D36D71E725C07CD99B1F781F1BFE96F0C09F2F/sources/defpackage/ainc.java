package defpackage;
/* compiled from: PG */
/* renamed from: ainc  reason: default package */
/* loaded from: classes.dex */
public final class ainc implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public ainc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static ainc b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new ainc(azqbVar, azqbVar2, azqbVar3);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final ainb get() {
        return new ainb(this.a, this.b, this.c);
    }
}
