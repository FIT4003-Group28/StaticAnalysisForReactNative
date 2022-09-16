package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cvxg  reason: default package */
/* loaded from: classes5.dex */
public final class cvxg {
    public static <AccountT> void a(Activity activity, int i, cwfn cwfnVar, AccountT accountt, String str) {
        if (accountt == null) {
            try {
                new ahr().a().a(activity, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException unused) {
                return;
            }
        }
        cwfn.f(accountt);
        b(activity, i, accountt);
    }

    public static <AccountT> void b(Activity activity, int i, AccountT accountt) {
        CharSequence b;
        cwfn.f(accountt);
        dbsk.a(true);
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", i - 1).putExtra("extra.utmSource", "OG");
        b = ((cwfm) accountt).b();
        putExtra.putExtra("extra.accountName", b);
        activity.startActivityForResult(putExtra, 51332);
    }
}
