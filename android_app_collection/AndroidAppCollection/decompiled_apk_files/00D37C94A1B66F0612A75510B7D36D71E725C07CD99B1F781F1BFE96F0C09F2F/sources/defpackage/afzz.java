package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: afzz  reason: default package */
/* loaded from: classes.dex */
public final class afzz implements agby {
    public final ContentResolver a;
    private final aadd b;
    private final Context c;
    private final ScheduledExecutorService d;
    private final agcp e;

    public afzz(Context context, aadd aaddVar, ScheduledExecutorService scheduledExecutorService, agcp agcpVar) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        ContentResolver contentResolver = applicationContext.getContentResolver();
        contentResolver.getClass();
        this.a = contentResolver;
        aaddVar.getClass();
        this.b = aaddVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        agcpVar.getClass();
        this.e = agcpVar;
    }

    private final atps b() {
        arhd a = this.b.a();
        if (a != null) {
            atps atpsVar = a.p;
            return atpsVar == null ? atps.a : atpsVar;
        }
        return atps.a;
    }

    private final String c() {
        ComponentName component;
        Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage(this.c.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    private final void d(String str, int i) {
        ylx.j(this.e.j(str, i), new Executor() { // from class: afzy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                afzz.this.a();
            }
        }, new ylv() { // from class: afzw
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                afzz afzzVar = afzz.this;
                zep.d("Failed to save the bade count.", th);
                afzzVar.a();
            }
        });
    }

    private static final boolean e(String str) {
        return str.equals("FEshared") || str.equals("FEnotifications_inbox");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzz.a():void");
    }

    @Override // defpackage.agby
    public final void l(String str) {
        if (!e(str)) {
            return;
        }
        d(str, 0);
    }

    @Override // defpackage.agby
    public final void o(String str, boolean z, int i) {
        if (!e(str)) {
            return;
        }
        d(str, i);
    }
}
