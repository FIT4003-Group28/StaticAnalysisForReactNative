package defpackage;
/* compiled from: PG */
/* renamed from: aabd  reason: default package */
/* loaded from: classes.dex */
public final class aabd implements axou {
    private final azqb a;
    private final azqb b;

    public aabd(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static aabd b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new aabd(azqbVar, azqbVar3);
    }

    public static yqw c(aaay aaayVar, azqb azqbVar) {
        boolean z = aaayVar.f;
        yqw yqwVar = (yqw) azqbVar.get();
        axzl.o(yqwVar);
        return yqwVar;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final yqw get() {
        return c((aaay) ((axov) this.a).a, this.b);
    }
}
