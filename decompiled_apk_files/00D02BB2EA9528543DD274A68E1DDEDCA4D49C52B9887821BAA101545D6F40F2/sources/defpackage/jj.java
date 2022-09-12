package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
/* compiled from: PG */
/* renamed from: jj  reason: default package */
/* loaded from: classes7.dex */
public final class jj extends BroadcastReceiver {
    final /* synthetic */ IntentSender a;

    public jj(IntentSender intentSender) {
        this.a = intentSender;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            this.a.sendIntent(context, 0, null, null, null);
        } catch (IntentSender.SendIntentException unused) {
        }
    }
}
