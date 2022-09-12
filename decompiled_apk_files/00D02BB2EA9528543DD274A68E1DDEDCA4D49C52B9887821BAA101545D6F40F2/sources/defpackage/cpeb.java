package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
/* compiled from: PG */
/* renamed from: cpeb  reason: default package */
/* loaded from: classes5.dex */
public final class cpeb extends cla implements IInterface {
    public cpeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcService");
    }

    public final void e(cpea cpeaVar, byte[] bArr) {
        Parcel a = a();
        clc.f(a, cpeaVar);
        a.writeByteArray(bArr);
        Sk(5, a);
    }

    public final void f(cpea cpeaVar, byte[] bArr) {
        Parcel a = a();
        clc.f(a, cpeaVar);
        a.writeByteArray(bArr);
        Sk(7, a);
    }

    public final void g(cpea cpeaVar, UdcCacheRequest udcCacheRequest) {
        Parcel a = a();
        clc.f(a, cpeaVar);
        clc.e(a, udcCacheRequest);
        Sk(8, a);
    }

    public final void h(cpea cpeaVar, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        Parcel a = a();
        clc.f(a, cpeaVar);
        clc.e(a, udcWriteLocalSettingsRequest);
        Sk(10, a);
    }
}
