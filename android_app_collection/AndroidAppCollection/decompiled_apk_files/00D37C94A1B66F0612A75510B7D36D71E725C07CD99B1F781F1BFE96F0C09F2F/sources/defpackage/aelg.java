package defpackage;
/* compiled from: PG */
/* renamed from: aelg  reason: default package */
/* loaded from: classes.dex */
public final class aelg implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;

    public aelg(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
    }

    public static aelg b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new aelg(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8);
    }

    public static aelf c(aeha aehaVar, aepf aepfVar, yrj yrjVar, adzz adzzVar, afmw afmwVar, aadd aaddVar, aegt aegtVar, afjz afjzVar) {
        return new aelf(aehaVar, aepfVar, yrjVar, adzzVar, afmwVar, aaddVar, aegtVar, afjzVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aelf get() {
        return c(((aehb) this.a).get(), (aepf) this.b.get(), (yrj) this.c.get(), (adzz) this.d.get(), ((ahdy) this.e).get(), (aadd) this.f.get(), (aegt) this.g.get(), (afjz) this.h.get());
    }
}
