package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: yus  reason: default package */
/* loaded from: classes4.dex */
public final class yus {
    private final yur a;
    private final Context b;

    public yus(yur yurVar, Context context) {
        this.a = yurVar == null ? yur.a : yurVar;
        this.b = context;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        amuk a = this.a.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            yuq yuqVar = (yuq) a.get(i);
            Context context = this.b;
            if (Build.VERSION.SDK_INT >= 26) {
                yhr.b(context, yuqVar.a, context.getString(yuqVar.b), yuqVar.c, yuqVar.d, yuqVar.e);
            }
        }
        for (String str : this.a.b()) {
            Context context2 = this.b;
            if (Build.VERSION.SDK_INT >= 26) {
                ((NotificationManager) context2.getSystemService("notification")).deleteNotificationChannel(str);
            }
        }
    }
}
