package com.teslamotors.plugins.client.d.a;

import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
/* compiled from: ExponentialBackoffStrategy.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f5331a = 100;

    /* renamed from: b  reason: collision with root package name */
    private int f5332b = NetstatsParserPatterns.NEW_TS_TO_MILLIS;

    public int a() {
        return this.f5331a;
    }

    public int b() {
        return this.f5332b;
    }

    public void a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot have an initial delay less than 0");
        }
        this.f5331a = i;
    }

    public void b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot have an maximum delay less than 0");
        }
        this.f5332b = i;
    }
}
