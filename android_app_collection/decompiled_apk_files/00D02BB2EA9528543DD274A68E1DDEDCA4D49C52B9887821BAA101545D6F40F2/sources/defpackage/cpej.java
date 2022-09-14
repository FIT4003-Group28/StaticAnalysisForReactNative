package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.ConsentFlowConfig;
/* compiled from: PG */
/* renamed from: cpej  reason: default package */
/* loaded from: classes5.dex */
final class cpej implements cpdp {
    final /* synthetic */ Status a;

    public cpej(Status status) {
        this.a = status;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cpdp
    public final void b(Activity activity, int i, ConsentFlowConfig consentFlowConfig) {
        throw new IllegalStateException("UdcApiImpl: No consent flow activity can be launched");
    }
}
