package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.nd;
/* loaded from: classes.dex */
final class g7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ nd f7318b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7319c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7320d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f7321e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f7322f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g7(AppMeasurementDynamiteService appMeasurementDynamiteService, nd ndVar, String str, String str2, boolean z) {
        this.f7322f = appMeasurementDynamiteService;
        this.f7318b = ndVar;
        this.f7319c = str;
        this.f7320d = str2;
        this.f7321e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7322f.f7147a.E().a(this.f7318b, this.f7319c, this.f7320d, this.f7321e);
    }
}
