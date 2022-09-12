package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.io.IOException;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: cpkx  reason: default package */
/* loaded from: classes5.dex */
public final class cpkx extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ReportAbuseActivity a;

    public cpkx(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        try {
            ReportAbuseActivity reportAbuseActivity = this.a;
            cpki cpkiVar = reportAbuseActivity.r;
            String str = reportAbuseActivity.D;
            String str2 = reportAbuseActivity.t;
            String str3 = reportAbuseActivity.u;
            UrlRequest.Callback callback = reportAbuseActivity.o;
            Uri.Builder appendPath = cpkiVar.d.buildUpon().appendPath("v1").appendPath("configuration").appendPath(str2);
            if (str3 != null) {
                appendPath.appendQueryParameter("language", str3);
            }
            UrlRequest.Builder mo29newUrlRequestBuilder = cpkiVar.c.b().mo29newUrlRequestBuilder(appendPath.build().toString(), callback, cpkiVar.b);
            for (int i = 0; i < cpki.a.j; i++) {
                mo29newUrlRequestBuilder.mo41addHeader(cpki.a.i(i), cpki.a.j(i));
            }
            mo29newUrlRequestBuilder.mo45setHttpMethod("GET");
            cpkiVar.a(mo29newUrlRequestBuilder, str);
            mo29newUrlRequestBuilder.mo43build().start();
            return null;
        } catch (cmra | IOException e) {
            this.a.t(e, 1000);
            return null;
        }
    }
}
