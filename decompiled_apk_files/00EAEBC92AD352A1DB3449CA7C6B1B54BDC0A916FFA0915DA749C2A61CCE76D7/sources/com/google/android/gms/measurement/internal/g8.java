package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.nd;
/* loaded from: classes.dex */
final class g8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ nd f7323b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p f7324c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7325d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f7326e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g8(AppMeasurementDynamiteService appMeasurementDynamiteService, nd ndVar, p pVar, String str) {
        this.f7326e = appMeasurementDynamiteService;
        this.f7323b = ndVar;
        this.f7324c = pVar;
        this.f7325d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7326e.f7147a.E().a(this.f7323b, this.f7324c, this.f7325d);
    }
}
