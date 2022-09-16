package defpackage;
/* compiled from: PG */
/* renamed from: ainl  reason: default package */
/* loaded from: classes.dex */
public final class ainl implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public ainl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static ainl b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new ainl(azqbVar, azqbVar2, azqbVar3);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aink get() {
        return new aink(this.a, this.b, this.c);
    }
}
