package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rbd  reason: default package */
/* loaded from: classes4.dex */
public final class rbd extends rbg {
    final /* synthetic */ FeedbackOptions a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbd(qsx qsxVar, FeedbackOptions feedbackOptions) {
        super(qsxVar);
        this.a = feedbackOptions;
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        rbl rblVar = (rbl) qsiVar;
        FeedbackOptions feedbackOptions = this.a;
        tzh.s(feedbackOptions);
        if (((Boolean) rbq.a.a()).booleanValue()) {
            rbo rboVar = (rbo) rblVar.D();
            Parcel pv = rboVar.pv();
            dve.g(pv, feedbackOptions);
            Parcel pw = rboVar.pw(7, pv);
            dve.j(pw);
            pw.recycle();
        } else {
            rbo rboVar2 = (rbo) rblVar.D();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, rblVar.a.getCacheDir());
            Parcel pv2 = rboVar2.pv();
            dve.g(pv2, errorReport);
            Parcel pw2 = rboVar2.pw(3, pv2);
            dve.j(pw2);
            pw2.recycle();
        }
        n(Status.a);
    }
}
