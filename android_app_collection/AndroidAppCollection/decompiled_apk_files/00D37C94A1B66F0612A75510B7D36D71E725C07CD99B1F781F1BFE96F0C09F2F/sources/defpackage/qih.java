package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
/* compiled from: PG */
/* renamed from: qih  reason: default package */
/* loaded from: classes4.dex */
public final class qih extends dvc implements qii {
    public qih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    @Override // defpackage.qii
    public final void a(quv quvVar, ClearTokenRequest clearTokenRequest) {
        Parcel pv = pv();
        dve.i(pv, quvVar);
        dve.g(pv, clearTokenRequest);
        px(2, pv);
    }

    @Override // defpackage.qii
    public final void f(qig qigVar, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel pv = pv();
        dve.i(pv, qigVar);
        dve.g(pv, accountChangeEventsRequest);
        px(4, pv);
    }

    @Override // defpackage.qii
    public final void g(qig qigVar, GetAccountsRequest getAccountsRequest) {
        Parcel pv = pv();
        dve.i(pv, qigVar);
        dve.g(pv, getAccountsRequest);
        px(5, pv);
    }

    @Override // defpackage.qii
    public final void h(qig qigVar, Account account, String str, Bundle bundle) {
        Parcel pv = pv();
        dve.i(pv, qigVar);
        dve.g(pv, account);
        pv.writeString(str);
        dve.g(pv, bundle);
        px(1, pv);
    }

    @Override // defpackage.qii
    public final void i(qig qigVar, HasCapabilitiesRequest hasCapabilitiesRequest) {
        Parcel pv = pv();
        dve.i(pv, qigVar);
        dve.g(pv, hasCapabilitiesRequest);
        px(7, pv);
    }

    @Override // defpackage.qii
    public final void j(qig qigVar, String str) {
        Parcel pv = pv();
        dve.i(pv, qigVar);
        pv.writeString(str);
        px(3, pv);
    }
}
