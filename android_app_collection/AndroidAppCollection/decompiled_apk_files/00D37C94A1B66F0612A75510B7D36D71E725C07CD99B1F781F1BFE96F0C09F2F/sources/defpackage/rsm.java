package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rsm  reason: default package */
/* loaded from: classes4.dex */
public final class rsm extends dvc implements IInterface {
    public rsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(rsl rslVar, boolean z, int i) {
        Parcel pv = pv();
        dve.i(pv, rslVar);
        dve.e(pv, z);
        pv.writeString(null);
        pv.writeString(null);
        pv.writeInt(i);
        Parcel pw = pw(11, pv);
        Bundle bundle = (Bundle) dve.a(pw, Bundle.CREATOR);
        pw.recycle();
    }
}
