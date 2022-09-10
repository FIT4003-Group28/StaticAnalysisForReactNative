package defpackage;
/* compiled from: PG */
/* renamed from: aopz  reason: default package */
/* loaded from: classes2.dex */
final class aopz implements anpr {
    final /* synthetic */ aoqb a;

    public aopz(aoqb aoqbVar) {
        this.a = aoqbVar;
    }

    @Override // defpackage.anpr
    public final void a(ilo iloVar, int i) {
        aoqb aoqbVar = this.a;
        dnql bZ = dnqm.c.bZ();
        dnqn bZ2 = dnqo.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqo dnqoVar = (dnqo) bZ2.b;
        dnqoVar.a |= 1;
        dnqoVar.b = i;
        dnqo bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqm dnqmVar = (dnqm) bZ.b;
        bK.getClass();
        dnqmVar.b = bK;
        dnqmVar.a = 1;
        aoqbVar.v(iloVar, bZ.bK());
    }
}
