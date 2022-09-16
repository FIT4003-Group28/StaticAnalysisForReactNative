package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends d2 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f7153b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f7154c;

    /* renamed from: d  reason: collision with root package name */
    private long f7155d;

    public a(d5 d5Var) {
        super(d5Var);
        this.f7154c = new a.e.a();
        this.f7153b = new a.e.a();
    }

    private final void a(long j, q7 q7Var) {
        if (q7Var == null) {
            c().B().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            c().B().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            p7.a(q7Var, bundle, true);
            o().a("am", "_xa", bundle);
        }
    }

    private final void a(String str, long j, q7 q7Var) {
        if (q7Var == null) {
            c().B().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            c().B().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            p7.a(q7Var, bundle, true);
            o().a("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        for (String str : this.f7153b.keySet()) {
            this.f7153b.put(str, Long.valueOf(j));
        }
        if (!this.f7153b.isEmpty()) {
            this.f7155d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str, long j) {
        e();
        g();
        com.google.android.gms.common.internal.s.b(str);
        if (this.f7154c.isEmpty()) {
            this.f7155d = j;
        }
        Integer num = this.f7154c.get(str);
        if (num != null) {
            this.f7154c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f7154c.size() >= 100) {
            c().v().a("Too many ads visible");
        } else {
            this.f7154c.put(str, 1);
            this.f7153b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, long j) {
        e();
        g();
        com.google.android.gms.common.internal.s.b(str);
        Integer num = this.f7154c.get(str);
        if (num == null) {
            c().s().a("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        q7 a2 = r().a(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            this.f7154c.put(str, Integer.valueOf(intValue));
            return;
        }
        this.f7154c.remove(str);
        Long l = this.f7153b.get(str);
        if (l == null) {
            c().s().a("First ad unit exposure time was never set");
        } else {
            this.f7153b.remove(str);
            a(str, j - l.longValue(), a2);
        }
        if (!this.f7154c.isEmpty()) {
            return;
        }
        long j2 = this.f7155d;
        if (j2 == 0) {
            c().s().a("First ad exposure time was never set");
            return;
        }
        a(j - j2, a2);
        this.f7155d = 0L;
    }

    public final void a(long j) {
        q7 a2 = r().a(false);
        for (String str : this.f7153b.keySet()) {
            a(str, j - this.f7153b.get(str).longValue(), a2);
        }
        if (!this.f7153b.isEmpty()) {
            a(j - this.f7155d, a2);
        }
        b(j);
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            c().s().a("Ad unit id must be a non-empty string");
        } else {
            a().a(new c1(this, str, j));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            c().s().a("Ad unit id must be a non-empty string");
        } else {
            a().a(new b0(this, str, j));
        }
    }
}
