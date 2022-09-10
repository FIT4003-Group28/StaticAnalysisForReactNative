package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bynk  reason: default package */
/* loaded from: classes4.dex */
public final class bynk implements DialogInterface.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ bynq b;

    public bynk(bynq bynqVar, boolean z) {
        this.b = bynqVar;
        this.a = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent;
        this.b.g.i(cjtd.a(this.a ? dtyi.dm : dtyi.dl));
        try {
            if (this.a) {
                dpad dpadVar = this.b.k;
                dbsk.s(dpadVar);
                intent = null;
                if ((dpadVar.a & 2) != 0) {
                    dqdk dqdkVar = dpadVar.c;
                    if (dqdkVar == null) {
                        dqdkVar = dqdk.e;
                    }
                    if ((dqdkVar.a & 1) != 0) {
                        dplx dplxVar = dqdkVar.b;
                        if (dplxVar == null) {
                            dplxVar = dplx.g;
                        }
                        intent = bvrq.a(dplxVar);
                    }
                }
                if (intent == null) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setPackage("com.waze");
                }
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.waze&referrer=utm_source%3Dgmm%26utm_campaign%3Dgmm_android"));
            }
            if (this.b.f.a().a()) {
                this.b.f.a().b().f(this.b.e, intent, 4);
            } else {
                this.b.e.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.b.e, this.b.e.getString(R.string.WAZE_NOT_AVAILABLE), 0).show();
        }
    }
}
