package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: cllk  reason: default package */
/* loaded from: classes5.dex */
final class cllk extends BroadcastReceiver implements Runnable {
    private final Handler a;

    public cllk(Handler handler) {
        this.a = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
