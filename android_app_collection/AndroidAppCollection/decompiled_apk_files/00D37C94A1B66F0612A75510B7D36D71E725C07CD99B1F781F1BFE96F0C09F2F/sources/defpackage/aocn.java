package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: PG */
/* renamed from: aocn  reason: default package */
/* loaded from: classes.dex */
final class aocn extends BroadcastReceiver {
    public aoco a;

    public aocn(aoco aocoVar) {
        this.a = aocoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aoco aocoVar = this.a;
        if (aocoVar != null && aocoVar.b()) {
            aoco aocoVar2 = this.a;
            FirebaseMessaging firebaseMessaging = aocoVar2.a;
            FirebaseMessaging.l(aocoVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
