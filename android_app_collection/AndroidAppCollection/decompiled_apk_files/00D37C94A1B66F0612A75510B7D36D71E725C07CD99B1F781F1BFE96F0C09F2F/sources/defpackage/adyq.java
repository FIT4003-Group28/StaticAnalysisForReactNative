package defpackage;
/* compiled from: PG */
/* renamed from: adyq  reason: default package */
/* loaded from: classes.dex */
public final class adyq implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public adyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public static adyq a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adyq(azqbVar, azqbVar2, azqbVar3);
    }

    public static amqo c(final afjz afjzVar, final afhy afhyVar, final afhw afhwVar) {
        return new amqo() { // from class: adyc
            @Override // defpackage.amqo
            public final Object get() {
                return afjz.this.r().h ? afhyVar : afhwVar;
            }
        };
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final amqo get() {
        return c((afjz) this.a.get(), (afhy) this.b.get(), (afhw) this.c.get());
    }
}
