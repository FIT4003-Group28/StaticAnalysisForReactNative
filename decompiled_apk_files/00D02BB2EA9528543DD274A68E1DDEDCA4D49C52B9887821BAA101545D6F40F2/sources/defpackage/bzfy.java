package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzfy  reason: default package */
/* loaded from: classes4.dex */
final class bzfy extends BroadcastReceiver {
    final /* synthetic */ bzgb a;

    public bzfy(bzgb bzgbVar) {
        this.a = bzgbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.c != 1) {
            if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                this.a.a(3);
            } else if (!intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            } else {
                this.a.a(2);
            }
        }
    }
}
