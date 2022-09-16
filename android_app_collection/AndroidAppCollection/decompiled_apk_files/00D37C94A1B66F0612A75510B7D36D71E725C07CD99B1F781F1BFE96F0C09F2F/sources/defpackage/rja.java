package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: PG */
/* renamed from: rja  reason: default package */
/* loaded from: classes4.dex */
public final class rja implements Runnable {
    final /* synthetic */ rjd a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    public rja(AppMeasurementDynamiteService appMeasurementDynamiteService, rjd rjdVar) {
        this.b = appMeasurementDynamiteService;
        this.a = rjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.l().V(this.a);
    }
}
