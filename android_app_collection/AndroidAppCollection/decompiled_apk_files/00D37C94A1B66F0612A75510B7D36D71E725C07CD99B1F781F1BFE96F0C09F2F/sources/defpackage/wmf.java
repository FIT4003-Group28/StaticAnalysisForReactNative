package defpackage;
/* compiled from: PG */
/* renamed from: wmf  reason: default package */
/* loaded from: classes4.dex */
public final class wmf implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public wmf(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public static wme b(azqb azqbVar, aiji aijiVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new wme(azqbVar, aijiVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static wmf c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new wmf(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final wme get() {
        return b(this.a, (aiji) this.b.get(), this.c, this.d, this.e);
    }
}
