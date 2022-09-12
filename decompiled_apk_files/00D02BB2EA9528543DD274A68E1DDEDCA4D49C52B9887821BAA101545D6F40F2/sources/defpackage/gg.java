package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gg  reason: default package */
/* loaded from: classes.dex */
public final class gg extends agz<IntentSenderRequest, ActivityResult> {
    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ ActivityResult a(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ Intent b(IntentSenderRequest intentSenderRequest) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest2.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                agx agxVar = new agx(intentSenderRequest2.a);
                agxVar.b(intentSenderRequest2.d, intentSenderRequest2.c);
                intentSenderRequest2 = agxVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
        if (gn.a(2)) {
            String str = "CreateIntent created the following intent: " + intent;
        }
        return intent;
    }
}
