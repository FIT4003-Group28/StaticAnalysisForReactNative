package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: cocw  reason: default package */
/* loaded from: classes.dex */
public final class cocw extends cocv {
    public cocw() {
        new ApplicationErrorReport();
        throw null;
    }

    @Override // defpackage.cocv
    public final FeedbackOptions b() {
        cnwc.a(this.g.crashInfo.exceptionClassName);
        cnwc.a(this.g.crashInfo.throwClassName);
        cnwc.a(this.g.crashInfo.throwMethodName);
        cnwc.a(this.g.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.g.crashInfo.throwFileName)) {
            this.g.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions b = super.b();
        b.d.crashInfo = this.g.crashInfo;
        b.g = null;
        return b;
    }

    public cocw(Throwable th) {
        this.g = new ApplicationErrorReport();
        this.g.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.g.crashInfo.throwLineNumber = -1;
        this.g.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
