package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.nd;
/* loaded from: classes.dex */
final class g6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ nd f7316b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f7317c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6(AppMeasurementDynamiteService appMeasurementDynamiteService, nd ndVar) {
        this.f7317c = appMeasurementDynamiteService;
        this.f7316b = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7317c.f7147a.E().a(this.f7316b);
    }
}
