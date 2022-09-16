package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aiwh  reason: default package */
/* loaded from: classes.dex */
public final class aiwh {
    public final ScheduledExecutorService a;
    public final FormatStreamModel b;
    public final TreeMap c;
    public final String d;
    public final ajbk e;
    public final aigw f;
    public final aixo g;
    public final String h;
    public Future i;
    public Long j;
    public boolean k;
    public final Long l;
    public final Long m;
    public final bame n;

    public aiwh(String str, ScheduledExecutorService scheduledExecutorService, FormatStreamModel formatStreamModel, String str2, ajbk ajbkVar, zdt zdtVar, aigw aigwVar, bame bameVar, Long l, Long l2) {
        aixo aixpVar;
        this.h = str;
        this.b = formatStreamModel;
        this.a = scheduledExecutorService;
        this.d = str2;
        this.e = ajbkVar;
        int e = formatStreamModel.e();
        if (e != 386) {
            aixpVar = e != 387 ? null : new aixq(zdtVar);
        } else {
            aixpVar = new aixp(zdtVar);
        }
        this.g = aixpVar;
        this.f = aigwVar;
        this.n = bameVar;
        this.l = l;
        this.m = l2;
        this.c = new TreeMap();
        this.i = null;
        this.j = null;
        this.k = false;
    }

    public final Long a(long j) {
        TreeMap treeMap = this.c;
        Long valueOf = Long.valueOf(j);
        Map.Entry floorEntry = treeMap.floorEntry(valueOf);
        Map.Entry ceilingEntry = this.c.ceilingEntry(valueOf);
        if (floorEntry == null && ceilingEntry == null) {
            floorEntry = null;
        } else if (floorEntry == null || (ceilingEntry != null && j - ((Long) floorEntry.getKey()).longValue() >= ((Long) ceilingEntry.getKey()).longValue() - j)) {
            floorEntry = ceilingEntry;
        }
        if (floorEntry == null) {
            return null;
        }
        Pair pair = (Pair) floorEntry.getValue();
        return Long.valueOf(((float) ((Long) pair.first).longValue()) + (((float) (j - ((Long) floorEntry.getKey()).longValue())) / ((Integer) pair.second).intValue()));
    }

    public final synchronized void b() {
        this.c.clear();
        Future future = this.i;
        if (future != null && !future.isDone()) {
            this.i.cancel(true);
        }
        this.i = null;
        this.j = null;
        this.k = false;
    }

    public final boolean c() {
        return this.f != null;
    }
}
