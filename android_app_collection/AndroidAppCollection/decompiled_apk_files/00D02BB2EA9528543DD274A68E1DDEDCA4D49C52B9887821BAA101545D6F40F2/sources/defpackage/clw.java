package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clw  reason: default package */
/* loaded from: classes5.dex */
public final class clw extends cla implements IInterface {
    public clw(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IImeController");
    }

    public final void e(clv clvVar) {
        Parcel a = a();
        clc.f(a, clvVar);
        Sk(1, a);
    }
}
