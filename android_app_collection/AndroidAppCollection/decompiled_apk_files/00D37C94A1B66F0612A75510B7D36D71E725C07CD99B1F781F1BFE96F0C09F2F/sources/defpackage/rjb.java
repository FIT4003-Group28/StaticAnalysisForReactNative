package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: PG */
/* renamed from: rjb  reason: default package */
/* loaded from: classes4.dex */
public final class rjb implements Runnable {
    final /* synthetic */ rhj a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public rjb(AppMeasurementDynamiteService appMeasurementDynamiteService, rhj rhjVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = rhjVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom o = this.d.a.o();
        rhj rhjVar = this.a;
        String str = this.b;
        String str2 = this.c;
        o.n();
        o.a();
        o.t(new rog(o, str, str2, o.e(false), rhjVar));
    }
}
