package defpackage;
/* compiled from: PG */
/* renamed from: aflv  reason: default package */
/* loaded from: classes.dex */
public final class aflv implements axou {
    private final azqb a;

    public aflv(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static aflv b(azqb azqbVar) {
        return new aflv(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aflu get() {
        return new aflu(this.a);
    }
}
