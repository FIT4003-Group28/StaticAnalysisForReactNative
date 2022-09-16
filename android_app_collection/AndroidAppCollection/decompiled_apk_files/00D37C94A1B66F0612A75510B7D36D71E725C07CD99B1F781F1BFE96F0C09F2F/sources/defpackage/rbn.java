package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: rbn  reason: default package */
/* loaded from: classes4.dex */
public final class rbn implements Runnable {
    private final Context a;
    private final long b;
    private final tzh c;

    public rbn(Context context, tzh tzhVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.c = tzhVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            rbp rbpVar = new rbp();
            rbpVar.c();
            singletonList = this.c.a();
            if (singletonList == null) {
                singletonList = new ArrayList(1);
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(rbpVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(rbpVar.a())));
                singletonList = arrayList;
            }
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        qst e2 = rbh.e(this.a);
        tnk.i(rbh.b(e2.D, tzh.p(singletonList), this.b));
    }
}
