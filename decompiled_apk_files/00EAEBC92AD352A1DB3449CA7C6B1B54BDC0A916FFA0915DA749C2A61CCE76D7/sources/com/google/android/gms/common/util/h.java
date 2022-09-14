package com.google.android.gms.common.util;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f7102a = new h();

    private h() {
    }

    public static e d() {
        return f7102a;
    }

    @Override // com.google.android.gms.common.util.e
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.e
    public long c() {
        return System.nanoTime();
    }
}
