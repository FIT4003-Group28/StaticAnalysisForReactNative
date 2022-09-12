package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: danr  reason: default package */
/* loaded from: classes5.dex */
public final class danr extends cla implements IInterface {
    public danr(IBinder iBinder) {
        super(iBinder, "com.google.android.remotesearch.IRemoteSearchServiceSession");
    }

    public final void e(byte[] bArr) {
        Parcel a = a();
        a.writeByteArray(bArr);
        Sj(1, a);
    }
}
