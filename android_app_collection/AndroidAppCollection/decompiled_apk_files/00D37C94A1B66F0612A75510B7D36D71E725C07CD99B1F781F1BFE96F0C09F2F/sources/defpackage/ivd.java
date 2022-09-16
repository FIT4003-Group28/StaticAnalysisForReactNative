package defpackage;
/* compiled from: PG */
/* renamed from: ivd  reason: default package */
/* loaded from: classes3.dex */
public final class ivd implements ajyi {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final ajsa d = new ajqw();

    public ivd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    private static void b(ajsa ajsaVar, Class cls, azqb azqbVar) {
        ajsaVar.f(cls, new ajsc(azqbVar));
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (asrm.class.isAssignableFrom(cls)) {
            b(this.d, asrm.class, this.a);
        }
        if (asqj.class.isAssignableFrom(cls)) {
            b(this.d, asqj.class, this.b);
        }
        if (assi.class.isAssignableFrom(cls)) {
            b(this.d, assi.class, this.c);
        }
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.d;
    }
}
