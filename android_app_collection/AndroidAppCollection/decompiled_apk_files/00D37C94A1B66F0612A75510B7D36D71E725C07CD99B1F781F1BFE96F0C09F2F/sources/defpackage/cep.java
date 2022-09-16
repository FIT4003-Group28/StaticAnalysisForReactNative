package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cep  reason: default package */
/* loaded from: classes2.dex */
public final class cep extends dvc implements IInterface {
    public cep(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int a(int i, String str, String str2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeString(str);
        pv.writeString(str2);
        Parcel pw = pw(1, pv);
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }
}
