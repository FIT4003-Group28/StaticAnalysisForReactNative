package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class XiaomiHomeBadger implements g.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private ResolveInfo f10359a;

    @TargetApi(16)
    private void a(Context context, int i) {
        if (this.f10359a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f10359a = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.f10359a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f10359a.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
                notificationManager.notify(0, build);
            } catch (Exception e2) {
                throw new g.a.a.b("not able to set badge", e2);
            }
        }
    }

    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        Object valueOf;
        Object obj = "";
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                valueOf = obj;
            } else {
                try {
                    valueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            if (i != 0) {
                obj = Integer.valueOf(i);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
            try {
                g.a.a.d.a.c(context, intent);
            } catch (g.a.a.b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            a(context, i);
        }
    }
}
