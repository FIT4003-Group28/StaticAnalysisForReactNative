package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {
    private ResultReceiver a;
    private boolean b;

    private final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r0 = 0
            java.lang.String r1 = "ProxyBillingActivity"
            r2 = 100
            if (r5 != r2) goto L71
            ced r5 = defpackage.ceh.c(r7, r1)
            int r5 = r5.a
            r2 = -1
            if (r6 != r2) goto L19
            if (r5 == 0) goto L17
            r6 = -1
            goto L19
        L17:
            r5 = 0
            goto L37
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 85
            r2.<init>(r3)
            java.lang.String r3 = "Activity finished with resultCode "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " and billing's responseCode: "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r6 = r2.toString()
            defpackage.ceh.e(r1, r6)
        L37:
            android.os.ResultReceiver r6 = r4.a
            if (r6 == 0) goto L47
            if (r7 != 0) goto L3f
            r7 = 0
            goto L43
        L3f:
            android.os.Bundle r7 = r7.getExtras()
        L43:
            r6.send(r5, r7)
            goto L8c
        L47:
            android.content.Intent r5 = r4.a()
            if (r7 == 0) goto L6d
            android.os.Bundle r6 = r7.getExtras()
            if (r6 == 0) goto L5b
            android.os.Bundle r6 = r7.getExtras()
            r5.putExtras(r6)
            goto L6d
        L5b:
            java.lang.String r6 = "Got null bundle!"
            defpackage.ceh.e(r1, r6)
            r6 = 6
            java.lang.String r7 = "RESPONSE_CODE"
            r5.putExtra(r7, r6)
            java.lang.String r6 = "DEBUG_MESSAGE"
            java.lang.String r7 = "An internal error occurred."
            r5.putExtra(r6, r7)
        L6d:
            r4.sendBroadcast(r5)
            goto L8c
        L71:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 69
            r6.<init>(r7)
            java.lang.String r7 = "Got onActivityResult with wrong requestCode: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "; skipping..."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.ceh.e(r1, r5)
        L8c:
            r4.b = r0
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            int i = ceh.a;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else {
                pendingIntent = null;
            }
            try {
                this.b = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(valueOf);
                ceh.e("ProxyBillingActivity", sb.toString());
                ResultReceiver resultReceiver = this.a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    Intent a = a();
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a);
                }
                this.b = false;
                finish();
                return;
            }
        }
        int i2 = ceh.a;
        this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (!bundle.containsKey("result_receiver")) {
            return;
        }
        this.a = (ResultReceiver) bundle.getParcelable("result_receiver");
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent a = a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
    }
}
