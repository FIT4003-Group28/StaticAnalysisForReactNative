package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udx  reason: default package */
/* loaded from: classes4.dex */
public final class udx implements Application.ActivityLifecycleCallbacks {
    public final axnm a;
    public final axnm b;
    public final axnm c;
    public final axnm d;
    private final axnm e;

    public udx(axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5) {
        this.e = axnmVar;
        this.a = axnmVar2;
        this.b = axnmVar3;
        this.c = axnmVar4;
        this.d = axnmVar5;
    }

    private final void a(Activity activity, Intent intent) {
        if (!intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
            uid.a(activity.getApplicationContext());
            final String g = umn.g(intent);
            final String j = umn.j(intent);
            final String i = umn.i(intent);
            final aomr f = umn.f(intent);
            final aojl e = umn.e(intent);
            if (j != null || i != null) {
                final int s = umn.s(intent);
                String h = umn.h(intent);
                if (h.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) {
                    h = h.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", "");
                }
                final String str = h;
                ((uee) this.e.get()).b(new Runnable() { // from class: udw
                    @Override // java.lang.Runnable
                    public final void run() {
                        List b;
                        udx udxVar = udx.this;
                        String str2 = g;
                        String str3 = j;
                        String str4 = i;
                        int i2 = s;
                        String str5 = str;
                        aomr aomrVar = f;
                        aojl aojlVar = e;
                        int threadPriority = Process.getThreadPriority(0);
                        try {
                            Process.setThreadPriority(10);
                            ucp b2 = str2 == null ? null : ((ucs) udxVar.b.get()).b(str2);
                            if (str3 != null) {
                                b = ((ude) udxVar.a.get()).c(str2, str3);
                            } else {
                                b = ((ude) udxVar.a.get()).b(str2, str4);
                            }
                            for (uih uihVar : (Set) udxVar.d.get()) {
                                amuk.o(b);
                                uihVar.g();
                            }
                            uea l = ueb.l();
                            l.f(uec.SYSTEM_TRAY);
                            l.h(i2);
                            l.a = str5;
                            l.b = b2;
                            l.b(b);
                            l.g(aomrVar);
                            l.e(aojlVar);
                            l.c(true);
                            ((ufe) udxVar.c.get()).b(l.a());
                        } catch (ucr e2) {
                            uev.c("ThreadUpdateActivityLifecycleCallback", e2, "Failed to update notification. Account not found: [%s].", str2);
                        } finally {
                            Process.setThreadPriority(threadPriority);
                        }
                    }
                });
                uev.e("ThreadUpdateActivityLifecycleCallback", "Scheduled job to handle thread update.", new Object[0]);
            }
            uev.e("ThreadUpdateActivityLifecycleCallback", "Marking thread update as handled.", new Object[0]);
        }
    }

    private static boolean b(Intent intent) {
        return umn.h(intent) != null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !b(intent) || intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) != 1) {
            return;
        }
        a(activity, intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null || !b(intent) || intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) != 0) {
            return;
        }
        a(activity, intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
