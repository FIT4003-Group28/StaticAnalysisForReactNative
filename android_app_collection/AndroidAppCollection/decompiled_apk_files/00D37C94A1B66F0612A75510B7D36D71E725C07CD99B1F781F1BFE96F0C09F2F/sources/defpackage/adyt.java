package defpackage;
/* compiled from: PG */
/* renamed from: adyt  reason: default package */
/* loaded from: classes.dex */
public final class adyt extends yjg {
    private final aepl a;
    private final axnm c;
    private final adww d;
    private final afhf e;
    private final azqb f;
    private final axxl g;

    public adyt(aepl aeplVar, axnm axnmVar, adww adwwVar, azqb azqbVar, afhf afhfVar, axxl axxlVar) {
        this.a = aeplVar;
        this.c = axnmVar;
        this.d = adwwVar;
        this.f = azqbVar;
        this.e = afhfVar;
        this.g = axxlVar;
    }

    @Override // defpackage.yjg
    protected final void a() {
        Boolean bool;
        this.a.n();
        afig afigVar = (afig) this.c.get();
        ((afia) afigVar.a.get()).a();
        afigVar.e();
        adww adwwVar = this.d;
        adwwVar.a.i(adwwVar);
        adwwVar.b.g(adwwVar);
        aqxe aqxeVar = this.g.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45358005L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45358005L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45358005L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            this.e.b().get();
        }
        ((amqo) this.f.get()).get();
    }
}
