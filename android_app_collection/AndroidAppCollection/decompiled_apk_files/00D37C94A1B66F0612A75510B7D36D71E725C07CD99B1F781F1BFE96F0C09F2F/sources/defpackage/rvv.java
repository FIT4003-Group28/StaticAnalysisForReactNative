package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rvv  reason: default package */
/* loaded from: classes4.dex */
final class rvv extends rvr {
    @Override // defpackage.rvr
    public final void b(Status status) {
        if (!status.c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("disconnect(): Could not unregister listener: status=");
            sb.append(valueOf);
            Log.e("UsageReportingClientImp", sb.toString());
        }
    }
}
