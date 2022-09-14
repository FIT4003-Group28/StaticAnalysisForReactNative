package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
/* compiled from: PG */
/* renamed from: cpbb  reason: default package */
/* loaded from: classes5.dex */
public final class cpbb extends cla implements IInterface {
    public cpbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    public final void e(GetAllCardsRequest getAllCardsRequest, cpbd cpbdVar) {
        Parcel a = a();
        clc.e(a, getAllCardsRequest);
        clc.f(a, cpbdVar);
        Sk(2, a);
    }

    public final void f(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest, cpbd cpbdVar) {
        Parcel a = a();
        clc.e(a, firstPartyTokenizePanRequest);
        clc.f(a, cpbdVar);
        Sk(4, a);
    }

    public final void g(GetActiveAccountRequest getActiveAccountRequest, cpbd cpbdVar) {
        Parcel a = a();
        clc.e(a, getActiveAccountRequest);
        clc.f(a, cpbdVar);
        Sk(9, a);
    }
}
