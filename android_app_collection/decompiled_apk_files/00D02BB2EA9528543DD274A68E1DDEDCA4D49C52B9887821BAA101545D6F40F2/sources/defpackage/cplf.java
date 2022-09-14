package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.io.IOException;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cplf  reason: default package */
/* loaded from: classes5.dex */
public final class cplf extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ReportAbuseActivity a;

    public cplf(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        try {
            try {
                JSONObject put = new JSONObject().put("reportId", this.a.C);
                ReportAbuseActivity reportAbuseActivity = this.a;
                if (!reportAbuseActivity.x) {
                    reportAbuseActivity.q.onSucceeded(null, null);
                } else {
                    cpki cpkiVar = reportAbuseActivity.r;
                    String str = reportAbuseActivity.D;
                    UrlRequest.Builder mo29newUrlRequestBuilder = cpkiVar.c.b().mo29newUrlRequestBuilder(cpkiVar.d.buildUpon().appendEncodedPath("v1:undo_report_abuse").build().toString(), reportAbuseActivity.q, cpkiVar.b);
                    try {
                        byte[] bytes = put.toString().getBytes("UTF-8");
                        if (bytes == null) {
                            throw new IOException("Failed to serialize undo request as JSON.");
                        }
                        mo29newUrlRequestBuilder.mo47setUploadDataProvider(new cpkk(bytes), cpkiVar.b).mo41addHeader("Content-Type", "application/json; charset=UTF-8");
                        cpkiVar.a(mo29newUrlRequestBuilder, str);
                        mo29newUrlRequestBuilder.mo43build().start();
                    } catch (IOException e) {
                        throw new IOException("Failed to serialize undo request as JSON.", e);
                    }
                }
            } catch (IOException e2) {
                e = e2;
                this.a.t(e, 1003);
                return null;
            }
        } catch (cmra e3) {
            e = e3;
            this.a.t(e, 1003);
            return null;
        } catch (JSONException e4) {
            e = e4;
            this.a.t(e, 1003);
            return null;
        }
        return null;
    }
}
