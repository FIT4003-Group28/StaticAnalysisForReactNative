package defpackage;
/* compiled from: PG */
/* renamed from: afgw  reason: default package */
/* loaded from: classes.dex */
public final class afgw implements axou {
    private final azqb a;
    private final azqb b;

    public afgw(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static afgv b(amqo amqoVar, axnm axnmVar) {
        return new afgv(amqoVar, axnmVar);
    }

    public static afgw c(azqb azqbVar, azqb azqbVar2) {
        return new afgw(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final afgv get() {
        return b(((wjw) this.a).b(), axot.a(this.b));
    }
}
