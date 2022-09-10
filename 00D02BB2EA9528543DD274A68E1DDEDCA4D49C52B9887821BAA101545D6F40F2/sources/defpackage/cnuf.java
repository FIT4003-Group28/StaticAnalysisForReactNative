package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnuf  reason: default package */
/* loaded from: classes5.dex */
public final class cnuf implements cnuc {
    final /* synthetic */ cnui a;

    public cnuf(cnui cnuiVar) {
        this.a = cnuiVar;
    }

    @Override // defpackage.cnuc
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.c()) {
            cnui cnuiVar = this.a;
            cnuiVar.A(null, cnuiVar.N());
            return;
        }
        cnuv cnuvVar = this.a.q;
        if (cnuvVar == null) {
            return;
        }
        cnuvVar.a(connectionResult);
    }
}
