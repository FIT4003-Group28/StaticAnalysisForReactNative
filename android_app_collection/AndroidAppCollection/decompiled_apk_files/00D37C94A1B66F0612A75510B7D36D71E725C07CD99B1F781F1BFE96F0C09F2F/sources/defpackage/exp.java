package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: PG */
/* renamed from: exp  reason: default package */
/* loaded from: classes3.dex */
public final class exp implements exn {
    private final Context a;
    private final snc b;

    public exp(Context context, snc sncVar) {
        this.a = context;
        this.b = sncVar;
    }

    @Override // defpackage.exn
    public final ymg a() {
        ActivityManager.RecentTaskInfo taskInfo;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.a.getSystemService("activity")).getAppTasks();
        if (appTasks == null || appTasks.isEmpty() || (taskInfo = appTasks.get(0).getTaskInfo()) == null) {
            return null;
        }
        try {
            Field declaredField = taskInfo.getClass().getDeclaredField("firstActiveTime");
            declaredField.setAccessible(true);
            long longValue = ((Long) declaredField.get(taskInfo)).longValue();
            if (longValue <= 0 || longValue >= this.b.c()) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("valueInCurrentMillis bad value: ");
                sb.append(longValue);
                throw new ymh(sb.toString());
            }
            return new exo(this.b.d() + (longValue - this.b.c()));
        } catch (Exception e) {
            afus.c(2, 18, "Failed to obtain process fork time using RecentTaskInfo", e);
            return null;
        }
    }

    @Override // defpackage.exn
    public final void b(acvp acvpVar) {
        if (c()) {
            acvpVar.h(exo.class, "proc_tt");
        }
    }

    @Override // defpackage.exn
    public final boolean c() {
        return Build.VERSION.SDK_INT < 29;
    }
}
