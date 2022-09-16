package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: rli  reason: default package */
/* loaded from: classes4.dex */
public final class rli {
    final rlx a;

    public rli(rlx rlxVar) {
        this.a = rlxVar;
    }

    public rli(rpn rpnVar) {
        this.a = rpnVar.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        try {
            qyq b = qyr.b(this.a.a);
            if (b != null) {
                return b.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.aG().k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.aG().k.b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String uri;
        this.a.r();
        if (!this.a.w()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (TextUtils.isEmpty(uri)) {
                return;
            }
            this.a.h().t.b(uri);
            this.a.h().u.b(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.h().u.a() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return c() && System.currentTimeMillis() - this.a.h().u.a() > this.a.g.h(null, rkg.R);
    }
}
