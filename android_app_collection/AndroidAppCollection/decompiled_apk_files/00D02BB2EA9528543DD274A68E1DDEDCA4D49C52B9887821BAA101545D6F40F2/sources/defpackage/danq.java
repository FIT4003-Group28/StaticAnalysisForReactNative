package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: danq  reason: default package */
/* loaded from: classes5.dex */
public final class danq extends cla implements IInterface {
    public danq(IBinder iBinder) {
        super(iBinder, "com.google.android.remotesearch.IRemoteSearchService");
    }

    public final void e() {
        Sk(12, a());
    }

    public final danr f(dant dantVar) {
        Parcel a = a();
        a.writeString("GMM_COMMUTE_UPDATE_SESSION");
        clc.f(a, dantVar);
        danr danrVar = null;
        a.writeByteArray(null);
        Parcel Si = Si(11, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.remotesearch.IRemoteSearchServiceSession");
            if (queryLocalInterface instanceof danr) {
                danrVar = (danr) queryLocalInterface;
            } else {
                danrVar = new danr(readStrongBinder);
            }
        }
        Si.recycle();
        return danrVar;
    }
}
