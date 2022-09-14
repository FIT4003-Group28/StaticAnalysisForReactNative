package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cpkz  reason: default package */
/* loaded from: classes5.dex */
public final class cpkz extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ReportAbuseActivity a;

    public cpkz(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        ReportAbuseActivity reportAbuseActivity;
        Exception e;
        cpcq b;
        try {
            ReportAbuseActivity reportAbuseActivity2 = this.a;
            if (!reportAbuseActivity2.G) {
                cmri cmriVar = reportAbuseActivity2.I;
                try {
                    b = cpda.a(cmrh.l(cmriVar.a, reportAbuseActivity2.D));
                } catch (cmra | IOException e2) {
                    b = cpda.b(e2);
                }
                reportAbuseActivity2.y = (String) cpda.d(b);
            }
            this.a.s(new Runnable(this) { // from class: cpky
                private final cpkz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.j();
                }
            });
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            reportAbuseActivity = this.a;
            reportAbuseActivity.t(e, 1001);
            return null;
        } catch (ExecutionException e4) {
            reportAbuseActivity = this.a;
            e = (Exception) e4.getCause();
            reportAbuseActivity.t(e, 1001);
            return null;
        }
    }
}
