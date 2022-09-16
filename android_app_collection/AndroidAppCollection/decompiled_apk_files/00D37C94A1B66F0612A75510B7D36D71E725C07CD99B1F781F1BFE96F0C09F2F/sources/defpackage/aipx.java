package defpackage;
/* compiled from: PG */
/* renamed from: aipx  reason: default package */
/* loaded from: classes.dex */
public final class aipx implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;

    public aipx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public static aipx b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aipx(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aipw get() {
        return new aipw(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
