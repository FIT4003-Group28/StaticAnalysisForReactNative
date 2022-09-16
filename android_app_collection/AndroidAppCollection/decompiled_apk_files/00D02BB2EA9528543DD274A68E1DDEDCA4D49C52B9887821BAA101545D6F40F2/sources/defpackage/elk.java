package defpackage;
/* compiled from: PG */
/* renamed from: elk  reason: default package */
/* loaded from: classes6.dex */
final class elk<T> implements dzsj<T> {
    final /* synthetic */ ell a;
    private final int b;

    public elk(ell ellVar, int i) {
        this.a = ellVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [buny, T] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                ell ellVar = this.a;
                return (T) new bnxt(ellVar.d.eW.K(), ellVar.d.eW.n(), ellVar.d.eW.nh());
            case 1:
                ell ellVar2 = this.a;
                dzsj dzsjVar = ellVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new elk(ellVar2, 2);
                    ellVar2.a = dzsjVar;
                }
                return (T) new bnxx(dzsjVar);
            case 2:
                ell ellVar3 = this.a;
                T t = (T) ellVar3.e;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(ellVar3.d.eW.h());
                bvrb tn = ellVar3.d.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) buoa.b(bunz.b(c, tn));
                ellVar3.e = r1;
                return r1;
            case 3:
                ell ellVar4 = this.a;
                ftt fttVar = ellVar4.d;
                return (T) new bnyd(fttVar.eV, fttVar.y(), ellVar4.d.fO());
            case 4:
                ell ellVar5 = this.a;
                return (T) new boss(dxjh.c(ellVar5.d.cn()), ellVar5.d.fO());
            case 5:
                ell ellVar6 = this.a;
                dzsj dzsjVar2 = ellVar6.c;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new elk(ellVar6, 6);
                    ellVar6.c = dzsjVar2;
                }
                return (T) new bopp(dzsjVar2, ellVar6.d.eW.il());
            case 6:
                ell ellVar7 = this.a;
                dzsj dzsjVar3 = ellVar7.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new elk(ellVar7, 7);
                    ellVar7.b = dzsjVar3;
                }
                return (T) new bopj(dzsjVar3, ellVar7.d.eW.il());
            default:
                return (T) new bopm(this.a.d.eW.il());
        }
    }
}
