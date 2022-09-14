package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvso  reason: default package */
/* loaded from: classes4.dex */
public class bvso {
    public final Activity a;
    private final cqat b;

    public bvso(Activity activity, cqat cqatVar) {
        this.a = activity;
        this.b = cqatVar;
    }

    public final dbsi<bvsn, Integer> a(long j) {
        if (j < 0) {
            return dbsi.a(bvsn.UNKNOWN, -1);
        }
        double seconds = TimeUnit.MILLISECONDS.toSeconds(this.b.b()) - j;
        Double.isNaN(seconds);
        int floor = (int) Math.floor(seconds / 60.0d);
        double d = floor;
        Double.isNaN(d);
        int floor2 = (int) Math.floor(d / 60.0d);
        double d2 = floor2;
        Double.isNaN(d2);
        int floor3 = (int) Math.floor(d2 / 24.0d);
        if (floor3 > 0) {
            return dbsi.a(bvsn.DAYS_AGO, Integer.valueOf(floor3));
        }
        if (floor2 > 0) {
            return dbsi.a(bvsn.HOURS_AGO, Integer.valueOf(floor2));
        }
        if (floor > 0) {
            return dbsi.a(bvsn.MINUTES_AGO, Integer.valueOf(floor));
        }
        if (floor != 0) {
            return dbsi.a(bvsn.UNKNOWN, -1);
        }
        return dbsi.a(bvsn.NOW, 0);
    }
}
