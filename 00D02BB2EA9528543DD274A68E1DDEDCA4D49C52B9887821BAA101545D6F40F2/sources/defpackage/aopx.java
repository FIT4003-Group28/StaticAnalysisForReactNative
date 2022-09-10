package defpackage;
/* compiled from: PG */
/* renamed from: aopx  reason: default package */
/* loaded from: classes2.dex */
public final class aopx implements anqu {
    final /* synthetic */ aoqb a;

    public aopx(aoqb aoqbVar) {
        this.a = aoqbVar;
    }

    @Override // defpackage.anqu
    public final void a(dcdc<dvas> dcdcVar) {
        aoqb aoqbVar = this.a;
        aopz aopzVar = new aopz(aoqbVar);
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            F.g(anps.i(dcdcVar.get(i), aopzVar, i2));
            i++;
            i2++;
        }
        aoqbVar.d = F.f();
        cqkx.p(this.a);
    }

    @Override // defpackage.anqu
    public final void b() {
        cqkx.p(this.a);
    }
}
