package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dmks  reason: default package */
/* loaded from: classes6.dex */
public final class dmks implements dmkj {
    public final Context a;
    public final WifiManager b;
    public final cqat c;
    public final ScheduledExecutorService d;
    public final Set<dmkq> e;

    public dmks(Context context, cqat cqatVar, ScheduledExecutorService scheduledExecutorService) {
        dbsk.l(true);
        this.a = context;
        this.c = cqatVar;
        this.d = scheduledExecutorService;
        this.b = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.e = dcnm.l();
    }

    public static final dtcg d(List<dmkr> list, long j, long j2, long j3, dmkc dmkcVar) {
        Iterator<dmkr> it;
        dcdc<ScanResult> dcdcVar;
        int i;
        HashMap hashMap = new HashMap();
        dtcd bZ = dtce.c.bZ();
        dtcj bZ2 = dtck.e.bZ();
        dtch bZ3 = dtci.b.bZ();
        Iterator<dmkr> it2 = list.iterator();
        while (it2.hasNext()) {
            dmkr next = it2.next();
            dcdc<ScanResult> b = next.b();
            int size = b.size();
            int i2 = 0;
            while (i2 < size) {
                ScanResult scanResult = b.get(i2);
                String str = scanResult.BSSID;
                int length = str.length();
                long j4 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        it = it2;
                        dcdcVar = b;
                        i = size;
                        break;
                    }
                    char charAt = str.charAt(i3);
                    it = it2;
                    int digit = Character.digit(charAt, 16);
                    dcdcVar = b;
                    if (digit == -1) {
                        i = size;
                        if (charAt != ':' && charAt != '-') {
                            j4 = -1;
                            break;
                        }
                    } else {
                        i = size;
                        j4 = digit | (j4 << 4);
                    }
                    i3++;
                    it2 = it;
                    b = dcdcVar;
                    size = i;
                }
                dmju dmjuVar = new dmju(j4, scanResult.frequency);
                Integer num = (Integer) hashMap.get(dmjuVar);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(dmjuVar, num);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dtce dtceVar = (dtce) bZ.b;
                    dsri dsriVar = dtceVar.a;
                    if (!dsriVar.a()) {
                        dtceVar.a = dsqw.ci(dsriVar);
                    }
                    dtceVar.a.d(j4);
                    int i4 = scanResult.frequency;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dtce dtceVar2 = (dtce) bZ.b;
                    dsrf dsrfVar = dtceVar2.b;
                    if (!dsrfVar.a()) {
                        dtceVar2.b = dsqw.cg(dsrfVar);
                    }
                    dtceVar2.b.h(i4);
                }
                int size2 = ((dtci) bZ3.b).a.size();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dtck dtckVar = (dtck) bZ2.b;
                dsrf dsrfVar2 = dtckVar.a;
                if (!dsrfVar2.a()) {
                    dtckVar.a = dsqw.cg(dsrfVar2);
                }
                dtckVar.a.h(size2);
                int intValue = num.intValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dtck dtckVar2 = (dtck) bZ2.b;
                dsrf dsrfVar3 = dtckVar2.b;
                if (!dsrfVar3.a()) {
                    dtckVar2.b = dsqw.cg(dsrfVar3);
                }
                dtckVar2.b.h(intValue);
                long millis = TimeUnit.NANOSECONDS.toMillis(j + TimeUnit.MICROSECONDS.toNanos(scanResult.timestamp));
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dtck dtckVar3 = (dtck) bZ2.b;
                dsri dsriVar2 = dtckVar3.c;
                if (!dsriVar2.a()) {
                    dtckVar3.c = dsqw.ci(dsriVar2);
                }
                dtckVar3.c.d(millis);
                int i5 = -scanResult.level;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dtck dtckVar4 = (dtck) bZ2.b;
                dsrf dsrfVar4 = dtckVar4.d;
                if (!dsrfVar4.a()) {
                    dtckVar4.d = dsqw.cg(dsrfVar4);
                }
                dtckVar4.d.h(i5);
                i2++;
                it2 = it;
                b = dcdcVar;
                size = i;
            }
            Iterator<dmkr> it3 = it2;
            long millis2 = TimeUnit.NANOSECONDS.toMillis(j + next.a());
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dtci dtciVar = (dtci) bZ3.b;
            dsri dsriVar3 = dtciVar.a;
            if (!dsriVar3.a()) {
                dtciVar.a = dsqw.ci(dsriVar3);
            }
            dtciVar.a.d(millis2);
            it2 = it3;
        }
        dtcf bZ4 = dtcg.g.bZ();
        dtbz bZ5 = dtca.d.bZ();
        dstv c = dsvb.c(j + j2);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dtca dtcaVar = (dtca) bZ5.b;
        c.getClass();
        dtcaVar.b = c;
        dtcaVar.a |= 1;
        dstv c2 = dsvb.c(j + j3);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dtca dtcaVar2 = (dtca) bZ5.b;
        c2.getClass();
        dtcaVar2.c = c2;
        dtcaVar2.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtcg dtcgVar = (dtcg) bZ4.b;
        dtca bK = bZ5.bK();
        bK.getClass();
        dtcgVar.e = bK;
        dtcgVar.a |= 8;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtcg dtcgVar2 = (dtcg) bZ4.b;
        dtci bK2 = bZ3.bK();
        bK2.getClass();
        dtcgVar2.b = bK2;
        dtcgVar2.a |= 1;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtcg dtcgVar3 = (dtcg) bZ4.b;
        dtce bK3 = bZ.bK();
        bK3.getClass();
        dtcgVar3.c = bK3;
        dtcgVar3.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtcg dtcgVar4 = (dtcg) bZ4.b;
        dtck bK4 = bZ2.bK();
        bK4.getClass();
        dtcgVar4.d = bK4;
        dtcgVar4.a |= 4;
        dqgu dqguVar = ((dmjt) dmkcVar).c;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtcg dtcgVar5 = (dtcg) bZ4.b;
        dqguVar.getClass();
        dtcgVar5.f = dqguVar;
        dtcgVar5.a |= 32;
        return bZ4.bK();
    }

    @Override // defpackage.dmkj
    public final dehn<dtcg> a(final dmkc dmkcVar) {
        WifiManager wifiManager;
        dbsk.l(Looper.getMainLooper().isCurrentThread());
        dbsk.l(true);
        dmjt dmjtVar = (dmjt) dmkcVar;
        eaow e = eaow.e(dmjtVar.c.b);
        int compareTo = e.compareTo(eaow.a);
        if (dmjtVar.a < 0 || dmjtVar.b < 0 || compareTo < 0 || (wifiManager = this.b) == null || !wifiManager.isWifiEnabled()) {
            return deha.a(null);
        }
        if (dmjtVar.a == 0 || dmjtVar.b == 0 || compareTo == 0) {
            return deha.a(dtcg.g);
        }
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
        final deig d = deig.d();
        final ArrayList arrayList = new ArrayList();
        final long nanos = TimeUnit.MILLISECONDS.toNanos(cqav.a(this.c, 0L));
        final long f = this.c.f();
        final ScheduledFuture schedule = this.d.schedule(new Callable(this, d, arrayList, nanos, f, dmkcVar) { // from class: dmkk
            private final dmks a;
            private final deig b;
            private final List c;
            private final long d;
            private final long e;
            private final dmkc f;

            {
                this.a = this;
                this.b = d;
                this.c = arrayList;
                this.d = nanos;
                this.e = f;
                this.f = dmkcVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dmks dmksVar = this.a;
                return Boolean.valueOf(this.b.j(dmks.d(this.c, this.d, this.e, dmksVar.c.f(), this.f)));
            }
        }, e.b, TimeUnit.MILLISECONDS);
        dbrn<Long, Boolean> dbrnVar = new dbrn(schedule, d, arrayList, nanos, f, dmkcVar) { // from class: dmkl
            private final Future a;
            private final deig b;
            private final List c;
            private final long d;
            private final long e;
            private final dmkc f;

            {
                this.a = schedule;
                this.b = d;
                this.c = arrayList;
                this.d = nanos;
                this.e = f;
                this.f = dmkcVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Future future = this.a;
                deig deigVar = this.b;
                List list = this.c;
                long j = this.d;
                long j2 = this.e;
                dmkc dmkcVar2 = this.f;
                future.cancel(false);
                return Boolean.valueOf(deigVar.j(dmks.d(list, j, j2, ((Long) obj).longValue(), dmkcVar2)));
            }
        };
        final dmkq dmkqVar = new dmkq(this, arrayList, dbrnVar, f, dmkcVar);
        this.e.add(dmkqVar);
        d.Pk(new Runnable(this, dmkqVar) { // from class: dmkm
            private final dmks a;
            private final dmkq b;

            {
                this.a = this;
                this.b = dmkqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dmks dmksVar = this.a;
                dmkq dmkqVar2 = this.b;
                dmksVar.e.remove(dmkqVar2);
                try {
                    dmksVar.a.unregisterReceiver(dmkqVar2);
                } catch (IllegalArgumentException unused) {
                }
            }
        }, dege.a);
        this.a.registerReceiver(dmkqVar, intentFilter);
        c(dbrnVar, f);
        return d;
    }

    @Override // defpackage.dmkj
    public final dmka b() {
        dbsk.l(Looper.getMainLooper().isCurrentThread());
        dcdc r = dcdc.r(this.e);
        this.e.clear();
        long f = this.c.f();
        dcen dcenVar = new dcen();
        int size = r.size();
        for (int i = 0; i < size; i++) {
            dmkq dmkqVar = (dmkq) r.get(i);
            Future<?> future = dmkqVar.c;
            if (future != null) {
                future.cancel(false);
            }
            dbsg i2 = dmkqVar.a.a(Long.valueOf(f)).booleanValue() ? dbsg.i(dmkqVar.b) : dbpy.a;
            if (i2.a()) {
                dcenVar.b((dmjz) i2.b());
            }
        }
        return dmka.b(dcenVar.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(dbrn<Long, Boolean> dbrnVar, long j) {
        if (!this.b.startScan()) {
            dbrnVar.a(Long.valueOf(j));
        }
    }
}
