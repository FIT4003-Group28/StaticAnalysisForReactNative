package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: reb  reason: default package */
/* loaded from: classes4.dex */
public final class reb implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final tzh d;

    public reb(Context context, GoogleHelp googleHelp, tzh tzhVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.b = googleHelp;
        this.d = tzhVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            rbp rbpVar = new rbp();
            rbpVar.c();
            singletonList = this.d.a();
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
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        rem b = rdz.b(this.a);
        GoogleHelp googleHelp = this.b;
        Bundle p = tzh.p(singletonList);
        long j = this.c;
        qsx qsxVar = b.D;
        ree reeVar = new ree(qsxVar, p, j, googleHelp);
        qsxVar.a(reeVar);
        tnk.i(reeVar);
    }
}
