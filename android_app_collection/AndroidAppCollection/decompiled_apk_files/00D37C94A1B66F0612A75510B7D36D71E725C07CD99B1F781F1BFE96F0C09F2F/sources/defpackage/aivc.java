package defpackage;
/* compiled from: PG */
/* renamed from: aivc  reason: default package */
/* loaded from: classes.dex */
public final class aivc implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public aivc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static aivc b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new aivc(azqbVar, azqbVar2, azqbVar3);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aivb get() {
        return new aivb(this.a, this.b, this.c);
    }
}
