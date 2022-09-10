package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
/* compiled from: PG */
/* renamed from: qqb  reason: default package */
/* loaded from: classes7.dex */
public final class qqb {
    private static final dcqe c = dcqe.c("qqb");
    private static final dcdn<qjj, bvjk> d = dcdn.m(qjj.TRAFFIC_TO_PLACE, bvjk.cv, qjj.TRANSIT_TO_PLACE, bvjk.cL, qjj.TIME_TO_LEAVE, bvjk.cw);
    private static final dcdn<qjj, ckgz> e = dcdn.m(qjj.TRAFFIC_TO_PLACE, ckht.ad, qjj.TIME_TO_LEAVE, ckht.ad, qjj.TRANSIT_TO_PLACE, ckht.at);
    private static final dcdn<qjj, ckgu> f = dcdn.m(qjj.TRAFFIC_TO_PLACE, ckht.ag, qjj.TIME_TO_LEAVE, ckht.ag, qjj.TRANSIT_TO_PLACE, ckht.au);
    private static final eaow g = eaow.b(4);
    @dzsi
    public final GoogleApiClient a;
    @dzsi
    public final coki b;
    private final Context h;
    private final bvjj i;
    private final dxio<ckcw> j;
    private final dxio<axwq> k;
    private final dxio<akfa> l;
    private final cqat m;

    public qqb(Application application, bvjj bvjjVar, dxio<ckcw> dxioVar, dxio<axwq> dxioVar2, dxio<akfa> dxioVar3, @dzsi GoogleApiClient googleApiClient, @dzsi coki cokiVar, cqat cqatVar) {
        this.h = application.getApplicationContext();
        this.i = bvjjVar;
        this.j = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.a = googleApiClient;
        this.b = cokiVar;
        this.m = cqatVar;
    }

    static int c(dlet dletVar) {
        CRC32 crc32 = new CRC32();
        byte[] bS = dletVar.bS();
        crc32.update(bS, 0, bS.length);
        return (int) crc32.getValue();
    }

    static String d(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("TrafficToPlace:");
        sb.append(i);
        return sb.toString();
    }

