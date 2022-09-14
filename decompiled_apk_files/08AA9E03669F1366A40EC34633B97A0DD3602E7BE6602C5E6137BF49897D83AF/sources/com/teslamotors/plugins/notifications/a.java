package com.teslamotors.plugins.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.y;
import d.a.e.a;
import java.util.Arrays;
import java.util.List;
/* compiled from: NotificationHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5400b = "a";

    /* renamed from: d  reason: collision with root package name */
    private final Context f5402d;

    /* renamed from: c  reason: collision with root package name */
    private static final Boolean f5401c = true;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f5399a = Arrays.asList("canal_predeterminado", "teléfono_llave_canal_de servicio", "預設_頻道", "電話_車匙_服務_頻道");

    public static boolean a(Bundle bundle) {
        String string = bundle.getString("alert_id");
        return string != null && string.startsWith("REFERRAL_");
    }

    public a(Context context) {
        this.f5402d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.notifications.a.b(android.os.Bundle):void");
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        Resources resources = context.getResources();
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        if (notificationChannels != null) {
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (f5399a.contains(notificationChannel.getId())) {
                    notificationManager.deleteNotificationChannel(notificationChannel.getId());
                }
            }
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("default_channel", resources.getString(a.b.notification_channel_default_name), 3);
        notificationChannel2.setDescription(resources.getString(a.b.notification_channel_default_description));
        NotificationChannel notificationChannel3 = new NotificationChannel("phone_key_service_channel", resources.getString(a.b.notification_channel_phone_service_name), 2);
        notificationChannel3.setDescription(resources.getString(a.b.notification_channel_phone_service_description));
        notificationManager.createNotificationChannels(Arrays.asList(notificationChannel2, notificationChannel3));
    }

    private void a(y.c cVar, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.b(str);
    }
}
