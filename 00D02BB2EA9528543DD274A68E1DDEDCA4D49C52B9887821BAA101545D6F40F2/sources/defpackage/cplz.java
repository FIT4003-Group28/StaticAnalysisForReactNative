package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cplz  reason: default package */
/* loaded from: classes5.dex */
public final class cplz {
    public String a;
    public String b;
    public cplx c;
    private String d;
    private String e;

    public final Intent a(Context context) {
        Intent intent = new Intent(context, ReportAbuseActivity.class);
        if (this.a == null || this.d == null) {
            throw new IllegalStateException("ReportAbuse Intent required arguments must not be null.");
        }
        cplx cplxVar = this.c;
        if (cplxVar != null) {
            cply.a.b = cplxVar;
        }
        intent.putExtra("config_name", this.a);
        intent.putExtra("reported_item_id", this.d);
        intent.putExtra("reported_item_extra_data", (Parcelable) null);
        intent.putExtra("additional_display_data", (Bundle) null);
        intent.putExtra("language", this.b);
        intent.putExtra("reporter_account_name", this.e);
        intent.putExtra("fulfilled_requirements", (String[]) null);
        intent.putExtra("no_report_mode", true);
        intent.putExtra("app_source", (String) null);
        intent.putExtra("reporter_role", (Serializable) null);
        intent.putExtra("client_environment", (String) null);
        return intent;
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new IllegalArgumentException("ReportAbuse reported item id cannot be null.");
    }

    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new IllegalArgumentException("ReportAbuse account name cannot be null.");
    }
}
