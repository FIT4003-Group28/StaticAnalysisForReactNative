package defpackage;
/* compiled from: PG */
/* renamed from: fep  reason: default package */
/* loaded from: classes6.dex */
final class fep<T> implements dzsj<T> {
    final /* synthetic */ feq a;
    private final int b;

    public fep(feq feqVar, int i) {
        this.a = feqVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [T, buzx] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, bulj] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            feq feqVar = this.a;
            T t = (T) feqVar.b;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(feqVar.a.eW.h());
            bvrb tn = feqVar.a.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) new bulj(new buli(c, tn));
            feqVar.b = r1;
            return r1;
        } else if (i != 1) {
            feq feqVar2 = this.a;
            return (T) bdge.b(feqVar2.a.eW.m(), feqVar2.a.eW.ba(), dxjh.c(feqVar2.a.eW.iW()), feqVar2.a.eW.V());
        } else {
            feq feqVar3 = this.a;
            T t2 = (T) feqVar3.c;
            if (t2 != null) {
                return t2;
            }
            dxio c2 = dxjc.c(feqVar3.a.eW.h());
            bvrb tn2 = feqVar3.a.eW.a.tn();
            dxjg.e(tn2);
            ?? r12 = (T) new buzx(new buzw(c2, tn2));
            feqVar3.c = r12;
            return r12;
        }
    }
}
