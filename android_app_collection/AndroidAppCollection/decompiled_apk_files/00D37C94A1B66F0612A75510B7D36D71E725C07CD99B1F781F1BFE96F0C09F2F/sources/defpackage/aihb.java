package defpackage;
/* compiled from: PG */
/* renamed from: aihb  reason: default package */
/* loaded from: classes.dex */
public final class aihb implements axou {
    private final azqb a;
    private final azqb b;

    public aihb(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static aihb b(azqb azqbVar, azqb azqbVar2) {
        return new aihb(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aiha get() {
        return new aiha(this.a, this.b);
    }
}
