package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnxa  reason: default package */
/* loaded from: classes5.dex */
public final class cnxa extends cla implements IInterface {
    public cnxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void e(cnwz cnwzVar) {
        Parcel a = a();
        clc.f(a, cnwzVar);
        Sj(1, a);
    }
}
