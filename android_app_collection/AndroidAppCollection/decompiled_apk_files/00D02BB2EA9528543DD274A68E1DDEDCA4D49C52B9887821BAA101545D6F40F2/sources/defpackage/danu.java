package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: danu  reason: default package */
/* loaded from: classes5.dex */
public final class danu extends cla implements IInterface {
    public danu(IBinder iBinder) {
        super(iBinder, "com.google.android.setupcompat.ISetupCompatService");
    }

    public final void e(String str, Bundle bundle) {
        Parcel a = a();
        a.writeString(str);
        clc.e(a, bundle);
        Sj(1, a);
    }

    public final void f(int i, Bundle bundle, Bundle bundle2) {
        Parcel a = a();
        a.writeInt(i);
        clc.e(a, bundle);
        clc.e(a, bundle2);
        Sj(2, a);
    }
}
