package defpackage;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aukj  reason: default package */
/* loaded from: classes2.dex */
public final class aukj {
    static final Uri a = RingtoneManager.getDefaultUri(2);
    static final AudioAttributes b = new AudioAttributes.Builder().setUsage(5).build();

    public static void a(Application application, auiu auiuVar, @dzsi String str, NotificationManager notificationManager) {
        NotificationChannel notificationChannel;
        NotificationChannel c;
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(auiuVar.a());
        String string = application.getString(auiuVar.c());
        String string2 = auiuVar.d().a() ? application.getString(auiuVar.d().b().intValue()) : null;
        if (notificationChannel2 == null || (dbsd.a(notificationChannel2.getName(), string) && dbsd.a(notificationChannel2.getDescription(), string2))) {
            if (notificationChannel2 != null || !auiuVar.g().a() || (notificationChannel = notificationManager.getNotificationChannel(auiuVar.g().b().a())) == null) {
                if (notificationChannel2 != null) {
                    return;
                }
                notificationManager.createNotificationChannel(c(str, string, string2, auiuVar));
                return;
            }
            if (notificationChannel.getImportance() != auiuVar.g().b().b()) {
                c = b(auiuVar.a(), str, string, string2, notificationChannel);
            } else {
                c = c(str, string, string2, auiuVar);
            }
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
            notificationManager.createNotificationChannel(c);
            return;
        }
        notificationManager.createNotificationChannel(b(notificationChannel2.getId(), str, string, string2, notificationChannel2));
    }

    private static NotificationChannel b(String str, @dzsi String str2, String str3, @dzsi String str4, NotificationChannel notificationChannel) {
        return d(str, str2, str3, str4, notificationChannel.getImportance(), notificationChannel.getSound(), notificationChannel.getAudioAttributes(), notificationChannel.shouldVibrate());
    }

    private static NotificationChannel c(@dzsi String str, String str2, @dzsi String str3, auiu auiuVar) {
        return d(auiuVar.a(), str, str2, str3, auiuVar.b(), auiuVar.f() ? a : null, auiuVar.f() ? b : null, auiuVar.e());
    }

    private static NotificationChannel d(String str, @dzsi String str2, String str3, @dzsi String str4, int i, @dzsi Uri uri, @dzsi AudioAttributes audioAttributes, boolean z) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str3, i);
        if (str2 != null) {
            notificationChannel.setGroup(str2);
        }
        if (str4 != null) {
            notificationChannel.setDescription(str4);
        }
        notificationChannel.setSound(uri, audioAttributes);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(z);
        return notificationChannel;
    }
}
