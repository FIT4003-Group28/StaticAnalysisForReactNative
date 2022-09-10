package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmwb  reason: default package */
/* loaded from: classes5.dex */
public final class cmwb extends cnuw<cmxn> implements cnir {
    public final cnis a;
    private final int t;

    public cmwb(Context context, Looper looper, cnum cnumVar, cnac cnacVar, int i, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 13, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.a = new cnis(this, looper, cnacVar);
        this.t = i;
    }

    @Override // defpackage.cnui
    public final void Sl(int i) {
        super.Sl(i);
        if (cmwk.a("CAR.CLIENT", 3)) {
            int i2 = cnjc.a;
        }
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.car.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.car.ICar";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 18712000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICar");
        return queryLocalInterface instanceof cmxn ? (cmxn) queryLocalInterface : new cmxm(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "car-1-0");
        return bundle;
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void n(cnuc cnucVar) {
        if (cmwk.a("CAR.CLIENT", 3)) {
            int i = cnjc.a;
        }
        super.n(cnucVar);
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void o() {
        if (cmwk.a("CAR.CLIENT", 3)) {
            int i = cnjc.a;
        }
        this.a.n();
        super.o();
    }

    @Override // defpackage.cnui
    protected final int p() {
        return this.t;
    }

    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ void q(IInterface iInterface) {
        cmxn cmxnVar = (cmxn) iInterface;
        super.q(cmxnVar);
        cnis cnisVar = this.a;
        if (cmwk.a("CAR.CLIENT", 3)) {
            int i = cnjc.a;
        }
        cnisVar.j(cnisVar.g);
        cnisVar.i();
        cnisVar.s(cmxnVar);
    }
}
