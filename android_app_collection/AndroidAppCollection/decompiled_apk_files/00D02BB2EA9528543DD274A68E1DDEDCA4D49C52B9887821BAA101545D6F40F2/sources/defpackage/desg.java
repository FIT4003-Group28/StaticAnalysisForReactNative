package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;
/* compiled from: PG */
/* renamed from: desg  reason: default package */
/* loaded from: classes6.dex */
final class desg extends BroadcastReceiver {
    @dzsi
    public desh a;

    public desg(desh deshVar) {
        this.a = deshVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        desh deshVar = this.a;
        if (deshVar != null && deshVar.b()) {
            desf desfVar = FirebaseInstanceId.a;
            desh deshVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = deshVar2.a;
            FirebaseInstanceId.m(deshVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
