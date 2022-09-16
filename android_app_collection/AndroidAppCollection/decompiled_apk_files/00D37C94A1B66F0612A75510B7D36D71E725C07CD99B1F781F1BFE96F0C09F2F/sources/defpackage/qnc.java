package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qnc  reason: default package */
/* loaded from: classes4.dex */
final class qnc extends BroadcastReceiver {
    final /* synthetic */ qng a;

    public qnc(qng qngVar) {
        this.a = qngVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PendingIntent activities;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        qnm.b(componentName);
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        qkp qkpVar = this.a.d;
        qnm.g("Must be called from the main thread.");
        if (qkpVar.e.g()) {
            intent2.setFlags(603979776);
            activities = rfi.a(context, 1, intent2, rfi.a | 134217728);
            try {
                qnm.b(activities);
                activities.send(context, 1, new Intent().setFlags(268435456));
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        gd a = gd.a(this.a);
        a.c(componentName);
        a.b(intent2);
        int i = rfi.a | 134217728;
        if (!a.a.isEmpty()) {
            ArrayList arrayList = a.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(a.b, 1, intentArr, i, null);
            qnm.b(activities);
            activities.send(context, 1, new Intent().setFlags(268435456));
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
}
