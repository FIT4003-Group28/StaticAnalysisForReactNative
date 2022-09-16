package defpackage;
/* compiled from: PG */
/* renamed from: aida  reason: default package */
/* loaded from: classes.dex */
public final class aida implements axou {
    private final azqb a;
    private final azqb b;

    public aida(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static aida b(azqb azqbVar, azqb azqbVar2) {
        return new aida(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aicz get() {
        return new aicz(this.a, this.b);
    }
}
