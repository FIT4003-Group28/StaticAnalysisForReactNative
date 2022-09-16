package defpackage;
/* compiled from: PG */
/* renamed from: aini  reason: default package */
/* loaded from: classes.dex */
public final class aini implements axou {
    private final azqb a;
    private final azqb b;

    public aini(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static aini b(azqb azqbVar, azqb azqbVar2) {
        return new aini(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final ainh get() {
        return new ainh(this.a, this.b);
    }
}
