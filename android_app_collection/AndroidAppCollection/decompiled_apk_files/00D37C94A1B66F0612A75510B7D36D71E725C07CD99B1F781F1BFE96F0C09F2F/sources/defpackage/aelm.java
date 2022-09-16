package defpackage;
/* compiled from: PG */
/* renamed from: aelm  reason: default package */
/* loaded from: classes.dex */
public final class aelm implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;

    public aelm(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
        this.j = azqbVar10;
    }

    public static aelm b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new aelm(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10);
    }

    public static aell c(aeai aeaiVar, aelf aelfVar, afex afexVar, aant aantVar, yrj yrjVar, afjz afjzVar, azqb azqbVar, aemv aemvVar, String str, ankw ankwVar) {
        return new aell(aeaiVar, aelfVar, afexVar, aantVar, yrjVar, afjzVar, azqbVar, str, ankwVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aell get() {
        return c((aeai) this.a.get(), ((aelg) this.b).get(), (afex) this.c.get(), (aant) this.d.get(), (yrj) this.e.get(), (afjz) this.f.get(), this.g, ((aemw) this.h).get(), (String) this.i.get(), (ankw) this.j.get());
    }
}
