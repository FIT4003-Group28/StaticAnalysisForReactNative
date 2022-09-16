package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: PG */
/* renamed from: rjc  reason: default package */
/* loaded from: classes4.dex */
public final class rjc implements Runnable {
    final /* synthetic */ rhj a;
    final /* synthetic */ AppMeasurementDynamiteService b;
    private final /* synthetic */ int c;

    public rjc(AppMeasurementDynamiteService appMeasurementDynamiteService, rhj rhjVar) {
        this.b = appMeasurementDynamiteService;
        this.a = rhjVar;
    }

    public rjc(AppMeasurementDynamiteService appMeasurementDynamiteService, rhj rhjVar, int i) {
        this.c = i;
        this.b = appMeasurementDynamiteService;
        this.a = rhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.a.q().T(this.a, this.b.a.v());
            return;
        }
        rom o = this.b.a.o();
        rhj rhjVar = this.a;
        o.n();
        o.a();
        o.t(new rnw(o, o.e(false), rhjVar));
    }
}
