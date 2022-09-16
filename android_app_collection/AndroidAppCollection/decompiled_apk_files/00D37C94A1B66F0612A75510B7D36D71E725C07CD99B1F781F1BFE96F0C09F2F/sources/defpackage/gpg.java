package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
/* compiled from: PG */
/* renamed from: gpg  reason: default package */
/* loaded from: classes3.dex */
public final class gpg {
    public final Random a;
    public String b;
    public apzg c;
    public apzg d;
    public apzg e;
    public String f;
    public final vne g;

    public gpg(SecureRandom secureRandom, vne vneVar) {
        this.a = secureRandom;
        this.g = vneVar;
    }

    private final boolean f(String str) {
        return str != null && str.equals(this.b);
    }

    public final boolean c(Uri uri) {
        return f(uri.getQueryParameter("token"));
    }

    public final boolean d(Activity activity) {
        Intent intent = activity.getIntent();
        if (!f(intent.getStringExtra("TOKEN_EXTRA"))) {
            zep.b("Invalid token");
            return false;
        }
        String stringExtra = intent.getStringExtra("URL_EXTRA");
        if (TextUtils.isEmpty(stringExtra)) {
            zep.b("Invalid url");
            return false;
        }
        Uri parse = Uri.parse(stringExtra);
        aer a = new aeq().a();
        String a2 = bact.a(activity);
        if (!TextUtils.isEmpty(a2)) {
            try {
                a.a.setPackage(a2);
                a.a(activity, parse);
                return true;
            } catch (ActivityNotFoundException e) {
                zep.d("Unable to launch CustomTabsIntent.", e);
                return false;
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        if (activity.getPackageManager().queryIntentActivities(intent2, 128).isEmpty()) {
            zep.b("Cannot open link to complete UriFlow.");
            return false;
        }
        ylx.j(this.g.b(new gpf(this, 1), anjk.a), anjk.a, gpe.a);
        activity.startActivity(intent2.setFlags(268435456));
        return true;
    }

    public final int e(Intent intent) {
        Uri data = intent.getData();
        if (data != null && c(data)) {
            String queryParameter = data.getQueryParameter("result");
            if ("success".equals(queryParameter)) {
                return 2;
            }
            if ("error".equals(queryParameter)) {
                return 3;
            }
            if ("cancel".equals(queryParameter)) {
                return 4;
            }
        }
        return 1;
    }
}
