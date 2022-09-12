package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
/* compiled from: PG */
/* renamed from: ckyj  reason: default package */
/* loaded from: classes5.dex */
public final class ckyj extends cla implements IInterface {
    public ckyj(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    public final void e(byte[] bArr) {
        Parcel a = a();
        a.writeByteArray(bArr);
        Sj(1, a);
    }

    public final void f(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        Parcel a = a();
        a.writeByteArray(bArr);
        clc.e(a, systemParcelableWrapper);
        Sj(2, a);
    }

    public final void g(ckyi ckyiVar) {
        Parcel a = a();
        clc.f(a, ckyiVar);
        Sj(3, a);
    }
}
