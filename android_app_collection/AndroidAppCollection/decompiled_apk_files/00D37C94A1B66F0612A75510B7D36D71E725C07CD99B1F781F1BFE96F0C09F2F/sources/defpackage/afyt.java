package defpackage;
/* compiled from: PG */
/* renamed from: afyt  reason: default package */
/* loaded from: classes.dex */
public final class afyt implements axou {
    private final azqb a;
    private final azqb b;

    public afyt(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static afyt b(azqb azqbVar, azqb azqbVar2) {
        return new afyt(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final afys get() {
        return new afys(this.a, this.b);
    }
}
