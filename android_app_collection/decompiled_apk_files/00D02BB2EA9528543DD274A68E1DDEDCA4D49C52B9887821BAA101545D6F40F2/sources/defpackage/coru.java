package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;
/* compiled from: PG */
/* renamed from: coru  reason: default package */
/* loaded from: classes5.dex */
final class coru extends corp {
    final /* synthetic */ cpct a;

    public coru(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.corq
    public final void b(Status status, SyncResult syncResult) {
        cntf.b(status, status.d() ? syncResult.a : null, this.a);
    }
}
