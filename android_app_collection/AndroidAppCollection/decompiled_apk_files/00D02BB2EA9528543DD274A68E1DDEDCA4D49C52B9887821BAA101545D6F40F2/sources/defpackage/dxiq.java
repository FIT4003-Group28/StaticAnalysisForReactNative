package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
/* compiled from: PG */
/* renamed from: dxiq  reason: default package */
/* loaded from: classes.dex */
public final class dxiq {
    public static void a(Activity activity) {
        Application application = activity.getApplication();
        if (!(application instanceof dxiw)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), dxiw.class.getCanonicalName()));
        }
        d(activity, (dxiw) application);
    }

    public static void b(Service service) {
        Application application = service.getApplication();
        if (!(application instanceof dxiw)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), dxiw.class.getCanonicalName()));
        }
        d(service, (dxiw) application);
    }

    public static void c(BroadcastReceiver broadcastReceiver, Context context) {
        dxjg.c(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (!(application instanceof dxiw)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), dxiw.class.getCanonicalName()));
        }
        d(broadcastReceiver, (dxiw) application);
    }

    private static void d(Object obj, dxiw dxiwVar) {
        dxis<Object> NK = dxiwVar.NK();
        dxjg.d(NK, "%s.androidInjector() returned null", dxiwVar.getClass());
        NK.a(obj);
    }
}
