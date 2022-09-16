package defpackage;
/* compiled from: PG */
/* renamed from: opx  reason: default package */
/* loaded from: classes4.dex */
final class opx implements azqb {
    private final azqb a;
    private final /* synthetic */ int b;

    private opx(azqb azqbVar, int i) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public static azqb a(azqb azqbVar) {
        return new opx(azqbVar);
    }

    public static azqb b(azqb azqbVar) {
        return new opx(azqbVar, 1);
    }

    private opx(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b == 0) {
            return ampq.j(this.a.get());
        }
        return ampq.j(this.a.get());
    }
}
