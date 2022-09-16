package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eay  reason: default package */
/* loaded from: classes3.dex */
public final class eay implements aafl {
    private final Activity a;
    private final afvn b;
    private final ajgr c;

    public eay(Activity activity, afvn afvnVar, ajgr ajgrVar) {
        this.a = activity;
        this.b = afvnVar;
        this.c = ajgrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar != null && (this.b.c() instanceof AccountIdentity)) {
            AccountIdentity accountIdentity = (AccountIdentity) this.b.c();
            if (accountIdentity.w()) {
                this.c.c(this.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", accountIdentity.e(), Locale.getDefault().getLanguage())).appendQueryParameter("Email", accountIdentity.a()).build());
            } else {
                this.a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", accountIdentity.a()).putExtra("extra.screenId", 217), 0);
            }
        }
    }
}
