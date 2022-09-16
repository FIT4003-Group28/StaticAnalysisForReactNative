package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qbj  reason: default package */
/* loaded from: classes4.dex */
public final class qbj extends dvc implements IInterface {
    public qbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(rad radVar, String str, qeo qeoVar) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeString(str);
        dve.i(pv, qeoVar);
        pv.writeInt(213380000);
        Parcel pw = pw(1, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        pw.recycle();
        return readStrongBinder;
    }
}
