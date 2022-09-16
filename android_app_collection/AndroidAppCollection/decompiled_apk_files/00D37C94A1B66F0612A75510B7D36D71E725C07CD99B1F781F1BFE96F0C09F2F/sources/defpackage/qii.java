package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
/* compiled from: PG */
/* renamed from: qii  reason: default package */
/* loaded from: classes4.dex */
public interface qii extends IInterface {
    void a(quv quvVar, ClearTokenRequest clearTokenRequest);

    void f(qig qigVar, AccountChangeEventsRequest accountChangeEventsRequest);

    void g(qig qigVar, GetAccountsRequest getAccountsRequest);

    void h(qig qigVar, Account account, String str, Bundle bundle);

    void i(qig qigVar, HasCapabilitiesRequest hasCapabilitiesRequest);

    void j(qig qigVar, String str);
}
