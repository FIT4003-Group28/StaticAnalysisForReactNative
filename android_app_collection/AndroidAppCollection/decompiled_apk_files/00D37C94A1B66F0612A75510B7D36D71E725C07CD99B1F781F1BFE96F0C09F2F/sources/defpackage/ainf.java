package defpackage;
/* compiled from: PG */
/* renamed from: ainf  reason: default package */
/* loaded from: classes.dex */
public final class ainf implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public ainf(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static ainf b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainf(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aine get() {
        return new aine(this.a, this.b, this.c, this.d);
    }
}
