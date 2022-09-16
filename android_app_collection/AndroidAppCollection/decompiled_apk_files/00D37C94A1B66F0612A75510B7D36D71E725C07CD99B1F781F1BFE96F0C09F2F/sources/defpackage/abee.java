package defpackage;
/* compiled from: PG */
/* renamed from: abee  reason: default package */
/* loaded from: classes.dex */
public final class abee implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public abee(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static abee b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new abee(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final abdz get() {
        return new abdz((aaqj) this.a.get(), (ampq) ((axov) this.b).a, this.c, ((aabc) this.d).get());
    }
}
