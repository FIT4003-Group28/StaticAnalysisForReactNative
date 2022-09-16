package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aimo  reason: default package */
/* loaded from: classes.dex */
public final class aimo implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;

    public aimo(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
    }

    public static aimo b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new aimo(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9);
    }

    public static aimn c(yni yniVar, aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, aimy aimyVar, Set set, abec abecVar, aadd aaddVar, aenl aenlVar) {
        return new aimn(yniVar, aaqjVar, aaqfVar, afvnVar, aimyVar, set, abecVar, aaddVar, aenlVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aimn get() {
        return c((yni) this.a.get(), (aaqj) this.b.get(), (aaqf) this.c.get(), (afvn) this.d.get(), (aimy) this.e.get(), ((axpa) this.f).get(), (abec) this.g.get(), (aadd) this.h.get(), ((ahec) this.i).get());
    }
}
