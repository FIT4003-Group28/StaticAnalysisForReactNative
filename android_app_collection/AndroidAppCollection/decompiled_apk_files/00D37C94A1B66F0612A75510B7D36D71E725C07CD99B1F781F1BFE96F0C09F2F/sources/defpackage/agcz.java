package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: agcz  reason: default package */
/* loaded from: classes.dex */
public final class agcz {
    private final Notification a;
    private final aged b;

    public agcz(Notification notification, aged agedVar) {
        this.a = notification;
        this.b = agedVar;
    }

    public final void a(Context context, boolean z) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        try {
            aged agedVar = this.b;
            notificationManager.notify(agedVar.a, agedVar.b, this.a);
        } catch (RuntimeException e) {
            afus.b(1, 7, e.getMessage());
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = true != z ? "posted" : "updated";
        aged agedVar2 = this.b;
        objArr[1] = agedVar2.a;
        objArr[2] = Integer.valueOf(agedVar2.b);
        String.format(locale, "%s notification with %s:%s", objArr);
    }
}
