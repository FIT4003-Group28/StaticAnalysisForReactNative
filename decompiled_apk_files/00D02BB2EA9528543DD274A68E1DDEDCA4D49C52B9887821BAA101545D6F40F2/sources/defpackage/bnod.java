package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bnod  reason: default package */
/* loaded from: classes3.dex */
public final class bnod {
    public static Intent a(dvev dvevVar, Context context) {
        Intent intent;
        if (dvevVar.e) {
            intent = afft.a(context);
            intent.putExtra("GMM_ENABLE_ONE_BACK_TAP", false);
        } else {
            intent = new Intent();
        }
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(dvevVar.d));
        return intent;
    }
}
