package defpackage;

import android.content.Intent;
import android.content.IntentSender;
/* compiled from: PG */
/* renamed from: agf  reason: default package */
/* loaded from: classes.dex */
final class agf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ IntentSender.SendIntentException b;
    final /* synthetic */ agg c;

    public agf(agg aggVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.c = aggVar;
        this.a = i;
        this.b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
    }
}
