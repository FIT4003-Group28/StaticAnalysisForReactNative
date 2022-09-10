package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.format.DateUtils;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationDismissReceiver;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awpz  reason: default package */
/* loaded from: classes3.dex */
public final class awpz {
    private static final long a = TimeUnit.DAYS.toMillis(5);
    private final Application b;
    private final cqat c;
    private final auhj d;
    private final auhi e;
    private final awth f;
    private final awtj g;
    private final ausy h;

    public awpz(Application application, cqat cqatVar, auhj auhjVar, auhi auhiVar, awth awthVar, awtj awtjVar, ausy ausyVar) {
        this.b = application;
        this.c = cqatVar;
        this.d = auhjVar;
        this.e = auhiVar;
        this.f = awthVar;
        this.g = awtjVar;
        this.h = ausyVar;
    }

    private final String d(long j) {
        Application application = this.b;
        long b = this.c.b();
        String c = awtj.c(application, j);
        if (DateUtils.isToday(j)) {
            if (j < b) {
                return application.getString(R.string.PARKING_LOCATION_NOTIFICATION_CONTENT_EXPIRED, c);
            }
            return application.getString(R.string.PARKING_LOCATION_NOTIFICATION_CONTENT_EXPIRES, c);
        } else if (j < b) {
            return application.getString(R.string.PARKING_LOCATION_NOTIFICATION_CONTENT_EXPIRED_WITH_DATE, c);
        } else {
            return application.getString(R.string.PARKING_LOCATION_NOTIFICATION_CONTENT_EXPIRES_WITH_DATE, c);
        }
    }

    private final Intent e() {
        Intent intent = new Intent();
        String packageName = this.b.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 24);
        sb.append(packageName);
        sb.append(".");
        sb.append("ParkingLocationActivity");
        intent.setComponent(new ComponentName(packageName, sb.toString()));
        return intent;
    }

    private final Bitmap f(boolean z) {
        int i = true != z ? R.raw.notification_bigicon_gray : R.raw.notification_bigicon_red;
        Resources resources = this.b.getResources();
        return bvlf.a(bvly.a().b(resources, i), resources.getDimensionPixelSize(17104901), resources.getDimensionPixelSize(17104902), Bitmap.Config.ARGB_8888);
    }

    private final Intent g(awtn awtnVar, int i) {
        Intent intent = new Intent(this.b, ParkingLocationDismissReceiver.class);
        intent.setAction("com.google.android.apps.gmm.parkinglocation.DISMISS_PARKING_LOCATION_NOTIFICATION");
        intent.putExtra("parking_location_timestamp_millis_key", awtnVar.k());
        intent.putExtra("parking_location_notification_type_key", i != 1 ? i != 2 ? "EXPIRATION" : "EXPIRATION_WARNING" : "INFORMATIONAL");
        return intent;
    }

    public final void a(@dzsi awtn awtnVar) {
        String string;
        if (awtnVar == null || this.f.a.w(bvjk.cU, -1L) == awtnVar.k() || this.f.a.w(bvjk.cW, -1L) == awtnVar.b()) {
            this.e.m(dpyv.SAVED_PARKING_LOCATION.dm);
        } else if (this.c.b() - awtnVar.d() >= a) {
            this.e.m(dpyv.SAVED_PARKING_LOCATION.dm);
        } else {
            int i = dpyv.SAVED_PARKING_LOCATION.dm;
            aujb e = this.h.e(i);
            if (e == null) {
                return;
            }
            augc b = this.d.b(i, e);
            b.v = -2;
            b.D(this.b.getResources().getColor(R.color.quantum_googblue));
            b.m = f(false);
            b.f = this.b.getString(R.string.PARKING_LOCATION_NOTIFICATION_TITLE);
            if (awtnVar.o()) {
                string = d(awtnVar.b());
            } else if (!dbsj.d(awtnVar.e())) {
                Application application = this.b;
                String e2 = awtnVar.e();
                dbsk.s(e2);
                string = application.getString(R.string.PARKING_LOCATION_NEAR, new Object[]{e2});
            } else {
                string = this.b.getString(R.string.PARKING_LOCATION_NOTIFICATION_CONTENT_SAVED, new Object[]{awtj.c(this.b, awtnVar.k())});
            }
            b.g = string;
            b.E(e(), auhw.ACTIVITY);
            b.m(g(awtnVar, 1), auhw.BROADCAST);
            this.e.j(b.a());
        }
    }

    public final void b() {
        this.f.b(null);
        this.e.m(dpyv.SAVED_PARKING_LOCATION_EXPIRE_TIME.dm);
    }

    public final void c(awtn awtnVar, int i) {
        this.e.m(dpyv.SAVED_PARKING_LOCATION.dm);
        this.f.b(awtnVar);
        int i2 = i == 2 ? R.string.PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION_TITLE : R.string.PARKING_LOCATION_EXPIRED_NOTIFICATION_TITLE;
        int i3 = dpyv.SAVED_PARKING_LOCATION_EXPIRE_TIME.dm;
        aujb e = this.h.e(i3);
        if (e == null) {
            return;
        }
        augc b = this.d.b(i3, e);
        b.v = 1;
        b.D(this.b.getResources().getColor(R.color.quantum_googblue));
        b.H(-1);
        b.m = f(true);
        b.f = this.b.getString(i2);
        b.g = d(awtnVar.b());
        b.E(e(), auhw.ACTIVITY);
        b.m(g(awtnVar, i), auhw.BROADCAST);
        this.e.j(b.a());
    }
}
