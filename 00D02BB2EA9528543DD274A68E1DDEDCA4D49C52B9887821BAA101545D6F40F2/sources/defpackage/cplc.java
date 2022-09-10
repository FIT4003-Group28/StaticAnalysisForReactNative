package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.io.IOException;
import java.util.Date;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cplc  reason: default package */
/* loaded from: classes5.dex */
public final class cplc extends AsyncTask<ckb, Void, Void> {
    final /* synthetic */ ReportAbuseActivity a;

    public cplc(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(ckb[] ckbVarArr) {
        this.a.w = ckbVarArr[0];
        try {
            try {
                cpmd cpmdVar = new cpmd();
                ReportAbuseActivity reportAbuseActivity = this.a;
                cpmdVar.a = reportAbuseActivity.t;
                cpmdVar.b = reportAbuseActivity.A;
                cpmdVar.g = reportAbuseActivity.w.b;
                cpmdVar.c = reportAbuseActivity.B;
                cpmdVar.d = new Date().getTime() * 1000;
                cpmdVar.e = "OBFUSCATED_GAIA";
                ReportAbuseActivity reportAbuseActivity2 = this.a;
                cpmdVar.h = reportAbuseActivity2.F;
                cpmdVar.i = reportAbuseActivity2.z;
                if (!reportAbuseActivity2.G) {
                    cpmdVar.f = reportAbuseActivity2.y;
                }
                if (!reportAbuseActivity2.x) {
                    reportAbuseActivity2.p.onSucceeded(null, null);
                } else {
                    cpki cpkiVar = reportAbuseActivity2.r;
                    String str = reportAbuseActivity2.D;
                    JSONObject put = new JSONObject().put("idInt", cpmdVar.g);
                    JSONObject put2 = new JSONObject().put("type", cpmdVar.e).put("id", cpmdVar.f);
                    JSONObject put3 = new JSONObject().put("configName", cpmdVar.a).put("timestampMicros", cpmdVar.d).put("reportedContent", cpmdVar.c).put("reportedItemId", cpmdVar.b).put("reporter", put2).put("abuseType", put).put("header", new JSONObject().put("identifier", new JSONObject().put("platform", 2).put("version", "v1").put("desc", cpmdVar.h))).put("reporterRole", cpmdVar.i.d);
                    UrlRequest.Builder mo29newUrlRequestBuilder = cpkiVar.c.b().mo29newUrlRequestBuilder(cpkiVar.d.buildUpon().appendEncodedPath("v1:report_abuse").build().toString(), this.a.p, cpkiVar.b);
                    try {
                        byte[] bytes = put3.toString().getBytes("UTF-8");
                        if (bytes == null) {
                            throw new IOException("Failed to serialize report request as JSON.");
                        }
                        mo29newUrlRequestBuilder.mo47setUploadDataProvider(new cpkk(bytes), cpkiVar.b).mo41addHeader("Content-Type", "application/json; charset=UTF-8");
                        cpkiVar.a(mo29newUrlRequestBuilder, str);
                        mo29newUrlRequestBuilder.mo43build().start();
                    } catch (IOException e) {
                        throw new IOException("Failed to serialize report request as JSON.", e);
                    }
                }
            } catch (IOException e2) {
                e = e2;
                this.a.t(e, 1002);
                return null;
            }
        } catch (cmra e3) {
            e = e3;
            this.a.t(e, 1002);
            return null;
        } catch (JSONException e4) {
            e = e4;
            this.a.t(e, 1002);
            return null;
        }
        return null;
    }
}
