package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class i4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final j4 f7353b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7354c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f7355d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f7356e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7357f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, List<String>> f7358g;

    private i4(String str, j4 j4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.s.a(j4Var);
        this.f7353b = j4Var;
        this.f7354c = i;
        this.f7355d = th;
        this.f7356e = bArr;
        this.f7357f = str;
        this.f7358g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7353b.a(this.f7357f, this.f7354c, this.f7355d, this.f7356e, this.f7358g);
    }
}
