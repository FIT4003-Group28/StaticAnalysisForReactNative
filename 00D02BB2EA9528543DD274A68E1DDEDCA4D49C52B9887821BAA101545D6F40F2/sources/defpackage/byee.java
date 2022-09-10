package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: byee  reason: default package */
/* loaded from: classes4.dex */
public class byee implements Serializable {
    public final dbsg<String> a;
    public final dbsg<CharSequence> b;
    @dzsi
    private final EnumMap<byea, bydp> c;
    @dzsi
    private final bvrt<dgsl> d;
    private final boolean e;
    private final boolean f;
    private final TimeZone g;
    @dzsi
    private final int h;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byee(@defpackage.dzsi defpackage.dgfs r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byee.<init>(dgfs, java.lang.String, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<byef> j(dgsl dgslVar, TimeZone timeZone) {
        ArrayList a = dchl.a();
        for (dgrz dgrzVar : dgslVar.a) {
            int a2 = dgry.a(dgrzVar.b);
            if (a2 == 0 || a2 != 2) {
                dsrj<dgsj> dsrjVar = dgrzVar.a;
                if (dsrjVar.size() == 1) {
                    if (byeg.b(dsrjVar.get(0))) {
                        a.addAll(byef.d(dsrjVar.get(0), timeZone));
                    } else if (byeg.a(dsrjVar.get(0))) {
                        a.addAll(byef.c(dsrjVar.get(0), timeZone));
                    }
                } else if (dsrjVar.size() == 2) {
                    if (!byeg.b(dsrjVar.get(0)) || !byeg.a(dsrjVar.get(1))) {
                        if (byeg.a(dsrjVar.get(0)) && byeg.b(dsrjVar.get(1))) {
                            a.addAll(byef.b(dsrjVar.get(1), dsrjVar.get(0), timeZone));
                        }
                    } else {
                        a.addAll(byef.b(dsrjVar.get(0), dsrjVar.get(1), timeZone));
                    }
                } else {
                    dsrjVar.size();
                }
            } else {
                dgrzVar.toString();
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(List<byef> list) {
        if (list.size() > 0) {
            Collections.sort(list);
            Iterator<byef> it = list.iterator();
            byef next = it.next();
            while (it.hasNext()) {
                byef next2 = it.next();
                if (next.g(next2)) {
                    it.remove();
                }
                next = next2;
            }
            if (!list.get(list.size() - 1).g(list.get(0))) {
                return;
            }
            list.remove(0);
        }
    }

    private final int m(duha duhaVar) {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            calendar.setTimeZone(timeZone);
        }
        calendar.set(duhaVar.a, duhaVar.b - 1, duhaVar.c);
        return calendar.get(7);
    }

    private final byed n(byeb byebVar, Calendar calendar, cqat cqatVar) {
        byef o = o(cqatVar);
        if (o == null || o.i(calendar) > 30) {
            byec e = byed.e();
            e.b(byebVar);
            bydg bydgVar = (bydg) e;
            bydgVar.b = o;
            bydgVar.c = o != null ? o.b : null;
            return e.a();
        }
        byec e2 = byed.e();
        e2.b(byeb.OPENS_SOON_NEXT_DAY);
        bydg bydgVar2 = (bydg) e2;
        bydgVar2.b = o;
        bydgVar2.c = o.b;
        return e2.a();
    }

    @dzsi
    private final byef o(cqat cqatVar) {
        List<bydp> h = h(cqatVar);
        byef byefVar = null;
        if (!h.isEmpty()) {
            for (int i = 1; i < h.size() && (byefVar = h.get(i).i()) == null; i++) {
            }
            if (byefVar == null) {
                return h.get(0).i();
            }
        }
        return byefVar;
    }

    private static bydp p(@dzsi Map<byea, bydp> map, byea byeaVar) {
        if (map == null) {
            return new bydp(byeaVar);
        }
        if (map.containsKey(byeaVar)) {
            return map.get(byeaVar);
        }
        bydp bydpVar = new bydp(byeaVar);
        map.put(byeaVar, bydpVar);
        return bydpVar;
    }

    public final Calendar a(cqat cqatVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(cqatVar.b());
        calendar.setTimeZone(this.g);
        return calendar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0190, code lost:
        if ((r7 + ((((r4.b != r4.c ? 1 : 0) * 1440) + ((r4.f.get(11) - r4.e.get(11)) * 60)) + (r4.f.get(12) - r4.e.get(12)))) < 1440) goto L95;
     */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.byed b(defpackage.cqat r17) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byee.b(cqat):byed");
    }

    @dzsi
    public final dgsl c() {
        return (dgsl) bvrt.f(this.d, (dssr) dgsl.b.cu(7), dgsl.b);
    }

    public final boolean d() {
        return this.c != null;
    }

    public final bydp e(cqat cqatVar) {
        Calendar a = a(cqatVar);
        bydp f = f(a.get(7));
        byef h = f.h(a);
        return h != null ? p(this.c, h.b) : f;
    }

    public final bydp f(int i) {
        return p(this.c, byea.b(i));
    }

    public final bydp g(cqat cqatVar) {
        return f(a(cqatVar).get(7));
    }

    public final List<bydp> h(cqat cqatVar) {
        dbsk.s(this.c);
        ArrayList f = dchl.f(byea.values().length);
        byea byeaVar = e(cqatVar).a;
        for (int i = 0; i < byea.values().length; i++) {
            f.add(p(this.c, byeaVar));
            byeaVar = byeaVar.c();
        }
        return f;
    }

    public final List<bydp> i() {
        dbsk.s(this.c);
        ArrayList f = dchl.f(byea.values().length);
        for (byea byeaVar : byea.values()) {
            f.add(p(this.c, byeaVar));
        }
        return f;
    }

    public final boolean l(cqat cqatVar) {
        byeb a;
        byed b = b(cqatVar);
        return (b == null || (a = b.a()) == byeb.OPEN_FOR_NEXT_24_HOURS || a == byeb.OPEN_NOW_CLOSES_NEXT_DAY || a == byeb.OPEN_NOW_HOURS_UNKNOWN || a == byeb.OPEN_NOW_LAST_INTERVAL || a == byeb.OPEN_NOW_WILL_REOPEN) ? false : true;
    }

    public final String toString() {
        EnumMap<byea, bydp> enumMap = this.c;
        return enumMap != null ? enumMap.toString() : "(No open hours data)";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd A[ADDED_TO_REGION] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byee(@defpackage.dzsi defpackage.dvxh r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byee.<init>(dvxh, java.lang.String, boolean, boolean):void");
    }
}
