package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cxnc  reason: default package */
/* loaded from: classes5.dex */
public final class cxnc {
    public static final void b(Activity activity, String str) {
        if (str == null || str.isEmpty()) {
            a(activity);
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str).putExtra("extra.screenId", 500);
        if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
            a(activity);
        } else {
            activity.startActivityForResult(putExtra, 0);
        }
    }

    static final void a(Context context) {
        try {
            ahr ahrVar = new ahr();
            ahrVar.c(Color.parseColor("#eeeeee"));
            ahrVar.a().a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new cxnb();
        }
    }
}
