package defpackage;

import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import org.chromium.net.CronetException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cple  reason: default package */
/* loaded from: classes5.dex */
public final class cple implements cpkj {
    final /* synthetic */ ReportAbuseActivity a;

    public cple(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // defpackage.cpkj
    public final void a(String str) {
        this.a.s(new Runnable(this) { // from class: cpld
            private final cple a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.l.f();
            }
        });
        if (this.a.x) {
            try {
                if (new JSONObject(str).has("error")) {
                    throw new JSONException("Error response from server.");
                }
            } catch (JSONException unused) {
                this.a.t(new JSONException("Undo was unsuccessful."), 1003);
                return;
            }
        }
        this.a.p(false, -1, -1, null, null);
    }

    @Override // defpackage.cpkj
    public final void b(CronetException cronetException) {
        this.a.t(cronetException, 1003);
    }
}
