package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: drq  reason: default package */
/* loaded from: classes3.dex */
public final class drq extends drf {
    /* JADX INFO: Access modifiers changed from: protected */
    public drq() {
        this.a.add(drr.ASSIGN);
        this.a.add(drr.CONST);
        this.a.add(drr.CREATE_ARRAY);
        this.a.add(drr.CREATE_OBJECT);
        this.a.add(drr.EXPRESSION_LIST);
        this.a.add(drr.GET);
        this.a.add(drr.GET_INDEX);
        this.a.add(drr.GET_PROPERTY);
        this.a.add(drr.NULL);
        this.a.add(drr.SET_PROPERTY);
        this.a.add(drr.TYPEOF);
        this.a.add(drr.UNDEFINED);
        this.a.add(drr.VAR);
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        String str2;
        drr drrVar = drr.ADD;
        int ordinal = dqt.h(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            dqt.k(drr.ASSIGN, 2, list);
            dqz b = dpuVar.b((dqz) list.get(0));
            if (!(b instanceof drc)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
            }
            if (!dpuVar.h(b.i())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.i()));
            }
            dqz b2 = dpuVar.b((dqz) list.get(1));
            dpuVar.g(b.i(), b2);
            return b2;
        } else if (ordinal == 14) {
            dqt.m(drr.CONST, 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    dqz b3 = dpuVar.b((dqz) list.get(i2));
                    if (b3 instanceof drc) {
                        dpuVar.f(b3.i(), dpuVar.b((dqz) list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                    }
                }
                return dqz.f;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            dqt.m(drr.EXPRESSION_LIST, 1, list);
            dqz dqzVar = dqz.f;
            while (i < list.size()) {
                dqzVar = dpuVar.b((dqz) list.get(i));
                if (dqzVar instanceof dqq) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return dqzVar;
        } else if (ordinal == 33) {
            dqt.k(drr.GET, 1, list);
            dqz b4 = dpuVar.b((dqz) list.get(0));
            if (!(b4 instanceof drc)) {
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b4.getClass().getCanonicalName()));
            }
            return dpuVar.d(b4.i());
        } else if (ordinal == 49) {
            dqt.k(drr.NULL, 0, list);
            return dqz.g;
        } else if (ordinal == 58) {
            dqt.k(drr.SET_PROPERTY, 3, list);
            dqz b5 = dpuVar.b((dqz) list.get(0));
            dqz b6 = dpuVar.b((dqz) list.get(1));
            dqz b7 = dpuVar.b((dqz) list.get(2));
            if (b5 == dqz.f || b5 == dqz.g) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b6.i(), b5.i()));
            }
            if (!(b5 instanceof dqo) || !(b6 instanceof dqr)) {
                if (b5 instanceof dqv) {
                    ((dqv) b5).r(b6.i(), b7);
                }
            } else {
                ((dqo) b5).q(b6.h().intValue(), b7);
            }
            return b7;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new dqo();
            }
            dqo dqoVar = new dqo();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dqz b8 = dpuVar.b((dqz) it.next());
                if (!(b8 instanceof dqq)) {
                    dqoVar.q(i, b8);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return dqoVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new dqw();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            dqw dqwVar = new dqw();
            while (i < list.size() - 1) {
                dqz b9 = dpuVar.b((dqz) list.get(i));
                dqz b10 = dpuVar.b((dqz) list.get(i + 1));
                if (!(b9 instanceof dqq) && !(b10 instanceof dqq)) {
                    dqwVar.r(b9.i(), b10);
                    i += 2;
                } else {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
            }
            return dqwVar;
        } else if (ordinal == 35 || ordinal == 36) {
            dqt.k(drr.GET_PROPERTY, 2, list);
            dqz b11 = dpuVar.b((dqz) list.get(0));
            dqz b12 = dpuVar.b((dqz) list.get(1));
            if (!(b11 instanceof dqo) || !dqt.p(b12)) {
                if (b11 instanceof dqv) {
                    return ((dqv) b11).f(b12.i());
                }
                if (b11 instanceof drc) {
                    if ("length".equals(b12.i())) {
                        return new dqr(Double.valueOf(b11.i().length()));
                    }
                    if (dqt.p(b12) && b12.h().doubleValue() < b11.i().length()) {
                        return new drc(String.valueOf(b11.i().charAt(b12.h().intValue())));
                    }
                }
                return dqz.f;
            }
            return ((dqo) b11).e(b12.h().intValue());
        } else {
            switch (ordinal) {
                case 62:
                    dqt.k(drr.TYPEOF, 1, list);
                    dqz b13 = dpuVar.b((dqz) list.get(0));
                    if (b13 instanceof drd) {
                        str2 = "undefined";
                    } else if (b13 instanceof dqp) {
                        str2 = "boolean";
                    } else if (b13 instanceof dqr) {
                        str2 = "number";
                    } else if (b13 instanceof drc) {
                        str2 = "string";
                    } else if (b13 instanceof dqy) {
                        str2 = "function";
                    } else if ((b13 instanceof dra) || (b13 instanceof dqq)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                    } else {
                        str2 = "object";
                    }
                    return new drc(str2);
                case 63:
                    dqt.k(drr.UNDEFINED, 0, list);
                    return dqz.f;
                case 64:
                    dqt.m(drr.VAR, 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        dqz b14 = dpuVar.b((dqz) it2.next());
                        if (b14 instanceof drc) {
                            dpuVar.e(b14.i(), dqz.f);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                        }
                    }
                    return dqz.f;
                default:
                    return super.b(str);
            }
        }
    }
}
