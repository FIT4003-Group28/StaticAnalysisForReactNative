package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: rbm  reason: default package */
/* loaded from: classes4.dex */
public final class rbm implements Runnable {
    private final Context a;
    private final long b;

    public rbm(Context context, long j) {
        this.a = context;
        this.b = j;
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
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        long j = this.b;
        tnk.i(rbh.a(rbh.e(this.a).D, FeedbackOptions.a(), bundle, j));
    }
}
