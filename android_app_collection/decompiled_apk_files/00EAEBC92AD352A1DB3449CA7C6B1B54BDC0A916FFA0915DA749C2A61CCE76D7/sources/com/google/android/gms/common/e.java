package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.util.l;
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f6951d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final e f6952e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final int f6953f = f.f6957a;

    /* renamed from: c  reason: collision with root package name */
    private String f6954c;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class a extends c.e.a.b.d.b.d {

        /* renamed from: a  reason: collision with root package name */
        private final Context f6955a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f6955a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int b2 = e.this.b(this.f6955a);
            if (!e.this.b(b2)) {
                return;
            }
            e.this.b(this.f6955a, b2);
        }
    }

    public static Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.e.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    static Dialog a(Context context, int i, com.google.android.gms.common.internal.f fVar, DialogInterface.OnCancelListener onCancelListener) {
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
        builder.setMessage(com.google.android.gms.common.internal.e.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = com.google.android.gms.common.internal.e.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, fVar);
        }
        String e2 = com.google.android.gms.common.internal.e.e(context, i);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static e a() {
        return f6952e;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.c) {
            SupportErrorDialogFragment.a(dialog, onCancelListener).a(((androidx.fragment.app.c) activity).h(), str);
            return;
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            c(context);
        } else if (pendingIntent == null) {
            if (i != 6) {
                return;
            }
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        } else {
            String d2 = com.google.android.gms.common.internal.e.d(context, i);
            String c2 = com.google.android.gms.common.internal.e.c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            g.e eVar = new g.e(context);
            eVar.c(true);
            eVar.a(true);
            eVar.b((CharSequence) d2);
            g.c cVar = new g.c();
            cVar.a(c2);
            eVar.a(cVar);
            if (com.google.android.gms.common.util.i.b(context)) {
                com.google.android.gms.common.internal.s.b(l.f());
                eVar.e(context.getApplicationInfo().icon);
                eVar.d(2);
                if (com.google.android.gms.common.util.i.c(context)) {
                    eVar.a(c.e.a.b.b.a.common_full_open_on_phone, resources.getString(c.e.a.b.b.b.common_open_on_phone), pendingIntent);
                } else {
                    eVar.a(pendingIntent);
                }
            } else {
                eVar.e(17301642);
                eVar.d((CharSequence) resources.getString(c.e.a.b.b.b.common_google_play_services_notification_ticker));
                eVar.a(System.currentTimeMillis());
                eVar.a(pendingIntent);
                eVar.a((CharSequence) c2);
            }
            if (l.i()) {
                com.google.android.gms.common.internal.s.b(l.i());
                String b2 = b();
                if (b2 == null) {
                    b2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
                    String b3 = com.google.android.gms.common.internal.e.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(b2, b3, 4);
                    } else if (!b3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b3);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.b(b2);
            }
            Notification a2 = eVar.a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                i.f6962d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        }
    }

    private final String b() {
        String str;
        synchronized (f6951d) {
            str = this.f6954c;
        }
        return str;
    }

    @Override // com.google.android.gms.common.f
    public int a(Context context, int i) {
        return super.a(context, i);
    }

    public Dialog a(Activity activity, int i, int i2) {
        return a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, com.google.android.gms.common.internal.f.a(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // com.google.android.gms.common.f
    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, b bVar) {
        return bVar.t() ? bVar.s() : a(context, bVar.q(), 0);
    }

    @Override // com.google.android.gms.common.f
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public c.e.a.b.g.h<Void> a(Activity activity) {
        int i = f6953f;
        com.google.android.gms.common.internal.s.a("makeGooglePlayServicesAvailable must be called from the main thread");
        int a2 = a(activity, i);
        if (a2 == 0) {
            return c.e.a.b.g.k.a((Object) null);
        }
        d0 b2 = d0.b(activity);
        b2.b(new b(a2, null), 0);
        return b2.h();
    }

    public final com.google.android.gms.common.api.internal.c0 a(Context context, com.google.android.gms.common.api.internal.b0 b0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.c0 c0Var = new com.google.android.gms.common.api.internal.c0(b0Var);
        context.registerReceiver(c0Var, intentFilter);
        c0Var.a(context);
        if (!a(context, "com.google.android.gms")) {
            b0Var.a();
            c0Var.a();
            return null;
        }
        return c0Var;
    }

    @Override // com.google.android.gms.common.f
    public final String a(int i) {
        return super.a(i);
    }

    public final boolean a(Activity activity, com.google.android.gms.common.api.internal.h hVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, com.google.android.gms.common.internal.f.a(hVar, a(activity, i, "d"), 2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean a(Context context, b bVar, int i) {
        PendingIntent a2 = a(context, bVar);
        if (a2 != null) {
            a(context, bVar.q(), (String) null, GoogleApiActivity.a(context, a2, i));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.f
    public int b(Context context) {
        return super.b(context);
    }

    public void b(Context context, int i) {
        a(context, i, (String) null, a(context, i, 0, "n"));
    }

    @Override // com.google.android.gms.common.f
    public final boolean b(int i) {
        return super.b(i);
    }

    public boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    final void c(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }
}
