package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cocr  reason: default package */
/* loaded from: classes5.dex */
public final class cocr extends cocs {
    final /* synthetic */ FeedbackOptions a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cocr(GoogleApiClient googleApiClient, FeedbackOptions feedbackOptions) {
        super(googleApiClient);
        this.a = feedbackOptions;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(codb codbVar) {
        codb codbVar2 = codbVar;
        FeedbackOptions feedbackOptions = this.a;
        codd.b(feedbackOptions);
        if (codf.a.a().booleanValue()) {
            ((codc) codbVar2.L()).e(feedbackOptions);
        } else {
            ((codc) codbVar2.L()).f(new ErrorReport(feedbackOptions, codbVar2.a.getCacheDir()));
        }
        p(Status.a);
    }
}
