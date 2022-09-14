package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.nd;
/* loaded from: classes.dex */
final class h9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ nd f7346b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f7347c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h9(AppMeasurementDynamiteService appMeasurementDynamiteService, nd ndVar) {
        this.f7347c = appMeasurementDynamiteService;
        this.f7346b = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7347c.f7147a.u().a(this.f7346b, this.f7347c.f7147a.f());
    }
}
