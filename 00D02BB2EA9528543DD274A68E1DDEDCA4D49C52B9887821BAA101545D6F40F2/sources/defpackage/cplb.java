package defpackage;

import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import org.chromium.net.CronetException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cplb  reason: default package */
/* loaded from: classes5.dex */
public final class cplb implements cpkj {
    final /* synthetic */ ReportAbuseActivity a;

    public cplb(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // defpackage.cpkj
    public final void a(String str) {
        this.a.s(new Runnable(this) { // from class: cpla
            private final cplb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.l.f();
            }
        });
        ReportAbuseActivity reportAbuseActivity = this.a;
        if (reportAbuseActivity.x) {
            try {
                reportAbuseActivity.C = new JSONObject(str).getString("reportId");
                return;
            } catch (JSONException e) {
                this.a.t(e, 1002);
                return;
            }
        }
        reportAbuseActivity.C = "no_report_id";
    }

    @Override // defpackage.cpkj
    public final void b(CronetException cronetException) {
        this.a.t(cronetException, 1002);
    }
}
