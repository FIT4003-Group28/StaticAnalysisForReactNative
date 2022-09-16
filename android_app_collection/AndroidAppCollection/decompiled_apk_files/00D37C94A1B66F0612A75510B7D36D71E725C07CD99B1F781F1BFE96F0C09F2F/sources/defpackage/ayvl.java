package defpackage;
/* compiled from: PG */
/* renamed from: ayvl  reason: default package */
/* loaded from: classes2.dex */
public final class ayvl extends ayua {
    final ayqb c;
    final ayqb d;
    final aypv e;

    public ayvl(aynx aynxVar, ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        super(aynxVar);
        this.c = ayqbVar;
        this.d = ayqbVar2;
        this.e = aypvVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (bameVar instanceof ayre) {
            this.b.ac(new ayvj((ayre) bameVar, this.c, this.d, this.e));
        } else {
            this.b.ac(new ayvk(bameVar, this.c, this.d, this.e));
        }
    }
}
