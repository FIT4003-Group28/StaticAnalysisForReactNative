package defpackage;
/* compiled from: PG */
/* renamed from: txe  reason: default package */
/* loaded from: classes4.dex */
public final class txe implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public txe(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final txd get() {
        return new txd(((txh) this.a).get(), (trv) this.b.get(), (ampq) this.c.get(), (tqe) this.d.get());
    }
}
