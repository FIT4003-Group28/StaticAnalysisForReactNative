package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: drn  reason: default package */
/* loaded from: classes3.dex */
public final class drn extends drf {
    /* JADX INFO: Access modifiers changed from: protected */
    public drn() {
        this.a.add(drr.FOR_IN);
        this.a.add(drr.FOR_IN_CONST);
        this.a.add(drr.FOR_IN_LET);
        this.a.add(drr.FOR_LET);
        this.a.add(drr.FOR_OF);
        this.a.add(drr.FOR_OF_CONST);
        this.a.add(drr.FOR_OF_LET);
        this.a.add(drr.WHILE);
    }

    private static dqz c(drm drmVar, Iterator it, dqz dqzVar) {
        if (it != null) {
            while (it.hasNext()) {
                dqz c = drmVar.a((dqz) it.next()).c((dqo) dqzVar);
                if (c instanceof dqq) {
                    dqq dqqVar = (dqq) c;
                    if ("break".equals(dqqVar.b)) {
                        return dqz.f;
                    }
                    if ("return".equals(dqqVar.b)) {
                        return dqqVar;
                    }
                }
            }
        }
        return dqz.f;
    }

    private static dqz d(drm drmVar, dqz dqzVar, dqz dqzVar2) {
        return c(drmVar, dqzVar.l(), dqzVar2);
    }

    private static dqz e(drm drmVar, dqz dqzVar, dqz dqzVar2) {
        if (dqzVar instanceof Iterable) {
            return c(drmVar, ((Iterable) dqzVar).iterator(), dqzVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        drr drrVar = drr.ADD;
        int ordinal = dqt.h(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    dqt.k(drr.FOR_IN, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    }
                    String i = ((dqz) list.get(0)).i();
                    return d(new drl(dpuVar, i, 2), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                case 27:
                    dqt.k(drr.FOR_IN_CONST, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    }
                    String i2 = ((dqz) list.get(0)).i();
                    return d(new drl(dpuVar, i2, 1), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                case 28:
                    dqt.k(drr.FOR_IN_LET, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    }
                    String i3 = ((dqz) list.get(0)).i();
                    return d(new drl(dpuVar, i3), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                case 29:
                    dqt.k(drr.FOR_LET, 4, list);
                    dqz b = dpuVar.b((dqz) list.get(0));
                    if (!(b instanceof dqo)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    }
                    dqo dqoVar = (dqo) b;
                    dqz dqzVar = (dqz) list.get(1);
                    dqz dqzVar2 = (dqz) list.get(2);
                    dqz b2 = dpuVar.b((dqz) list.get(3));
                    dpu a = dpuVar.a();
                    for (int i4 = 0; i4 < dqoVar.c(); i4++) {
                        String i5 = dqoVar.e(i4).i();
                        a.g(i5, dpuVar.d(i5));
                    }
                    while (dpuVar.b(dqzVar).g().booleanValue()) {
                        dqz c = dpuVar.c((dqo) b2);
                        if (c instanceof dqq) {
                            dqq dqqVar = (dqq) c;
                            if ("break".equals(dqqVar.b)) {
                                return dqz.f;
                            }
                            if ("return".equals(dqqVar.b)) {
                                return dqqVar;
                            }
                        }
                        dpu a2 = dpuVar.a();
                        for (int i6 = 0; i6 < dqoVar.c(); i6++) {
                            String i7 = dqoVar.e(i6).i();
                            a2.g(i7, a.d(i7));
                        }
                        a2.b(dqzVar2);
                        a = a2;
                    }
                    return dqz.f;
                case 30:
                    dqt.k(drr.FOR_OF, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    }
                    String i8 = ((dqz) list.get(0)).i();
                    return e(new drl(dpuVar, i8, 2), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                case 31:
                    dqt.k(drr.FOR_OF_CONST, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    }
                    String i9 = ((dqz) list.get(0)).i();
                    return e(new drl(dpuVar, i9, 1), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                case 32:
                    dqt.k(drr.FOR_OF_LET, 3, list);
                    if (!(list.get(0) instanceof drc)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    }
                    String i10 = ((dqz) list.get(0)).i();
                    return e(new drl(dpuVar, i10), dpuVar.b((dqz) list.get(1)), dpuVar.b((dqz) list.get(2)));
                default:
                    return super.b(str);
            }
        }
        dqt.k(drr.WHILE, 4, list);
        dqz dqzVar3 = (dqz) list.get(0);
        dqz dqzVar4 = (dqz) list.get(1);
        dqz b3 = dpuVar.b((dqz) list.get(3));
        if (dpuVar.b((dqz) list.get(2)).g().booleanValue()) {
            dqz c2 = dpuVar.c((dqo) b3);
            if (c2 instanceof dqq) {
                dqq dqqVar2 = (dqq) c2;
                if ("break".equals(dqqVar2.b)) {
                    return dqz.f;
                }
                if ("return".equals(dqqVar2.b)) {
                    return dqqVar2;
                }
            }
        }
        while (dpuVar.b(dqzVar3).g().booleanValue()) {
            dqz c3 = dpuVar.c((dqo) b3);
            if (c3 instanceof dqq) {
                dqq dqqVar3 = (dqq) c3;
                if ("break".equals(dqqVar3.b)) {
                    return dqz.f;
                }
                if ("return".equals(dqqVar3.b)) {
                    return dqqVar3;
                }
            }
            dpuVar.b(dqzVar4);
        }
        return dqz.f;
    }
}
