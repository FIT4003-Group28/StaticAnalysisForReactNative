package defpackage;
/* compiled from: PG */
/* renamed from: ahec  reason: default package */
/* loaded from: classes.dex */
public final class ahec implements axou {
    private final azqb a;
    private final azqb b;

    public ahec(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static ahec b(azqb azqbVar, azqb azqbVar2) {
        return new ahec(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aenl get() {
        return ahfa.b((ahfm) ((axov) this.a).a, (aenk) this.b.get());
    }
}
