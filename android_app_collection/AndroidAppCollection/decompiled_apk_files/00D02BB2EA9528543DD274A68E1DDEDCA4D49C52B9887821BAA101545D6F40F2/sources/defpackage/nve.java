package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: nve  reason: default package */
/* loaded from: classes7.dex */
public final class nve implements cjyy {
    private static boolean c(List<cjyv<?>> list) {
        cjyv<?> cjyvVar = list.get(list.size() - 1);
        T t = cjyvVar.c;
        if (t instanceof cjyx) {
            return c(((cjyx) t).a());
        }
        return cjyvVar.b.b.a(t) != cjzj.NONE;
    }

    private static boolean d(List<cjyv<?>> list) {
        cjyv<?> cjyvVar = list.get(0);
        T t = cjyvVar.c;
        if (t instanceof cjyx) {
            return d(((cjyx) t).a());
        }
        return cjyvVar.b.b.a(t) != cjzj.NONE;
    }

    @Override // defpackage.cjyy
    @dzsi
    public final cqiw<cqkp> a(cjyw cjywVar, cjyw cjywVar2) {
        if (cjywVar != null && cjywVar2 != null) {
            dtic c = cjywVar.c();
            dtic c2 = cjywVar2.c();
            if (c == dtic.VERTICAL_LIST_NO_MARGIN && c2 == dtic.VERTICAL_LIST_NO_MARGIN) {
                boolean c3 = c(cjywVar.b());
                boolean d = d(cjywVar2.b());
                if (!c3 && !d) {
                    return null;
                }
                if (!c3 || !d) {
                    return new nvd();
                }
                return new nvc();
            }
        }
        return null;
    }

    @Override // defpackage.cjyy
    @dzsi
    public final cqiw<cqkp> b(cjyv<?> cjyvVar, cjyv<?> cjyvVar2) {
        if (cjyvVar != null && cjyvVar2 != null && !cjyvVar.e && !cjyvVar2.d) {
            cjzj a = cjyvVar.b.b.a(cjyvVar.c);
            cjzj a2 = cjyvVar2.b.b.a(cjyvVar2.c);
            if (a != cjzj.NONE && a2 != cjzj.NONE) {
                if (a == cjzj.FULL_WIDTH || a2 == cjzj.FULL_WIDTH) {
                    return new oam();
                }
                if (a == cjzj.WITH_MARGIN || a2 == cjzj.WITH_MARGIN) {
                    return new oan();
                }
                return ict.o(ibn.q(), new cqmp[0]);
            }
        }
        return null;
    }
}
