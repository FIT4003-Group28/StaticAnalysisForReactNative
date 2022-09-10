package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
/* compiled from: PG */
/* renamed from: cmqf  reason: default package */
/* loaded from: classes5.dex */
public final class cmqf extends cla implements IInterface {
    public cmqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void e(cmqh cmqhVar, ActionImpl[] actionImplArr) {
        Parcel a = a();
        clc.f(a, cmqhVar);
        a.writeTypedArray(actionImplArr, 0);
        Sk(7, a);
    }

    public final void f(cmqh cmqhVar, UsageInfo[] usageInfoArr) {
        Parcel a = a();
        clc.f(a, cmqhVar);
        a.writeString(null);
        a.writeTypedArray(usageInfoArr, 0);
        Sk(1, a);
    }
}
