package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
/* compiled from: PG */
/* renamed from: ahfe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahfe {
    public static final Class[] a(ahiq ahiqVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahiqVar.t((ahgn) obj);
                return null;
            } else if (i == 1) {
                ahiqVar.u((ahhm) obj);
                return null;
            } else if (i == 2) {
                ahiqVar.c((ahhw) obj);
                return null;
            } else if (i == 3) {
                ahiqVar.v((ahic) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhm.class, ahhw.class, ahic.class};
    }

    public static final Class[] b(aicj aicjVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aicjVar.h((aesr) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aesr.class};
    }

    public static boolean c(int i) {
        if (i == 79 || i == 130 || i == 126 || i == 127) {
            return true;
        }
        switch (i) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                return false;
        }
    }

    public static void d(Intent intent, apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)) {
            zep.g("Notification clickTrackingEndpoint was not set or did not contain a RecordNotificationInteractionsEndpoint.");
        } else {
            intent.putExtra("record_interactions_endpoint", apzgVar.toByteArray());
        }
    }

    public static Bundle e(InteractionLoggingScreen interactionLoggingScreen) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("interaction_screen_extra", interactionLoggingScreen);
        return bundle;
    }

    public static InteractionLoggingScreen f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(InteractionLoggingScreen.class.getClassLoader());
            Parcelable parcelable = bundle.getParcelable("interaction_screen_extra");
            if (!(parcelable instanceof InteractionLoggingScreen)) {
                return null;
            }
            return (InteractionLoggingScreen) parcelable;
        } catch (BadParcelableException unused) {
            zep.b("Malformed bundle.");
            return null;
        }
    }

    public static void g(Intent intent, InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen != null) {
            intent.putExtra("interaction_screen_bundle_extra", e(interactionLoggingScreen));
        }
    }

    public static void h(Context context) {
        ((NotificationManager) context.getSystemService("notification")).cancelAll();
    }

    public static void i(Context context, acti actiVar, aged agedVar) {
        StatusBarNotification[] l;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : l(context)) {
                String str = agedVar.c;
                if (TextUtils.isEmpty(str) || (agee.c(statusBarNotification).h() && TextUtils.equals(str, (CharSequence) agee.c(statusBarNotification).c()) && TextUtils.equals(statusBarNotification.getTag(), agedVar.a) && statusBarNotification.getId() == agedVar.b)) {
                    j(actiVar, statusBarNotification.getNotification());
                    ((NotificationManager) context.getSystemService("notification")).cancel(agedVar.a, agedVar.b);
                }
            }
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(agedVar.a, agedVar.b);
    }

    public static void j(acti actiVar, Notification notification) {
        Bundle bundle = notification.extras;
        asvv b = bundle == null ? null : agec.b(bundle.getByteArray("logging_directive"));
        Bundle bundle2 = notification.extras;
        InteractionLoggingScreen f = bundle2 == null ? null : f(bundle2.getBundle("interaction_screen_bundle_extra"));
        if (b == null || f == null) {
            return;
        }
        actiVar.B(f);
        acte acteVar = new acte(b.d);
        acte acteVar2 = new acte(actj.PUSH_NOTIFICATION_HIDE);
        actiVar.E(acteVar2, acteVar);
        actiVar.u(acteVar2, null);
        actiVar.H(3, acteVar2, null);
    }

    public static void k(Context context, acti actiVar, Intent intent) {
        aged a = agee.a(intent);
        if (a.b == -666) {
            return;
        }
        i(context, actiVar, a);
    }

    public static StatusBarNotification[] l(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Exception e) {
            afus.b(1, 7, e.getMessage());
            return new StatusBarNotification[0];
        }
    }
}
