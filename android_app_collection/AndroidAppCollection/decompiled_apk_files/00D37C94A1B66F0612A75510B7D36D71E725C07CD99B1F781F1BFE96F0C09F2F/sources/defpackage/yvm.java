package defpackage;
/* compiled from: PG */
/* renamed from: yvm  reason: default package */
/* loaded from: classes4.dex */
public final class yvm implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public yvm(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static yvm b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new yvm(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final yvl get() {
        return new yvl(this.a, this.b, this.c, this.d);
    }
}
