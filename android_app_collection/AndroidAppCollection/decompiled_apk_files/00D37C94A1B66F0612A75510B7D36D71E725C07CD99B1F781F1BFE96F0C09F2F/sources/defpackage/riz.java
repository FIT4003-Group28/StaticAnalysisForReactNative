package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: PG */
/* renamed from: riz  reason: default package */
/* loaded from: classes4.dex */
public final class riz implements Runnable {
    final /* synthetic */ rhj a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ AppMeasurementDynamiteService e;

    public riz(AppMeasurementDynamiteService appMeasurementDynamiteService, rhj rhjVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = rhjVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom o = this.e.a.o();
        rhj rhjVar = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        o.n();
        o.a();
        o.t(new rnt(o, str, str2, o.e(false), z, rhjVar));
    }
}
