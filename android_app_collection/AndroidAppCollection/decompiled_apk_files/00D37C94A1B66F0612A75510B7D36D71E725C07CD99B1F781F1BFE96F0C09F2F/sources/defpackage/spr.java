package defpackage;
/* compiled from: PG */
/* renamed from: spr  reason: default package */
/* loaded from: classes4.dex */
public final class spr implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public spr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static spm b(ampq ampqVar, spo spoVar, ampq ampqVar2, ankx ankxVar) {
        return new spm(ampqVar, spoVar, ampqVar2, ankxVar);
    }

    public static spr c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new spr(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final spm get() {
        return b((ampq) ((axov) this.a).a, ((spp) this.b).get(), (ampq) this.c.get(), (ankx) this.d.get());
    }
}
