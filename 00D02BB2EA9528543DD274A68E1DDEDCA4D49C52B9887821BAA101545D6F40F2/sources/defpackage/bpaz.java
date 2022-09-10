package defpackage;
/* compiled from: PG */
/* renamed from: bpaz  reason: default package */
/* loaded from: classes3.dex */
public final class bpaz<T> extends btrh<T> {
    public bpaz(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bpaw bpawVar = (bpaw) this.a;
        alho alhoVar = (alho) obj;
        if (!bpawVar.a.aD) {
            return;
        }
        alaq alaqVar = alhoVar.a;
        if (!(alaqVar instanceof alap)) {
            return;
        }
        alap alapVar = (alap) alaqVar;
        if (alapVar.j && !akqi.d(alapVar.g)) {
            return;
        }
        bpax bpaxVar = bpawVar.a;
        ily ilyVar = new ily();
        ilyVar.i(alapVar);
        ilyVar.f = false;
        ilyVar.D();
        bpaxVar.ag = ilyVar.d();
        akqq S = alhoVar.a.l().S();
        bpax bpaxVar2 = bpawVar.a;
        bpaxVar2.ak = bpaxVar2.aq.i(akpp.o(S), true);
        bpax bpaxVar3 = bpawVar.a;
        bpaxVar3.bF(bpaxVar3.ag);
    }
}
