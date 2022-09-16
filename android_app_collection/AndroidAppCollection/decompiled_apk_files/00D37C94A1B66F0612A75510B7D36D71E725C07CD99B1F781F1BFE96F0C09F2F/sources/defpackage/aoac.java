package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;
/* compiled from: PG */
/* renamed from: aoac  reason: default package */
/* loaded from: classes.dex */
final class aoac extends BroadcastReceiver {
    public aoad a;

    public aoac(aoad aoadVar) {
        this.a = aoadVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aoad aoadVar = this.a;
        if (aoadVar != null && aoadVar.b()) {
            aoab aoabVar = FirebaseInstanceId.a;
            aoad aoadVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = aoadVar2.a;
            FirebaseInstanceId.m(aoadVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
