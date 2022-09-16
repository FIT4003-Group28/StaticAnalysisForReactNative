package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dre  reason: default package */
/* loaded from: classes3.dex */
public final class dre extends drf {
    public dre() {
        this.a.add(drr.BITWISE_AND);
        this.a.add(drr.BITWISE_LEFT_SHIFT);
        this.a.add(drr.BITWISE_NOT);
        this.a.add(drr.BITWISE_OR);
        this.a.add(drr.BITWISE_RIGHT_SHIFT);
        this.a.add(drr.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(drr.BITWISE_XOR);
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        drr drrVar = drr.ADD;
        switch (dqt.h(str).ordinal()) {
            case 4:
                dqt.k(drr.BITWISE_AND, 2, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) & dqt.f(dpuVar.b((dqz) list.get(1)).h().doubleValue())));
            case 5:
                dqt.k(drr.BITWISE_LEFT_SHIFT, 2, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) << ((int) (dqt.g(dpuVar.b((dqz) list.get(1)).h().doubleValue()) & 31))));
            case 6:
                dqt.k(drr.BITWISE_NOT, 1, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) ^ (-1)));
            case 7:
                dqt.k(drr.BITWISE_OR, 2, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) | dqt.f(dpuVar.b((dqz) list.get(1)).h().doubleValue())));
            case 8:
                dqt.k(drr.BITWISE_RIGHT_SHIFT, 2, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) >> ((int) (dqt.g(dpuVar.b((dqz) list.get(1)).h().doubleValue()) & 31))));
            case 9:
                dqt.k(drr.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new dqr(Double.valueOf(dqt.g(dpuVar.b((dqz) list.get(0)).h().doubleValue()) >>> ((int) (dqt.g(dpuVar.b((dqz) list.get(1)).h().doubleValue()) & 31))));
            case 10:
                dqt.k(drr.BITWISE_XOR, 2, list);
                return new dqr(Double.valueOf(dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue()) ^ dqt.f(dpuVar.b((dqz) list.get(1)).h().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
