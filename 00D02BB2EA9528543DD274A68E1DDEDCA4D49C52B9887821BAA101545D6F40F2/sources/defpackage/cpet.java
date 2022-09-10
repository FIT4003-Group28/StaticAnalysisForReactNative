package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.ConsentFlowConfig;
/* compiled from: PG */
/* renamed from: cpet  reason: default package */
/* loaded from: classes5.dex */
final class cpet implements cpdp {
    private final Status a;

    public cpet(Status status) {
        this.a = status;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cpdp
    public final void b(Activity activity, int i, ConsentFlowConfig consentFlowConfig) {
        IntentSender intentSender = this.a.i.getIntentSender();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("UdcConsentFlowConfig", consentFlowConfig);
        intent.putExtra("UdcConsentFlowConfigBundle", bundle);
        activity.startIntentSenderForResult(intentSender, i, intent, 0, 0, 0);
    }
}
