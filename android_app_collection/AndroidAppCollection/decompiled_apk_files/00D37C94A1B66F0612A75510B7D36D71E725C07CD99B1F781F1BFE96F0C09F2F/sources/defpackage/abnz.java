package defpackage;
/* compiled from: PG */
/* renamed from: abnz  reason: default package */
/* loaded from: classes.dex */
public final class abnz implements ajyi {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final ajsa f = new ajqw();

    public abnz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    private static void b(ajsa ajsaVar, Class cls, azqb azqbVar) {
        ajsaVar.f(cls, new ajsc(azqbVar));
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (assn.class.isAssignableFrom(cls)) {
            b(this.f, asrw.class, this.a);
            b(this.f, asqz.class, this.b);
            b(this.f, asra.class, this.c);
            b(this.f, asrx.class, this.d);
            b(this.f, ajhh.class, this.e);
        }
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.f;
    }
}
