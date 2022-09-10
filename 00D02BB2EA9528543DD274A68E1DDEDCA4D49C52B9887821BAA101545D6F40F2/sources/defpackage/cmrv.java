package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmrv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmrv extends clb implements cmrw {
    public cmrv() {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b((Status) clc.d(parcel, Status.CREATOR), parcel.createTypedArrayList(Account.CREATOR));
            return true;
        }
        return false;
    }
}
