package defpackage;

import android.os.Parcel;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
/* compiled from: PG */
/* renamed from: dbop  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbop extends clb implements dboq {
    public dbop() {
        super("com.google.commerce.tapandpay.android.seclient.ISecureElementServiceCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((GetSeCardBalanceResponse) clc.d(parcel, GetSeCardBalanceResponse.CREATOR));
            return true;
        }
        return false;
    }
}
