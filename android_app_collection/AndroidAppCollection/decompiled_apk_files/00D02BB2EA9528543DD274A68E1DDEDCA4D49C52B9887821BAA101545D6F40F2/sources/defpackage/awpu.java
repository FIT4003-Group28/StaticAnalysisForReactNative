package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationExpireAlertReceiver;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationExpireWarningReceiver;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationUpdateNotificationReceiver;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awpu  reason: default package */
/* loaded from: classes3.dex */
public final class awpu {
    static final long a = TimeUnit.MINUTES.toMillis(19);
    static final long b = TimeUnit.MINUTES.toMillis(30);
    static final long c;
    static final long d;
    static final long e;
    public final cqat f;
    public final awpz g;
    public final awth h;
    private final Application i;
    private final AlarmManager j;

    static {
        long millis = TimeUnit.MINUTES.toMillis(15L);
        c = millis;
        long millis2 = TimeUnit.MINUTES.toMillis(5L);
        d = millis2;
        e = millis - millis2;
    }

    public awpu(Application application, cqat cqatVar, awpz awpzVar, awth awthVar) {
        this.i = application;
        this.f = cqatVar;
        this.g = awpzVar;
        this.h = awthVar;
        this.j = (AlarmManager) application.getSystemService("alarm");
    }

    @dzsi
    public static awtn e(Intent intent) {
        awtr awtrVar;
        Bundle bundleExtra = intent.getBundleExtra("ParkingLocationKey");
        if (bundleExtra == null || (awtrVar = (awtr) bvrs.e(bundleExtra, awtr.class, (dssr) awtr.l.cu(7))) == null) {
            return null;
        }
        return awtn.m(awtrVar).k();
    }

    private final PendingIntent f(String str, @dzsi awtn awtnVar) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION")) {
            intent.setClass(this.i, ParkingLocationExpireWarningReceiver.class);
        } else if (str.equals("com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRED_NOTIFICATION")) {
            intent.setClass(this.i, ParkingLocationExpireAlertReceiver.class);
        } else if (str.equals("com.google.android.apps.gmm.parkinglocation.ACTION_UPDATE_PARKING_LOCATION_NOTIFICATION")) {
            intent.setClass(this.i, ParkingLocationUpdateNotificationReceiver.class);
        }
        if (awtnVar != null) {
            Bundle bundle = new Bundle();
            bvrs.l(bundle, awtnVar.n());
            intent.putExtra("ParkingLocationKey", bundle);
        }
        return PendingIntent.getBroadcast(this.i, 0, intent, 268435456);
    }

    public final void a() {
        this.h.a(null);
        this.g.b();
        this.j.cancel(f("com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION", null));
        this.j.cancel(f("com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRED_NOTIFICATION", null));
        this.j.cancel(f("com.google.android.apps.gmm.parkinglocation.ACTION_UPDATE_PARKING_LOCATION_NOTIFICATION", null));
    }

    public final void b(awtn awtnVar, long j, String str) {
        this.h.a(awtnVar);
        PendingIntent f = f(str, awtnVar);
        long b2 = awtnVar.b();
        if (Build.VERSION.SDK_INT >= 23) {
            this.j.setExactAndAllowWhileIdle(2, this.f.e() + j, f);
            return;
        }
        long d2 = d(b2);
        if (str.equals("com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION")) {
            long j2 = e;
            if (d2 > j2) {
                this.j.setWindow(2, this.f.e() + j, Math.max(Math.min(d, d2 - j2), 0L), f);
                return;
            }
        }
        this.j.setExact(2, this.f.e() + j, f);
    }

    public final long c(long j) {
        return Math.max(0L, (j - this.f.b()) - c);
    }

    public final long d(long j) {
        return j - this.f.b();
    }
}
