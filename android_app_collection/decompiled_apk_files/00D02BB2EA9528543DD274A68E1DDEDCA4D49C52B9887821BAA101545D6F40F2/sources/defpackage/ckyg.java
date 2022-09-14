package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: ckyg  reason: default package */
/* loaded from: classes5.dex */
public final class ckyg extends cla implements IInterface {
    public ckyg(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    public final ckyj e(String str, ckyl ckylVar, byte[] bArr) {
        ckyj ckyjVar;
        Parcel a = a();
        a.writeString(str);
        clc.f(a, ckylVar);
        a.writeByteArray(bArr);
        Parcel Si = Si(1, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            ckyjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
            if (queryLocalInterface instanceof ckyj) {
                ckyjVar = (ckyj) queryLocalInterface;
            } else {
                ckyjVar = new ckyj(readStrongBinder);
            }
        }
        Si.recycle();
        return ckyjVar;
    }
}
