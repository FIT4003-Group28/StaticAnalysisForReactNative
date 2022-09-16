package defpackage;
/* compiled from: PG */
/* renamed from: bpbm  reason: default package */
/* loaded from: classes3.dex */
public final class bpbm<T> extends btrh<T> {
    private final int d;

    public bpbm(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bpbl bpblVar = (bpbl) this.a;
            alho alhoVar = (alho) obj;
            if (!bpblVar.aD) {
                return;
            }
            alaq alaqVar = alhoVar.a;
            if (!(alaqVar instanceof alap)) {
                return;
            }
            if (alhoVar.c == null) {
                bvoo.h("MapPoiClickedEvent did not have clickLocation.", new Object[0]);
                return;
            }
            bpblVar.bL(alhoVar.c.S(), dbsg.j(((alap) alaqVar).g), true);
            return;
        }
        ((bpbl) this.a).bL(((alia) obj).a.S(), dbpy.a, true);
    }
}
