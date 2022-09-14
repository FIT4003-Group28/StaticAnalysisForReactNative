package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k9 {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.common.util.e f7433a;

    /* renamed from: b  reason: collision with root package name */
    private long f7434b;

    public k9(com.google.android.gms.common.util.e eVar) {
        com.google.android.gms.common.internal.s.a(eVar);
        this.f7433a = eVar;
    }

    public final void a() {
        this.f7434b = this.f7433a.b();
    }

    public final boolean a(long j) {
        return this.f7434b == 0 || this.f7433a.b() - this.f7434b >= 3600000;
    }

    public final void b() {
        this.f7434b = 0L;
    }
}
