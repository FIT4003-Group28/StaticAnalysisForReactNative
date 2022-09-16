package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: qbn  reason: default package */
/* loaded from: classes4.dex */
public final class qbn extends dvc implements IInterface {
    public qbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(rad radVar, AdSizeParcel adSizeParcel, String str, qeo qeoVar, int i) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.g(pv, adSizeParcel);
        pv.writeString(str);
        dve.i(pv, qeoVar);
        pv.writeInt(213380000);
        pv.writeInt(i);
        Parcel pw = pw(2, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        pw.recycle();
        return readStrongBinder;
    }
}
