package com.google.android.libraries.youtube.notification;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationInteractionBroadcastReceiver extends afzv {
    public yjl a;
    public axwt b;
    public yjs c;

    @Override // defpackage.afzv, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Boolean bool;
        a(context);
        aqxe aqxeVar = this.b.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352806L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352806L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352806L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            try {
                this.c.e("notification_interaction", 0L, false, 1, intent.getExtras(), null, false);
                return;
            } catch (RuntimeException e) {
                afus.c(2, 7, "Notification interaction extras exceed the size limit", e);
                this.a.a("notification_interaction", intent.getExtras());
                return;
            }
        }
        this.a.a("notification_interaction", intent.getExtras());
    }
}