    private final void f(rlg rlgVar) {
        final ArrayList arrayList = new ArrayList();
        for (Integer num : rlgVar.c) {
            arrayList.add(d(num.intValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        h(new Callable(this, arrayList) { // from class: qpy
            private final qqb a;
            private final List b;

            {
                this.a = this;
                this.b = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                qqb qqbVar = this.a;
                List<String> list = this.b;
                coki cokiVar = qqbVar.b;
                dbsk.s(cokiVar);
                GoogleApiClient googleApiClient = qqbVar.a;
                dbsk.s(googleApiClient);
                return cokiVar.b(googleApiClient, list);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:20|(1:22)|23|(1:25)(1:73)|26|(1:(2:29|(12:31|32|33|34|(1:36)|37|(1:39)|40|(2:42|(2:44|(1:46)(2:63|64))(1:65))(1:66)|(1:48)(1:62)|49|(2:51|52)(2:53|(4:55|(1:57)(1:60)|58|59)(1:61)))(1:69))(1:71))(1:72)|70|32|33|34|(0)|37|(0)|40|(0)(0)|(0)(0)|49|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bb, code lost:
        r1 = new byte[]{0};
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(@defpackage.dzsi defpackage.btlu r24, final java.lang.String r25, defpackage.dlet r26, long r27, final defpackage.qjj r29) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqb.g(btlu, java.lang.String, dlet, long, qjj):void");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/concurrent/Callable<Lcnoh<Lcom/google/android/gms/common/api/Status;>;>;)Ljava/lang/Object; */
    private final int h(Callable callable) {
        GoogleApiClient googleApiClient;
        GoogleApiClient googleApiClient2 = this.a;
        if (googleApiClient2 == null || this.b == null) {
            return 2;
        }
        int i = googleApiClient2.blockingConnect(10L, TimeUnit.SECONDS).c;
        if (i == 14) {
            return 4;
        }
        if (i != 0) {
            return 3;
        }
        int i2 = 10;
        try {
            try {
                int i3 = ((Status) ((cnoh) callable.call()).g(10L, TimeUnit.SECONDS)).g;
                if (i3 == -1 || i3 == 0) {
                    i2 = 1;
                } else if (i3 != 15) {
                    switch (i3) {
                        case 1000:
                            i2 = 6;
                            break;
                        case 1001:
                            i2 = 7;
                            break;
                        case 1002:
                            i2 = 8;
                            break;
                    }
                } else {
                    i2 = 9;
                }
                googleApiClient = this.a;
            } catch (SecurityException unused) {
                this.a.disconnect();
                return 11;
            } catch (Exception e2) {
                bvoo.i(new RuntimeException(e2));
                googleApiClient = this.a;
            }
            googleApiClient.disconnect();
            return i2;
        } catch (Throwable th) {
            this.a.disconnect();
            throw th;
        }
    }

    private final void i(int i, qjj qjjVar) {
        ((ckco) this.j.a().a(e.get(qjjVar))).a(i);
    }

    public final synchronized void a(@dzsi btlu btluVar, String str, List<dlet> list, long j, qjj qjjVar) {
        if (!bvrj.UI_THREAD.b()) {
            dbsk.a(!dbsj.d(str));
            dcdn<qjj, bvjk> dcdnVar = d;
            dbsk.p(dcdnVar.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
            dbsk.p(e.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
            dbsk.p(f.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
            rli rliVar = (rli) this.i.L(dcdnVar.get(qjjVar), (dssr) rli.b.cu(7), rli.b);
            rlg rlgVar = rlg.d;
            str.getClass();
            dssd<String, rlg> dssdVar = rliVar.a;
            if (dssdVar.containsKey(str)) {
                rlgVar = dssdVar.get(str);
            }
            HashSet hashSet = new HashSet();
            for (dlet dletVar : list) {
                hashSet.add(Integer.valueOf(c(dletVar)));
            }
            HashSet hashSet2 = new HashSet();
            hashSet2.addAll(rlgVar.c);
            if (hashSet2.equals(hashSet)) {
                return;
            }
            f(rlgVar);
            for (dlet dletVar2 : list) {
                g(btluVar, str, dletVar2, j, qjjVar);
            }
            dsqp dsqpVar = (dsqp) rliVar.cu(5);
            dsqpVar.bC(rliVar);
            rle rleVar = (rle) dsqpVar;
            long b = this.m.b();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : Collections.unmodifiableMap(Collections.unmodifiableMap(((rli) rleVar.b).a)).entrySet()) {
                if (((rlg) entry.getValue()).b < b) {
                    arrayList.add((String) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                rleVar.a((String) arrayList.get(i));
            }
            str.getClass();
            if (Collections.unmodifiableMap(((rli) rleVar.b).a).containsKey(str)) {
                rleVar.a(str);
            }
            rlf bZ = rlg.d.bZ();
            long b2 = this.m.b() + g.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            rlg rlgVar2 = (rlg) bZ.b;
            rlgVar2.a |= 1;
            rlgVar2.b = b2;
            rlg rlgVar3 = (rlg) bZ.b;
            dsrf dsrfVar = rlgVar3.c;
            if (!dsrfVar.a()) {
                rlgVar3.c = dsqw.cg(dsrfVar);
            }
            dsod.bv(hashSet, rlgVar3.c);
            if (((rlg) bZ.b).c.size() > 0) {
                rlg bK = bZ.bK();
                str.getClass();
                bK.getClass();
                if (rleVar.c) {
                    rleVar.bF();
                    rleVar.c = false;
                }
                ((rli) rleVar.b).b().put(str, bK);
            }
            this.i.al(d.get(qjjVar), rleVar.bK());
            return;
        }
        bvoo.f(new IllegalStateException("Should not be running on UI_THREAD, but we're on UI_THREAD"));
        i(19, qjjVar);
    }

    public final synchronized void b(String str, qjj qjjVar) {
        dbsk.a(!dbsj.d(str));
        dcdn<qjj, bvjk> dcdnVar = d;
        dbsk.p(dcdnVar.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
        rli rliVar = (rli) this.i.L(dcdnVar.get(qjjVar), (dssr) rli.b.cu(7), rli.b);
        rlg rlgVar = rlg.d;
        str.getClass();
        dssd<String, rlg> dssdVar = rliVar.a;
        if (dssdVar.containsKey(str)) {
            rlgVar = dssdVar.get(str);
        }
        f(rlgVar);
        dsqp dsqpVar = (dsqp) rliVar.cu(5);
        dsqpVar.bC(rliVar);
        rle rleVar = (rle) dsqpVar;
        rleVar.a(str);
        this.i.al(dcdnVar.get(qjjVar), rleVar.bK());
    }

    @dzsi
    public final akqq e(String str, int i, qjj qjjVar) {
        for (azva azvaVar : (List) deha.s(this.k.a().m())) {
            if (i != 2) {
                if (i == 3 && azvaVar.a == dndr.WORK) {
                    return azvaVar.e;
                }
            } else if (azvaVar.a == dndr.HOME) {
                return azvaVar.e;
            }
        }
        i(13, qjjVar);
        return null;
    }
}
