package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahmf  reason: default package */
/* loaded from: classes2.dex */
public final class ahmf implements ahjv {
    private static final long b = TimeUnit.SECONDS.toMillis(1);
    public final btrm a;
    private final ahsv c;
    private final LocationManager d;
    private final LocationListener e = new ahmd();

    public ahmf(Context context, cqat cqatVar, btrm btrmVar) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.d = locationManager;
        this.a = btrmVar;
        this.c = new ahsv(new ahme(this), locationManager, cqatVar, false);
    }

    @Override // defpackage.ahjv
    public final void a() {
        try {
            int i = ckfu.a;
            this.d.requestLocationUpdates("gps", b, 0.0f, this.e);
            this.c.a();
            this.a.b(new ardm(true));
        } catch (Exception unused) {
            this.a.b(new ardm(false));
        }
    }

    @Override // defpackage.ahjv
    public final void b() {
        try {
            int i = ckfu.a;
            this.d.removeUpdates(this.e);
            this.c.b();
        } catch (Exception unused) {
        }
    }
}
