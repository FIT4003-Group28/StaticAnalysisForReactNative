package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckvn  reason: default package */
/* loaded from: classes4.dex */
public final class ckvn implements cnon<LocationSettingsResult> {
    final /* synthetic */ ckvo a;

    public ckvn(ckvo ckvoVar) {
        this.a = ckvoVar;
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(LocationSettingsResult locationSettingsResult) {
        LocationSettingsResult locationSettingsResult2 = locationSettingsResult;
        if (this.a.c != 2) {
            return;
        }
        Status status = locationSettingsResult2.a;
        if (!status.c()) {
            this.a.e();
            return;
        }
        ckvo ckvoVar = this.a;
        ckvoVar.c = 4;
        ckvoVar.d.b(status);
    }
}
