package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.nd;
/* loaded from: classes.dex */
final class da implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ nd f7253b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7254c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7255d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f7256e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public da(AppMeasurementDynamiteService appMeasurementDynamiteService, nd ndVar, String str, String str2) {
        this.f7256e = appMeasurementDynamiteService;
        this.f7253b = ndVar;
        this.f7254c = str;
        this.f7255d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7256e.f7147a.E().a(this.f7253b, this.f7254c, this.f7255d);
    }
}
