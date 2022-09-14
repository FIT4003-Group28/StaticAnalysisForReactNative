package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coig  reason: default package */
/* loaded from: classes5.dex */
public final class coig extends cla implements IInterface {
    public coig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
    }

    public final void e(cnrt cnrtVar) {
        Parcel a = a();
        a.writeInt(0);
        clc.f(a, cnrtVar);
        Sk(2, a);
    }

    public final void f(coba cobaVar, coba cobaVar2, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.f(a, cnrtVar);
        Parcel Si = Si(1, a);
        clc.a(Si);
        Si.recycle();
    }
}
