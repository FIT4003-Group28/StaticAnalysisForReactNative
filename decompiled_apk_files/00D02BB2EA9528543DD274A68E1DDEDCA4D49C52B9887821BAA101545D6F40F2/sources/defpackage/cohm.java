package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cohm  reason: default package */
/* loaded from: classes5.dex */
public final class cohm extends cla implements IInterface {
    public cohm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }

    public final void e(cohl cohlVar, long j) {
        Parcel a = a();
        clc.f(a, cohlVar);
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
