package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: cocb  reason: default package */
/* loaded from: classes5.dex */
final class cocb extends cocc {
    final /* synthetic */ cpct a;

    public cocb(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cocc, defpackage.cock
    public final void d(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        if (status.d()) {
            try {
                cntf.b(status, (dslt) dsqw.cq(dslt.d, getActivityControlsSettingsResult.a), this.a);
                return;
            } catch (dsrm e) {
                this.a.c(e);
                return;
            }
        }
        cntf.b(status, null, this.a);
    }
}
