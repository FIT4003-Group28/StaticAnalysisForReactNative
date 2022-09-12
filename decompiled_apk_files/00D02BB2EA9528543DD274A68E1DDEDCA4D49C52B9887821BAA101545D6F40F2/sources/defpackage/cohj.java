package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cohj  reason: default package */
/* loaded from: classes5.dex */
public final class cohj extends cla implements IInterface {
    public cohj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    public final void e(coba cobaVar, coba cobaVar2, long j) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        a.writeLong(j);
        Sk(2, a);
    }

    public final void f(Status status, long j) {
        Parcel a = a();
        clc.e(a, status);
        a.writeLong(j);
        Sk(3, a);
    }
}
