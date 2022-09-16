package defpackage;
/* compiled from: PG */
/* renamed from: ajnl  reason: default package */
/* loaded from: classes.dex */
public final class ajnl implements axou {
    private final azqb a;

    public ajnl(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static ajnl a(azqb azqbVar) {
        return new ajnl(azqbVar);
    }

    public static apfc c(yme ymeVar) {
        apfc b = ymeVar.b();
        axzl.o(b);
        return b;
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final apfc get() {
        return c((yme) this.a.get());
    }
}
