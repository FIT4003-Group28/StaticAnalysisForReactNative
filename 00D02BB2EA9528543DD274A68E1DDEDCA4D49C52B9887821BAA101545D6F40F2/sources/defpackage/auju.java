package defpackage;

import android.content.SharedPreferences;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: auju  reason: default package */
/* loaded from: classes.dex */
public final class auju implements aujx {
    public final dxio<bvjj> a;
    public final dxio<cqat> b;
    public final crzp<aujn> c = new aujs(this);
    public dbty<Map<ddos, aujt>> d;
    public final bvju e;

    public auju(final bvju bvjuVar, final dxio dxioVar, final dxio dxioVar2, final dxio dxioVar3, final aujg aujgVar, final dehq dehqVar) {
        this.e = bvjuVar;
        this.a = dxioVar2;
        this.b = dxioVar3;
        this.d = dbud.a(new dbty(this, aujgVar, dehqVar, bvjuVar, dxioVar2, dxioVar3, dxioVar) { // from class: aujq
            private final auju a;
            private final dehq b;
            private final dxio c;
            private final dxio d;
            private final dxio e;
            private final aujg f;
            private final bvju g;

            {
                this.a = this;
                this.f = aujgVar;
                this.b = dehqVar;
                this.g = bvjuVar;
                this.c = dxioVar2;
                this.d = dxioVar3;
                this.e = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                auju aujuVar = this.a;
                aujg aujgVar2 = this.f;
                dehq dehqVar2 = this.b;
                bvju bvjuVar2 = this.g;
                dxio dxioVar4 = this.c;
                dxio dxioVar5 = this.d;
                dxio dxioVar6 = this.e;
                aujgVar2.a.a.d(aujuVar.c, dehqVar2);
                return auju.d(bvjuVar2, dxioVar4, dxioVar5, ((aujl) dxioVar6.a()).a());
            }
        });
    }

    public static Map<ddos, aujt> d(bvju bvjuVar, dxio<bvjj> dxioVar, dxio<cqat> dxioVar2, aujn aujnVar) {
        boolean z;
        ddos ddosVar;
        Integer num;
        long millis;
        Integer num2;
        int i;
        int i2;
        aujw a;
        dkpl next;
        bvju bvjuVar2 = bvjuVar;
        aujn aujnVar2 = aujnVar;
        bvjj a2 = dxioVar.a();
        cqat a3 = dxioVar2.a();
        EnumMap k = dcjz.k(ddos.class);
        HashMap d = dcjz.d();
        Iterator<dkpl> it = aujnVar.c().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            int i3 = it.next().b;
            String str = "featureHistoryStore";
            if (i3 != 1) {
                if (i3 == 2) {
                    str = "featureHistoryStorefactualcontributions";
                } else {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append(str);
                    sb.append(i3);
                    str = sb.toString();
                }
            }
            d.put(Integer.valueOf(i3), aujw.a(bvjuVar2.a(str), a2, 200, TimeUnit.DAYS.toMillis(next.e), true, a3));
        }
        dcdc<ddos> e = aujnVar.e();
        int size = e.size();
        int i4 = 0;
        while (i4 < size) {
            ddos ddosVar2 = e.get(i4);
            boolean f = aujnVar2.f(ddosVar2);
            dkpi h = aujnVar2.h(ddosVar2);
            Integer b = aujnVar2.b(ddosVar2);
            dbsk.a(k.containsKey(ddosVar2) ^ z);
            SharedPreferences a4 = bvjuVar2.a(Integer.toString(ddosVar2.s));
            int i5 = (h == null || (h.a & 32) == 0) ? 30 : h.g;
            if (h == null || (h.a & 8) == 0) {
                ddosVar = ddosVar2;
                num = b;
                millis = TimeUnit.DAYS.toMillis(30L);
            } else {
                num = b;
                ddosVar = ddosVar2;
                millis = TimeUnit.SECONDS.toMillis(h.e);
            }
            aujw aujwVar = null;
            if (!f) {
                if (!dbsj.d(a4.getString("actionsList", ""))) {
                    a4.edit().remove("actionsList").apply();
                }
                a = null;
                i2 = size;
                num2 = num;
                i = i4;
            } else {
                int i6 = i5;
                num2 = num;
                i = i4;
                i2 = size;
                a = aujw.a(a4, a2, i6, millis, false, a3);
            }
            if (num2 != null) {
                aujwVar = (aujw) d.get(num2);
            }
            k.put((EnumMap) ddosVar, (ddos) new aujt(a, aujwVar));
            i4 = i + 1;
            bvjuVar2 = bvjuVar;
            aujnVar2 = aujnVar;
            size = i2;
            z = true;
        }
        return k;
    }

    @dzsi
    public final aujw a(ddos ddosVar) {
        aujw aujwVar;
        aujt b = b(ddosVar);
        if (b == null || (aujwVar = b.a) == null) {
            return null;
        }
        aujwVar.b().size();
        return aujwVar;
    }

    @dzsi
    public final aujt b(ddos ddosVar) {
        return this.d.a().get(ddosVar);
    }

    @Override // defpackage.aujx
    public final aujt c(ddos ddosVar) {
        aujt b = b(ddosVar);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException(String.format("Reporter missing for notification type %s.", ddosVar));
    }
}
