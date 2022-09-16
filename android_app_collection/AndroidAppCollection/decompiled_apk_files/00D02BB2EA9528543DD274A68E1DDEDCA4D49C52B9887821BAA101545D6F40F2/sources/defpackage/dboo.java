package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceRequest;
/* compiled from: PG */
/* renamed from: dboo  reason: default package */
/* loaded from: classes5.dex */
public final class dboo extends cla implements IInterface {
    public dboo(IBinder iBinder) {
        super(iBinder, "com.google.commerce.tapandpay.android.seclient.ISecureElementService");
    }

    public final void e(GetSeCardBalanceRequest getSeCardBalanceRequest, dboq dboqVar) {
        Parcel a = a();
        clc.e(a, getSeCardBalanceRequest);
        clc.f(a, dboqVar);
        Sk(1, a);
    }
}
