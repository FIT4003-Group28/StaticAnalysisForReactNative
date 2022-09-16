package defpackage;
/* compiled from: PG */
/* renamed from: aiun  reason: default package */
/* loaded from: classes.dex */
public final class aiun implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;

    public aiun(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
    }

    public static aiun b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new aiun(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aium get() {
        return new aium(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
