package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.EventParcel;
/* compiled from: PG */
/* renamed from: riy  reason: default package */
/* loaded from: classes4.dex */
public final class riy implements Runnable {
    final /* synthetic */ rhj a;
    final /* synthetic */ EventParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public riy(AppMeasurementDynamiteService appMeasurementDynamiteService, rhj rhjVar, EventParcel eventParcel, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = rhjVar;
        this.b = eventParcel;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom o = this.d.a.o();
        rhj rhjVar = this.a;
        EventParcel eventParcel = this.b;
        String str = this.c;
        o.n();
        o.a();
        if (o.N().ay() == 0) {
            o.t(new rob(o, eventParcel, str, rhjVar));
            return;
        }
        o.aG().f.a("Not bundling data. Service unavailable or out of date");
        o.N().W(rhjVar, new byte[0]);
    }
}
