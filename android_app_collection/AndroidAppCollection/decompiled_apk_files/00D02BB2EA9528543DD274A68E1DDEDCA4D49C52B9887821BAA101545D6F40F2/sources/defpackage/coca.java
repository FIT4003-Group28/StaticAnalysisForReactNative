package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: coca  reason: default package */
/* loaded from: classes5.dex */
final class coca extends cocc {
    final /* synthetic */ cpct a;

    public coca(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cocc, defpackage.cock
    public final void c(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        if (status.d()) {
            try {
                cntf.b(status, (dsmn) dsqw.cq(dsmn.b, updateActivityControlsSettingsResult.a), this.a);
                return;
            } catch (dsrm e) {
                this.a.c(e);
                return;
            }
        }
        cntf.b(status, null, this.a);
    }
}
