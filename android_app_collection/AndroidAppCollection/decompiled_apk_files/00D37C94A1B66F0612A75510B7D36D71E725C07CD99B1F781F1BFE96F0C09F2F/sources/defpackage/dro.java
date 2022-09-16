package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dro  reason: default package */
/* loaded from: classes3.dex */
public final class dro extends drf {
    /* JADX INFO: Access modifiers changed from: protected */
    public dro() {
        this.a.add(drr.ADD);
        this.a.add(drr.DIVIDE);
        this.a.add(drr.MODULUS);
        this.a.add(drr.MULTIPLY);
        this.a.add(drr.NEGATE);
        this.a.add(drr.POST_DECREMENT);
        this.a.add(drr.POST_INCREMENT);
        this.a.add(drr.PRE_DECREMENT);
        this.a.add(drr.PRE_INCREMENT);
        this.a.add(drr.SUBTRACT);
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        drr drrVar = drr.ADD;
        int ordinal = dqt.h(str).ordinal();
        if (ordinal == 0) {
            dqt.k(drr.ADD, 2, list);
            dqz b = dpuVar.b((dqz) list.get(0));
            dqz b2 = dpuVar.b((dqz) list.get(1));
            if ((b instanceof dqv) || (b instanceof drc) || (b2 instanceof dqv) || (b2 instanceof drc)) {
                String valueOf = String.valueOf(b.i());
                String valueOf2 = String.valueOf(b2.i());
                return new drc(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new dqr(Double.valueOf(b.h().doubleValue() + b2.h().doubleValue()));
        } else if (ordinal == 21) {
            dqt.k(drr.DIVIDE, 2, list);
            return new dqr(Double.valueOf(dpuVar.b((dqz) list.get(0)).h().doubleValue() / dpuVar.b((dqz) list.get(1)).h().doubleValue()));
        } else if (ordinal == 59) {
            dqt.k(drr.SUBTRACT, 2, list);
            return new dqr(Double.valueOf(dpuVar.b((dqz) list.get(0)).h().doubleValue() + new dqr(Double.valueOf(-dpuVar.b((dqz) list.get(1)).h().doubleValue())).a.doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            dqt.l(str, 2, list);
            dqz b3 = dpuVar.b((dqz) list.get(0));
            dpuVar.b((dqz) list.get(1));
            return b3;
        } else if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    dqt.k(drr.MODULUS, 2, list);
                    return new dqr(Double.valueOf(dpuVar.b((dqz) list.get(0)).h().doubleValue() % dpuVar.b((dqz) list.get(1)).h().doubleValue()));
                case 45:
                    dqt.k(drr.MULTIPLY, 2, list);
                    return new dqr(Double.valueOf(dpuVar.b((dqz) list.get(0)).h().doubleValue() * dpuVar.b((dqz) list.get(1)).h().doubleValue()));
                case 46:
                    dqt.k(drr.NEGATE, 1, list);
                    return new dqr(Double.valueOf(-dpuVar.b((dqz) list.get(0)).h().doubleValue()));
                default:
                    return super.b(str);
            }
        } else {
            dqt.l(str, 1, list);
            return dpuVar.b((dqz) list.get(0));
        }
    }
}
