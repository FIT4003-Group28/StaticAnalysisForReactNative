package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
/* compiled from: PG */
/* renamed from: rea  reason: default package */
/* loaded from: classes4.dex */
public final class rea implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;

    public rea(Context context, GoogleHelp googleHelp, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            rbp rbpVar = new rbp();
            rbpVar.c();
            this.a.getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(rbpVar.a()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        FeedbackOptions a = FeedbackOptions.a();
        rem b = rdz.b(this.a);
        GoogleHelp googleHelp = this.b;
        long j = this.c;
        qsx qsxVar = b.D;
        reg regVar = new reg(qsxVar, a, bundle, j, googleHelp);
        qsxVar.a(regVar);
        tnk.i(regVar);
    }
}
