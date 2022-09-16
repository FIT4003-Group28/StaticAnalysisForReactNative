package defpackage;
/* compiled from: PG */
/* renamed from: aivg  reason: default package */
/* loaded from: classes.dex */
public final class aivg implements axou {
    private final azqb a;

    public aivg(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static aivg b(azqb azqbVar) {
        return new aivg(azqbVar);
    }

    public static aivf c(tis tisVar) {
        return new aivf(tisVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aivf get() {
        return c((tis) this.a.get());
    }
}
