package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: qrq  reason: default package */
/* loaded from: classes4.dex */
public final class qrq extends qrr {
    private static final Object e = new Object();
    public static final qrq a = new qrq();
    public static final int b = qrr.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return b(activity, i, new qww(i(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final Dialog b(Context context, int i, qwy qwyVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(qwv.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = qwv.c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, qwyVar);
        }
        String g = qwv.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void c(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof dt) {
                eo supportFragmentManager = ((dt) activity).getSupportFragmentManager();
                qsg qsgVar = new qsg();
                qnm.n(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                qsgVar.ae = dialog;
                if (onCancelListener != null) {
                    qsgVar.af = onCancelListener;
                }
                qsgVar.qv(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        qrn qrnVar = new qrn();
        qnm.n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        qrnVar.a = dialog;
        if (onCancelListener != null) {
            qrnVar.b = onCancelListener;
        }
        qrnVar.show(fragmentManager, str);
    }

    public final void d(Context context, int i) {
        e(context, i, j(context, i, "n"));
    }

    public final void e(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new qrp(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i != 6) {
                return;
            }
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        } else {
            String f = qwv.f(context, i);
            String e2 = qwv.e(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            qnm.b(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            fi fiVar = new fi(context);
            fiVar.w = true;
            fiVar.g(true);
            fiVar.k(f);
            fh fhVar = new fh();
            fhVar.c(e2);
            fiVar.s(fhVar);
            if (trz.d(context)) {
                qnm.j(true);
                fiVar.r(context.getApplicationInfo().icon);
                fiVar.k = 2;
                if (trz.e(context)) {
                    fiVar.e(2131231136, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    fiVar.g = pendingIntent;
                }
            } else {
                fiVar.r(17301642);
                fiVar.u(resources.getString(R.string.common_google_play_services_notification_ticker));
                fiVar.w(System.currentTimeMillis());
                fiVar.g = pendingIntent;
                fiVar.j(e2);
            }
            if (twx.g()) {
                qnm.j(twx.g());
                synchronized (e) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b2 = qwv.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b2, 4));
                } else if (!b2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                fiVar.E = "com.google.android.gms.availability";
            }
            Notification b3 = fiVar.b();
            if (i == 1 || i == 2 || i == 3) {
                qse.b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b3);
        }
    }

    public final void f(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return;
        }
        c(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
