package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ajdy  reason: default package */
/* loaded from: classes2.dex */
final class ajdy extends BroadcastReceiver {
    final /* synthetic */ ajdz a;

    public ajdy(ajdz ajdzVar) {
        this.a = ajdzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIME_TICK".equals(intent.getAction())) {
            ajee ajeeVar = this.a.af;
            dbsk.s(ajeeVar);
            cqkx.p(ajeeVar);
        }
    }
}
