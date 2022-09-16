package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: auhz  reason: default package */
/* loaded from: classes2.dex */
public final class auhz {
    private final Application a;

    public auhz(Application application) {
        this.a = application;
    }

    public static Intent a(dplx dplxVar, List<dlhl> list) {
        Intent a = bvrq.a(dplxVar);
        f(a, list);
        return a;
    }

    public static auhw e(int i) {
        int i2 = i - 1;
        auhw auhwVar = auhw.ACTIVITY;
        if (i != 0) {
            if (i2 != 0 && i2 != 1) {
                return i2 != 2 ? i2 != 3 ? i2 != 4 ? auhw.ACTIVITY : auhw.BROADCAST : auhw.SERVICE : auhw.ACTIVITY_WITHOUT_TASK_AFFINITY;
            }
            return auhw.ACTIVITY;
        }
        throw null;
    }

    private static void f(Intent intent, List<dlhl> list) {
        for (dlhl dlhlVar : list) {
            int i = dlhlVar.b;
            if (i == 2) {
                intent.putExtra(dlhlVar.d, (String) dlhlVar.c);
            } else if (i == 3) {
                intent.putExtra(dlhlVar.d, ((Boolean) dlhlVar.c).booleanValue());
            } else if (i == 4) {
                intent.putExtra(dlhlVar.d, ((Integer) dlhlVar.c).intValue());
            } else if (i == 5) {
                intent.putExtra(dlhlVar.d, ((Long) dlhlVar.c).longValue());
            } else if (i == 6) {
                intent.putExtra(dlhlVar.d, ((Integer) dlhlVar.c).intValue());
            } else if (i == 7) {
                intent.putExtra(dlhlVar.d, ((Long) dlhlVar.c).longValue());
            } else if (i == 8) {
                intent.putExtra(dlhlVar.d, ((Double) dlhlVar.c).doubleValue());
            } else if (i == 9) {
                intent.putExtra(dlhlVar.d, ((Float) dlhlVar.c).floatValue());
            } else if (i == 10) {
                intent.putExtra(dlhlVar.d, ((dspd) dlhlVar.c).G());
            } else if (i == 11) {
                intent.putExtra(dlhlVar.d, (String[]) ((dlhi) dlhlVar.c).a.toArray(new String[0]));
            } else if (i == 12) {
                intent.putStringArrayListExtra(dlhlVar.d, new ArrayList<>(((dlhk) dlhlVar.c).a));
            }
        }
    }

    public final Intent b(boolean z, dplx dplxVar, @dzsi String str, List<dlhl> list) {
        if (true != z) {
            dplxVar = null;
        }
        return c(dplxVar, str, list);
    }

    @dzsi
    public final PendingIntent d(@dzsi NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent) {
        Intent intent;
        if (notificationIntentConverter$NotificationIntent == null) {
            return null;
        }
        Integer f = notificationIntentConverter$NotificationIntent.a().f();
        auhw b = notificationIntentConverter$NotificationIntent.b();
        Intent c = notificationIntentConverter$NotificationIntent.c();
        String f2 = notificationIntentConverter$NotificationIntent.d().f();
        String f3 = notificationIntentConverter$NotificationIntent.e().f();
        String f4 = notificationIntentConverter$NotificationIntent.f().f();
        auhw auhwVar = auhw.ACTIVITY;
        int ordinal = b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return PendingIntent.getService(this.a, c.hashCode(), c, 268435456);
            }
            if (ordinal == 3) {
                Intent intent2 = new Intent(c);
                cjqg.i(intent2, 19235, f2, f3, f4);
                return PendingIntent.getBroadcast(this.a, intent2.hashCode(), intent2, 268435456);
            }
            throw new IllegalArgumentException("Intent type is invalid");
        }
        Intent intent3 = new Intent(c);
        cjqg.i(intent3, 19235, f2, f3, f4);
        if (f != null) {
            intent3.putExtra("NOTIFICATION_TYPE", f);
            if ("com.google.android.apps.gmm.ACTION_ENSURE_CORRECT_LOGIN_STATUS_THEN_CONTINUE".equals(intent3.getAction()) && intent3.hasExtra("WRAPPED_INTENT") && (intent = (Intent) c.getParcelableExtra("WRAPPED_INTENT")) != null) {
                intent.putExtra("NOTIFICATION_TYPE", f);
                intent3.putExtra("WRAPPED_INTENT", intent);
            }
        }
        intent3.addFlags(268435456);
        return PendingIntent.getActivity(this.a, intent3.hashCode(), intent3, 268435456);
    }

    public final Intent c(@dzsi dplx dplxVar, @dzsi String str, List<dlhl> list) {
        Intent launchIntentForPackage;
        if (dplxVar == null) {
            if (!dbsj.d(str)) {
                launchIntentForPackage = afft.a(this.a).setAction("android.intent.action.VIEW").setData(Uri.parse(str));
                launchIntentForPackage.addFlags(536870912);
            } else {
                launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
            }
        } else {
            launchIntentForPackage = bvrq.a(dplxVar);
        }
        f(launchIntentForPackage, list);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }
}
