package defpackage;

import android.content.Intent;
import android.content.IntentSender;
/* compiled from: PG */
/* renamed from: abn  reason: default package */
/* loaded from: classes.dex */
public final class abn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ IntentSender.SendIntentException b;
    final /* synthetic */ acd c;

    public abn(acd acdVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.c = acdVar;
        this.a = i;
        this.b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
    }
}
