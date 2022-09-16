package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: akur  reason: default package */
/* loaded from: classes.dex */
final class akur extends BroadcastReceiver {
    final /* synthetic */ akus a;

    public akur(akus akusVar) {
        this.a = akusVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        synchronized (this.a) {
            if (this.a.a && intent != null && (action = intent.getAction()) != null) {
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    ((aktp) this.a.c.get()).a = true;
                } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                    ((aktp) this.a.c.get()).a = false;
                } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    ((aktp) this.a.c.get()).a(intent);
                    akut akutVar = (akut) this.a.d.get();
                    synchronized (akutVar.a) {
                        for (aktk aktkVar : akutVar.e.values()) {
                            if (aktkVar.e()) {
                                aktkVar.a();
                            }
                        }
                    }
                }
            }
        }
    }
}
