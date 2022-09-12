package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cpeu  reason: default package */
/* loaded from: classes5.dex */
class cpeu implements cpdq {
    private final Status a;
    private final PendingIntent b;

    public cpeu(Status status, PendingIntent pendingIntent) {
        this.a = status;
        this.b = pendingIntent;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cpdq
    public final boolean c() {
        return this.b != null;
    }

    @Override // defpackage.cpdq
    public final void b(Activity activity, int i) {
        if (c()) {
            activity.startIntentSenderForResult(this.b.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
        throw new IllegalStateException("No PendingIntent available");
    }
}
