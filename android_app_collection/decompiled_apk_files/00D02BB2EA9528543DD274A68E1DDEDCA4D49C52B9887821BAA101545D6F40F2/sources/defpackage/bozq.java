package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bozq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bozq {
    public static cflx f(long j, cflq cflqVar) {
        dbsg<cflx> b = cflqVar.b(j);
        if (!b.a()) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Segment ");
            sb.append(j);
            sb.append(" not found in graph");
            throw new IllegalArgumentException(sb.toString());
        }
        return b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bozq g(cflx cflxVar, int i, cflq cflqVar) {
        long j;
        int i2 = i;
        dcep<cflw> d = cflxVar.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(cflxVar.a()));
        long e = cflxVar.e();
        long f = cflxVar.f();
        ArrayList arrayList2 = new ArrayList(cflxVar.b().q());
        if (i2 == 3 || i2 == 1) {
            while (true) {
                cflx h = h(arrayList, e, d, cflqVar);
                if (h == null) {
                    break;
                }
                arrayList.add(0, Long.valueOf(h.a()));
                e = h.g(e);
                List<akra> q = h.b().q();
                if (((akra) arrayList2.get(0)).equals(q.get(0))) {
                    q = dchl.l(q);
                }
                arrayList2.addAll(0, q.subList(0, q.size() - 1));
            }
            j = e;
        } else {
            j = e;
            i2 = 2;
        }
        if (i2 == 2 || i2 == 1) {
            while (true) {
                cflx h2 = h(arrayList, f, d, cflqVar);
                if (h2 == null) {
                    break;
                }
                arrayList.add(Long.valueOf(h2.a()));
                f = h2.g(f);
                List<akra> q2 = h2.b().q();
                if (((akra) dcft.s(arrayList2)).equals(dcft.s(q2))) {
                    q2 = dchl.l(q2);
                }
                arrayList2.addAll(q2.subList(1, q2.size()));
            }
        }
        return new boya(j, f, dcdc.r(arrayList), akrk.e(arrayList2));
    }

    @dzsi
    private static cflx h(List<Long> list, long j, Set<cflw> set, cflq cflqVar) {
        dcdc<cflx> a = cflqVar.a(j);
        if (a.size() == 2) {
            int i = 0;
            if (list.contains(Long.valueOf(a.get(0).a()))) {
                i = 1;
            }
            cflx cflxVar = a.get(i);
            if (!list.contains(Long.valueOf(cflxVar.a())) && cflxVar.d().equals(set)) {
                return cflxVar;
            }
            return null;
        }
        return null;
    }

    public abstract long a();

    public abstract long b();

    public abstract dcdc<Long> c();

    public abstract akrk d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bozq e() {
        return new boya(b(), a(), dcdc.r(dchl.l(c())), akrk.e(dchl.l(d().q())));
    }
}
