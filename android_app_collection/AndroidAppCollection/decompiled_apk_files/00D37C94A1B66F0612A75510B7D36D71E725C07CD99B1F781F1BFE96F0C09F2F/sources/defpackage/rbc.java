package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: rbc  reason: default package */
/* loaded from: classes4.dex */
final class rbc extends rbg {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbc(qsx qsxVar, FeedbackOptions feedbackOptions, Context context, long j) {
        super(qsxVar);
        this.a = feedbackOptions;
        this.b = context;
        this.c = j;
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        rbl rblVar = (rbl) qsiVar;
        FeedbackOptions feedbackOptions = this.a;
        tzh tzhVar = feedbackOptions.q;
        if (tzhVar == null) {
            tzh.s(feedbackOptions);
            rblVar.k(feedbackOptions);
            rbo rboVar = (rbo) rblVar.D();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, rblVar.a.getCacheDir());
            Parcel pv = rboVar.pv();
            dve.g(pv, errorReport);
            Parcel pw = rboVar.pw(1, pv);
            dve.j(pw);
            pw.recycle();
            n(Status.a);
            return;
        }
        Context context = this.b;
        long j = this.c;
        tzh.t(new rbm(context, j));
        tzh.t(new rbn(context, tzhVar, j, null, null, null));
        FeedbackOptions feedbackOptions2 = this.a;
        long j2 = this.c;
        tzh.s(feedbackOptions2);
        rblVar.k(feedbackOptions2);
        rbo rboVar2 = (rbo) rblVar.D();
        ErrorReport errorReport2 = new ErrorReport(feedbackOptions2, rblVar.a.getCacheDir());
        Parcel pv2 = rboVar2.pv();
        dve.g(pv2, errorReport2);
        pv2.writeLong(j2);
        rboVar2.py(6, pv2);
        n(Status.a);
    }
}
