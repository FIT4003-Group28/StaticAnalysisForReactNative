package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qob  reason: default package */
/* loaded from: classes4.dex */
public final class qob implements qpz {
    final /* synthetic */ qod a;

    public qob(qod qodVar) {
        this.a = qodVar;
    }

    @Override // defpackage.qpz
    public final void a(long j, int i, Object obj) {
        try {
            this.a.n(new qof(new Status(i)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }

    @Override // defpackage.qpz
    public final void b(long j) {
        try {
            this.a.n(qod.d(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }
}
