package defpackage;
/* compiled from: PG */
/* renamed from: fdm  reason: default package */
/* loaded from: classes6.dex */
final class fdm<T> implements dzsj<T> {
    final /* synthetic */ fdn a;
    private final int b;

    public fdm(fdn fdnVar, int i) {
        this.a = fdnVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fdn fdnVar = this.a;
            return (T) new bnfb(fdnVar.a.lk(), fdnVar.a.l());
        } else if (i != 1) {
            fdn fdnVar2 = this.a;
            return (T) new bgpu(fdnVar2.a.eW.il(), fdnVar2.a.l(), fdnVar2.a.eW.mK(), fdnVar2.a.tX(), fdnVar2.a.tY(), fdnVar2.a.tZ(), fdnVar2.a.lk());
        } else {
            fdn fdnVar3 = this.a;
            ftt fttVar = fdnVar3.a;
            return (T) new bnfe(fttVar.eV, dxjh.c(fttVar.oQ()), dxjh.c(fdnVar3.a.m()), fdnVar3.a.eW.V());
        }
    }
}
