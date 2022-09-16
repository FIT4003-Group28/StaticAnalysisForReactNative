package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.BillingClientNativeCallback;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: cdm  reason: default package */
/* loaded from: classes2.dex */
public final class cdm extends BroadcastReceiver {
    public final ceg a;
    public boolean b;
    public final /* synthetic */ cdn c;
    public final BillingClientNativeCallback d = null;

    public cdm(cdn cdnVar, ceg cegVar) {
        this.c = cdnVar;
        this.a = cegVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ced c = ceh.c(intent, "BillingBroadcastManager");
        ceg cegVar = this.a;
        if (cegVar == null) {
            ceh.f(intent.getExtras());
            throw null;
        } else if (c.a != 0) {
            cegVar.b(c, amuk.q());
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                ceh.e("BillingBroadcastManager", "Bundle is null.");
                this.a.b(cee.f, amuk.q());
                return;
            }
            String string = extras.getString("FIRST_PARTY_PURCHASE_DATA");
            if (string == null) {
                ceh.e("BillingBroadcastManager", "Couldn't find purchase data in Bundle.");
                this.a.b(cee.f, amuk.q());
                return;
            }
            try {
                this.a.b(c, amuk.r(new cef(string)));
            } catch (JSONException unused) {
                ceh.e("BillingBroadcastManager", String.format("Parse invalid first party purchase info: [%s]", string));
                this.a.b(cee.f, amuk.q());
            }
        }
    }
}
