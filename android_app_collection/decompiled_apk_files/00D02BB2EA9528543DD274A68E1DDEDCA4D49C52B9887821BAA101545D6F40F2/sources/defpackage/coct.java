package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: coct  reason: default package */
/* loaded from: classes.dex */
public final class coct {
    public static final Api<cnnv> a;
    private static final cnoa<codb> b;
    private static final cnnp<codb, cnnv> c;

    static {
        new Status(13);
        cnoa<codb> cnoaVar = new cnoa<>();
        b = cnoaVar;
        cocp cocpVar = new cocp();
        c = cocpVar;
        a = new Api<>("Feedback.API", cocpVar, cnoaVar);
    }

    @Deprecated
    public static cnoh<Status> a(GoogleApiClient googleApiClient, FeedbackOptions feedbackOptions) {
        googleApiClient.getContext();
        cocq cocqVar = new cocq(googleApiClient, feedbackOptions);
        googleApiClient.enqueue(cocqVar);
        return cocqVar;
    }

    @Deprecated
    public static cnoh<Status> b(GoogleApiClient googleApiClient, FeedbackOptions feedbackOptions) {
        cocr cocrVar = new cocr(googleApiClient, feedbackOptions);
        googleApiClient.enqueue(cocrVar);
        return cocrVar;
    }
}
