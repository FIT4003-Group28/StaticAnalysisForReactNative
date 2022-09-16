package defpackage;
/* compiled from: PG */
/* renamed from: akcl  reason: default package */
/* loaded from: classes.dex */
public final class akcl implements ajyi {
    private final azqb a;
    private final azqb b;
    private final ajsa c = new ajqw();
    private final /* synthetic */ int d;

    public akcl(azqb azqbVar, azqb azqbVar2, int i) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    private static void b(ajsa ajsaVar, Class cls, azqb azqbVar) {
        ajsaVar.f(cls, new ajsc(azqbVar));
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.d != 0 ? this.c : this.c;
    }

    public akcl(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (this.d == 0) {
            if (!akcd.class.isAssignableFrom(cls)) {
                return;
            }
            this.c.f(aquq.class, new ajsc(this.a));
            this.c.f(aqut.class, new ajsc(this.b));
        } else if (!assn.class.isAssignableFrom(cls)) {
        } else {
            b(this.c, asrf.class, this.b);
            b(this.c, ajhh.class, this.a);
        }
    }
}
