package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private c.e.a.a.i.y.a f6733a;

        /* renamed from: b  reason: collision with root package name */
        private Map<c.e.a.a.d, b> f6734b = new HashMap();

        public a a(c.e.a.a.d dVar, b bVar) {
            this.f6734b.put(dVar, bVar);
            return this;
        }

        public a a(c.e.a.a.i.y.a aVar) {
            this.f6733a = aVar;
            return this;
        }

        public g a() {
            if (this.f6733a != null) {
                if (this.f6734b.keySet().size() < c.e.a.a.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                Map<c.e.a.a.d, b> map = this.f6734b;
                this.f6734b = new HashMap();
                return g.a(this.f6733a, map);
            }
            throw new NullPointerException("missing required property: clock");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract a a(long j);

            public abstract a a(Set<c> set);

            public abstract b a();

            public abstract a b(long j);
        }

        public static a d() {
            d.b bVar = new d.b();
            bVar.a(Collections.emptySet());
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long c();
    }

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static g a(c.e.a.a.i.y.a aVar) {
        a c2 = c();
        c.e.a.a.d dVar = c.e.a.a.d.DEFAULT;
        b.a d2 = b.d();
        d2.a(30000L);
        d2.b(86400000L);
        c2.a(dVar, d2.a());
        c.e.a.a.d dVar2 = c.e.a.a.d.HIGHEST;
        b.a d3 = b.d();
        d3.a(1000L);
        d3.b(86400000L);
        c2.a(dVar2, d3.a());
        c.e.a.a.d dVar3 = c.e.a.a.d.VERY_LOW;
        b.a d4 = b.d();
        d4.a(86400000L);
        d4.b(86400000L);
        d4.a(a(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        c2.a(dVar3, d4.a());
        c2.a(aVar);
        return c2.a();
    }

    static g a(c.e.a.a.i.y.a aVar, Map<c.e.a.a.d, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(aVar, map);
    }

    private static <T> Set<T> a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void a(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static a c() {
        return new a();
    }

    public long a(c.e.a.a.d dVar, long j, int i) {
        long a2 = j - a().a();
        b bVar = b().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, i - 1)) * bVar.a(), a2), bVar.c());
    }

    public JobInfo.Builder a(JobInfo.Builder builder, c.e.a.a.d dVar, long j, int i) {
        builder.setMinimumLatency(a(dVar, j, i));
        a(builder, b().get(dVar).b());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract c.e.a.a.i.y.a a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<c.e.a.a.d, b> b();
}
