package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aint  reason: default package */
/* loaded from: classes.dex */
public final class aint extends BroadcastReceiver {
    final /* synthetic */ aizn a;
    final /* synthetic */ aioe b;
    final /* synthetic */ ainw c;

    public aint(ainw ainwVar, aizn aiznVar, aioe aioeVar) {
        this.c = ainwVar;
        this.a = aiznVar;
        this.b = aioeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || "noop".equals(action)) {
            return;
        }
        if ("com.google.android.libraries.youtube.player.action.controller_notification_delete".equals(action)) {
            this.a.b();
        } else if ("android.intent.action.MAIN".equals(action)) {
            this.b.d();
        }
        for (aino ainoVar : this.c.b) {
            if (ainoVar.i(action)) {
                this.b.b(ainoVar);
            }
        }
    }
}
