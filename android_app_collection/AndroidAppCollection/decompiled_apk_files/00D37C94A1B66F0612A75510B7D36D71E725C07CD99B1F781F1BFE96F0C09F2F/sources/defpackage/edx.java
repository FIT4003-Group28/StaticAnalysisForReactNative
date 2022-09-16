package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: edx  reason: default package */
/* loaded from: classes3.dex */
public final class edx implements edw {
    private final Context c;
    private final Object d = new Object();
    private final ConditionVariable e = new ConditionVariable();
    private final ConditionVariable f = new ConditionVariable();
    int a = 0;
    int b = 0;

    public edx(Context context) {
        this.c = context;
    }

    private final boolean d(Intent intent, String str, Class cls) {
        String name = cls.getName();
        if (name.equals(str)) {
            return true;
        }
        ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 65536);
        return (resolveActivity == null || resolveActivity.activityInfo == null || !name.equals(resolveActivity.activityInfo.targetActivity)) ? false : true;
    }

    @Override // defpackage.edw
    public final int a() {
        ActivityManager.RecentTaskInfo taskInfo;
        Intent intent;
        ComponentName component;
        String className;
        if (this.a == 0) {
            synchronized (this.d) {
                if (this.a == 0) {
                    ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
                    List<ActivityManager.AppTask> appTasks = activityManager == null ? null : activityManager.getAppTasks();
                    int i = 1;
                    if (appTasks != null) {
                        if (appTasks.isEmpty()) {
                            i = 4;
                        } else {
                            ActivityManager.AppTask appTask = appTasks.get(0);
                            if (appTask != null && (taskInfo = appTask.getTaskInfo()) != null && taskInfo.baseIntent != null && (intent = taskInfo.baseIntent) != null && (component = intent.getComponent()) != null && (className = component.getClassName()) != null) {
                                if (d(intent, className, Shell_HomeActivity.class)) {
                                    i = 2;
                                } else {
                                    i = d(intent, className, Shell_UrlActivity.class) ? 3 : 5;
                                }
                            }
                        }
                    }
                    this.a = i;
                    this.e.open();
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.edw
    public final void b(int i) {
        synchronized (this.d) {
            if (this.b == 0) {
                this.b = i;
                String.format(Locale.US, "Startup earlyDetected:%d detected:%d", Integer.valueOf(this.a), Integer.valueOf(this.b));
                int i2 = this.a;
                if (i2 != 0 && i2 != this.b) {
                    afus.b(1, 18, String.format(Locale.US, "ColdStartTypeDetector mismatch earlyDetected:%d detected:%d", Integer.valueOf(this.a), Integer.valueOf(this.b)));
                }
            }
            this.f.open();
        }
    }

    @Override // defpackage.acuw
    public final void c() {
        b(4);
    }
}
