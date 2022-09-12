package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cpyo  reason: default package */
/* loaded from: classes5.dex */
public final class cpyo extends cla implements IInterface {
    public cpyo(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
    }

    public final void e(byte[] bArr) {
        Parcel a = a();
        a.writeByteArray(bArr);
        Sj(1, a);
    }
}
