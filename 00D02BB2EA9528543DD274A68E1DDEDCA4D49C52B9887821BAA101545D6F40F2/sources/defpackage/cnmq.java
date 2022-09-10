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
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cnmq  reason: default package */
/* loaded from: classes.dex */
public final class cnmq extends cnmr {
    private static final Object e = new Object();
    public static final cnmq a = new cnmq();
    public static final int b = cnmr.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return d(activity, i, new cnuq(k(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final void b(Context context, int i) {
        g(context, i, l(context, i, "n"));
    }

    public final cnrq c(Context context, cnrp cnrpVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        cnrq cnrqVar = new cnrq(cnrpVar);
        context.registerReceiver(cnrqVar, intentFilter);
        cnrqVar.a = context;
        if (!cnnl.k(context, "com.google.android.gms")) {
            cnrpVar.a();
            cnrqVar.a();
            return null;
        }
        return cnrqVar;
    }

    public final Dialog d(Context context, int i, cnus cnusVar, DialogInterface.OnCancelListener onCancelListener) {
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
        builder.setMessage(cnun.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e2 = cnun.e(context, i);
        if (e2 != null) {
            builder.setPositiveButton(e2, cnusVar);
        }
        String a2 = cnun.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public final void e(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ff) {
                gn g = ((ff) activity).g();
                cnnn cnnnVar = new cnnn();
                cnwc.n(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                cnnnVar.ad = dialog;
                if (onCancelListener != null) {
                    cnnnVar.ae = onCancelListener;
                }
                cnnnVar.e(g, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        cnmn cnmnVar = new cnmn();
        cnwc.n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        cnmnVar.a = dialog;
        if (onCancelListener != null) {
            cnmnVar.b = onCancelListener;
        }
        cnmnVar.show(fragmentManager, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Context context) {
        new cnmp(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            f(context);
        } else if (pendingIntent == null) {
        } else {
            String b2 = cnun.b(context, i);
            String d = cnun.d(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            cnwc.a(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            ib ibVar = new ib(context);
            ibVar.w = true;
            ibVar.h(true);
            ibVar.l(b2);
            ia iaVar = new ia();
            iaVar.e(d);
            ibVar.v(iaVar);
            if (cnxo.a(context)) {
                cnwc.b(true);
                ibVar.t(context.getApplicationInfo().icon);
                ibVar.k = 2;
                if (cnxo.b(context)) {
                    ibVar.e(2131231048, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    ibVar.g = pendingIntent;
                }
            } else {
                ibVar.t(17301642);
                ibVar.x(resources.getString(R.string.common_google_play_services_notification_ticker));
                ibVar.z(System.currentTimeMillis());
                ibVar.g = pendingIntent;
                ibVar.k(d);
            }
            if (cnxs.a()) {
                cnwc.b(cnxs.a());
                synchronized (e) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String g = cnun.g(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", g, 4));
                } else if (!g.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(g);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                ibVar.G = "com.google.android.gms.availability";
            }
            Notification b3 = ibVar.b();
            if (i == 1 || i == 2 || i == 3) {
                cnnl.d.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b3);
        }
    }

    public final void h(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return;
        }
        e(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
