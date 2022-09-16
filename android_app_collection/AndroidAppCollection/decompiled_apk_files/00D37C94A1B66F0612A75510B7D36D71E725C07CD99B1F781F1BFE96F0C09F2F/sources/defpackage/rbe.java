package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rbe  reason: default package */
/* loaded from: classes4.dex */
final class rbe extends rbg {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbe(qsx qsxVar, Bundle bundle, long j) {
        super(qsxVar);
        this.a = bundle;
        this.b = j;
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        rbl rblVar = (rbl) qsiVar;
        try {
            Bundle bundle = this.a;
            long j = this.b;
            tzh.r(bundle);
            rbo rboVar = (rbo) rblVar.D();
            Parcel pv = rboVar.pv();
            dve.g(pv, bundle);
            pv.writeLong(j);
            rboVar.px(4, pv);
            n(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            l(rbh.a);
        }
    }
}
