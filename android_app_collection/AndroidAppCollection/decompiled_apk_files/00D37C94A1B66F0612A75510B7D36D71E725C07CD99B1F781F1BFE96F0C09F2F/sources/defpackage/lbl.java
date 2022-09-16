package defpackage;
/* compiled from: PG */
/* renamed from: lbl  reason: default package */
/* loaded from: classes3.dex */
public final class lbl {
    private final azqb a;
    private final azqb b;
    private final afvn c;

    public lbl(azqb azqbVar, azqb azqbVar2, afvn afvnVar) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        afvnVar.getClass();
        this.c = afvnVar;
    }

    public final akib a() {
        if (b()) {
            return (akib) this.a.get();
        }
        return (akib) this.b.get();
    }

    public final boolean b() {
        return !this.c.t();
    }
}
