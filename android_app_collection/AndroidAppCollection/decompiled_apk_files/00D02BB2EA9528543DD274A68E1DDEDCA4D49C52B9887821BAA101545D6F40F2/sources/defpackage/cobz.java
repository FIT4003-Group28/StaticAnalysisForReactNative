package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
/* compiled from: PG */
/* renamed from: cobz  reason: default package */
/* loaded from: classes5.dex */
final class cobz extends cocc {
    final /* synthetic */ cpct a;

    public cobz(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cocc, defpackage.cock
    public final void b(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        if (status.d()) {
            try {
                cntf.b(status, (dslt) dsqw.cq(dslt.d, forceSettingsCacheRefreshResult.a), this.a);
                return;
            } catch (dsrm e) {
                this.a.c(e);
                return;
            }
        }
        cntf.b(status, null, this.a);
    }
}
