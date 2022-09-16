package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
/* compiled from: PG */
/* renamed from: cocl  reason: default package */
/* loaded from: classes5.dex */
public final class cocl extends cla implements IInterface {
    public cocl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsCacheService");
    }

    public final void e(cock cockVar, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel a = a();
        clc.f(a, cockVar);
        clc.e(a, facsCacheCallOptions);
        Sk(1, a);
    }

    public final void f(cock cockVar, byte[] bArr, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel a = a();
        clc.f(a, cockVar);
        a.writeByteArray(bArr);
        clc.e(a, facsCacheCallOptions);
        Sk(2, a);
    }

    public final void g(cock cockVar, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel a = a();
        clc.f(a, cockVar);
        clc.e(a, facsCacheCallOptions);
        Sk(3, a);
    }
}
