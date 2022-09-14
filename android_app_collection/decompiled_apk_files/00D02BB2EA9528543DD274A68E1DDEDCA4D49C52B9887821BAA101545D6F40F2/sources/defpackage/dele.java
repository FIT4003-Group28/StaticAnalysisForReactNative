package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dele  reason: default package */
/* loaded from: classes6.dex */
public final class dele {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public dele(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        cnwc.c(!cnxu.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public static dele fromResource(Context context) {
        cnwc.a(context);
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String a = cnwh.a("google_app_id", resources, resourcePackageName);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new dele(a, cnwh.a("google_api_key", resources, resourcePackageName), cnwh.a("firebase_database_url", resources, resourcePackageName), cnwh.a("ga_trackingId", resources, resourcePackageName), cnwh.a("gcm_defaultSenderId", resources, resourcePackageName), cnwh.a("google_storage_bucket", resources, resourcePackageName), cnwh.a("project_id", resources, resourcePackageName));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dele)) {
            return false;
        }
        dele deleVar = (dele) obj;
        return cnvv.a(this.b, deleVar.b) && cnvv.a(this.a, deleVar.a) && cnvv.a(this.e, deleVar.e) && cnvv.a(this.f, deleVar.f) && cnvv.a(this.c, deleVar.c) && cnvv.a(this.g, deleVar.g) && cnvv.a(this.d, deleVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("applicationId", this.b);
        b.a("apiKey", this.a);
        b.a("databaseUrl", this.e);
        b.a("gcmSenderId", this.c);
        b.a("storageBucket", this.g);
        b.a("projectId", this.d);
        return b.toString();
    }
}
