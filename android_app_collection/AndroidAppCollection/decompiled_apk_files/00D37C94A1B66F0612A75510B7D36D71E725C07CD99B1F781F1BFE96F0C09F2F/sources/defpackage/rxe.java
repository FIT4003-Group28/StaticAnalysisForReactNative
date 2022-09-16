package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
/* compiled from: PG */
/* renamed from: rxe  reason: default package */
/* loaded from: classes4.dex */
public final class rxe extends rwn {
    final /* synthetic */ GetClientTokenRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxe(qsx qsxVar, GetClientTokenRequest getClientTokenRequest) {
        super(qsxVar);
        this.a = getClientTokenRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return new rww(status, new GetClientTokenResponse(new byte[0]));
    }

    @Override // defpackage.rwn, defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        rxd rxdVar = (rxd) qsiVar;
        GetClientTokenRequest getClientTokenRequest = this.a;
        rxc rxcVar = new rxc(this);
        Bundle k = rxd.k(rxdVar.b, rxdVar.a.getPackageName(), rxdVar.c, rxdVar.d, rxdVar.e);
        try {
            rxa rxaVar = (rxa) rxdVar.D();
            Parcel pv = rxaVar.pv();
            dve.g(pv, getClientTokenRequest);
            dve.g(pv, k);
            dve.i(pv, rxcVar);
            rxaVar.py(15, pv);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            rxcVar.b(Status.c, new GetClientTokenResponse(new byte[0]));
        }
    }
}
