package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aikw  reason: default package */
/* loaded from: classes.dex */
public final class aikw implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;

    public aikw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
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

    public static aikw b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        return new aikw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aiku get() {
        return new aiku(((zez) this.a).get(), (ailf) this.b.get(), (aimr) this.c.get(), ((aimo) this.d).get(), (aiko) this.e.get(), ((aime) this.f).get(), (aadd) this.g.get(), (aiix) this.h.get(), (Executor) this.i.get());
    }
}
