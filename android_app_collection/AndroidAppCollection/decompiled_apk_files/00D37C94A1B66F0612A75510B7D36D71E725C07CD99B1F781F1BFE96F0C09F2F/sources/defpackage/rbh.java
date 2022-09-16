package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: rbh  reason: default package */
/* loaded from: classes4.dex */
public final class rbh {
    public static final Status a = new Status(13);
    public static final qso b;
    private static final twx c;
    private static final tzc d;

    static {
        twx twxVar = new twx();
        c = twxVar;
        rbb rbbVar = new rbb();
        d = rbbVar;
        b = new qso("Feedback.API", rbbVar, twxVar, null, null, null);
    }

    public static qta a(qsx qsxVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        rbf rbfVar = new rbf(qsxVar, feedbackOptions, bundle, j);
        qsxVar.a(rbfVar);
        return rbfVar;
    }

    public static qta b(qsx qsxVar, Bundle bundle, long j) {
        rbe rbeVar = new rbe(qsxVar, bundle, j);
        qsxVar.a(rbeVar);
        return rbeVar;
    }

    @Deprecated
    public static qta c(qsx qsxVar, FeedbackOptions feedbackOptions) {
        rbd rbdVar = new rbd(qsxVar, feedbackOptions);
        qsxVar.a(rbdVar);
        return rbdVar;
    }

    @Deprecated
    public static qta d(qsx qsxVar, FeedbackOptions feedbackOptions) {
        rbc rbcVar = new rbc(qsxVar, feedbackOptions, ((qur) qsxVar).a.w, System.nanoTime());
        qsxVar.a(rbcVar);
        return rbcVar;
    }

    public static qst e(Context context) {
        return new qst(context);
    }
}
