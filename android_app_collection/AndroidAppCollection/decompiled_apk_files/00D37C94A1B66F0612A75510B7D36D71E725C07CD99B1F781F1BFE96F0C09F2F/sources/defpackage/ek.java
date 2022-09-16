package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ek  reason: default package */
/* loaded from: classes3.dex */
public final class ek extends ach {
    @Override // defpackage.ach
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }

    @Override // defpackage.ach
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                acf acfVar = new acf(intentSenderRequest.a);
                acfVar.a = null;
                acfVar.b(intentSenderRequest.d, intentSenderRequest.c);
                intentSenderRequest = acfVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateIntent created the following intent: ");
            sb.append(intent);
        }
        return intent;
    }
}
