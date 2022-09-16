package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
/* compiled from: PG */
/* renamed from: qhw  reason: default package */
/* loaded from: classes4.dex */
public final class qhw implements qhy {
    final /* synthetic */ AccountChangeEventsRequest a;

    public qhw(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a = accountChangeEventsRequest;
    }

    @Override // defpackage.qhy
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        ose oseVar;
        if (iBinder == null) {
            oseVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof ose) {
                oseVar = (ose) queryLocalInterface;
            } else {
                oseVar = new ose(iBinder);
            }
        }
        AccountChangeEventsRequest accountChangeEventsRequest = this.a;
        Parcel pv = oseVar.pv();
        dve.g(pv, accountChangeEventsRequest);
        Parcel pw = oseVar.pw(3, pv);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) dve.a(pw, AccountChangeEventsResponse.CREATOR);
        pw.recycle();
        qhz.j(accountChangeEventsResponse);
        return accountChangeEventsResponse.b;
    }
}
