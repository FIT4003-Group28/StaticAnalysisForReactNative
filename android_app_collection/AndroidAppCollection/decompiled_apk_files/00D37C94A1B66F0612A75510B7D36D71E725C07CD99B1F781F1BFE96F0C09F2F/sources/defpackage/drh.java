package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: drh  reason: default package */
/* loaded from: classes3.dex */
public final class drh extends drf {
    public drh() {
        this.a.add(drr.EQUALS);
        this.a.add(drr.GREATER_THAN);
        this.a.add(drr.GREATER_THAN_EQUALS);
        this.a.add(drr.IDENTITY_EQUALS);
        this.a.add(drr.IDENTITY_NOT_EQUALS);
        this.a.add(drr.LESS_THAN);
        this.a.add(drr.LESS_THAN_EQUALS);
        this.a.add(drr.NOT_EQUALS);
    }

    private static boolean c(dqz dqzVar, dqz dqzVar2) {
        if (dqzVar.getClass().equals(dqzVar2.getClass())) {
            if ((dqzVar instanceof drd) || (dqzVar instanceof dqx)) {
                return true;
            }
            if (dqzVar instanceof dqr) {
                if (!Double.isNaN(dqzVar.h().doubleValue()) && !Double.isNaN(dqzVar2.h().doubleValue())) {
                    return dqzVar.h().equals(dqzVar2.h());
                }
                return false;
            } else if (dqzVar instanceof drc) {
                return dqzVar.i().equals(dqzVar2.i());
            } else {
                if (dqzVar instanceof dqp) {
                    return dqzVar.g().equals(dqzVar2.g());
                }
                return dqzVar == dqzVar2;
            }
        } else if (((dqzVar instanceof drd) || (dqzVar instanceof dqx)) && ((dqzVar2 instanceof drd) || (dqzVar2 instanceof dqx))) {
            return true;
        } else {
            boolean z = dqzVar instanceof dqr;
            if (!z || !(dqzVar2 instanceof drc)) {
                boolean z2 = dqzVar instanceof drc;
                if (!z2 || !(dqzVar2 instanceof dqr)) {
                    if (dqzVar instanceof dqp) {
                        return c(new dqr(dqzVar.h()), dqzVar2);
                    }
                    if (dqzVar2 instanceof dqp) {
                        return c(dqzVar, new dqr(dqzVar2.h()));
                    }
                    if ((!z2 && !z) || !(dqzVar2 instanceof dqv)) {
                        if ((dqzVar instanceof dqv) && ((dqzVar2 instanceof drc) || (dqzVar2 instanceof dqr))) {
                            return c(new drc(dqzVar.i()), dqzVar2);
                        }
                        return false;
                    }
                    return c(dqzVar, new drc(dqzVar2.i()));
                }
                return c(new dqr(dqzVar.h()), dqzVar2);
            }
            return c(dqzVar, new dqr(dqzVar2.h()));
        }
    }

    private static boolean d(dqz dqzVar, dqz dqzVar2) {
        if (dqzVar instanceof dqv) {
            dqzVar = new drc(dqzVar.i());
        }
        if (dqzVar2 instanceof dqv) {
            dqzVar2 = new drc(dqzVar2.i());
        }
        if ((dqzVar instanceof drc) && (dqzVar2 instanceof drc)) {
            return dqzVar.i().compareTo(dqzVar2.i()) < 0;
        }
        double doubleValue = dqzVar.h().doubleValue();
        double doubleValue2 = dqzVar2.h().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    private static boolean e(dqz dqzVar, dqz dqzVar2) {
        if (dqzVar instanceof dqv) {
            dqzVar = new drc(dqzVar.i());
        }
        if (dqzVar2 instanceof dqv) {
            dqzVar2 = new drc(dqzVar2.i());
        }
        return (((dqzVar instanceof drc) && (dqzVar2 instanceof drc)) || (!Double.isNaN(dqzVar.h().doubleValue()) && !Double.isNaN(dqzVar2.h().doubleValue()))) && !d(dqzVar2, dqzVar);
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        boolean c;
        boolean c2;
        dqt.k(dqt.h(str), 2, list);
        dqz b = dpuVar.b((dqz) list.get(0));
        dqz b2 = dpuVar.b((dqz) list.get(1));
        drr drrVar = drr.ADD;
        int ordinal = dqt.h(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c2 = c(b, b2);
            } else if (ordinal == 42) {
                c = d(b, b2);
            } else if (ordinal == 43) {
                c = e(b, b2);
            } else {
                switch (ordinal) {
                    case 37:
                        c = d(b2, b);
                        break;
                    case 38:
                        c = e(b2, b);
                        break;
                    case 39:
                        c = dqt.q(b, b2);
                        break;
                    case 40:
                        c2 = dqt.q(b, b2);
                        break;
                    default:
                        return super.b(str);
                }
            }
            c = !c2;
        } else {
            c = c(b, b2);
        }
        return c ? dqz.k : dqz.l;
    }
}
