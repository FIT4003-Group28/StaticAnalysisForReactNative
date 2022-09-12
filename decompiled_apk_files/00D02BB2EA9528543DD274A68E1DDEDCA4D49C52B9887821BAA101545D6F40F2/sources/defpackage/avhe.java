package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: avhe  reason: default package */
/* loaded from: classes2.dex */
public final class avhe extends cla implements IInterface {
    public avhe(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gmm.offline.aidl.shared.IProtoResultListener");
    }

    public final void e(byte[] bArr) {
        Parcel a = a();
        a.writeByteArray(bArr);
        Sj(1, a);
    }

    public final void f(byte[] bArr) {
        Parcel a = a();
        a.writeByteArray(bArr);
        Sj(2, a);
    }
}
