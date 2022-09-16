package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: rbf  reason: default package */
/* loaded from: classes4.dex */
final class rbf extends rbg {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbf(qsx qsxVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(qsxVar);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        rbl rblVar = (rbl) qsiVar;
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            tzh.r(bundle);
            tzh.s(feedbackOptions);
            rbo rboVar = (rbo) rblVar.D();
            Parcel pv = rboVar.pv();
            dve.g(pv, feedbackOptions);
            dve.g(pv, bundle);
            pv.writeLong(j);
            rboVar.px(5, pv);
            n(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            l(rbh.a);
        }
    }
}
