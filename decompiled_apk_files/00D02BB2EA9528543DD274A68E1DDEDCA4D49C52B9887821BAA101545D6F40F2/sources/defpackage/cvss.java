package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cvss  reason: default package */
/* loaded from: classes5.dex */
public final class cvss implements cvsf {
    private final Context a;
    private final cvkf b;
    private final cvkk c;

    public cvss(Context context, cvkf cvkfVar, cvkk cvkkVar) {
        this.a = context;
        this.b = cvkfVar;
        this.c = cvkkVar;
    }

    @Override // defpackage.cvsf
    public final dbsg<Integer> a() {
        NotificationManager notificationManager;
        if (!dxxh.a.a().i()) {
            cvlw.a("NotificationStateImpl", "Current amount unknown (Phenotype disabled).", new Object[0]);
            return dbpy.a;
        } else if (Build.VERSION.SDK_INT < 23 || (notificationManager = (NotificationManager) this.a.getSystemService("notification")) == null) {
            int a = (int) this.c.a(null);
            for (cvkc cvkcVar : this.b.a()) {
                a += (int) this.c.a(cvkcVar.b());
            }
            Integer valueOf = Integer.valueOf(a);
            cvlw.a("NotificationStateImpl", "Current amount is %s (SDK < M || NotificationManager missing).", valueOf);
            return dbsg.i(valueOf);
        } else {
            Integer valueOf2 = Integer.valueOf(notificationManager.getActiveNotifications().length);
            cvlw.a("NotificationStateImpl", "Current amount is %s (SDK >= M).", valueOf2);
            return dbsg.i(valueOf2);
        }
    }
}
