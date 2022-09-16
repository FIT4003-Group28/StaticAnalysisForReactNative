package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: airo  reason: default package */
/* loaded from: classes.dex */
public final class airo extends BroadcastReceiver {
    public boolean a;
    final /* synthetic */ airr b;
    private Handler c;

    public airo(airr airrVar) {
        this.b = airrVar;
    }

    public final void a() {
        if (aiix.e(this.b.i.a).N) {
            return;
        }
        if (this.c == null) {
            this.c = new Handler();
        }
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.b.a.registerReceiver(this, intentFilter);
        this.a = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (this.b.t.h() || this.b.c.i().b <= 0) {
                return;
            }
            this.c.postDelayed(new Runnable() { // from class: airn
                @Override // java.lang.Runnable
                public final void run() {
                    airo airoVar = airo.this;
                    if (!airoVar.b.t.h()) {
                        airoVar.b.r();
                    }
                }
            }, 180000L);
            return;
        }
        this.c.removeCallbacksAndMessages(null);
    }
}
