package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: rbj  reason: default package */
/* loaded from: classes4.dex */
public final class rbj extends rbi {
    public String f;

    public rbj() {
        this.e = new ApplicationErrorReport();
        throw null;
    }

    @Override // defpackage.rbi
    public final FeedbackOptions a() {
        qnm.b(this.e.crashInfo.exceptionClassName);
        qnm.b(this.e.crashInfo.throwClassName);
        qnm.b(this.e.crashInfo.throwMethodName);
        qnm.b(this.e.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.e.crashInfo.throwFileName)) {
            this.e.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.a();
        a.d.crashInfo = this.e.crashInfo;
        a.g = this.f;
        return a;
    }

    public rbj(Throwable th) {
        this.e = new ApplicationErrorReport();
        this.e.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.e.crashInfo.throwLineNumber = -1;
        this.e.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
