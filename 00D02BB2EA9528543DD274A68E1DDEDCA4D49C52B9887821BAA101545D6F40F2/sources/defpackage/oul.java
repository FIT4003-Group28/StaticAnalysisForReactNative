package defpackage;

import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: oul  reason: default package */
/* loaded from: classes7.dex */
public final class oul {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<wjm> list, cqiv cqivVar) {
        dbsi a;
        B b;
        HashSet c = dcnm.c();
        dccx F = dcdc.F();
        for (wjm wjmVar : list) {
            jhk h = wjmVar.h();
            if (h != null) {
                a = dbsi.a(ouk.SHOW_LINE_ICON, h.a);
            } else {
                String f = wjmVar.f();
                if (f == null || f.isEmpty() || f.length() > 4) {
                    jhk o = wjmVar.o();
                    if (o != null) {
                        a = dbsi.a(ouk.SHOW_VEHICLE_ICON, o.a);
                    } else {
                        a = dbsi.a(ouk.SHOW_NOTHING, null);
                    }
                } else {
                    a = dbsi.a(ouk.SHOW_LINE_NAME, f);
                }
            }
            if (a.a != ouk.SHOW_NOTHING && (b = a.b) != 0 && c.add((String) b)) {
                F.g(dbsi.a((ouk) a.a, wjmVar));
            }
        }
        dcdc f2 = F.f();
        int size = f2.size();
        for (int i = 0; i < size; i++) {
            dbsi dbsiVar = (dbsi) f2.get(i);
            ouk oukVar = ouk.SHOW_NOTHING;
            int ordinal = ((ouk) dbsiVar.a).ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    cqivVar.a(new ouh(), (wjm) dbsiVar.b);
                } else if (ordinal != 3) {
                }
            }
            cqivVar.a(new ouf(), (wjm) dbsiVar.b);
        }
    }
}
