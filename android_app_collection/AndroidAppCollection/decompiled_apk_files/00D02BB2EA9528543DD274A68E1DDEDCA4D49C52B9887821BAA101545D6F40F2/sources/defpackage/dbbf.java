package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: dbbf  reason: default package */
/* loaded from: classes5.dex */
public final class dbbf extends BroadcastReceiver {
    final /* synthetic */ dbay a;

    public dbbf(dbay dbayVar) {
        this.a = dbayVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if (!"com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) || extras == null || !extras.containsKey("install.status")) {
            return;
        }
        int i = extras.getInt("install.status");
        if (i == 1 || i == 2 || i == 3) {
            this.a.a(dbaz.ACCEPTED);
        } else if (i == 4) {
            this.a.a(dbaz.COMPLETED);
        } else if (i != 6) {
        } else {
            this.a.a(dbaz.CANCELLED);
        }
    }
}
