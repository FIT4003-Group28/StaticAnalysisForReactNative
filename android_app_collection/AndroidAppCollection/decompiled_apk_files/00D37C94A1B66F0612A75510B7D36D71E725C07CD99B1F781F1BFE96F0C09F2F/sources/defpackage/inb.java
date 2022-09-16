package defpackage;
/* compiled from: PG */
/* renamed from: inb  reason: default package */
/* loaded from: classes3.dex */
public final class inb implements aari {
    public final iox a;
    private final aath b;
    private final azqb c;
    private final aadd e;
    private final azqb f;
    private final ampq g;
    private final aacz h;

    public inb(aath aathVar, iox ioxVar, aacz aaczVar, azqb azqbVar, aadd aaddVar, azqb azqbVar2, ampq ampqVar) {
        aathVar.getClass();
        this.b = aathVar;
        ioxVar.getClass();
        this.a = ioxVar;
        this.h = aaczVar;
        azqbVar.getClass();
        this.c = azqbVar;
        this.e = aaddVar;
        this.f = azqbVar2;
        this.g = ampqVar;
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        aatf a = this.b.a(ajfzVar);
        ite.q(this.c, a, this.h);
        ite.o(a, this.f, this.e);
        if (this.g.h()) {
            ((ydu) this.g.c()).a(a);
        }
        return a;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.b.b(aaqsVar, aarhVar, new ina(this, afzfVar));
    }
}
