package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wearable.internal.AddListenerRequest;
/* compiled from: PG */
/* renamed from: cpiy  reason: default package */
/* loaded from: classes5.dex */
public final class cpiy extends cla implements IInterface {
    public cpiy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void e(cpiu cpiuVar, String str, String str2, byte[] bArr) {
        Parcel a = a();
        clc.f(a, cpiuVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeByteArray(bArr);
        Sk(12, a);
    }

    public final void f(cpiu cpiuVar) {
        Parcel a = a();
        clc.f(a, cpiuVar);
        Sk(15, a);
    }

    public final void g(cpiu cpiuVar, AddListenerRequest addListenerRequest) {
        Parcel a = a();
        clc.f(a, cpiuVar);
        clc.e(a, addListenerRequest);
        Sk(16, a);
    }

    public final void h(cpiu cpiuVar, Uri uri) {
        Parcel a = a();
        clc.f(a, cpiuVar);
        clc.e(a, uri);
        a.writeInt(0);
        Sk(41, a);
    }

    public final void i(cpiu cpiuVar, Uri uri) {
        Parcel a = a();
        clc.f(a, cpiuVar);
        clc.e(a, uri);
        a.writeInt(1);
        Sk(40, a);
    }
}
